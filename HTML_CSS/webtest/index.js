$(function () {
    var showGotoTop = 100;
    $(window).scroll(function () {
        if ($(this).scrollTop() >= showGotoTop) {
            $('#khung').fadeIn();
        } else { $('#khung').fadeOut(); }
    });
    // TweenMax.from($('.logo'),1,{y:-200,opacity:0,ease:Circ.easeOut})
    // TweenMax.from($('.small'),1,{y:-100,opacity:0,ease:Power4.easeOut,delay:1.5})
    // TweenMax.from($('.we'),1,{y:100,scale:0.5,opacity:0,ease:Circ.easeOut,delay:1})
    TweenMax.from($('.we'), 1, { y: 100, opacity: 0, ease: Sine.easeOut, delay: 11.5 })
    TweenMax.from($('.small'), 1, { y: -1000, opacity: 0, ease: Sine.easeOut, delay: 11.5 })
    TweenMax.from($('.cottrai '), 1, { x: -200, opacity: 0, ease: Power4.easeOut, delay: 9 })
    TweenMax.from($('.cotphai .icon1'), 1, { x: 200, opacity: 0, ease: Quint.easeOut, delay: 9 })
    TweenMax.from($('.cotphai .icon2'), 1, { x: 200, opacity: 0, ease: Quint.easeOut, delay: 10 })
    TweenMax.from($('.cotphai .icon3'), 1, { x: 200, opacity: 0, ease: Quint.easeOut, delay: 11 })
    // viet hieu ung cho cac khoi


    new WOW().init();

    hieuungload = new TimelineMax({ onComplete: noidungvaodi });
    // lap lai
    hieuungload
        .from($('.loading'), 0.7, { opacity: 0 })
        .from($('.khoiload'), 1, { scale: 2, opacity: 0 })
        .to($('.khoiload'), 1, { scale: 0.3, ease: Power4.easeOut })
        .to($('.khoiload'), 1, { scale: 1, ease: Elastic.easeOut.config(1, 0.3) })
        .to($('.khoiload'), 1, { scale: 0.3, ease: Power4.easeOut })
        .to($('.khoiload'), 1, { scale: 1, ease: Elastic.easeOut.config(1, 0.3) })
        .to($('.khoiload'), 1, { scale: 0.3, ease: Power4.easeOut })
        .to($('.khoiload'), 1, { scale: 1, ease: Elastic.easeOut.config(1, 0.3) })

        //ket thuc
        .to($('.khoiload'), 1, { scale: 7, opacity: 0, ease: Power4.easeOut })
        .to($('.loading'), 1, { x: -2200, ease: Power1.easeOut })

    function noidungvaodi() {
        hieuungbannertop.play();
    }

    hieuungbannertop = new TimelineMax({ paused: true });

    hieuungbannertop

        .from($('.cotgiua'), 1, { y: -200, opacity: 0, ease: Bounce.easeOut }, " +=3")



})