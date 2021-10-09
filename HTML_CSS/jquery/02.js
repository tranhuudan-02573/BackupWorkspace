$(function(){
    $('.ndmotkhoi').slideUp();
$('.motkhoi h3').click(function(event){
    console.log('da click roi');
    $(this).next().slideToggle();
    
    $(this).toggleClass('xanh')
});
})
