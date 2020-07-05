package com.example.makanankhasaceh

object dataMakanan {
    private val namaMakanan = arrayOf(
        "Mie Aceh",
        "Sate Matang",
        "Kuah Pliek U",
        "Gulai Kambing",
        "Kuah Masam Keu-eung",
        "Kuah Sie Itek",
        "Ayam Tangkap",
        "Rujak Aceh",
        "Ungkot Kemamah",
        "Kue Timphan",
        "Manisan Pala",
        "Pisang Sale",
        "Lepat",
        "Bohromrom"
    )


    private val detailMakanan = arrayOf(
        "Orang Indonesia pasti tidak asing dengan masakan mie. Mie Aceh salah satunya, makanan yang menarik dari Aceh, dapat kita icipi dengan dua cara, yaitu dengan di goreng atau juga dengan kuah. Untuk masalah rasa pedas atau tidak itu sesuai dengan selera kita masing-masing. Agar tidak bosan , mie aceh dapat di sajikan dengan beberapa variasi lauk mulai dari sejenis seafood atau daging.",
        "Sate Matang adalah makanan khas Aceh berisikan daging kambing atau daging sapi yang diungkep dengan bumbu khas Aceh kemudian di bakar. Sate Matang paling sedap dimakan dengan kuah soto yang kaya akan bumbu-bumbu istimewa.",
        "Kuah Pilek U merupakan makan khas yang melambangkan keeratan dan keberagaman, dalam masyarakat Aceh yang tertuang dalam satu kuali, sehingga memunculkan suatu rasa yang tersendiri. Kuah Pilek U merupakan cara penyaluran hasil bumi dari daerah Aceh. Makanan ini wajib Anda santab bila Anda berkunjung ke Aceh.",
        "Ada rasa yang tersembunyi dalam Gulai Kambing khas Aceh, karena di masak dengan bumbu asli khas Aceh. Gulai Kambing in dimasak dalam kuali yang besar dan dalam penyajianya selalu dalam keadaan panas, dengan daging kambing yang empuk serta tidak beraroma kambing lagi.",
        "Masakan Masam Keu-ueng tidak hanya bisa Anda dapatkan di Aceh saja, tapi hampir seluruh penjuru Indonesia juga ada dengan nama yang tidak sama. Bagi masyarakat Aceh memiliki makna masam pedas yang cocok dengan lidah bangsa Indonesia.",
        "Masakan selanjutnya adalah olahan dari itik atau bebek, tapi cara mengolahnya dengan cara yang berbeda dan resep yang diwariskan turun-temurun dari para pendahulu atau leluhur masyarakat Aceh. Bahkan hingga sekarang banyak restoran yang menyajikan makanan satu ini.",
        "Ayam Tangkap Merupakan olahan daging ayam yang di cincang kecil-kecil yang ditumpuk dengan daun teumuru dan cabai hijau serta ditaburu bawang goreng. Ketika Anda makan kuliner yang satu ini Anda bisa harus mencari ayam yang terselimuti oleh daun teumuru.",
        "Rujak Aceh merupakan makanan khas dengan cita rasa yang berbeda dari rujak yang lain. Rujak Aceh berisikan buah rumbia Aceh yang disiram dengan saus rujak, Rujak Aceh sangat lezat bila dinikmati dalam keadaan dingin ditambah lagi dengan es serut, sangat cocok di makan saat cuaca panas.",
        "Ungkot Kemamah adalah masakan khas Aceh dengan cita rasa yang menantang. Bahan bakunya adalah ikan tuna yang dikeringkan dan kemudian dicincang. Ikan kemamah ini bisa dimasak dengan bahan masakan seperti santan kelapa, cabai hijau, kantang dan bahan masakan yang lainya. Sejak zaman perang melawan Belanda dulu, Ungkot Kemamah merupakan masakan yang sudah popular karena cara masak yang berbeda.",
        "Masakan Aceh selanjutnya adalah Kue Timphan, berbahan dasar tepung ketan, bercampur dengan srikaya dan pisang beranang. Dalam masyarakat Aceh sendiri, Kue Timphan merupakan hidangan wajib ada untuk tamu yang berkunjung kerumah ketika hari raya lebaran, baik itu idul fitri maupun hari raya idhul adha.",
        "Manisan Pala seperti namanya manisan ini terbuat buah pala. Ada banyak sekali masyarakat Aceh yang memproduksi Manisan Pala. Bahkan pala merupakan komoditi terbesr di Aceh Selatan. Jadi anda akan banyak sekali menemukan Manisan Pala bila berlibur atau berkunjung ke Aceh Selatan.",
        "Pisang Sale sudah lama dikenal sebagai makanan tradisional kususnya di kawasan Aceh Timur sebagai sentra pisang sale wilayah Aceh. Makanan tradisional ini mempunyai rasa dan aroma yang khas, terbuat dari pisang matang yang kemudian di jemur sampai kering, kemudian di asapi agar tahan lama. Pisang Sale dapat disantab langsung atau dengan di goreng terlebih dahhulu.",
        "Masyarakat Indonesia pasti tau makanan yang di bungkus dengan daun pisang lalu dikukus ini adalah Lepat. Lepat berisi kelapa parut pada bagian tengahnya. Banyak disajikan pada hari besar dan dapat bertahan sampai dua minggu lamanya.",
        "Bohromrom memiliki nama lain yaitu kue boh duek beudeh dalam bahasa Aceh. Jajanan ini sangat cocok untuk Anda yang bingung mencari oleh-oleh dari Aceh, kue ini adalah salah satu oleh-oleh yang cocok untuk keluarga dan kerabat Anda di rumah. Dalam pembuatan Bohromrom berbahan tepung ketan dan parutan kelapa sekilas mirip dengan kue klepon yang ada di Jawa, yang membedakan dari segi warna. Dalam kue Bahrom ada gula merah yang leleh ketika Anda mencicipi kue ini."
    )


    private val gambarMakanan = intArrayOf(
        R.drawable.mieaceh,
        R.drawable.satematang,
        R.drawable.kuahpliek,
        R.drawable.gulaikambing,
        R.drawable.kuahasamkeeung,
        R.drawable.kuahsieitek,
        R.drawable.ayamtangkap,
        R.drawable.rujakaceh,
        R.drawable.ungkotkemamah,
        R.drawable.kuetimphan,
        R.drawable.manisanpala,
        R.drawable.pisangsale,
        R.drawable.lepat,
        R.drawable.bohromrom
    )

    val listData: ArrayList<Makanan> get() {
        val list = arrayListOf<Makanan>()
        for(position in namaMakanan.indices){
            val makanan = Makanan()
            makanan.nama = namaMakanan[position]
            makanan.detail = detailMakanan[position]
            makanan.photo = gambarMakanan[position]
            list.add(makanan)
        }
        return list
    }

}