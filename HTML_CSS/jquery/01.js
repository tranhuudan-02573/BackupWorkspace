$(function(){
    $('.dangky').animate({opacity:0, marginLeft:-1000});

    $('.nutso2').click(function(event){
        $('.dangnhap').animate({opacity:0, marginLeft:-10000});
        $('.dangky').animate({opacity:1, marginLeft:0});

    });;
    $('.nutso1').click(function(event){
        $('.dangky').animate({opacity:0, marginLeft:-10000})
        $('.dangnhap').animate({opacity:1, marginLeft:0})

    });;
    $('.nuttat1, .nuttat2' ).click(function(event){
        $('.dangky').animate({opacity:0, marginLeft:-10000})
        $('.dangnhap').animate({opacity:1, marginLeft:-10000})
        
    })
    
    
});