$(function () {

    $('.menutren ul li:nth-child(1) a').on('click', function (event) {
        event.preventDefault();
        $("html,body").animate({ scrollTop: $('.chapter1').offset().top }, 500);
    });
    $('.menutren ul li:nth-child(2) a').on('click', function (event) {
        event.preventDefault();
        $("html,body").animate({ scrollTop: $('.chapter2').offset().top }, 500);
    });
    $('.menutren ul li:nth-child(3) a').on('click', function (event) {
        event.preventDefault();
        $("html,body").animate({ scrollTop: $('.chapter3').offset().top }, 500);
    });
    $('.nutlentren').click(function (e) {

        $("html,body").animate({ scrollTop: 0 }, "slow");
    });

});
