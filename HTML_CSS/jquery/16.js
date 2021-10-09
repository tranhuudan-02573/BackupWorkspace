$(function () {
    // dinh nghia 1 dong thoi gian 
    // can dat ten truoc khi su dung
    // nhieu chuyen dong trong 1 doi tuong thi dung timelinemax con chi 1 chuyen dong thi dung tweenmax
    cd1 = new TimelineMax();

    cd1.to($('.nut1'), 1, { x: -300 })
        .to($('.nut1'), 1, { y: 300 }, "+=1")
        .to($('.nut1'), 1, { x: 0, }, "+=1")
        .to($('.nut1'), 1, { rotationX: 360 })
        .to($('.nut1'), 1, { rotationX: 0, y: 0 })

    // code cho cac nut
    $('.nutstop').click(function (e) {
        cd1.pause();
    })
    $('.nutplay').click(function (e) {
        cd1.play();
    })
    $('.nutdaonguoc').click(function (e) {
        cd1.reverse();
    })

})