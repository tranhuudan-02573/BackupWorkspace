$(function(){
    
    $('.noidungthem').slideUp();
    TweenMax.staggerFrom($('.tinto'), 0.5, {top:100, opacity:0}, 0.5);
    $('.nutload').click(function (e) { 
        $('.noidungthem').slideDown();
        TweenMax.staggerFrom($('.tinto1'), 0.5, {right:100, opacity:0}, 0.5);
    });
})