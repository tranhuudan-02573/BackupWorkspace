$(function(){
    TweenMax.to($('.test1'), 1,{x:400, opacity:0});

    TweenMax.from($('.nut1'), 1,{x:-400, opacity:0,scale:2})
    TweenMax.from($('.nut3'), 1,{x:400, opacity:0, scale:2})
    TweenMax.from($('.nut2'), 1,{y:400, opacity:0,scale:2})

    $('.nut2').click(function(e){
        TweenMax.fromTo($('.nut1'), 2,{x:-400},{x:400})
        TweenMax.to($(this),1,{y:"+=100"})
        TweenMax.to($('.nut3'),1,{scale:"+=0.2"})
    })
    // TweenMax.fromTo($('.btn-primary'), 1,{y:200,opacity:0},{y:0,opacity:1})
    // goi ra su dung
    // vdstaggerto();
    vdstaggerfrom();
    // thoi gian cac phan tu
    //ease: ham gia toc dc dinh nghia trong greensock
    function vdstaggerto(){
        TweenMax.staggerTo($('.btn-primary'), 1,{x:-300,opacity:0},0.2)
        TweenMax.staggerTo($('.btn-primary'), 1,{y:300,opacity:0},0.1)
    }
    function vdstaggerfrom(){
        TweenMax.staggerFrom($('.btn-primary'), 1,{y:300,opacity:0, ease:Bounce.easeOut},0.2)
        
    }

})