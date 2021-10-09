$(function () {
    $('.tdkhoi').click(function (e) {
        $(this).toggleClass('den')

        // khi click vao cho nd hien ra
        $(this).next().slideToggle(300);

        // su dung ham animate de chuyen nd len
        $('body,html').animate({ scrollTop: $(this).offset().top })

    })
    // code cho phan phong to anh
    $('.vaicaianh a').fancybox({ openEffect: 'elastic' });

    // code cho accordion
    $('.ndkhoi').slideUp();
})