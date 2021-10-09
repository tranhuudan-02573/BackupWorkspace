$(function () {
  new WOW().init();
    $('body, html').scrollspy({ target: '.menutren' })
  

    //ap dung ham click
    $('.menutren ul li a').click(function (e) {
        var vitri = $(this).attr('href')
        var toado = $(vitri).offset().top;

        console.log(toado)
        $('body, html').animate({ scrollTop: toado });
        return false;

    })
})