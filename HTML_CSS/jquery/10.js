$(function () {
    // code cho phan tu khoa
    $('.tukhoa').keypress(function (e) {
        if (e.keyCode == "13") {
            // console.log('ban vua bam enter')
            tu1 = $('.tukhoa').val();
            // console.log(tu1)
            tu1 = "." + tu1;
            $('.content ul').isotope({ filter: tu1 });
        }
        // if (e.keyCode == "32") {
        //     console.log('ban vua bam space')

        // }       
    });
    thoigian =setInterval(function(){
        tu1 = $('.tukhoa').val();
            // console.log(tu1)
            tu1 = "." + tu1;
            $('.content ul').isotope({ filter: tu1 });
    },200)
    $('.content').isotope({
        itemSelector: 'li'
    });
    $('nav ul li a ').click(function (e) {
        var danhmuc = $(this).data('danhmucanh');
        danhmuc = "." + danhmuc;
        // console.log(danhmuc);
        // console.log(ten)
        //dat vao trong h1
        var ten = $(this).text();
        $('section h1 ').text(ten);
        // $('.content ul li ').each(function () {
        //     if($(this).hasClass(danhmuc)){
        //         $(this).show(300);
        //     }
        //     else{
        //         $(this).hide(300);
        //     }
        if (danhmuc == '.all') {
            $('section h1 ').text("TAT CA ANH");
            $('.content ul').isotope({ filter: '*' });
        }
        else {

            $('.content ul').isotope({ filter: danhmuc });
        }
        // });
        return false;
    });
});

