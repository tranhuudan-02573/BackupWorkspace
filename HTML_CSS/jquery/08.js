$(function () {
    var vitrimenu = $('.menutren').offset().top;
    $(window).scroll(function (e) {
        var vitri = $('body,html').scrollTop();
        // if ((vitri >= 400) && (vitri < 800)) {
        //     $('.menutren ').addClass('bienhinh')
        // }
        // else {
        //     $('.menutren ').removeClass('bienhinh')
        // }
        // if ((vitri >= 800) && (vitri < 1600)) {
        //     $('.menutren ').addClass('xayzacap1')
        // }
        // else {
        //     $('.menutren ').removeClass('xayzacap1')
        // }

        if (vitri >= vitrimenu) {
            $('.menutren').addClass('mabubeo');
        }
        else {
            $('.menutren').removeClass('mabubeo');
        }
    })
})