$(function () {
    // viet cho nut next
    $('.next').click(function (e) {
        var sau = $('.active').next();
        var vitri = $('.xanh').index() + 1;
        // console.log($('.xanh').index() +1)
        $('.nutslide ul li').removeClass('xanh');
//
        if (vitri == $('.nutslide ul li').length) {
            vitri = 0;
        }
        $('.nutslide ul li:nth-child(' + (vitri + 1) + ')').addClass('xanh');
        // console.log(sau.length);
        //
        if (sau.length == 0) {// co nghia la den slide cuoi cung roi
            $('.active').addClass('bien-mat-o-ben-trai').one('webkitAnimattionEnd', function (e) {
                $('.bien-mat-o-ben-trai').removeClass('bien-mat-o-ben-trai')
            });
            $('.anhslide ._1slide:first-child').addClass('divaotubenphai').one('webkitAnimationEnd', function (e) {
                //bo active
                $('.bien-mat-o-ben-trai').removeClass('bien-mat-o-ben-trai')
                $('.active').removeClass('active')
                // cho cai slide sau duoc active
                $('.divaotubenphai').addClass('active').removeClass('divaotubenphai')
            });
        }
        //
        else {
            // code cho phan add class ban dau
            $('.active').addClass('bien-mat-o-ben-trai').one('webkitAnimattionEnd', function (e) {
                $('.bien-mat-o-ben-trai').removeClass('bien-mat-o-ben-trai')
            });
            sau.addClass('divaotubenphai').one('webkitAnimationEnd', function (e) {
                $('.active').removeClass('active')
                $('.bien-mat-o-ben-trai').removeClass('bien-mat-o-ben-trai')
                $('.divaotubenphai').addClass('active').removeClass('divaotubenphai')
            });
        }
    })
    // viet cho nut prev
    $('.prev').click(function (e) {
        var truoc = $('.active').prev();
        // console.log(truoc.length);
        var vitri = $('.xanh').index() + 1;
        $('.nutslide ul li').removeClass('xanh');
        if (vitri == 1) {
            vitri = $('.nutslide ul li').length + 1
        }
        $('.nutslide ul li:nth-child(' + (vitri - 1) + ')').addClass('xanh');
        //
        if (truoc.length == 0) {
            $('.active').addClass('bien-mat-o-ben-phai').one('webkitAnimattionEnd', function (e) {
                $('.bien-mat-o-ben-phai').removeClass('bien-mat-o-ben-phai')
            });
            $('.anhslide ._1slide:last-child').addClass('divaotubentrai').one('webkitAnimationEnd', function (e) {
                $('.active').removeClass('active')
                $('.bien-mat-o-ben-phai').removeClass('bien-mat-o-ben-phai')
                $('.divaotubentrai').addClass('active').removeClass('divaotubentrai')
            });
        }
        //
        else {
            // code cho phan add class ban dau
            $('.active').addClass('bien-mat-o-ben-phai').one('webkitAnimattionEnd', function (e) {
                $('.bien-mat-o-ben-phai').removeClass('bien-mat-o-ben-phai')
            });
            truoc.addClass('divaotubentrai').one('webkitAnimationEnd', function (e) {
                $('.active').removeClass('active')
                $('.bien-mat-o-ben-phai').removeClass('bien-mat-o-ben-phai')
                $('.divaotubentrai').addClass('active').removeClass('divaotubentrai')
            });
        }
    })
    // viet cho nut slide
    $('.nutslide ul li').click(function (e) {
        $('.nutslide ul li').removeClass('xanh')
        console.log($(this).index()+1)
        $(this).addClass('xanh');
        $('.active').addClass('bien-mat-o-ben-phai').one('webkitAnimattionEnd', function (e) {
            $('.bien-mat-o-ben-phai').removeClass('bien-mat-o-ben-phai')
        });
        $('.anhslide ._1slide:nth-child(' + ($(this).index() + 1) + ')').addClass('divaotubentrai').one('webkitAnimationEnd', function (e) {
            $('.active').removeClass('active')
            $('.bien-mat-o-ben-phai').removeClass('bien-mat-o-ben-phai')
            $('.divaotubentrai').addClass('active').removeClass('divaotubentrai')
        });
    })
})