//package com.example.resttemplatedemo.test;
//
//public class LargeDataJson {
//
//
//    public static String getBigData() {
//        return "{\n" +
//                "  \"code\": \"200\",\n" +
//                "  \"msg\": \"Успешно\",\n" +
//                "  \"staff\": [\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003634\",\n" +
//                "      \"pinfl\": \"40603860230068\",\n" +
//                "      \"name\": \"Topilova Shaxlo Baxtiyarovna\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003635\",\n" +
//                "      \"pinfl\": \"43001740780039\",\n" +
//                "      \"name\": \"Ibragimova Gavhar Jo'rayevna\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003636\",\n" +
//                "      \"pinfl\": \"62807006500024\",\n" +
//                "      \"name\": \"Xo'jayeva Saodat Mirpo'lat qizi\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003637\",\n" +
//                "      \"pinfl\": \"41806860290019\",\n" +
//                "      \"name\": \"Tadjiyeva Ra'no Kamoletdinova\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003638\",\n" +
//                "      \"pinfl\": \"41410790290021\",\n" +
//                "      \"name\": \"Tolipova Ma'rifat Ubaydullayevna\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003639\",\n" +
//                "      \"pinfl\": \"40401976670013\",\n" +
//                "      \"name\": \"Toirova Muxlisa Ubaydilla qizi\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003640\",\n" +
//                "      \"pinfl\": \"61907026610048\",\n" +
//                "      \"name\": \"Abdulazizova Charos Orifjon qizi\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003641\",\n" +
//                "      \"pinfl\": \"41512966740041\",\n" +
//                "      \"name\": \"Azimova Fazilatxon Odil qizi\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000014\",\n" +
//                "      \"pinfl\": \"42012896600019\",\n" +
//                "      \"name\": \"Kadirova Iroda Xasanboy qizi\",\n" +
//                "      \"depName\": \"Kadrlar bo'yicha ish yuritish boshqarmasi\",\n" +
//                "      \"depId\": \"50000984\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000166\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000019\",\n" +
//                "      \"pinfl\": \"30402976500040\",\n" +
//                "      \"name\": \"Alixonov Bektosh Baxromjon o'g'li\",\n" +
//                "      \"depName\": \"Boshqaruv hujjatlari bilan ishlash va kotibiyat boshqarmasi\",\n" +
//                "      \"depId\": \"50001564\",\n" +
//                "      \"postName\": \"Referent\",\n" +
//                "      \"postId\": \"60000047\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000102\",\n" +
//                "      \"pinfl\": \"40107890241174\",\n" +
//                "      \"name\": \"Sattarova Mumtoza Nosirovna\",\n" +
//                "      \"depName\": \"Ichki xo'jalik amaliyotlari bo'limi\",\n" +
//                "      \"depId\": \"50001034\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60000474\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000105\",\n" +
//                "      \"pinfl\": \"41804870250106\",\n" +
//                "      \"name\": \"Musaxodjayeva Mavjuda Axmadjanovna\",\n" +
//                "      \"depName\": \"Devonxona sektori\",\n" +
//                "      \"depId\": \"50001566\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003510\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000149\",\n" +
//                "      \"pinfl\": \"42510860230100\",\n" +
//                "      \"name\": \"Nadirova Diyora Xusanovna\",\n" +
//                "      \"depName\": \"Ichki xo'jalik amaliyotlari bo'limi\",\n" +
//                "      \"depId\": \"50001034\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60000477\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000156\",\n" +
//                "      \"pinfl\": \"32007920241484\",\n" +
//                "      \"name\": \"Norqulov Abror Odil o'g'li\",\n" +
//                "      \"depName\": \"Soft collection bo'limi\",\n" +
//                "      \"depId\": \"50001026\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60004870\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000228\",\n" +
//                "      \"pinfl\": \"30307872970013\",\n" +
//                "      \"name\": \"Ibroximov Ilxomjon Ibroximjon o'g'li\",\n" +
//                "      \"depName\": \"Ta'minot bo'limi\",\n" +
//                "      \"depId\": \"50001052\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60002838\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000285\",\n" +
//                "      \"pinfl\": \"32505942330011\",\n" +
//                "      \"name\": \"Kudratilloyev Anvar Yunus og'li\",\n" +
//                "      \"depName\": \"Kredit mahsulotlarini ishlab chiqish boshqarmasi\",\n" +
//                "      \"depId\": \"50001020\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60005005\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000290\",\n" +
//                "      \"pinfl\": \"30608966500043\",\n" +
//                "      \"name\": \"Zabixullayev Farruxjon Rustam o'g'li\",\n" +
//                "      \"depName\": \"Bank xizmatlari markazlarini rivojlantirish bo'limi\",\n" +
//                "      \"depId\": \"50001029\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60003158\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000327\",\n" +
//                "      \"pinfl\": \"30210986610075\",\n" +
//                "      \"name\": \"O'tkurov Javdod Uchkurovich\",\n" +
//                "      \"depName\": \"Boshqaruv hujjatlari bilan ishlash va kotibiyat boshqarmasi\",\n" +
//                "      \"depId\": \"50001564\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003522\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000352\",\n" +
//                "      \"pinfl\": \"31403920171964\",\n" +
//                "      \"name\": \"G'ofurov Jaxongir Abdulla o'g'li\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60000572\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000360\",\n" +
//                "      \"pinfl\": \"32308940270033\",\n" +
//                "      \"name\": \"Negmatov Sarvarbek Izzatilla o'g'li\",\n" +
//                "      \"depName\": \"Texnik ta'minot va texnikalarni hisobini yuritish bo'limi\",\n" +
//                "      \"depId\": \"50001598\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003863\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000370\",\n" +
//                "      \"pinfl\": \"32908950330046\",\n" +
//                "      \"name\": \"Xaybatillayev Sherzodbek Shavkatbek o'g'li\",\n" +
//                "      \"depName\": \"Farmatsevtika loyihalarini moliyalashtirish markazi\",\n" +
//                "      \"depId\": \"50001537\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003341\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000383\",\n" +
//                "      \"pinfl\": \"41810890191422\",\n" +
//                "      \"name\": \"Karimova Indira Yakubovna\",\n" +
//                "      \"depName\": \"Moliya bozori amaliyotlari bo'limi\",\n" +
//                "      \"depId\": \"50001067\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003885\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000430\",\n" +
//                "      \"pinfl\": \"30705826780013\",\n" +
//                "      \"name\": \"Xayrullayev Sherzod Ismailovich\",\n" +
//                "      \"depName\": \"Ichki audit departamenti\",\n" +
//                "      \"depId\": \"50000034\",\n" +
//                "      \"postName\": \"Departament direktori\",\n" +
//                "      \"postId\": \"60000228\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000432\",\n" +
//                "      \"pinfl\": \"32005884140052\",\n" +
//                "      \"name\": \"Axmedov Jamshidbek Marifjonovich\",\n" +
//                "      \"depName\": \"Kredit risklarini audit qilish guruhi\",\n" +
//                "      \"depId\": \"50000988\",\n" +
//                "      \"postName\": \"Guruh rahbari\",\n" +
//                "      \"postId\": \"60000233\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000433\",\n" +
//                "      \"pinfl\": \"30803742700044\",\n" +
//                "      \"name\": \"Xo'jamberdiyev Ibroxim Suyunovich\",\n" +
//                "      \"depName\": \"Kredit risklarini audit qilish guruhi\",\n" +
//                "      \"depId\": \"50000988\",\n" +
//                "      \"postName\": \"Katta auditor\",\n" +
//                "      \"postId\": \"60000231\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000434\",\n" +
//                "      \"pinfl\": \"31712814040016\",\n" +
//                "      \"name\": \"Suvonkulov Bexzod Shavkatovich\",\n" +
//                "      \"depName\": \"Kredit monitoringi departamenti\",\n" +
//                "      \"depId\": \"50000053\",\n" +
//                "      \"postName\": \"Departament direktori o'rinbosari\",\n" +
//                "      \"postId\": \"60000753\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000435\",\n" +
//                "      \"pinfl\": \"31605932710012\",\n" +
//                "      \"name\": \"Azimov Nurjaxon Nurmaxmat\",\n" +
//                "      \"depName\": \"Kredit risklarini audit qilish guruhi\",\n" +
//                "      \"depId\": \"50000988\",\n" +
//                "      \"postName\": \"Auditor\",\n" +
//                "      \"postId\": \"60000234\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000436\",\n" +
//                "      \"pinfl\": \"30905882380105\",\n" +
//                "      \"name\": \"Haqnazarov Jasur Karomiddinovich\",\n" +
//                "      \"depName\": \"Tahlil va rejalashtirish guruhi\",\n" +
//                "      \"depId\": \"50000991\",\n" +
//                "      \"postName\": \"Katta auditor\",\n" +
//                "      \"postId\": \"60000247\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000437\",\n" +
//                "      \"pinfl\": \"31806822140045\",\n" +
//                "      \"name\": \"Alimatov Rustamjon Nurmirzayevich\",\n" +
//                "      \"depName\": \"Kredit risklarini audit qilish guruhi\",\n" +
//                "      \"depId\": \"50000988\",\n" +
//                "      \"postName\": \"Katta auditor\",\n" +
//                "      \"postId\": \"60003293\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000438\",\n" +
//                "      \"pinfl\": \"31412871070062\",\n" +
//                "      \"name\": \"Xudoyberdiyev Nodir Mustafoyevich\",\n" +
//                "      \"depName\": \"Operatsion risklarni audit qilish guruhi\",\n" +
//                "      \"depId\": \"50000989\",\n" +
//                "      \"postName\": \"Guruh rahbari\",\n" +
//                "      \"postId\": \"60000237\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000439\",\n" +
//                "      \"pinfl\": \"31110782700116\",\n" +
//                "      \"name\": \"Bobonazarov Jo'rabek Bobomurodovich\",\n" +
//                "      \"depName\": \"Operatsion risklarni audit qilish guruhi\",\n" +
//                "      \"depId\": \"50000989\",\n" +
//                "      \"postName\": \"Katta auditor\",\n" +
//                "      \"postId\": \"60000238\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000440\",\n" +
//                "      \"pinfl\": \"32111841810019\",\n" +
//                "      \"name\": \"Shomuratov Ismoil Norboyevich\",\n" +
//                "      \"depName\": \"Operatsion risklarni audit qilish guruhi\",\n" +
//                "      \"depId\": \"50000989\",\n" +
//                "      \"postName\": \"Katta auditor\",\n" +
//                "      \"postId\": \"60000239\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000441\",\n" +
//                "      \"pinfl\": \"31704881930048\",\n" +
//                "      \"name\": \"Allamuradov Umid Abdug'oniyevich\",\n" +
//                "      \"depName\": \"Kredit risklarini audit qilish guruhi\",\n" +
//                "      \"depId\": \"50000988\",\n" +
//                "      \"postName\": \"Katta auditor\",\n" +
//                "      \"postId\": \"60005022\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000442\",\n" +
//                "      \"pinfl\": \"32301830560054\",\n" +
//                "      \"name\": \"Zokirov Olimjon Xikmatullayevich\",\n" +
//                "      \"depName\": \"Operatsion risklarni audit qilish guruhi\",\n" +
//                "      \"depId\": \"50000989\",\n" +
//                "      \"postName\": \"Auditor\",\n" +
//                "      \"postId\": \"60000241\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000443\",\n" +
//                "      \"pinfl\": \"30802911000042\",\n" +
//                "      \"name\": \"Vasiyev Sardor Obidovich\",\n" +
//                "      \"depName\": \"Operatsion risklarni audit qilish guruhi\",\n" +
//                "      \"depId\": \"50000989\",\n" +
//                "      \"postName\": \"Auditor\",\n" +
//                "      \"postId\": \"60000242\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000444\",\n" +
//                "      \"pinfl\": \"30501864150069\",\n" +
//                "      \"name\": \"Rajapov Nursalim Tavakkalovich\",\n" +
//                "      \"depName\": \"Operatsion risklarni audit qilish guruhi\",\n" +
//                "      \"depId\": \"50000989\",\n" +
//                "      \"postName\": \"Auditor\",\n" +
//                "      \"postId\": \"60000243\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000446\",\n" +
//                "      \"pinfl\": \"32905751120032\",\n" +
//                "      \"name\": \"Vafiyev Raxim Xalimjonovich\",\n" +
//                "      \"depName\": \"Korporativ boshqaruv risklarini audit qilish guruhi\",\n" +
//                "      \"depId\": \"50000990\",\n" +
//                "      \"postName\": \"Katta auditor\",\n" +
//                "      \"postId\": \"60000244\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000448\",\n" +
//                "      \"pinfl\": \"32804796780015\",\n" +
//                "      \"name\": \"Saidov Ravshan Rustamovich\",\n" +
//                "      \"depName\": \"Tahlil va rejalashtirish guruhi\",\n" +
//                "      \"depId\": \"50000991\",\n" +
//                "      \"postName\": \"Guruh rahbari\",\n" +
//                "      \"postId\": \"60000248\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000449\",\n" +
//                "      \"pinfl\": \"32608791570066\",\n" +
//                "      \"name\": \"Usanov Arslon Nazarovich\",\n" +
//                "      \"depName\": \"Korporativ boshqaruv risklarini audit qilish guruhi\",\n" +
//                "      \"depId\": \"50000990\",\n" +
//                "      \"postName\": \"Guruh rahbari\",\n" +
//                "      \"postId\": \"60000245\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000451\",\n" +
//                "      \"pinfl\": \"32911806590017\",\n" +
//                "      \"name\": \"Davlatov Alisher Saparovich\",\n" +
//                "      \"depName\": \"Buxgalteriya hisobi va moliyaviy nazorat departamenti\",\n" +
//                "      \"depId\": \"50000043\",\n" +
//                "      \"postName\": \"Departament direktori - Bosh buxgalter\",\n" +
//                "      \"postId\": \"60000467\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000452\",\n" +
//                "      \"pinfl\": \"32312892720025\",\n" +
//                "      \"name\": \"Usmanov Shoxrux Norboboyevich\",\n" +
//                "      \"depName\": \"Buxgalteriya hisobi va moliyaviy nazorat departamenti\",\n" +
//                "      \"depId\": \"50000043\",\n" +
//                "      \"postName\": \"Departament direktori o'rinbosari - Bosh buxgalter o'rinbosari\",\n" +
//                "      \"postId\": \"60000469\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000453\",\n" +
//                "      \"pinfl\": \"32711841660018\",\n" +
//                "      \"name\": \"Ruzimuradov Komil Narbekovich\",\n" +
//                "      \"depName\": \"Mijozlar bazasini qo'llab-quvvatlash va rivojlantirish boshqarmasi\",\n" +
//                "      \"depId\": \"50001535\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i o'rinbosari\",\n" +
//                "      \"postId\": \"60003776\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000454\",\n" +
//                "      \"pinfl\": \"43008860620049\",\n" +
//                "      \"name\": \"Igamberdiyeva Dilafruz Baxramovna\",\n" +
//                "      \"depName\": \"Buxgalteriya hisobi va moliyaviy nazorat departamenti\",\n" +
//                "      \"depId\": \"50000043\",\n" +
//                "      \"postName\": \"Ish yurituvchi - kotib\",\n" +
//                "      \"postId\": \"60000470\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000455\",\n" +
//                "      \"pinfl\": \"41905706530013\",\n" +
//                "      \"name\": \"Kim Valeriya Moiseyevna\",\n" +
//                "      \"depName\": \"Moliyaviy nazorat bo'limi\",\n" +
//                "      \"depId\": \"50001040\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000499\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000456\",\n" +
//                "      \"pinfl\": \"30612802130013\",\n" +
//                "      \"name\": \"Valijonov Farxod Alijonovich\",\n" +
//                "      \"depName\": \"Yakuniy nazorat sektori\",\n" +
//                "      \"depId\": \"50001620\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003876\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000457\",\n" +
//                "      \"pinfl\": \"43009890310889\",\n" +
//                "      \"name\": \"Ostonova Kamola Botirovna\",\n" +
//                "      \"depName\": \"Ichki xo'jalik amaliyotlari bo'limi\",\n" +
//                "      \"depId\": \"50001034\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000473\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000458\",\n" +
//                "      \"pinfl\": \"41305940270076\",\n" +
//                "      \"name\": \"Yunusova Bonuxon Akmal qizi\",\n" +
//                "      \"depName\": \"Ichki xo'jalik amaliyotlari bo'limi\",\n" +
//                "      \"depId\": \"50001034\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60000474\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000459\",\n" +
//                "      \"pinfl\": \"40901876600025\",\n" +
//                "      \"name\": \"Alimova Nasiba Sunnatillayevna\",\n" +
//                "      \"depName\": \"Ichki xo'jalik amaliyotlari bo'limi\",\n" +
//                "      \"depId\": \"50001034\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60000475\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000460\",\n" +
//                "      \"pinfl\": \"41708810240021\",\n" +
//                "      \"name\": \"Nabixanova Dilnoza Nuriddinovna\",\n" +
//                "      \"depName\": \"Ichki xo'jalik amaliyotlari bo'limi\",\n" +
//                "      \"depId\": \"50001034\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60000476\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000461\",\n" +
//                "      \"pinfl\": \"43006876560014\",\n" +
//                "      \"name\": \"Yusupdjanova Ra'no Adilovna\",\n" +
//                "      \"depName\": \"\",\n" +
//                "      \"depId\": \"\",\n" +
//                "      \"postName\": \"\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000462\",\n" +
//                "      \"pinfl\": \"32012800480046\",\n" +
//                "      \"name\": \"Xotamov Bekzot Nuraliyevich\",\n" +
//                "      \"depName\": \"Soliq hisobi va hisobotlari boshqarmasi\",\n" +
//                "      \"depId\": \"50001035\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60000479\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000465\",\n" +
//                "      \"pinfl\": \"30905871570047\",\n" +
//                "      \"name\": \"Mamarajabov Bobur Abduxakimovich\",\n" +
//                "      \"depName\": \"Balans va yagona korrespondentlik hisobini konsolidatsiya qilish bo'limi\",\n" +
//                "      \"depId\": \"50001036\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60000483\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000466\",\n" +
//                "      \"pinfl\": \"32607934310044\",\n" +
//                "      \"name\": \"Tursunov Diyorbek Adxamjon o'g'li\",\n" +
//                "      \"depName\": \"Balans va yagona korrespondentlik hisobini konsolidatsiya qilish bo'limi\",\n" +
//                "      \"depId\": \"50001036\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60000484\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000467\",\n" +
//                "      \"pinfl\": \"32406955360034\",\n" +
//                "      \"name\": \"Ismoilov Murodjon Iskandar o'g'li\",\n" +
//                "      \"depName\": \"Hisob siyosati ijrosi bo'limi\",\n" +
//                "      \"depId\": \"50001039\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003725\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000468\",\n" +
//                "      \"pinfl\": \"62711007340038\",\n" +
//                "      \"name\": \"Izentayeva Guljahan Barlikbayevna\",\n" +
//                "      \"depName\": \"Soliq hisobi va hisobotlari boshqarmasi\",\n" +
//                "      \"depId\": \"50001035\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60005029\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000469\",\n" +
//                "      \"pinfl\": \"32309890261485\",\n" +
//                "      \"name\": \"Inoyatov Shoazim Sa'dullayevich\",\n" +
//                "      \"depName\": \"Moliyaviy nazorat bo'limi\",\n" +
//                "      \"depId\": \"50001040\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60000498\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000472\",\n" +
//                "      \"pinfl\": \"31711700050027\",\n" +
//                "      \"name\": \"Xikmatullayev Rustam Batirovich\",\n" +
//                "      \"depName\": \"Ishlarni boshqarish departamenti\",\n" +
//                "      \"depId\": \"50000046\",\n" +
//                "      \"postName\": \"Departament direktori o'rinbosari\",\n" +
//                "      \"postId\": \"60000553\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000473\",\n" +
//                "      \"pinfl\": \"31009840450013\",\n" +
//                "      \"name\": \"Sabirov Alimardon Aduganiyevich\",\n" +
//                "      \"depName\": \"Ishlarni boshqarish departamenti\",\n" +
//                "      \"depId\": \"50000046\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60002740\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000474\",\n" +
//                "      \"pinfl\": \"30107880050026\",\n" +
//                "      \"name\": \"Sharipov Sayfulla Kudratillayevich\",\n" +
//                "      \"depName\": \"Ishlarni boshqarish departamenti\",\n" +
//                "      \"depId\": \"50000046\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60000555\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000475\",\n" +
//                "      \"pinfl\": \"32411890231729\",\n" +
//                "      \"name\": \"Gafurov Farxod Baxramjonovich\",\n" +
//                "      \"depName\": \"Ta'minot bo'limi\",\n" +
//                "      \"depId\": \"50001052\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60005003\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000476\",\n" +
//                "      \"pinfl\": \"30508870170021\",\n" +
//                "      \"name\": \"Abrarov Xojiakbar Axmatxanovich\",\n" +
//                "      \"depName\": \"Ta'minot bo'limi\",\n" +
//                "      \"depId\": \"50001052\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000557\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000477\",\n" +
//                "      \"pinfl\": \"32709890310785\",\n" +
//                "      \"name\": \"Gafarov Azamat Abduxapizovich\",\n" +
//                "      \"depName\": \"Ta'minot bo'limi\",\n" +
//                "      \"depId\": \"50001052\",\n" +
//                "      \"postName\": \"Ombor mudiri\",\n" +
//                "      \"postId\": \"60000558\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000478\",\n" +
//                "      \"pinfl\": \"30502930211484\",\n" +
//                "      \"name\": \"Anvarov Lazizjon Azizjon\",\n" +
//                "      \"depName\": \"Ta'minot bo'limi\",\n" +
//                "      \"depId\": \"50001052\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60000559\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000479\",\n" +
//                "      \"pinfl\": \"30202690280013\",\n" +
//                "      \"name\": \"Kuchkanov Nemat Djumadullayevich\",\n" +
//                "      \"depName\": \"Ta'minot bo'limi\",\n" +
//                "      \"depId\": \"50001052\",\n" +
//                "      \"postName\": \"Yuk tashuvchi\",\n" +
//                "      \"postId\": \"60000560\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000480\",\n" +
//                "      \"pinfl\": \"30409730280039\",\n" +
//                "      \"name\": \"Usmonov Abdusodik Abdusattarovich\",\n" +
//                "      \"depName\": \"Ta'minot bo'limi\",\n" +
//                "      \"depId\": \"50001052\",\n" +
//                "      \"postName\": \"Yuk tashuvchi\",\n" +
//                "      \"postId\": \"60000561\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000482\",\n" +
//                "      \"pinfl\": \"31205830200057\",\n" +
//                "      \"name\": \"Axmetov Rovshan Niyazovich\",\n" +
//                "      \"depName\": \"Ko'chmas mulk sektori\",\n" +
//                "      \"depId\": \"50001053\",\n" +
//                "      \"postName\": \"Sektor mudiri\",\n" +
//                "      \"postId\": \"60003477\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000483\",\n" +
//                "      \"pinfl\": \"31801830190039\",\n" +
//                "      \"name\": \"Yuldashev Nodir Muxtardjanovich\",\n" +
//                "      \"depName\": \"Ishlarni boshqarish departamenti\",\n" +
//                "      \"depId\": \"50000046\",\n" +
//                "      \"postName\": \"Departament direktori o'rinbosari\",\n" +
//                "      \"postId\": \"60002798\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000484\",\n" +
//                "      \"pinfl\": \"32008860270019\",\n" +
//                "      \"name\": \"Dadamuxamedov Farxod Rishatovich\",\n" +
//                "      \"depName\": \"Transport bo'limi\",\n" +
//                "      \"depId\": \"50001054\",\n" +
//                "      \"postName\": \"Bosh mexanik\",\n" +
//                "      \"postId\": \"60000565\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000489\",\n" +
//                "      \"pinfl\": \"30906720170054\",\n" +
//                "      \"name\": \"Xalikov Okiljon Xashimovich\",\n" +
//                "      \"depName\": \"Transport bo'limi\",\n" +
//                "      \"depId\": \"50001054\",\n" +
//                "      \"postName\": \"Yengil avtomobil xaydovchisi\",\n" +
//                "      \"postId\": \"60000569\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000491\",\n" +
//                "      \"pinfl\": \"31205650221450\",\n" +
//                "      \"name\": \"Kulaxmedov Taxir Maxamatazizovich\",\n" +
//                "      \"depName\": \"Transport bo'limi\",\n" +
//                "      \"depId\": \"50001054\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60003622\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000493\",\n" +
//                "      \"pinfl\": \"30504860170022\",\n" +
//                "      \"name\": \"Mavlanov Nodirjon Abdunosirovich\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"Bosh energetik\",\n" +
//                "      \"postId\": \"60000573\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000494\",\n" +
//                "      \"pinfl\": \"32812890310706\",\n" +
//                "      \"name\": \"Igamberdiyev G'ayratjon Tairjonovich\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"Xo'jalik mudiri\",\n" +
//                "      \"postId\": \"60000574\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000495\",\n" +
//                "      \"pinfl\": \"31710630230077\",\n" +
//                "      \"name\": \"Gulyamov Djamalitdin Zuxritdinovich\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"Tokar`\",\n" +
//                "      \"postId\": \"60000575\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000496\",\n" +
//                "      \"pinfl\": \"30704716600015\",\n" +
//                "      \"name\": \"Utaganov Matibroxim Maxmudovich\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"Chilangar\",\n" +
//                "      \"postId\": \"60000580\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000497\",\n" +
//                "      \"pinfl\": \"30306770190103\",\n" +
//                "      \"name\": \"Yunusov Fazliddin Xayritdinovich\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"Chilangar\",\n" +
//                "      \"postId\": \"60000581\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000499\",\n" +
//                "      \"pinfl\": \"32307890310691\",\n" +
//                "      \"name\": \"Mirxamedov Abdurasul Abduraxmanovich\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"Elektrik\",\n" +
//                "      \"postId\": \"60000577\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000500\",\n" +
//                "      \"pinfl\": \"30207776520038\",\n" +
//                "      \"name\": \"Savin Sergey Ivanovich\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"Elektrik\",\n" +
//                "      \"postId\": \"60000578\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000501\",\n" +
//                "      \"pinfl\": \"30910690190093\",\n" +
//                "      \"name\": \"Neumetov Refkat Izaxitdinovich\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"Elektrik\",\n" +
//                "      \"postId\": \"60000579\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000502\",\n" +
//                "      \"pinfl\": \"30808690070018\",\n" +
//                "      \"name\": \"Kadirov Axmatjan Raximjanovich\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"Bogbon\",\n" +
//                "      \"postId\": \"60000582\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000503\",\n" +
//                "      \"pinfl\": \"41102760780017\",\n" +
//                "      \"name\": \"Musayeva Surayyo Abdugapurovna\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"Farrosh\",\n" +
//                "      \"postId\": \"60000583\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000504\",\n" +
//                "      \"pinfl\": \"42703800200017\",\n" +
//                "      \"name\": \"Islamova Nilufar Ergashevna\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"Farrosh\",\n" +
//                "      \"postId\": \"60000584\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000505\",\n" +
//                "      \"pinfl\": \"41104820160078\",\n" +
//                "      \"name\": \"Usmanova Muazzam Karimovna\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"Farrosh\",\n" +
//                "      \"postId\": \"60000585\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000506\",\n" +
//                "      \"pinfl\": \"42312790140016\",\n" +
//                "      \"name\": \"Ismatova Guzal Boxodirovna\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"Farrosh\",\n" +
//                "      \"postId\": \"60000586\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000507\",\n" +
//                "      \"pinfl\": \"42311760280011\",\n" +
//                "      \"name\": \"Abdurasulova Guzal Yuldashevna\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"Farrosh\",\n" +
//                "      \"postId\": \"60000587\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000508\",\n" +
//                "      \"pinfl\": \"40908830170093\",\n" +
//                "      \"name\": \"Usmanova Muxabbat Anvarovna\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"Farrosh\",\n" +
//                "      \"postId\": \"60000588\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000509\",\n" +
//                "      \"pinfl\": \"41203780200038\",\n" +
//                "      \"name\": \"Rustamova Rano Nigmatullayevna\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"Farrosh\",\n" +
//                "      \"postId\": \"60000589\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000510\",\n" +
//                "      \"pinfl\": \"41612750280048\",\n" +
//                "      \"name\": \"Kadirova Dlorom Xabibullayevna\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"Farrosh\",\n" +
//                "      \"postId\": \"60000590\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000512\",\n" +
//                "      \"pinfl\": \"41903790580093\",\n" +
//                "      \"name\": \"Kasimova Nigora Saydamirovna\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"Farrosh\",\n" +
//                "      \"postId\": \"60000592\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000514\",\n" +
//                "      \"pinfl\": \"31708841610052\",\n" +
//                "      \"name\": \"Asatullayev Alisher Asatulla o'g'li\",\n" +
//                "      \"depName\": \"Bank ijro apparati\",\n" +
//                "      \"depId\": \"50000025\",\n" +
//                "      \"postName\": \"Direktor\",\n" +
//                "      \"postId\": \"60000008\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000515\",\n" +
//                "      \"pinfl\": \"30508956520018\",\n" +
//                "      \"name\": \"Zuxriddinov Baxriynur Alisher o'g'li\",\n" +
//                "      \"depName\": \"Bank ijro apparati\",\n" +
//                "      \"depId\": \"50000025\",\n" +
//                "      \"postName\": \"Menedjer\",\n" +
//                "      \"postId\": \"60002964\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000517\",\n" +
//                "      \"pinfl\": \"31506910252006\",\n" +
//                "      \"name\": \"Begmatov Abdulatif Abdumutalovich\",\n" +
//                "      \"depName\": \"Boshqaruv hujjatlari bilan ishlash va kotibiyat boshqarmasi\",\n" +
//                "      \"depId\": \"50001564\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60003483\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000518\",\n" +
//                "      \"pinfl\": \"30903853910069\",\n" +
//                "      \"name\": \"Sulaymonov Jasur Jalolovich\",\n" +
//                "      \"depName\": \"Legal collection bo'limi\",\n" +
//                "      \"depId\": \"50001531\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60003314\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000519\",\n" +
//                "      \"pinfl\": \"30410920172195\",\n" +
//                "      \"name\": \"Yusupov Sarvar Xasan o'g'li\",\n" +
//                "      \"depName\": \"Ijro nazorati boshqarmasi\",\n" +
//                "      \"depId\": \"50001565\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60003495\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000521\",\n" +
//                "      \"pinfl\": \"42305896570012\",\n" +
//                "      \"name\": \"Chakkanova Lola Kaxarovna\",\n" +
//                "      \"depName\": \"Ijro nazorati boshqarmasi\",\n" +
//                "      \"depId\": \"50001565\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003497\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000523\",\n" +
//                "      \"pinfl\": \"30901826090020\",\n" +
//                "      \"name\": \"Beknazarov Abror Muxiddinovich\",\n" +
//                "      \"depName\": \"Bank ijro apparati\",\n" +
//                "      \"depId\": \"50000025\",\n" +
//                "      \"postName\": \"Direktor o'rinbosari\",\n" +
//                "      \"postId\": \"60002374\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000524\",\n" +
//                "      \"pinfl\": \"32012854250033\",\n" +
//                "      \"name\": \"Isakov Miraziz Abdumajidovich\",\n" +
//                "      \"depName\": \"Ekspert-tahlil guruhi\",\n" +
//                "      \"depId\": \"50000964\",\n" +
//                "      \"postName\": \"Guruh rahbari\",\n" +
//                "      \"postId\": \"60003515\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000525\",\n" +
//                "      \"pinfl\": \"31402901110042\",\n" +
//                "      \"name\": \"Axtamov Mirshod Axtam o'g'li\",\n" +
//                "      \"depName\": \"Bank xizmatlari iste'molchilari huquqini himoya qilish bo'limi\",\n" +
//                "      \"depId\": \"50000970\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60003514\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000526\",\n" +
//                "      \"pinfl\": \"31412782090010\",\n" +
//                "      \"name\": \"Mamadumarov Adxamjon Sobirjonovich\",\n" +
//                "      \"depName\": \"Ekspert-tahlil guruhi\",\n" +
//                "      \"depId\": \"50000964\",\n" +
//                "      \"postName\": \"Ekspert (Namangan BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60003766\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000528\",\n" +
//                "      \"pinfl\": \"32208862100031\",\n" +
//                "      \"name\": \"Buriyev Azizbek Shermirzaevich\",\n" +
//                "      \"depName\": \"Ekspert-tahlil guruhi\",\n" +
//                "      \"depId\": \"50000964\",\n" +
//                "      \"postName\": \"Ekspert (Namangan BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60002972\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000530\",\n" +
//                "      \"pinfl\": \"32209764110012\",\n" +
//                "      \"name\": \"Dadashyev Davronbek Mirzaqulovich\",\n" +
//                "      \"depName\": \"Ekspert-tahlil guruhi\",\n" +
//                "      \"depId\": \"50000964\",\n" +
//                "      \"postName\": \"Ekspert (Farg'ona BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60002968\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000531\",\n" +
//                "      \"pinfl\": \"33005873090028\",\n" +
//                "      \"name\": \"Matqurbanov Izzatbek Komilovich\",\n" +
//                "      \"depName\": \"Ekspert-tahlil guruhi\",\n" +
//                "      \"depId\": \"50000964\",\n" +
//                "      \"postName\": \"Ekspert (Urganch BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60002971\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000533\",\n" +
//                "      \"pinfl\": \"31404883940048\",\n" +
//                "      \"name\": \"Ashirov Nuriddin Muxiddinovich\",\n" +
//                "      \"depName\": \"Murojaatlar bilan ishlash boshqarmasi\",\n" +
//                "      \"depId\": \"50001567\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60003511\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000534\",\n" +
//                "      \"pinfl\": \"32305862580033\",\n" +
//                "      \"name\": \"Xakimov Dilshod Tojimurotovich\",\n" +
//                "      \"depName\": \"Garov mulkini baholash bo‘limi\",\n" +
//                "      \"depId\": \"50001912\",\n" +
//                "      \"postName\": \"Bosh mutaxassis (BXM bo‘yicha)\",\n" +
//                "      \"postId\": \"60005086\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000535\",\n" +
//                "      \"pinfl\": \"32707900201333\",\n" +
//                "      \"name\": \"Ibroximov Zoxid  Zoirovich\",\n" +
//                "      \"depName\": \"Biriktirilgan hududlar va sohalar bo’yicha ishlarni muvofiqlashtirishboshqarmasi\",\n" +
//                "      \"depId\": \"50001570\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60003518\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000539\",\n" +
//                "      \"pinfl\": \"30603842560081\",\n" +
//                "      \"name\": \"Avloqulov Mashrab Akramovich\",\n" +
//                "      \"depName\": \"Dasturlar ijrosini nazorat qilish boshqarma\",\n" +
//                "      \"depId\": \"50000966\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60002991\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000540\",\n" +
//                "      \"pinfl\": \"30309840270053\",\n" +
//                "      \"name\": \"Axmedov Komron Muxammat-Alievich\",\n" +
//                "      \"depName\": \"Dasturlarni shakllantirish boshqarmasi\",\n" +
//                "      \"depId\": \"50000965\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60002979\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000541\",\n" +
//                "      \"pinfl\": \"31407860260041\",\n" +
//                "      \"name\": \"Jurayev Olimjon Raxmatullaevich\",\n" +
//                "      \"depName\": \"Dasturlar ijrosini nazorat qilish boshqarma\",\n" +
//                "      \"depId\": \"50000966\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60003516\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000543\",\n" +
//                "      \"pinfl\": \"30803732160043\",\n" +
//                "      \"name\": \"Ortikov Muxiddin Kamoliddinovich\",\n" +
//                "      \"depName\": \"Biriktirilgan hududlar va sohalar bo’yicha ishlarni muvofiqlashtirishboshqarmasi\",\n" +
//                "      \"depId\": \"50001570\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60003517\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000544\",\n" +
//                "      \"pinfl\": \"30909860220096\",\n" +
//                "      \"name\": \"Axmedjanov Mumtoz Muzaffarovich\",\n" +
//                "      \"depName\": \"Biriktirilgan hududlar va sohalar bo’yicha ishlarni muvofiqlashtirishboshqarmasi\",\n" +
//                "      \"depId\": \"50001570\",\n" +
//                "      \"postName\": \"Xududiy menedjer\",\n" +
//                "      \"postId\": \"60003519\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000546\",\n" +
//                "      \"pinfl\": \"32006952550012\",\n" +
//                "      \"name\": \"Abdiraximov Olimjon Shokir o'g'li\",\n" +
//                "      \"depName\": \"Boshqaruv hujjatlari bilan ishlash va kotibiyat boshqarmasi\",\n" +
//                "      \"depId\": \"50001564\",\n" +
//                "      \"postName\": \"Referent\",\n" +
//                "      \"postId\": \"60003500\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000547\",\n" +
//                "      \"pinfl\": \"33112870270026\",\n" +
//                "      \"name\": \"Nurmatov Javlon  Temur-Alievich\",\n" +
//                "      \"depName\": \"Valyuta ayirboshlash amaliyotlari bo'limi\",\n" +
//                "      \"depId\": \"50001874\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60004941\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000552\",\n" +
//                "      \"pinfl\": \"40711870220130\",\n" +
//                "      \"name\": \"Sultanova Aziza Xamidovna\",\n" +
//                "      \"depName\": \"Mijozlarga xizmat ko'rsatish boshqarmasi\",\n" +
//                "      \"depId\": \"50000975\",\n" +
//                "      \"postName\": \"Kotib - resepshionist\",\n" +
//                "      \"postId\": \"60002502\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000553\",\n" +
//                "      \"pinfl\": \"40907910211253\",\n" +
//                "      \"name\": \"Musashayxova Ma'mura Jaxongir qizi\",\n" +
//                "      \"depName\": \"\",\n" +
//                "      \"depId\": \"\",\n" +
//                "      \"postName\": \"\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000554\",\n" +
//                "      \"pinfl\": \"30502860100034\",\n" +
//                "      \"name\": \"Toshmatov Akmal Sunnatillaevich\",\n" +
//                "      \"depName\": \"Murojaatlar bilan ishlash boshqarmasi\",\n" +
//                "      \"depId\": \"50001567\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60003512\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000555\",\n" +
//                "      \"pinfl\": \"41003826780010\",\n" +
//                "      \"name\": \"Allanazarova Dilfuza Kuldashevna\",\n" +
//                "      \"depName\": \"Murojaatlar bilan ishlash boshqarmasi\",\n" +
//                "      \"depId\": \"50001567\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003513\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000556\",\n" +
//                "      \"pinfl\": \"30904921671392\",\n" +
//                "      \"name\": \"Ibragimov Muzaffar Maxamadali o'g'li\",\n" +
//                "      \"depName\": \"Byudjetni rejalashtirish va nazorat qilish boshqarmasi\",\n" +
//                "      \"depId\": \"50001492\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60003250\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000558\",\n" +
//                "      \"pinfl\": \"41904998660044\",\n" +
//                "      \"name\": \"Yunusboeva Moxinur Abdusodik qizi\",\n" +
//                "      \"depName\": \"Devonxona sektori\",\n" +
//                "      \"depId\": \"50001566\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003510\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000559\",\n" +
//                "      \"pinfl\": \"50603015050038\",\n" +
//                "      \"name\": \"Xoshimov Muxammadlaziz Azimjon o'g'li\",\n" +
//                "      \"depName\": \"Boshqaruv hujjatlari bilan ishlash va kotibiyat boshqarmasi\",\n" +
//                "      \"depId\": \"50001564\",\n" +
//                "      \"postName\": \"Referent\",\n" +
//                "      \"postId\": \"60003503\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000560\",\n" +
//                "      \"pinfl\": \"42306890261306\",\n" +
//                "      \"name\": \"Bekmuradova Durdona Baxodirovna\",\n" +
//                "      \"depName\": \"Devonxona sektori\",\n" +
//                "      \"depId\": \"50001566\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003508\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000561\",\n" +
//                "      \"pinfl\": \"41903780290014\",\n" +
//                "      \"name\": \"Nizamova Madina Niyazovna\",\n" +
//                "      \"depName\": \"Devonxona sektori\",\n" +
//                "      \"depId\": \"50001566\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003507\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000563\",\n" +
//                "      \"pinfl\": \"32912831220038\",\n" +
//                "      \"name\": \"Isakov Azizbek Salaxitdinovich\",\n" +
//                "      \"depName\": \"Ekspert-tahlil guruhi\",\n" +
//                "      \"depId\": \"50000964\",\n" +
//                "      \"postName\": \"Ekspert (Andijon BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60002975\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000564\",\n" +
//                "      \"pinfl\": \"52804016670049\",\n" +
//                "      \"name\": \"Ibroximxo'jayev Abbosxo'ja Muxammadxo'ja o'g'li\",\n" +
//                "      \"depName\": \"Boshqaruv hujjatlari bilan ishlash va kotibiyat boshqarmasi\",\n" +
//                "      \"depId\": \"50001564\",\n" +
//                "      \"postName\": \"Referent\",\n" +
//                "      \"postId\": \"60004855\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000565\",\n" +
//                "      \"pinfl\": \"30305873500031\",\n" +
//                "      \"name\": \"Arz'mbetov Alisher Jaks'movich\",\n" +
//                "      \"depName\": \"Ekspert-tahlil guruhi\",\n" +
//                "      \"depId\": \"50000964\",\n" +
//                "      \"postName\": \"Ekspert (Nukus BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60002978\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000567\",\n" +
//                "      \"pinfl\": \"30504822730035\",\n" +
//                "      \"name\": \"Ishpulatov Shuxrat Shamsiddinovich\",\n" +
//                "      \"depName\": \"Ijro nazorati boshqarmasi\",\n" +
//                "      \"depId\": \"50001565\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60003494\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000568\",\n" +
//                "      \"pinfl\": \"41710910241415\",\n" +
//                "      \"name\": \"Abdurazakova Marxabo Djalolidin qizi\",\n" +
//                "      \"depName\": \"Devonxona sektori\",\n" +
//                "      \"depId\": \"50001566\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003505\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000575\",\n" +
//                "      \"pinfl\": \"30905750360033\",\n" +
//                "      \"name\": \"Xamrayev Alijan Amanullaevich\",\n" +
//                "      \"depName\": \"Xavfsizlik va axborotlarni muhofaza qilish boshqarmasi\",\n" +
//                "      \"depId\": \"50000031\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60000107\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000576\",\n" +
//                "      \"pinfl\": \"31106820200045\",\n" +
//                "      \"name\": \"Salixodjayev Iskandarxo'ja Il'yasovich\",\n" +
//                "      \"depName\": \"Xavfsizlik va axborotlarni muhofaza qilish boshqarmasi\",\n" +
//                "      \"depId\": \"50000031\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i o'rinbosari\",\n" +
//                "      \"postId\": \"60000108\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000577\",\n" +
//                "      \"pinfl\": \"32110770210017\",\n" +
//                "      \"name\": \"Nabiyev Umid Utkirovich\",\n" +
//                "      \"depName\": \"Xavfsizlik va axborotlarni muhofaza qilish boshqarmasi\",\n" +
//                "      \"depId\": \"50000031\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i o'rinbosari\",\n" +
//                "      \"postId\": \"60000109\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000579\",\n" +
//                "      \"pinfl\": \"30304730280019\",\n" +
//                "      \"name\": \"Ruzikulov Xayrulla Uktamovich\",\n" +
//                "      \"depName\": \"Xavfsizlik tartiboti va nazorat bo'limi\",\n" +
//                "      \"depId\": \"50000977\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000115\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000580\",\n" +
//                "      \"pinfl\": \"32212920232073\",\n" +
//                "      \"name\": \"Karimkulov Sanjar Xakimjonovich\",\n" +
//                "      \"depName\": \"Xavfsizlik tartiboti va nazorat bo'limi\",\n" +
//                "      \"depId\": \"50000977\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000113\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000581\",\n" +
//                "      \"pinfl\": \"31111860460018\",\n" +
//                "      \"name\": \"Urinbaev Farxod Odiljonovich\",\n" +
//                "      \"depName\": \"Xavfsizlik tartiboti va nazorat bo'limi\",\n" +
//                "      \"depId\": \"50000977\",\n" +
//                "      \"postName\": \"Bosh mutaxassis (Poytaxt BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60004910\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000583\",\n" +
//                "      \"pinfl\": \"43107670220031\",\n" +
//                "      \"name\": \"Valiyeva Mastura Numanovna\",\n" +
//                "      \"depName\": \"Xodimlarni tanlash va moslashtirish boshqarmasi\",\n" +
//                "      \"depId\": \"50000981\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60002903\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000584\",\n" +
//                "      \"pinfl\": \"31605776860016\",\n" +
//                "      \"name\": \"Nishonov Jamoliddin Sayfullaevich\",\n" +
//                "      \"depName\": \"Iqtisodiy xavfsizlik bo'limi\",\n" +
//                "      \"depId\": \"50000978\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60000116\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000585\",\n" +
//                "      \"pinfl\": \"30307770220083\",\n" +
//                "      \"name\": \"Elmuradov Matraim Aralovich\",\n" +
//                "      \"depName\": \"Iqtisodiy xavfsizlik bo'limi\",\n" +
//                "      \"depId\": \"50000978\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000117\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000586\",\n" +
//                "      \"pinfl\": \"32102890640023\",\n" +
//                "      \"name\": \"Kurbonov Nodirbek Sobirovich\",\n" +
//                "      \"depName\": \"Iqtisodiy xavfsizlik bo'limi\",\n" +
//                "      \"depId\": \"50000978\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000118\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000587\",\n" +
//                "      \"pinfl\": \"32407942380105\",\n" +
//                "      \"name\": \"Axmedov Kobuljon Aktam o'g'li\",\n" +
//                "      \"depName\": \"Axborot xavfsizligi bo'limi\",\n" +
//                "      \"depId\": \"50000979\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60000119\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000588\",\n" +
//                "      \"pinfl\": \"30101966140205\",\n" +
//                "      \"name\": \"Sadritdinov  Qodir  Qamariddin o'g'li\",\n" +
//                "      \"depName\": \"Axborot xavfsizligi bo'limi\",\n" +
//                "      \"depId\": \"50000979\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000120\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000589\",\n" +
//                "      \"pinfl\": \"31603944040051\",\n" +
//                "      \"name\": \"Boboqandov Alisher Boboqand o'g'li\",\n" +
//                "      \"depName\": \"Axborot xavfsizligi bo'limi\",\n" +
//                "      \"depId\": \"50000979\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000121\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000590\",\n" +
//                "      \"pinfl\": \"31208930530020\",\n" +
//                "      \"name\": \"Jamoliddinov Sardor Shuxrat o'g'li\",\n" +
//                "      \"depName\": \"Axborot xavfsizligi bo'limi\",\n" +
//                "      \"depId\": \"50000979\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000122\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000591\",\n" +
//                "      \"pinfl\": \"30809946140017\",\n" +
//                "      \"name\": \"Sayitaxmadov Sherali Sayitaxmad o'g'li\",\n" +
//                "      \"depName\": \"Axborot xavfsizligi bo'limi\",\n" +
//                "      \"depId\": \"50000979\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000123\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000592\",\n" +
//                "      \"pinfl\": \"31801880220043\",\n" +
//                "      \"name\": \"Saidnazarov Burxon  Baxodirovich\",\n" +
//                "      \"depName\": \"Axborot xavfsizligi bo'limi\",\n" +
//                "      \"depId\": \"50000979\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000124\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000593\",\n" +
//                "      \"pinfl\": \"32508966950061\",\n" +
//                "      \"name\": \"Qurbonov Umidjon Fazliddin o'g'li\",\n" +
//                "      \"depName\": \"Axborot xavfsizligi bo'limi\",\n" +
//                "      \"depId\": \"50000979\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60002444\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000594\",\n" +
//                "      \"pinfl\": \"31810966030023\",\n" +
//                "      \"name\": \"Salimov  Bektosh To'lqin o'g'li\",\n" +
//                "      \"depName\": \"Axborot xavfsizligi bo'limi\",\n" +
//                "      \"depId\": \"50000979\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60002445\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000595\",\n" +
//                "      \"pinfl\": \"32601870201301\",\n" +
//                "      \"name\": \"Karimov Elmurodjon G'ulomovich\",\n" +
//                "      \"depName\": \"Mehnat muhofazasi va xavfsizlik texnikasi bo'limi\",\n" +
//                "      \"depId\": \"50001870\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60004924\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000596\",\n" +
//                "      \"pinfl\": \"42907766520017\",\n" +
//                "      \"name\": \"Xudoyberdiyeva Feruza Axmadovna\",\n" +
//                "      \"depName\": \"Xavfsizlik tartiboti va nazorat bo'limi\",\n" +
//                "      \"depId\": \"50000977\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60004920\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000597\",\n" +
//                "      \"pinfl\": \"31609911581372\",\n" +
//                "      \"name\": \"Narzullayev  Dilmurod Soxibiddin o'g'li\",\n" +
//                "      \"depName\": \"Xavfsizlik tartiboti va nazorat bo'limi\",\n" +
//                "      \"depId\": \"50000977\",\n" +
//                "      \"postName\": \"Bosh mutaxassis (Jizzax BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60004904\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000599\",\n" +
//                "      \"pinfl\": \"31307824340058\",\n" +
//                "      \"name\": \"Abduraxmanov Nodirbek Xolmirzaevich\",\n" +
//                "      \"depName\": \"Xavfsizlik tartiboti va nazorat bo'limi\",\n" +
//                "      \"depId\": \"50000977\",\n" +
//                "      \"postName\": \"Bosh mutaxassis (Qo'qon BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60004912\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000601\",\n" +
//                "      \"pinfl\": \"30505750260014\",\n" +
//                "      \"name\": \"Ibragimov  Ulug'bek Akil'djanovich\",\n" +
//                "      \"depName\": \"Xavfsizlik tartiboti va nazorat bo'limi\",\n" +
//                "      \"depId\": \"50000977\",\n" +
//                "      \"postName\": \"Bosh mutaxassis (Nurafshon BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60004914\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000603\",\n" +
//                "      \"pinfl\": \"31801715030012\",\n" +
//                "      \"name\": \"Mamajonov Zuxridin Axmadjonovich\",\n" +
//                "      \"depName\": \"Xavfsizlik tartiboti va nazorat bo'limi\",\n" +
//                "      \"depId\": \"50000977\",\n" +
//                "      \"postName\": \"Bosh mutaxassis (Andijon BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60004915\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000604\",\n" +
//                "      \"pinfl\": \"31406706890019\",\n" +
//                "      \"name\": \"Nabiyev Shuxrat  Zakirjanovich\",\n" +
//                "      \"depName\": \"Xavfsizlik tartiboti va nazorat bo'limi\",\n" +
//                "      \"depId\": \"50000977\",\n" +
//                "      \"postName\": \"Bosh mutaxassis (Buxoro BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60004913\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000605\",\n" +
//                "      \"pinfl\": \"30904862860046\",\n" +
//                "      \"name\": \"Sariyev Turdiali Mirzaevich\",\n" +
//                "      \"depName\": \"Xavfsizlik tartiboti va nazorat bo'limi\",\n" +
//                "      \"depId\": \"50000977\",\n" +
//                "      \"postName\": \"Bosh mutaxassis (Guliston BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60004911\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000606\",\n" +
//                "      \"pinfl\": \"31010775740014\",\n" +
//                "      \"name\": \"Fayziyev Baxtiyor Nadjimovich\",\n" +
//                "      \"depName\": \"Mehnat muhofazasi va xavfsizlik texnikasi bo'limi\",\n" +
//                "      \"depId\": \"50001870\",\n" +
//                "      \"postName\": \"Bosh mutaxassis (Qarshi BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60004927\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000607\",\n" +
//                "      \"pinfl\": \"31808813820026\",\n" +
//                "      \"name\": \"Mardanov Laziz Ismatullayevuch\",\n" +
//                "      \"depName\": \"Xavfsizlik tartiboti va nazorat bo'limi\",\n" +
//                "      \"depId\": \"50000977\",\n" +
//                "      \"postName\": \"Bosh mutaxassis (Samarqand BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60004909\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000609\",\n" +
//                "      \"pinfl\": \"32101806890015\",\n" +
//                "      \"name\": \"Nishonov  Ikromjon Valievich\",\n" +
//                "      \"depName\": \"Mehnat muhofazasi va xavfsizlik texnikasi bo'limi\",\n" +
//                "      \"depId\": \"50001870\",\n" +
//                "      \"postName\": \"Bosh mutaxassis (Farg'ona BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60004928\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000610\",\n" +
//                "      \"pinfl\": \"33010703500039\",\n" +
//                "      \"name\": \"Jumabekov Salamat Turganbaevich\",\n" +
//                "      \"depName\": \"Xavfsizlik tartiboti va nazorat bo'limi\",\n" +
//                "      \"depId\": \"50000977\",\n" +
//                "      \"postName\": \"Bosh mutaxassis (Nukus BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60004907\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000611\",\n" +
//                "      \"pinfl\": \"30105891861352\",\n" +
//                "      \"name\": \"Jurayev Beknazar Chorievich\",\n" +
//                "      \"depName\": \"Xavfsizlik tartiboti va nazorat bo'limi\",\n" +
//                "      \"depId\": \"50000977\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000114\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000615\",\n" +
//                "      \"pinfl\": \"31706764300010\",\n" +
//                "      \"name\": \"Maxmudov Shukurjon Yusufjonovich\",\n" +
//                "      \"depName\": \"Xavfsizlik tartiboti va nazorat bo'limi\",\n" +
//                "      \"depId\": \"50000977\",\n" +
//                "      \"postName\": \"Bosh mutaxassis (Namangan BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60004919\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000616\",\n" +
//                "      \"pinfl\": \"31704790280049\",\n" +
//                "      \"name\": \"Dostonov Jaxongir Erkinovich\",\n" +
//                "      \"depName\": \"Xavfsizlik tartiboti va nazorat bo'limi\",\n" +
//                "      \"depId\": \"50000977\",\n" +
//                "      \"postName\": \"Bosh mutaxassis (Navoiy BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60004906\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000618\",\n" +
//                "      \"pinfl\": \"32604840060065\",\n" +
//                "      \"name\": \"Yax'yayev Otabek Gayratovich\",\n" +
//                "      \"depName\": \"Iqtisodiy xavfsizlik bo'limi\",\n" +
//                "      \"depId\": \"50000978\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60002256\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000619\",\n" +
//                "      \"pinfl\": \"31710870240029\",\n" +
//                "      \"name\": \"Saatov Otabek Ulug'bekovich\",\n" +
//                "      \"depName\": \"Bank amaliyotlari markazi\",\n" +
//                "      \"depId\": \"50000049\",\n" +
//                "      \"postName\": \"Markaz direktori\",\n" +
//                "      \"postId\": \"60000659\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000620\",\n" +
//                "      \"pinfl\": \"31706690270047\",\n" +
//                "      \"name\": \"Begmatov Erkin Burxanovich\",\n" +
//                "      \"depName\": \"Komplayens nazorat departamenti\",\n" +
//                "      \"depId\": \"50000040\",\n" +
//                "      \"postName\": \"Departament direktori o'rinbosari\",\n" +
//                "      \"postId\": \"60000339\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000622\",\n" +
//                "      \"pinfl\": \"32504900211245\",\n" +
//                "      \"name\": \"Qosimxo'jayev Fazliddin Rustam o'g'li\",\n" +
//                "      \"depName\": \"Komplayens nazorat departamenti\",\n" +
//                "      \"depId\": \"50000040\",\n" +
//                "      \"postName\": \"Hududiy komplayens ofitseri (Yunusobod BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60005237\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000624\",\n" +
//                "      \"pinfl\": \"30505817100015\",\n" +
//                "      \"name\": \"Jumaniyazov Sarvarbek Xasanbayevich\",\n" +
//                "      \"depName\": \"Komplayens nazorat departamenti\",\n" +
//                "      \"depId\": \"50000040\",\n" +
//                "      \"postName\": \"Hududiy komplayens ofitseri (Urganch BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60005233\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000625\",\n" +
//                "      \"pinfl\": \"31704931580014\",\n" +
//                "      \"name\": \"Omonullayev Muxammadjon Rustam o'g'li\",\n" +
//                "      \"depName\": \"Komplayens nazorat departamenti\",\n" +
//                "      \"depId\": \"50000040\",\n" +
//                "      \"postName\": \"Hududiy komplayens ofitseri (Jizzax BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60005234\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000626\",\n" +
//                "      \"pinfl\": \"31503864060033\",\n" +
//                "      \"name\": \"Nurmuratov Bekzod Mamadaliyevich\",\n" +
//                "      \"depName\": \"Komplayens nazorat departamenti\",\n" +
//                "      \"depId\": \"50000040\",\n" +
//                "      \"postName\": \"Hududiy komplayens ofitseri (Samarqand BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60005235\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000627\",\n" +
//                "      \"pinfl\": \"30302870310672\",\n" +
//                "      \"name\": \"Samatov Shavkat Baxadirovich\",\n" +
//                "      \"depName\": \"Komplayens nazorat departamenti\",\n" +
//                "      \"depId\": \"50000040\",\n" +
//                "      \"postName\": \"Hududiy komplayens ofitseri (Avtotransport BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60005236\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000628\",\n" +
//                "      \"pinfl\": \"30903914250028\",\n" +
//                "      \"name\": \"Baxriddinov Otabek Raxmatullo o'g'li\",\n" +
//                "      \"depName\": \"Komplayens nazorat departamenti\",\n" +
//                "      \"depId\": \"50000040\",\n" +
//                "      \"postName\": \"Hududiy komplayens ofitseri (Farg'ona BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60005241\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000629\",\n" +
//                "      \"pinfl\": \"32905851800081\",\n" +
//                "      \"name\": \"Payziyev Umedjon Arziqulovich\",\n" +
//                "      \"depName\": \"Komplayens nazorat departamenti\",\n" +
//                "      \"depId\": \"50000040\",\n" +
//                "      \"postName\": \"Hududiy komplayens ofitseri (Nurafshon BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60005246\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000630\",\n" +
//                "      \"pinfl\": \"41804810190062\",\n" +
//                "      \"name\": \"Zakirova Xurshida Abdrasulovna\",\n" +
//                "      \"depName\": \"Komplayens nazorat departamenti\",\n" +
//                "      \"depId\": \"50000040\",\n" +
//                "      \"postName\": \"Hududiy komplayens ofitseri (Shayxontohur BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60005231\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000631\",\n" +
//                "      \"pinfl\": \"32102874060012\",\n" +
//                "      \"name\": \"Pardayev Maksud Sobirovich\",\n" +
//                "      \"depName\": \"Komplayens nazorat departamenti\",\n" +
//                "      \"depId\": \"50000040\",\n" +
//                "      \"postName\": \"Hududiy komplayens ofitseri (Poytaxt BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60005242\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000632\",\n" +
//                "      \"pinfl\": \"40108712390016\",\n" +
//                "      \"name\": \"Tuxtayeva Gulrux Yerkinovna\",\n" +
//                "      \"depName\": \"Komplayens nazorat departamenti\",\n" +
//                "      \"depId\": \"50000040\",\n" +
//                "      \"postName\": \"Hududiy komplayens ofitseri (Navoiy BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60005238\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000634\",\n" +
//                "      \"pinfl\": \"30102735960026\",\n" +
//                "      \"name\": \"Dadaxanov Akmal Xapisovich\",\n" +
//                "      \"depName\": \"Komplayens nazorat departamenti\",\n" +
//                "      \"depId\": \"50000040\",\n" +
//                "      \"postName\": \"Hududiy komplayens ofitseri (Namangan BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60005240\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000635\",\n" +
//                "      \"pinfl\": \"42004875260019\",\n" +
//                "      \"name\": \"Muxtorova Durdona Ilxom qizi\",\n" +
//                "      \"depName\": \"Komplayens nazorat departamenti\",\n" +
//                "      \"depId\": \"50000040\",\n" +
//                "      \"postName\": \"Hududiy komplayens ofitseri (Buxoro BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60005243\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000636\",\n" +
//                "      \"pinfl\": \"32207851560010\",\n" +
//                "      \"name\": \"Isakulov Alisher Abdumuratovich\",\n" +
//                "      \"depName\": \"Regulyativ komplayens boshqarmasi\",\n" +
//                "      \"depId\": \"50001925\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60005248\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000637\",\n" +
//                "      \"pinfl\": \"30907770060023\",\n" +
//                "      \"name\": \"Kurbanov Doniyor Baxtiyorovich\",\n" +
//                "      \"depName\": \"Komplayens nazoratni muvofiqlashtirish boshqarmasi\",\n" +
//                "      \"depId\": \"50001930\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60005271\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000638\",\n" +
//                "      \"pinfl\": \"42009751670018\",\n" +
//                "      \"name\": \"Karmisheva Shaxlo Kuchkarovna\",\n" +
//                "      \"depName\": \"Qonunchilikka, regulyativ talablarga va ESGga muvofiqlik bo‘limi\",\n" +
//                "      \"depId\": \"50001926\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60005249\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000639\",\n" +
//                "      \"pinfl\": \"30612815500012\",\n" +
//                "      \"name\": \"Musayev Shukurullo Xolmatovich\",\n" +
//                "      \"depName\": \"Uchinchi shaxslar, mahsulotlar va operatsiyalarning muvofiqlik bo‘limi\",\n" +
//                "      \"depId\": \"50001927\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60005258\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000640\",\n" +
//                "      \"pinfl\": \"31903660530013\",\n" +
//                "      \"name\": \"Agzamov Jaxongir Maxmudovich\",\n" +
//                "      \"depName\": \"Qonunchilikka, regulyativ talablarga va ESGga muvofiqlik bo‘limi\",\n" +
//                "      \"depId\": \"50001926\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60005254\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000641\",\n" +
//                "      \"pinfl\": \"30512830550015\",\n" +
//                "      \"name\": \"Xoshimov Zuxriddin Ruxutdinovich\",\n" +
//                "      \"depName\": \"Qonunchilikka, regulyativ talablarga va ESGga muvofiqlik bo‘limi\",\n" +
//                "      \"depId\": \"50001926\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60005256\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000642\",\n" +
//                "      \"pinfl\": \"31603920261869\",\n" +
//                "      \"name\": \"To'raboyev Moxirjon Xabibullo o'g'li\",\n" +
//                "      \"depName\": \"Komplayens nazoratni muvofiqlashtirish boshqarmasi\",\n" +
//                "      \"depId\": \"50001930\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60000356\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000643\",\n" +
//                "      \"pinfl\": \"42812800190038\",\n" +
//                "      \"name\": \"Adilova Nigora Gafurdjanovna\",\n" +
//                "      \"depName\": \"Yakuniy nazorat bo'limi\",\n" +
//                "      \"depId\": \"50001015\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60000363\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000645\",\n" +
//                "      \"pinfl\": \"32112840100022\",\n" +
//                "      \"name\": \"Xasanov Anvar Akmaldjanovich\",\n" +
//                "      \"depName\": \"Qonunchilikka, regulyativ talablarga va ESGga muvofiqlik bo‘limi\",\n" +
//                "      \"depId\": \"50001926\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60005250\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000646\",\n" +
//                "      \"pinfl\": \"32001912380032\",\n" +
//                "      \"name\": \"Olimov Baxriddin Boliyevich\",\n" +
//                "      \"depName\": \"Jinoiy faoliyatdan olingan daromadlarni legallashtirishga, terrorizmnimoliyalashtirishga va ommaviy qirg‘in qurollarini tarqatishnimoliyalashtirishga qarshi kurashish boshqarmasi (JDL/TM)\",\n" +
//                "      \"depId\": \"50001928\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60005260\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000647\",\n" +
//                "      \"pinfl\": \"30808900191744\",\n" +
//                "      \"name\": \"Djalalov Shamshod Dilshodovich\",\n" +
//                "      \"depName\": \"Sanksiyalar, embargolar bilan ishlash boshqarmasi\",\n" +
//                "      \"depId\": \"50001929\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60005265\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000648\",\n" +
//                "      \"pinfl\": \"30510922950107\",\n" +
//                "      \"name\": \"Aliyev Eldor Mirzoxidovich\",\n" +
//                "      \"depName\": \"Sanksiyalar, embargolar bilan ishlash boshqarmasi\",\n" +
//                "      \"depId\": \"50001929\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60005267\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000649\",\n" +
//                "      \"pinfl\": \"40501800191195\",\n" +
//                "      \"name\": \"Abduraxmanova Surayyo Xujanazarovna\",\n" +
//                "      \"depName\": \"Uchinchi shaxslar, mahsulotlar va operatsiyalarning muvofiqlik bo‘limi\",\n" +
//                "      \"depId\": \"50001927\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60005259\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000651\",\n" +
//                "      \"pinfl\": \"32312863080022\",\n" +
//                "      \"name\": \"Allayarov Xurshid Yangiboyevich\",\n" +
//                "      \"depName\": \"Uchinchi shaxslar, mahsulotlar va operatsiyalarning muvofiqlik bo‘limi\",\n" +
//                "      \"depId\": \"50001927\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60005257\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000652\",\n" +
//                "      \"pinfl\": \"30402860240056\",\n" +
//                "      \"name\": \"Aliyev Baxtiyor Rixsillayevich\",\n" +
//                "      \"depName\": \"O'qitish va rivojlantirish boshqarmasi\",\n" +
//                "      \"depId\": \"50000982\",\n" +
//                "      \"postName\": \"Menedjer\",\n" +
//                "      \"postId\": \"60003063\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000653\",\n" +
//                "      \"pinfl\": \"31704900171478\",\n" +
//                "      \"name\": \"Orifiy Ramz XXX\",\n" +
//                "      \"depName\": \"Jinoiy faoliyatdan olingan daromadlarni legallashtirishga, terrorizmnimoliyalashtirishga va ommaviy qirg‘in qurollarini tarqatishnimoliyalashtirishga qarshi kurashish boshqarmasi (JDL/TM)\",\n" +
//                "      \"depId\": \"50001928\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60005262\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000654\",\n" +
//                "      \"pinfl\": \"30911891931045\",\n" +
//                "      \"name\": \"Ximmatov Azamat Ismoilovich\",\n" +
//                "      \"depName\": \"Hisob siyosati ijrosi bo'limi\",\n" +
//                "      \"depId\": \"50001039\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60002660\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000655\",\n" +
//                "      \"pinfl\": \"41304923310022\",\n" +
//                "      \"name\": \"Pulatova Dilfuza Amanovna\",\n" +
//                "      \"depName\": \"Komplayens nazorat departamenti\",\n" +
//                "      \"depId\": \"50000040\",\n" +
//                "      \"postName\": \"Hududiy komplayens ofitseri (Nukus BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60005244\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000656\",\n" +
//                "      \"pinfl\": \"41803753100048\",\n" +
//                "      \"name\": \"Seydamova Mexribon Ismailovna\",\n" +
//                "      \"depName\": \"Komplayens nazorat departamenti\",\n" +
//                "      \"depId\": \"50000040\",\n" +
//                "      \"postName\": \"Hududiy komplayens ofitseri (Hazorasp BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60005239\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000657\",\n" +
//                "      \"pinfl\": \"30106890222034\",\n" +
//                "      \"name\": \"Xaydarov Bekzod Sandjarovich\",\n" +
//                "      \"depName\": \"Kichik biznesga xizmat ko'rsatish departamenti\",\n" +
//                "      \"depId\": \"50000050\",\n" +
//                "      \"postName\": \"Departament direktori\",\n" +
//                "      \"postId\": \"60000708\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000658\",\n" +
//                "      \"pinfl\": \"42412957050025\",\n" +
//                "      \"name\": \"Mirsalimova Mabruka-bonu Obidxon qizi\",\n" +
//                "      \"depName\": \"Korporativ biznesni rivojlantirish, tahlil va prognozlash boshqarmasi\",\n" +
//                "      \"depId\": \"50001672\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60003952\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000659\",\n" +
//                "      \"pinfl\": \"30205886180014\",\n" +
//                "      \"name\": \"Axmedov Abdulla Baxodirovich\",\n" +
//                "      \"depName\": \"Loyihalarni boshqarish, ko‘rib chiqish va tahlil qilish boshqarmasi\",\n" +
//                "      \"depId\": \"50001670\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60003905\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000660\",\n" +
//                "      \"pinfl\": \"31405926540014\",\n" +
//                "      \"name\": \"Mutalov Xurshid Jamshid ugli\",\n" +
//                "      \"depName\": \"Loyihalarni ko'rib chiqish va tahlil qilish bo'limi\",\n" +
//                "      \"depId\": \"50001676\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60003936\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000662\",\n" +
//                "      \"pinfl\": \"32007880261357\",\n" +
//                "      \"name\": \"Achilov Sherzod Faxridinovich\",\n" +
//                "      \"depName\": \"Loyihalarni boshqarish bo‘limi\",\n" +
//                "      \"depId\": \"50001671\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60003906\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000663\",\n" +
//                "      \"pinfl\": \"30210842640037\",\n" +
//                "      \"name\": \"Abdullayev Furkat Nabilloevich\",\n" +
//                "      \"depName\": \"Loyihalarni boshqarish bo‘limi\",\n" +
//                "      \"depId\": \"50001671\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003907\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000664\",\n" +
//                "      \"pinfl\": \"31902976580044\",\n" +
//                "      \"name\": \"Raxmatullaev  Shoxruxxon Ravshan o'g'li\",\n" +
//                "      \"depName\": \"Loyihalarni ko'rib chiqish va tahlil qilish bo'limi\",\n" +
//                "      \"depId\": \"50001676\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003932\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000665\",\n" +
//                "      \"pinfl\": \"52008007000013\",\n" +
//                "      \"name\": \"Abdumuxtorov  Javoxirbek Sherzod o'g'li\",\n" +
//                "      \"depName\": \"Loyihalarni boshqarish bo‘limi\",\n" +
//                "      \"depId\": \"50001671\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60005024\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000666\",\n" +
//                "      \"pinfl\": \"32409860200031\",\n" +
//                "      \"name\": \"Shamansurov  Davron Sultanmuratovich\",\n" +
//                "      \"depName\": \"Korporativ xizmat ko'rsatish departamenti\",\n" +
//                "      \"depId\": \"50000052\",\n" +
//                "      \"postName\": \"Departament direktori o'rinbosari\",\n" +
//                "      \"postId\": \"60000726\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000667\",\n" +
//                "      \"pinfl\": \"31601894180010\",\n" +
//                "      \"name\": \"Karimov Xislatjon Ikromjonovich\",\n" +
//                "      \"depName\": \"Loyihalarni ko'rib chiqish va tahlil qilish bo'limi\",\n" +
//                "      \"depId\": \"50001676\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60003929\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000668\",\n" +
//                "      \"pinfl\": \"32408985740048\",\n" +
//                "      \"name\": \"Xudoyberdiev Sunnatbek Shuxrat o'g'li\",\n" +
//                "      \"depName\": \"Loyihalarni ko'rib chiqish va tahlil qilish bo'limi\",\n" +
//                "      \"depId\": \"50001676\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003931\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000669\",\n" +
//                "      \"pinfl\": \"30201941860068\",\n" +
//                "      \"name\": \"Xasanov Rasul Eshpo'lat o'g'li\",\n" +
//                "      \"depName\": \"Loyihalarni ko'rib chiqish va tahlil qilish bo'limi\",\n" +
//                "      \"depId\": \"50001676\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003933\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000670\",\n" +
//                "      \"pinfl\": \"32902960450026\",\n" +
//                "      \"name\": \"Nurmatov Nosirjon Abdunabi o'g'li\",\n" +
//                "      \"depName\": \"Loyihalarni boshqarish bo‘limi\",\n" +
//                "      \"depId\": \"50001671\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003908\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000671\",\n" +
//                "      \"pinfl\": \"32811844060012\",\n" +
//                "      \"name\": \"Abdukaxarov Voxidjon  Yakubdjonovich\",\n" +
//                "      \"depName\": \"Korporativ biznesni rivojlantirish, tahlil va prognozlash boshqarmasi\",\n" +
//                "      \"depId\": \"50001672\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60003911\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000672\",\n" +
//                "      \"pinfl\": \"31908786530011\",\n" +
//                "      \"name\": \"Xusanov Jonibek Jumaevich\",\n" +
//                "      \"depName\": \"Korporativ biznesni rivojlantirish, tahlil va prognozlash boshqarmasi\",\n" +
//                "      \"depId\": \"50001672\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003913\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000673\",\n" +
//                "      \"pinfl\": \"40510850190038\",\n" +
//                "      \"name\": \"G'ulomjonova Gulinur G'ulomjon qizi\",\n" +
//                "      \"depName\": \"Korporativ biznesni rivojlantirish, tahlil va prognozlash boshqarmasi\",\n" +
//                "      \"depId\": \"50001672\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003914\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000674\",\n" +
//                "      \"pinfl\": \"31112880460022\",\n" +
//                "      \"name\": \"Qosimov Azizbek Farxod o'g'li\",\n" +
//                "      \"depName\": \"Savdoni moliyalashtirishni rivojlantirish boshqarmasi\",\n" +
//                "      \"depId\": \"50001673\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60003917\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000675\",\n" +
//                "      \"pinfl\": \"41610870160028\",\n" +
//                "      \"name\": \"Gafurova Kamola  Kabirjanovna\",\n" +
//                "      \"depName\": \"Korporativ biznesni rivojlantirish, tahlil va prognozlash boshqarmasi\",\n" +
//                "      \"depId\": \"50001672\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003912\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000676\",\n" +
//                "      \"pinfl\": \"40509776580012\",\n" +
//                "      \"name\": \"Kivelevich Olesya Vladimirovna\",\n" +
//                "      \"depName\": \"Yirik korporotiv mijozlarga joriy xizmat ko'rsatish boshqarmasi\",\n" +
//                "      \"depId\": \"50001679\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60003944\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000677\",\n" +
//                "      \"pinfl\": \"32703886540022\",\n" +
//                "      \"name\": \"Abdushukurov Dilshod Daniyarovich\",\n" +
//                "      \"depName\": \"Eskport-Import, pul hisob-kitob va konversion amaliyotlar bo`limi\",\n" +
//                "      \"depId\": \"50001680\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60003945\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000678\",\n" +
//                "      \"pinfl\": \"41501850100027\",\n" +
//                "      \"name\": \"Faxrutdinova Gulmira Rifatovna\",\n" +
//                "      \"depName\": \"Savdo amaliyotlarini muvofiqlashtirish va tahlil qilish bo`limi\",\n" +
//                "      \"depId\": \"50001681\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003950\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000679\",\n" +
//                "      \"pinfl\": \"32002950210044\",\n" +
//                "      \"name\": \"Dergachyov Sergey Yurevich\",\n" +
//                "      \"depName\": \"Loyiha ofisi\",\n" +
//                "      \"depId\": \"50000030\",\n" +
//                "      \"postName\": \"Ofis boshlig'i o'rinbosari\",\n" +
//                "      \"postId\": \"60002367\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000680\",\n" +
//                "      \"pinfl\": \"42907813450021\",\n" +
//                "      \"name\": \"Yerimbetova Gul'mira Taxirovna\",\n" +
//                "      \"depName\": \"Savdo amaliyotlarini muvofiqlashtirish va tahlil qilish bo`limi\",\n" +
//                "      \"depId\": \"50001681\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60003948\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000683\",\n" +
//                "      \"pinfl\": \"42708986500010\",\n" +
//                "      \"name\": \"Raxmatullayeva Xadicha G'afforovna\",\n" +
//                "      \"depName\": \"Ishlab chiqarish boshqarmasi\",\n" +
//                "      \"depId\": \"50000972\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60003548\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000684\",\n" +
//                "      \"pinfl\": \"41010900500088\",\n" +
//                "      \"name\": \"Soliyeva Surayyo Tojialiyevna\",\n" +
//                "      \"depName\": \"Loyiha ofisi\",\n" +
//                "      \"depId\": \"50000030\",\n" +
//                "      \"postName\": \"Menedjer\",\n" +
//                "      \"postId\": \"60000105\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000685\",\n" +
//                "      \"pinfl\": \"40606920192151\",\n" +
//                "      \"name\": \"Churadayeva Yelena Viktorovna\",\n" +
//                "      \"depName\": \"Brend Marketingi va Reklama boshqarmasi\",\n" +
//                "      \"depId\": \"50001577\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60003536\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000686\",\n" +
//                "      \"pinfl\": \"31909930220075\",\n" +
//                "      \"name\": \"Ubaydullayev Fayzulla Ziyodulla o'g'li\",\n" +
//                "      \"depName\": \"Ishlab chiqarish boshqarmasi\",\n" +
//                "      \"depId\": \"50000972\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60003016\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000687\",\n" +
//                "      \"pinfl\": \"42701902390012\",\n" +
//                "      \"name\": \"Abdurashitova Valide Rifatovna\",\n" +
//                "      \"depName\": \"Raqamli ishlab chiqarish bo'limi\",\n" +
//                "      \"depId\": \"50001581\",\n" +
//                "      \"postName\": \"Menedjer\",\n" +
//                "      \"postId\": \"60003544\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000688\",\n" +
//                "      \"pinfl\": \"30204902170024\",\n" +
//                "      \"name\": \"Xusanov Dilmurod Faritovich\",\n" +
//                "      \"depName\": \"Brend marketingi bo'limi\",\n" +
//                "      \"depId\": \"50001579\",\n" +
//                "      \"postName\": \"Menedjer\",\n" +
//                "      \"postId\": \"60003539\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000690\",\n" +
//                "      \"pinfl\": \"31701976500043\",\n" +
//                "      \"name\": \"Abdujalilov Abdurasul Abdurashid o'g'li\",\n" +
//                "      \"depName\": \"Mahsulotlar marketingi bo'limi\",\n" +
//                "      \"depId\": \"50001578\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60003537\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000692\",\n" +
//                "      \"pinfl\": \"60504027040026\",\n" +
//                "      \"name\": \"Qosimova Moxinabonu Baxromjon qizi\",\n" +
//                "      \"depName\": \"Raqamli marketing bo'limi\",\n" +
//                "      \"depId\": \"50001580\",\n" +
//                "      \"postName\": \"Menedjer\",\n" +
//                "      \"postId\": \"60003541\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000693\",\n" +
//                "      \"pinfl\": \"41107976500035\",\n" +
//                "      \"name\": \"Nazarova Nargiza Uchqun qizi\",\n" +
//                "      \"depName\": \"Raqamli marketing bo'limi\",\n" +
//                "      \"depId\": \"50001580\",\n" +
//                "      \"postName\": \"Menedjer\",\n" +
//                "      \"postId\": \"60003540\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000694\",\n" +
//                "      \"pinfl\": \"41405926600014\",\n" +
//                "      \"name\": \"Djurabayeva Ziyoda Baxodir qizi\",\n" +
//                "      \"depName\": \"Mijozlarga xizmat ko'rsatish boshqarmasi\",\n" +
//                "      \"depId\": \"50000975\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60003054\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000696\",\n" +
//                "      \"pinfl\": \"31607800190058\",\n" +
//                "      \"name\": \"Maulyanxodjaev Alisher Anvarxodjaevich\",\n" +
//                "      \"depName\": \"Mijozlarga xizmat ko'rsatish boshqarmasi\",\n" +
//                "      \"depId\": \"50000975\",\n" +
//                "      \"postName\": \"Ekspert (Shayhontoxur BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60002881\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000697\",\n" +
//                "      \"pinfl\": \"30609873800022\",\n" +
//                "      \"name\": \"Tashmuratov Azimjon Narkamolovich\",\n" +
//                "      \"depName\": \"Mijozlarga xizmat ko'rsatish boshqarmasi\",\n" +
//                "      \"depId\": \"50000975\",\n" +
//                "      \"postName\": \"Ekspert (Samarqand BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60002882\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000698\",\n" +
//                "      \"pinfl\": \"30508871520047\",\n" +
//                "      \"name\": \"Gayratov Ozod Gayrat o'g'li\",\n" +
//                "      \"depName\": \"Mijozlarga xizmat ko'rsatish boshqarmasi\",\n" +
//                "      \"depId\": \"50000975\",\n" +
//                "      \"postName\": \"Ekspert (Jizzax BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60002883\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000699\",\n" +
//                "      \"pinfl\": \"30907824310036\",\n" +
//                "      \"name\": \"Mavlonov Xurmatilloxon Sattorovich\",\n" +
//                "      \"depName\": \"Mijozlarga xizmat ko'rsatish boshqarmasi\",\n" +
//                "      \"depId\": \"50000975\",\n" +
//                "      \"postName\": \"Ekspert (Farg'ona BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60002884\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000701\",\n" +
//                "      \"pinfl\": \"33108903490031\",\n" +
//                "      \"name\": \"Kaljanov Abbaz  Maksetbaevich\",\n" +
//                "      \"depName\": \"Mijozlarga xizmat ko'rsatish boshqarmasi\",\n" +
//                "      \"depId\": \"50000975\",\n" +
//                "      \"postName\": \"Ekspert (Nukus BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60002886\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000702\",\n" +
//                "      \"pinfl\": \"31203891380022\",\n" +
//                "      \"name\": \"Abidov  Sardor Zokirjonovich\",\n" +
//                "      \"depName\": \"Mijozlarga xizmat ko'rsatish boshqarmasi\",\n" +
//                "      \"depId\": \"50000975\",\n" +
//                "      \"postName\": \"Ekspert (Bobur BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60002887\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000703\",\n" +
//                "      \"pinfl\": \"40610917190019\",\n" +
//                "      \"name\": \"Radjapova  Nasiba Yakub qizi\",\n" +
//                "      \"depName\": \"Mijozlarga xizmat ko'rsatish boshqarmasi\",\n" +
//                "      \"depId\": \"50000975\",\n" +
//                "      \"postName\": \"Ekspert (Urganch BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60002891\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000706\",\n" +
//                "      \"pinfl\": \"32101941930056\",\n" +
//                "      \"name\": \"Qadirov Akmal Baxtiyorovich\",\n" +
//                "      \"depName\": \"Mijozlarga xizmat ko'rsatish boshqarmasi\",\n" +
//                "      \"depId\": \"50000975\",\n" +
//                "      \"postName\": \"Ekspert (Termiz BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60002889\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000707\",\n" +
//                "      \"pinfl\": \"32508910211408\",\n" +
//                "      \"name\": \"Ismoilov Ilyosjon Xakimjon o'g'li\",\n" +
//                "      \"depName\": \"Mijozlarga xizmat ko'rsatish boshqarmasi\",\n" +
//                "      \"depId\": \"50000975\",\n" +
//                "      \"postName\": \"Ekspert (Avtotransport BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60002888\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000708\",\n" +
//                "      \"pinfl\": \"30710830270050\",\n" +
//                "      \"name\": \"Ziyaev Abror Abdunabievich\",\n" +
//                "      \"depName\": \"Mijozlarga xizmat ko'rsatish boshqarmasi\",\n" +
//                "      \"depId\": \"50000975\",\n" +
//                "      \"postName\": \"Ekspert (Poytaxt BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60002890\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000709\",\n" +
//                "      \"pinfl\": \"41209822400040\",\n" +
//                "      \"name\": \"Abdullayeva Nafisa Ibodullaevna\",\n" +
//                "      \"depName\": \"Mijozlarga xizmat ko'rsatish boshqarmasi\",\n" +
//                "      \"depId\": \"50000975\",\n" +
//                "      \"postName\": \"Ekspert (Zarafshon BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60002880\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000711\",\n" +
//                "      \"pinfl\": \"30405986500039\",\n" +
//                "      \"name\": \"Sodiqov  Amirxon Azizxon o'g'li\",\n" +
//                "      \"depName\": \"Mahsulotlar marketingi bo'limi\",\n" +
//                "      \"depId\": \"50001578\",\n" +
//                "      \"postName\": \"Menedjer\",\n" +
//                "      \"postId\": \"60003538\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000712\",\n" +
//                "      \"pinfl\": \"41303860171727\",\n" +
//                "      \"name\": \"Yusupova Durdona Abduvarisovna\",\n" +
//                "      \"depName\": \"Matbuot markazi\",\n" +
//                "      \"depId\": \"50000027\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60002741\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000713\",\n" +
//                "      \"pinfl\": \"30211823150024\",\n" +
//                "      \"name\": \"Sabirov Umid Baxtiyarovich\",\n" +
//                "      \"depName\": \"Mijozlarga xizmat ko'rsatish boshqarmasi\",\n" +
//                "      \"depId\": \"50000975\",\n" +
//                "      \"postName\": \"Ekspert (Xazorasp BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60002894\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000714\",\n" +
//                "      \"pinfl\": \"31007921230042\",\n" +
//                "      \"name\": \"Yuldashev Ulug'bek Dilshodbek o'g'li\",\n" +
//                "      \"depName\": \"Mijozlarga xizmat ko'rsatish boshqarmasi\",\n" +
//                "      \"depId\": \"50000975\",\n" +
//                "      \"postName\": \"Ekspert (Andijon BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60002895\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000716\",\n" +
//                "      \"pinfl\": \"32101782630038\",\n" +
//                "      \"name\": \"Inoyatullayev Ravshan Qaxramonovich\",\n" +
//                "      \"depName\": \"Mijozlarga xizmat ko'rsatish boshqarmasi\",\n" +
//                "      \"depId\": \"50000975\",\n" +
//                "      \"postName\": \"Ekspert (Qarshi BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60002897\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000717\",\n" +
//                "      \"pinfl\": \"32603845890011\",\n" +
//                "      \"name\": \"Muxitdinov Murodjon Abdulxamitovich\",\n" +
//                "      \"depName\": \"Mijozlarga xizmat ko'rsatish boshqarmasi\",\n" +
//                "      \"depId\": \"50000975\",\n" +
//                "      \"postName\": \"Ekspert (Namangan BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60002898\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000719\",\n" +
//                "      \"pinfl\": \"33105870140057\",\n" +
//                "      \"name\": \"Nosov Maksim Mixaylovich\",\n" +
//                "      \"depName\": \"Matbuot markazi\",\n" +
//                "      \"depId\": \"50000027\",\n" +
//                "      \"postName\": \"Menedjer\",\n" +
//                "      \"postId\": \"60003174\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000721\",\n" +
//                "      \"pinfl\": \"30210933820126\",\n" +
//                "      \"name\": \"Ismoilov Sirojiddin Mexrojidinovich\",\n" +
//                "      \"depName\": \"Bank amaliyotlari markazi\",\n" +
//                "      \"depId\": \"50000049\",\n" +
//                "      \"postName\": \"Markaz direktori o'rinbosari\",\n" +
//                "      \"postId\": \"60000660\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000722\",\n" +
//                "      \"pinfl\": \"30904800221535\",\n" +
//                "      \"name\": \"Raxmedov Farxod Isoxujayevich\",\n" +
//                "      \"depName\": \"Bank amaliyotlari markazi\",\n" +
//                "      \"depId\": \"50000049\",\n" +
//                "      \"postName\": \"Markaz direktori o'rinbosari\",\n" +
//                "      \"postId\": \"60000661\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000723\",\n" +
//                "      \"pinfl\": \"43101780210027\",\n" +
//                "      \"name\": \"Javlanova Shaxnoza DJalalitdinovna\",\n" +
//                "      \"depName\": \" Bank likvidligini boshqarish bo'limi\",\n" +
//                "      \"depId\": \"50000994\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60000262\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000724\",\n" +
//                "      \"pinfl\": \"32305910192087\",\n" +
//                "      \"name\": \"Soipov Davronbek Dilshod o'g'li\",\n" +
//                "      \"depName\": \"Korporativ mijozlar va g'aznachilik amaliyotlarini muvofiqlashtirishboshqarmasi\",\n" +
//                "      \"depId\": \"50001065\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60000663\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000725\",\n" +
//                "      \"pinfl\": \"32809852150021\",\n" +
//                "      \"name\": \"Ismatov Baxriddin Kutbidinovich\",\n" +
//                "      \"depName\": \"Yuridik shaxslarga amaliy xizmat ko'rsatishni muvofiqlashtirish bo'limi\",\n" +
//                "      \"depId\": \"50001526\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60003243\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000726\",\n" +
//                "      \"pinfl\": \"41205790060062\",\n" +
//                "      \"name\": \"Mirzayeva Surayyo Rustamovna\",\n" +
//                "      \"depName\": \"Yuridik shaxslarga amaliy xizmat ko'rsatishni muvofiqlashtirish bo'limi\",\n" +
//                "      \"depId\": \"50001526\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003244\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000728\",\n" +
//                "      \"pinfl\": \"31409893680045\",\n" +
//                "      \"name\": \"Raxmatullayev Shoxrux Raxmatullo o'g'li\",\n" +
//                "      \"depName\": \"Moliya bozori amaliyotlari bo'limi\",\n" +
//                "      \"depId\": \"50001067\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60000667\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000729\",\n" +
//                "      \"pinfl\": \"32910890221988\",\n" +
//                "      \"name\": \"Gaipov Alisher Ubaydullayevich\",\n" +
//                "      \"depName\": \"Moliya bozori amaliyotlari bo'limi\",\n" +
//                "      \"depId\": \"50001067\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000668\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000730\",\n" +
//                "      \"pinfl\": \"42707830270057\",\n" +
//                "      \"name\": \"Azimova Nargiza Rashidovna\",\n" +
//                "      \"depName\": \"Moliya bozori amaliyotlari bo'limi\",\n" +
//                "      \"depId\": \"50001067\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000669\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000731\",\n" +
//                "      \"pinfl\": \"30201903180087\",\n" +
//                "      \"name\": \"Iskandarov Sherzod Muradovich\",\n" +
//                "      \"depName\": \"Xalqaro to'lov tizimlarining xisobi bo'limi\",\n" +
//                "      \"depId\": \"50001073\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60000692\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000732\",\n" +
//                "      \"pinfl\": \"31701863690040\",\n" +
//                "      \"name\": \"Raxmankulov Sherzod Shokirovich\",\n" +
//                "      \"depName\": \"Xalqaro hisob-kitoblar boshqarmasi\",\n" +
//                "      \"depId\": \"50001068\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60000671\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000733\",\n" +
//                "      \"pinfl\": \"30401890270411\",\n" +
//                "      \"name\": \"Shirinov Rustam Saydullaevich\",\n" +
//                "      \"depName\": \"Vakillik hisobvaraqlari bo'limi\",\n" +
//                "      \"depId\": \"50001069\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60000672\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000734\",\n" +
//                "      \"pinfl\": \"32501940270010\",\n" +
//                "      \"name\": \"Latipov Shaxzod Alisher o'gli\",\n" +
//                "      \"depName\": \"Vakillik hisobvaraqlari bo'limi\",\n" +
//                "      \"depId\": \"50001069\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000673\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000735\",\n" +
//                "      \"pinfl\": \"41501830201616\",\n" +
//                "      \"name\": \"Bekmirzayeva Muxtarama Xasanovna\",\n" +
//                "      \"depName\": \"Vakillik hisobvaraqlari bo'limi\",\n" +
//                "      \"depId\": \"50001069\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000674\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000736\",\n" +
//                "      \"pinfl\": \"41806830200060\",\n" +
//                "      \"name\": \"Inoyatova Shoxida Yel'taevna\",\n" +
//                "      \"depName\": \"Savdoni moliyalashtirish bo'limi\",\n" +
//                "      \"depId\": \"50001071\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000688\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000737\",\n" +
//                "      \"pinfl\": \"40902920201645\",\n" +
//                "      \"name\": \"Eshboeva Dildora Botir qizi\",\n" +
//                "      \"depName\": \"Vakillik hisobvaraqlari bo'limi\",\n" +
//                "      \"depId\": \"50001069\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60000676\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000738\",\n" +
//                "      \"pinfl\": \"41607910192059\",\n" +
//                "      \"name\": \"Alimova Dona Alisher qizi\",\n" +
//                "      \"depName\": \"Vakillik hisobvaraqlari bo'limi\",\n" +
//                "      \"depId\": \"50001069\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60000676\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000740\",\n" +
//                "      \"pinfl\": \"30101924320052\",\n" +
//                "      \"name\": \"Xasanov Jamshidjon Xasanjon o'g'li\",\n" +
//                "      \"depName\": \" Tashqi savdo shartnomalarini muvofiqlashtirish bo'limi\",\n" +
//                "      \"depId\": \"50001070\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60000679\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000741\",\n" +
//                "      \"pinfl\": \"32806911671404\",\n" +
//                "      \"name\": \"Jiyanov Yorkinjon Botir o'g'li\",\n" +
//                "      \"depName\": \"SWIFT bo'limi\",\n" +
//                "      \"depId\": \"50001077\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60005010\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000743\",\n" +
//                "      \"pinfl\": \"31012900191940\",\n" +
//                "      \"name\": \"Ganiev Farxodxo'ja Valixodjaevich\",\n" +
//                "      \"depName\": \" Bank likvidligini boshqarish bo'limi\",\n" +
//                "      \"depId\": \"50000994\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000259\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000744\",\n" +
//                "      \"pinfl\": \"41302800060031\",\n" +
//                "      \"name\": \"Aliyeva Dilnoza Ulugbekovna\",\n" +
//                "      \"depName\": \" Tashqi savdo shartnomalarini muvofiqlashtirish bo'limi\",\n" +
//                "      \"depId\": \"50001070\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000683\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000745\",\n" +
//                "      \"pinfl\": \"41607900840034\",\n" +
//                "      \"name\": \"Azizxodjaeva Madinaxon Turaxodjaevna\",\n" +
//                "      \"depName\": \" Tashqi savdo shartnomalarini muvofiqlashtirish bo'limi\",\n" +
//                "      \"depId\": \"50001070\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60000684\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000746\",\n" +
//                "      \"pinfl\": \"42311966590059\",\n" +
//                "      \"name\": \"Majidova Fotima O'tkirbekovna\",\n" +
//                "      \"depName\": \" Tashqi savdo shartnomalarini muvofiqlashtirish bo'limi\",\n" +
//                "      \"depId\": \"50001070\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60000685\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000747\",\n" +
//                "      \"pinfl\": \"41208820240061\",\n" +
//                "      \"name\": \"Golovina Yelena Rinadovna\",\n" +
//                "      \"depName\": \"Savdoni moliyalashtirish bo'limi\",\n" +
//                "      \"depId\": \"50001071\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000687\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000749\",\n" +
//                "      \"pinfl\": \"40611800261333\",\n" +
//                "      \"name\": \"Myazina Alyona Alekseevna\",\n" +
//                "      \"depName\": \"Savdo amaliyotlarini muvofiqlashtirish va tahlil qilish bo`limi\",\n" +
//                "      \"depId\": \"50001681\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003949\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000750\",\n" +
//                "      \"pinfl\": \"42704996140019\",\n" +
//                "      \"name\": \"Nosirova  Dinora Azzam qizi\",\n" +
//                "      \"depName\": \"Savdoni moliyalashtirish bo'limi\",\n" +
//                "      \"depId\": \"50001071\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60002303\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000751\",\n" +
//                "      \"pinfl\": \"31812842560097\",\n" +
//                "      \"name\": \"Turmanov Akbar Kurbanovich\",\n" +
//                "      \"depName\": \"Chakana amaliyotlari boshqarmasi\",\n" +
//                "      \"depId\": \"50001072\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60000691\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000753\",\n" +
//                "      \"pinfl\": \"42410840211128\",\n" +
//                "      \"name\": \"Ergasheva Nigora Xurramovna\",\n" +
//                "      \"depName\": \"Xalqaro to'lov tizimlarining xisobi bo'limi\",\n" +
//                "      \"depId\": \"50001073\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000693\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000754\",\n" +
//                "      \"pinfl\": \"42405830211220\",\n" +
//                "      \"name\": \"Azmetova  Farangis Mislimovna\",\n" +
//                "      \"depName\": \"Xalqaro to'lov tizimlarining xisobi bo'limi\",\n" +
//                "      \"depId\": \"50001073\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000694\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000756\",\n" +
//                "      \"pinfl\": \"41208710220076\",\n" +
//                "      \"name\": \"Allayarova Mukaddas Boykulovna\",\n" +
//                "      \"depName\": \"Milliy to'lov tizimlarining hisobi bo'limi\",\n" +
//                "      \"depId\": \"50001074\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60000696\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000757\",\n" +
//                "      \"pinfl\": \"43105640230017\",\n" +
//                "      \"name\": \"Kan  Liliya Nikolaevna\",\n" +
//                "      \"depName\": \"Milliy to'lov tizimlarining hisobi bo'limi\",\n" +
//                "      \"depId\": \"50001074\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000697\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000758\",\n" +
//                "      \"pinfl\": \"30210910270797\",\n" +
//                "      \"name\": \"Sharopov Mirali  Isomiddin o'g'li\",\n" +
//                "      \"depName\": \"Milliy to'lov tizimlarining hisobi bo'limi\",\n" +
//                "      \"depId\": \"50001074\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000698\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000759\",\n" +
//                "      \"pinfl\": \"32502832390054\",\n" +
//                "      \"name\": \"To'xtaev Behzod Bahodirovich\",\n" +
//                "      \"depName\": \"Milliy to'lov tizimlarining hisobi bo'limi\",\n" +
//                "      \"depId\": \"50001074\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000699\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000761\",\n" +
//                "      \"pinfl\": \"30612876210011\",\n" +
//                "      \"name\": \"Mirzayev Xolmurod Saitmurodovich\",\n" +
//                "      \"depName\": \"Chakana amaliyotlar hisobi bo'limi\",\n" +
//                "      \"depId\": \"50001076\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60003201\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000763\",\n" +
//                "      \"pinfl\": \"31903840210083\",\n" +
//                "      \"name\": \"Nigmatov Alijon Utkurovich\",\n" +
//                "      \"depName\": \"Milliy to'lov tizimlarining hisobi bo'limi\",\n" +
//                "      \"depId\": \"50001074\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003872\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000765\",\n" +
//                "      \"pinfl\": \"30808880640018\",\n" +
//                "      \"name\": \"Mirsadikov Mirjamshid Mirsaitovich\",\n" +
//                "      \"depName\": \"SWIFT bo'limi\",\n" +
//                "      \"depId\": \"50001077\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60000705\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000766\",\n" +
//                "      \"pinfl\": \"31910900222481\",\n" +
//                "      \"name\": \"Musaev  Xurshid Dilshodovich\",\n" +
//                "      \"depName\": \"Vakillik hisobvaraqlari bo'limi\",\n" +
//                "      \"depId\": \"50001069\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60005011\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000767\",\n" +
//                "      \"pinfl\": \"42406860260048\",\n" +
//                "      \"name\": \"Aripova Feruza Ubaydullaevna\",\n" +
//                "      \"depName\": \"SWIFT bo'limi\",\n" +
//                "      \"depId\": \"50001077\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60000707\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000768\",\n" +
//                "      \"pinfl\": \"30305860270017\",\n" +
//                "      \"name\": \"Mirziyayev Abror Axrorovich\",\n" +
//                "      \"depName\": \"Raxbariyat\",\n" +
//                "      \"depId\": \"50000024\",\n" +
//                "      \"postName\": \"Maslahatchi-Boshqaruvchi direktor\",\n" +
//                "      \"postId\": \"60003135\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000772\",\n" +
//                "      \"pinfl\": \"30107890191520\",\n" +
//                "      \"name\": \"Xudayberdiyev Asadjon Alimovich\",\n" +
//                "      \"depName\": \"Boshqaruv hujjatlari bilan ishlash va kotibiyat boshqarmasi\",\n" +
//                "      \"depId\": \"50001564\",\n" +
//                "      \"postName\": \"Referent\",\n" +
//                "      \"postId\": \"60003504\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000773\",\n" +
//                "      \"pinfl\": \"33108950190058\",\n" +
//                "      \"name\": \"Sultonov Atabeg Abdurashid o'g'li\",\n" +
//                "      \"depName\": \"Xalqaro moliyalashtirish bo'limi\",\n" +
//                "      \"depId\": \"50000996\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60000273\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000774\",\n" +
//                "      \"pinfl\": \"32702950170059\",\n" +
//                "      \"name\": \"Kamilov Abdul Malik Nigmatjanovich\",\n" +
//                "      \"depName\": \"Xalqaro moliyalashtirish bo'limi\",\n" +
//                "      \"depId\": \"50000996\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000275\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000775\",\n" +
//                "      \"pinfl\": \"30208900171814\",\n" +
//                "      \"name\": \"Xadiyev Mirsaidxon Ulug'bek o'g'li\",\n" +
//                "      \"depName\": \"Xalqaro reyting agentliklari va korrespondent-banklar bilanishlash bo'limi\",\n" +
//                "      \"depId\": \"50001647\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60003816\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000776\",\n" +
//                "      \"pinfl\": \"30609976500036\",\n" +
//                "      \"name\": \"Isroilov Temurbek Iskandar o'g'li\",\n" +
//                "      \"depName\": \"Xalqaro reyting agentliklari va korrespondent-banklar bilanishlash bo'limi\",\n" +
//                "      \"depId\": \"50001647\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003817\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000777\",\n" +
//                "      \"pinfl\": \"32308860240011\",\n" +
//                "      \"name\": \"Zaripov Muzaffar Muzrapjanovich\",\n" +
//                "      \"depName\": \"Korporativ munosabatlar xizmati\",\n" +
//                "      \"depId\": \"50000029\",\n" +
//                "      \"postName\": \"Xizmat boshlig'i o'rinbosari\",\n" +
//                "      \"postId\": \"60003271\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000778\",\n" +
//                "      \"pinfl\": \"30110986780036\",\n" +
//                "      \"name\": \"Jalilov Azizbek Baxodir o'g'li\",\n" +
//                "      \"depName\": \"Savdoni moliyalashtirishni tarkibiy tuzish va tashkiliy quvvatlashbo'limi\",\n" +
//                "      \"depId\": \"50001480\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60002697\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000781\",\n" +
//                "      \"pinfl\": \"31203890251424\",\n" +
//                "      \"name\": \"Davletov Marat Rinatovich\",\n" +
//                "      \"depName\": \"Axborot texnologiyalari departamenti\",\n" +
//                "      \"depId\": \"50000044\",\n" +
//                "      \"postName\": \"Departament direktori\",\n" +
//                "      \"postId\": \"60000500\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000783\",\n" +
//                "      \"pinfl\": \"32508870760064\",\n" +
//                "      \"name\": \"Abdullayev Farrux Xasanovich\",\n" +
//                "      \"depName\": \"Dasturiy ta'minotlarni joriy etish va qo'llab-quvvatlash boshqarmasi\",\n" +
//                "      \"depId\": \"50001614\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60003692\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000784\",\n" +
//                "      \"pinfl\": \"30102880050083\",\n" +
//                "      \"name\": \"Alimov Sherzod Saidjanovich\",\n" +
//                "      \"depName\": \"Infratuzilma va analitiklar boshqarmasi\",\n" +
//                "      \"depId\": \"50001609\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60003690\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000785\",\n" +
//                "      \"pinfl\": \"30403856590010\",\n" +
//                "      \"name\": \"Xolturayev Sharofiddin Ashurovich\",\n" +
//                "      \"depName\": \"\\\"iABS\\\"ni rivojlantirish va qo'llab-quvvatlash bo'limi\",\n" +
//                "      \"depId\": \"50001615\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003696\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000786\",\n" +
//                "      \"pinfl\": \"30206780280019\",\n" +
//                "      \"name\": \"Astaxov Andrey Vladimirovich\",\n" +
//                "      \"depName\": \"Situatsion markaz bo'limi\",\n" +
//                "      \"depId\": \"50001595\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003632\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000787\",\n" +
//                "      \"pinfl\": \"31508940270056\",\n" +
//                "      \"name\": \"Azimov Sunnatilla Xabibulla o'g'li\",\n" +
//                "      \"depName\": \"\\\"iABS\\\"ni rivojlantirish va qo'llab-quvvatlash bo'limi\",\n" +
//                "      \"depId\": \"50001615\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003697\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000788\",\n" +
//                "      \"pinfl\": \"32203910560025\",\n" +
//                "      \"name\": \"Yunusov Jasurbek Amilbek o'g'li\",\n" +
//                "      \"depName\": \"\\\"iABS\\\"ni rivojlantirish va qo'llab-quvvatlash bo'limi\",\n" +
//                "      \"depId\": \"50001615\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003694\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000789\",\n" +
//                "      \"pinfl\": \"31202890600023\",\n" +
//                "      \"name\": \"Mirxodjayev Fazliddin Mirkamilovich\",\n" +
//                "      \"depName\": \"\\\"iABS\\\"ni rivojlantirish va qo'llab-quvvatlash bo'limi\",\n" +
//                "      \"depId\": \"50001615\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003701\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000790\",\n" +
//                "      \"pinfl\": \"32405940170010\",\n" +
//                "      \"name\": \"Umurov Islombek Rashid o'g'li\",\n" +
//                "      \"depName\": \"\\\"iABS\\\"ni rivojlantirish va qo'llab-quvvatlash bo'limi\",\n" +
//                "      \"depId\": \"50001615\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003700\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000791\",\n" +
//                "      \"pinfl\": \"32209966500086\",\n" +
//                "      \"name\": \"Azimov Kamoliddin Nematjon o'g'li\",\n" +
//                "      \"depName\": \"\\\"iABS\\\"ni rivojlantirish va qo'llab-quvvatlash bo'limi\",\n" +
//                "      \"depId\": \"50001615\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003702\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000793\",\n" +
//                "      \"pinfl\": \"30801995270017\",\n" +
//                "      \"name\": \"Narzullayev Murodali Tolibjonovich\",\n" +
//                "      \"depName\": \"Ichki dasturiy ta'minotlarni ishlab chiqish bo'limi\",\n" +
//                "      \"depId\": \"50001604\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003659\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000796\",\n" +
//                "      \"pinfl\": \"30309952160028\",\n" +
//                "      \"name\": \"Qirg'izboyev A'zamjon Abdusamat o'g'li\",\n" +
//                "      \"depName\": \"Ichki dasturiy ta'minotlarni ishlab chiqish bo'limi\",\n" +
//                "      \"depId\": \"50001604\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003662\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000797\",\n" +
//                "      \"pinfl\": \"32809941930040\",\n" +
//                "      \"name\": \"Odinayev Muxammad Komil o'g'li\",\n" +
//                "      \"depName\": \"Ichki dasturiy ta'minotlarni ishlab chiqish bo'limi\",\n" +
//                "      \"depId\": \"50001604\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003660\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000798\",\n" +
//                "      \"pinfl\": \"32012965950024\",\n" +
//                "      \"name\": \"G'aybullayev Azizbek Olimjon o'g'li\",\n" +
//                "      \"depName\": \"Ichki dasturiy ta'minotlarni ishlab chiqish bo'limi\",\n" +
//                "      \"depId\": \"50001604\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60003658\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000799\",\n" +
//                "      \"pinfl\": \"31207950270040\",\n" +
//                "      \"name\": \"Akromov Saidalixon Muslimxo'ja o'g'li\",\n" +
//                "      \"depName\": \"Masofaviy bank xizmatlarini rivojlantirish bo'limi\",\n" +
//                "      \"depId\": \"50001603\",\n" +
//                "      \"postName\": \"Menedjer\",\n" +
//                "      \"postId\": \"60003657\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000800\",\n" +
//                "      \"pinfl\": \"33105650160017\",\n" +
//                "      \"name\": \"Zaltsman Vitaliy Viktorovich\",\n" +
//                "      \"depName\": \"AT loyihalarni boshqarish va hisobini yuritish bo'limi\",\n" +
//                "      \"depId\": \"50001597\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003635\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000801\",\n" +
//                "      \"pinfl\": \"32810700260010\",\n" +
//                "      \"name\": \"Bayrakovskiy Radik Borisovich\",\n" +
//                "      \"depName\": \"Ma'lumotlarni qayta ishlash markazini va operatsion tizimlarni qo'llab-quvatlash bo'limi\",\n" +
//                "      \"depId\": \"50001045\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60004822\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000802\",\n" +
//                "      \"pinfl\": \"32908786750010\",\n" +
//                "      \"name\": \"Mayusupov Mirabzal Tolipjonovich\",\n" +
//                "      \"depName\": \"Situatsion markaz bo'limi\",\n" +
//                "      \"depId\": \"50001595\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003630\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000803\",\n" +
//                "      \"pinfl\": \"30310906770011\",\n" +
//                "      \"name\": \"Anorboyev Shaxzod Ag'zam o'g'li\",\n" +
//                "      \"depName\": \"Situatsion markaz bo'limi\",\n" +
//                "      \"depId\": \"50001595\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003631\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000804\",\n" +
//                "      \"pinfl\": \"32905750240010\",\n" +
//                "      \"name\": \"Xudaybergenov Muzaffar Masharipovich\",\n" +
//                "      \"depName\": \"Ma'lumotlarni qayta ishlash markazini va operatsion tizimlarni qo'llab-quvatlash bo'limi\",\n" +
//                "      \"depId\": \"50001045\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60002985\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000805\",\n" +
//                "      \"pinfl\": \"31805830250034\",\n" +
//                "      \"name\": \"Musayev Kazimjan Abdukarimovich\",\n" +
//                "      \"depName\": \"Ma'lumotlarni qayta ishlash markazini va operatsion tizimlarni qo'llab-quvatlash bo'limi\",\n" +
//                "      \"depId\": \"50001045\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60000520\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000807\",\n" +
//                "      \"pinfl\": \"30903950260052\",\n" +
//                "      \"name\": \"Opudalov Artyom Andreyevich\",\n" +
//                "      \"depName\": \"Tarmoq infratuzilmasini qo'llab-quvvatlash bo'limi\",\n" +
//                "      \"depId\": \"50001594\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003628\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000808\",\n" +
//                "      \"pinfl\": \"31103810250013\",\n" +
//                "      \"name\": \"Sergeyev Zaxar Mixaylovich\",\n" +
//                "      \"depName\": \"Tarmoq infratuzilmasini qo'llab-quvvatlash bo'limi\",\n" +
//                "      \"depId\": \"50001594\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003627\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000809\",\n" +
//                "      \"pinfl\": \"32609770250027\",\n" +
//                "      \"name\": \"Feoktistov Evgeniy Viktorovich\",\n" +
//                "      \"depName\": \"Foydalanuvchilarni qo'llab-quvvatlash bo'limi\",\n" +
//                "      \"depId\": \"50001599\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60003640\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000810\",\n" +
//                "      \"pinfl\": \"30204890770026\",\n" +
//                "      \"name\": \"Zaparojskiy Vladimir Yuryevich\",\n" +
//                "      \"depName\": \"Foydalanuvchilarni qo'llab-quvvatlash bo'limi\",\n" +
//                "      \"depId\": \"50001599\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003641\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000811\",\n" +
//                "      \"pinfl\": \"31403730280027\",\n" +
//                "      \"name\": \"Presnov Fyodor Nikolayevich\",\n" +
//                "      \"depName\": \"Foydalanuvchilarni qo'llab-quvvatlash bo'limi\",\n" +
//                "      \"depId\": \"50001599\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003642\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000812\",\n" +
//                "      \"pinfl\": \"31207900231590\",\n" +
//                "      \"name\": \"Tojiyev Xasan Zokirjon o'g'li\",\n" +
//                "      \"depName\": \"Texnik ta'minot va axborot tizimlarini qo'llab-quvvatlash boshqarmasi\",\n" +
//                "      \"depId\": \"50001596\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60003633\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000813\",\n" +
//                "      \"pinfl\": \"30510920232175\",\n" +
//                "      \"name\": \"Tojiyev Javlon Rasuljon o'g'li\",\n" +
//                "      \"depName\": \"Tarmoq infratuzilmasini qo'llab-quvvatlash bo'limi\",\n" +
//                "      \"depId\": \"50001594\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60004825\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000814\",\n" +
//                "      \"pinfl\": \"31010976580022\",\n" +
//                "      \"name\": \"Jumanazarov Diyor Azamat o'g'li\",\n" +
//                "      \"depName\": \"Axborot tizimlarini qo'llab-quvvatlash bo'limi\",\n" +
//                "      \"depId\": \"50001600\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003644\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000815\",\n" +
//                "      \"pinfl\": \"30309756590016\",\n" +
//                "      \"name\": \"Rasulov Komil Talibovich\",\n" +
//                "      \"depName\": \"Data Engineering va Sun'iy Intellekt texnologiyalari bo'limi\",\n" +
//                "      \"depId\": \"50001605\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003674\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000816\",\n" +
//                "      \"pinfl\": \"30904880550037\",\n" +
//                "      \"name\": \"Yax'yayev Mirvoxid Mirag'zamovich\",\n" +
//                "      \"depName\": \"\\\"iABS\\\"ni rivojlantirish va qo'llab-quvvatlash bo'limi\",\n" +
//                "      \"depId\": \"50001615\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003695\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000817\",\n" +
//                "      \"pinfl\": \"32502926840012\",\n" +
//                "      \"name\": \"Amirov Elshod Dilshod o'g'li\",\n" +
//                "      \"depName\": \"Data Engineering va Sun'iy Intellekt texnologiyalari bo'limi\",\n" +
//                "      \"depId\": \"50001605\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003672\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000819\",\n" +
//                "      \"pinfl\": \"32901975440011\",\n" +
//                "      \"name\": \"Ahmadov Nursulton Farhod o'g'li\",\n" +
//                "      \"depName\": \"Data Engineering va Sun'iy Intellekt texnologiyalari bo'limi\",\n" +
//                "      \"depId\": \"50001605\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003671\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000821\",\n" +
//                "      \"pinfl\": \"31408870290042\",\n" +
//                "      \"name\": \"Mumindjanov Komil Maksudbayevich\",\n" +
//                "      \"depName\": \"\\\"iABS\\\"ni rivojlantirish va qo'llab-quvvatlash bo'limi\",\n" +
//                "      \"depId\": \"50001615\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003698\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000822\",\n" +
//                "      \"pinfl\": \"31008976640015\",\n" +
//                "      \"name\": \"Qoraboyev Sardorbek Baxtiyor o'g'li\",\n" +
//                "      \"depName\": \"\\\"iABS\\\"ni rivojlantirish va qo'llab-quvvatlash bo'limi\",\n" +
//                "      \"depId\": \"50001615\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60003693\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000867\",\n" +
//                "      \"pinfl\": \"30912866540011\",\n" +
//                "      \"name\": \"Turakulov Bekzod Baxodirovich\",\n" +
//                "      \"depName\": \"Tavakkalchiliklarni boshqarish departamenti\",\n" +
//                "      \"depId\": \"50001902\",\n" +
//                "      \"postName\": \"Departament direktori o'rinbosari\",\n" +
//                "      \"postId\": \"60005036\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000868\",\n" +
//                "      \"pinfl\": \"30711833450106\",\n" +
//                "      \"name\": \"Amankulov Bayrambay Uzakbayevich\",\n" +
//                "      \"depName\": \"Kreditlash jarayonlarini qo'llab-quvvatlash va ESG boshqarmasi\",\n" +
//                "      \"depId\": \"50001900\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60004993\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000869\",\n" +
//                "      \"pinfl\": \"40203890171281\",\n" +
//                "      \"name\": \"Baxramova Kamola Abdumalikovna\",\n" +
//                "      \"depName\": \"Kredit maxsulotlarini sotish boshqarmasi\",\n" +
//                "      \"depId\": \"50000051\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60004830\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000870\",\n" +
//                "      \"pinfl\": \"32510890630038\",\n" +
//                "      \"name\": \"Niyazov Shukurullaxon Sobirxanovich\",\n" +
//                "      \"depName\": \"Kichik biznesga xizmat ko'rsatish departamenti\",\n" +
//                "      \"depId\": \"50000050\",\n" +
//                "      \"postName\": \"Departament direktori o'rinbosari\",\n" +
//                "      \"postId\": \"60000709\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000871\",\n" +
//                "      \"pinfl\": \"42711816610014\",\n" +
//                "      \"name\": \"Sattarova Iroda Abdimajitovna\",\n" +
//                "      \"depName\": \"Kredit maxsulotlarini sotish boshqarmasi\",\n" +
//                "      \"depId\": \"50000051\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60003004\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000872\",\n" +
//                "      \"pinfl\": \"32101900480055\",\n" +
//                "      \"name\": \"Mustafayev Shaxbozjon Gayratovich\",\n" +
//                "      \"depName\": \"Kredit maxsulotlarini sotish boshqarmasi\",\n" +
//                "      \"depId\": \"50000051\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60003005\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000874\",\n" +
//                "      \"pinfl\": \"30606901801611\",\n" +
//                "      \"name\": \"Toshmurodov Shoxrux Nasrulloyevich\",\n" +
//                "      \"depName\": \"Kredit ma‘muriyati bo‘limi\",\n" +
//                "      \"depId\": \"50001909\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60005075\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000875\",\n" +
//                "      \"pinfl\": \"30406832730013\",\n" +
//                "      \"name\": \"Maxdixonov Sherzodxon Shuxratxonovich\",\n" +
//                "      \"depName\": \"Kredit maxsulotlarini sotish boshqarmasi\",\n" +
//                "      \"depId\": \"50000051\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60003307\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000876\",\n" +
//                "      \"pinfl\": \"30509997340021\",\n" +
//                "      \"name\": \"Idirisov Pulatbek Juginisovich\",\n" +
//                "      \"depName\": \"Kredit maxsulotlarini sotish boshqarmasi\",\n" +
//                "      \"depId\": \"50000051\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003419\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000877\",\n" +
//                "      \"pinfl\": \"30401920271043\",\n" +
//                "      \"name\": \"Perdebayev Kuaatbay Kadirbayevich\",\n" +
//                "      \"depName\": \"Kichik biznes uchun mahsulotlarni ishlab chiqish va joriy qilishboshqarmasi\",\n" +
//                "      \"depId\": \"50001079\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60005204\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000878\",\n" +
//                "      \"pinfl\": \"32601920192131\",\n" +
//                "      \"name\": \"Karimov Abdusamug Abdumutal o'g'li\",\n" +
//                "      \"depName\": \"Tranzaktsiya mahsulotlarini sotish boshqarmasi\",\n" +
//                "      \"depId\": \"50001078\",\n" +
//                "      \"postName\": \"Menedjer\",\n" +
//                "      \"postId\": \"60000720\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000879\",\n" +
//                "      \"pinfl\": \"40309770780014\",\n" +
//                "      \"name\": \"Lafasova Chamangul Moyliyevna\",\n" +
//                "      \"depName\": \"Tranzaktsiya mahsulotlarini sotish boshqarmasi\",\n" +
//                "      \"depId\": \"50001078\",\n" +
//                "      \"postName\": \"Menedjer\",\n" +
//                "      \"postId\": \"60000721\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000880\",\n" +
//                "      \"pinfl\": \"40408880060064\",\n" +
//                "      \"name\": \"Kaldibayeva Asel Torabekovna\",\n" +
//                "      \"depName\": \"Kichik biznes uchun mahsulotlarni ishlab chiqish va joriy qilishboshqarmasi\",\n" +
//                "      \"depId\": \"50001079\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60003418\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000882\",\n" +
//                "      \"pinfl\": \"33005716530010\",\n" +
//                "      \"name\": \"Korakuziyev Baxtiyor Raxmatillayevich\",\n" +
//                "      \"depName\": \"Birinchi bo'lim\",\n" +
//                "      \"depId\": \"50000028\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60000094\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000883\",\n" +
//                "      \"pinfl\": \"32110675760011\",\n" +
//                "      \"name\": \"Amonov Amrullo Abdulloyevich\",\n" +
//                "      \"depName\": \"Birinchi bo'lim\",\n" +
//                "      \"depId\": \"50000028\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000095\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000885\",\n" +
//                "      \"pinfl\": \"32512760270029\",\n" +
//                "      \"name\": \"Aripov Baxodir Axmadovich\",\n" +
//                "      \"depName\": \"Korporativ munosabatlar xizmati\",\n" +
//                "      \"depId\": \"50000029\",\n" +
//                "      \"postName\": \"Korporativ maslahatchi\",\n" +
//                "      \"postId\": \"60005305\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000886\",\n" +
//                "      \"pinfl\": \"40307770200086\",\n" +
//                "      \"name\": \"Gafurova Lola Raximovna\",\n" +
//                "      \"depName\": \"Korporativ munosabatlar xizmati\",\n" +
//                "      \"depId\": \"50000029\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60005307\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000887\",\n" +
//                "      \"pinfl\": \"31812956320028\",\n" +
//                "      \"name\": \"Alimov Zulfiqor Abdulla o'g'li\",\n" +
//                "      \"depName\": \"Korporativ munosabatlar xizmati\",\n" +
//                "      \"depId\": \"50000029\",\n" +
//                "      \"postName\": \"Xizmat boshlig'i\",\n" +
//                "      \"postId\": \"60005306\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000888\",\n" +
//                "      \"pinfl\": \"40808870200061\",\n" +
//                "      \"name\": \"Kadirova Juldiz Abdijalelovna\",\n" +
//                "      \"depName\": \"Boshqaruv hujjatlari bilan ishlash va kotibiyat boshqarmasi\",\n" +
//                "      \"depId\": \"50001564\",\n" +
//                "      \"postName\": \"Referent\",\n" +
//                "      \"postId\": \"60003874\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000893\",\n" +
//                "      \"pinfl\": \"42501920270835\",\n" +
//                "      \"name\": \"Yormatova Nargiza Kamilovna\",\n" +
//                "      \"depName\": \"Loyiha ofisi\",\n" +
//                "      \"depId\": \"50000030\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60002761\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000895\",\n" +
//                "      \"pinfl\": \"32207964320031\",\n" +
//                "      \"name\": \"Umarov Doniyorjon Shavkatjon o'g'li\",\n" +
//                "      \"depName\": \"Loyiha ofisi\",\n" +
//                "      \"depId\": \"50000030\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60003416\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000896\",\n" +
//                "      \"pinfl\": \"43005940270024\",\n" +
//                "      \"name\": \"Abdullaxonova Shahlo Hamza qizi\",\n" +
//                "      \"depName\": \"Loyiha ofisi\",\n" +
//                "      \"depId\": \"50000030\",\n" +
//                "      \"postName\": \"Menedjer\",\n" +
//                "      \"postId\": \"60000105\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000897\",\n" +
//                "      \"pinfl\": \"50208005540030\",\n" +
//                "      \"name\": \"Nurmuxammedov Xondamir Valijon o'g'li\",\n" +
//                "      \"depName\": \"Loyiha ofisi\",\n" +
//                "      \"depId\": \"50000030\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003417\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000899\",\n" +
//                "      \"pinfl\": \"31709840210034\",\n" +
//                "      \"name\": \"Usmanxanov Boburxon Botirxonovich\",\n" +
//                "      \"depName\": \"Korporativ xizmat ko'rsatish departamenti\",\n" +
//                "      \"depId\": \"50000052\",\n" +
//                "      \"postName\": \"Departament direktori\",\n" +
//                "      \"postId\": \"60000724\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000900\",\n" +
//                "      \"pinfl\": \"33009881811235\",\n" +
//                "      \"name\": \"Xujanov Sherzod Allayorovich\",\n" +
//                "      \"depName\": \"Kredit monitoringi departamenti\",\n" +
//                "      \"depId\": \"50000053\",\n" +
//                "      \"postName\": \"Departament direktori o'rinbosari\",\n" +
//                "      \"postId\": \"60000751\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000901\",\n" +
//                "      \"pinfl\": \"31204940190085\",\n" +
//                "      \"name\": \"Sotimov Sobirjon Odilbek o'g'li\",\n" +
//                "      \"depName\": \"Kredit monitoringi departamenti\",\n" +
//                "      \"depId\": \"50000053\",\n" +
//                "      \"postName\": \"Departament direktori o'rinbosari\",\n" +
//                "      \"postId\": \"60000752\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000902\",\n" +
//                "      \"pinfl\": \"40411850560057\",\n" +
//                "      \"name\": \"Ganiyeva Xurshida Xamidxojayevna\",\n" +
//                "      \"depName\": \"Bank xizmatlari markazlari kreditlari monitoringini nazorat qilishbo'limi\",\n" +
//                "      \"depId\": \"50001497\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60005196\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000903\",\n" +
//                "      \"pinfl\": \"31602816590014\",\n" +
//                "      \"name\": \"Axmedov Zafar Tishayevich\",\n" +
//                "      \"depName\": \"Loyihalarni monitoring qilish boshqarmasi\",\n" +
//                "      \"depId\": \"50001494\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60002917\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000904\",\n" +
//                "      \"pinfl\": \"40409840190100\",\n" +
//                "      \"name\": \"Zufarova Shaxnoza Shamansurovna\",\n" +
//                "      \"depName\": \"Tadbirkorlik sub'ektlarini qo'llab-quvvatlash davlat jamg'armasi bilanishlash sektori\",\n" +
//                "      \"depId\": \"50001498\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60004861\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000906\",\n" +
//                "      \"pinfl\": \"32512872710019\",\n" +
//                "      \"name\": \"To'rayev Zoxid Baxtiyorovich\",\n" +
//                "      \"depName\": \"Korporativ xizmat loyihalarini monitoring qilish bo'limi\",\n" +
//                "      \"depId\": \"50001496\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60002919\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000908\",\n" +
//                "      \"pinfl\": \"32403933820119\",\n" +
//                "      \"name\": \"Raxmankulov Temur Yusupovich\",\n" +
//                "      \"depName\": \"Bank xizmatlari markazlari kreditlari monitoringini nazorat qilishbo'limi\",\n" +
//                "      \"depId\": \"50001497\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60002925\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000910\",\n" +
//                "      \"pinfl\": \"32503802720044\",\n" +
//                "      \"name\": \"Boyqulov Dilshod Erkinovich\",\n" +
//                "      \"depName\": \"Bank xizmatlari markazlari kreditlari monitoringini nazorat qilishbo'limi\",\n" +
//                "      \"depId\": \"50001497\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60002924\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000912\",\n" +
//                "      \"pinfl\": \"30209955590038\",\n" +
//                "      \"name\": \"Qurbonov Farruh Azam o'g'li\",\n" +
//                "      \"depName\": \"Bank xizmatlari markazlari kreditlari monitoringini nazorat qilishbo'limi\",\n" +
//                "      \"depId\": \"50001497\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003414\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000913\",\n" +
//                "      \"pinfl\": \"30301977040035\",\n" +
//                "      \"name\": \"Abbosxonov Bexzod Yorqinjon o'g'li\",\n" +
//                "      \"depName\": \"Bank balansiga mulklarni qabul qilish bo'limi\",\n" +
//                "      \"depId\": \"50001477\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003098\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000914\",\n" +
//                "      \"pinfl\": \"30408966930046\",\n" +
//                "      \"name\": \"Abduvaxobov Abbosbek Elbekjon o'g'li\",\n" +
//                "      \"depName\": \"Bank xizmatlari markazlari kreditlari monitoringini nazorat qilishbo'limi\",\n" +
//                "      \"depId\": \"50001497\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003415\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000915\",\n" +
//                "      \"pinfl\": \"50203008660015\",\n" +
//                "      \"name\": \"Xusanov Ilxomjon Erkin o'g'li\",\n" +
//                "      \"depName\": \"Bank xizmatlari markazlari kreditlari monitoringini nazorat qilishbo'limi\",\n" +
//                "      \"depId\": \"50001497\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60002931\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000916\",\n" +
//                "      \"pinfl\": \"31902816500014\",\n" +
//                "      \"name\": \"Matniyazov Azizbek Shonazarovich\",\n" +
//                "      \"depName\": \"Hisobot va tahlil boshqarmasi\",\n" +
//                "      \"depId\": \"50001495\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60002918\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000917\",\n" +
//                "      \"pinfl\": \"31710824070025\",\n" +
//                "      \"name\": \"Shukurov Ne'matillo Buronovich\",\n" +
//                "      \"depName\": \"Hisobot va tahlil boshqarmasi\",\n" +
//                "      \"depId\": \"50001495\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60002932\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000919\",\n" +
//                "      \"pinfl\": \"32408942390035\",\n" +
//                "      \"name\": \"Xamidov Oxunjon Toxir o'g'li\",\n" +
//                "      \"depName\": \"Tadbirkorlik sub'ektlarini qo'llab-quvvatlash davlat jamg'armasi bilanishlash sektori\",\n" +
//                "      \"depId\": \"50001498\",\n" +
//                "      \"postName\": \"Sektor mudiri\",\n" +
//                "      \"postId\": \"60002933\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000922\",\n" +
//                "      \"pinfl\": \"31407840530018\",\n" +
//                "      \"name\": \"Mirsoatov Sardor Baxodirovich\",\n" +
//                "      \"depName\": \"Ishlarni boshqarish departamenti\",\n" +
//                "      \"depId\": \"50000046\",\n" +
//                "      \"postName\": \"Departament direktori\",\n" +
//                "      \"postId\": \"60000552\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000926\",\n" +
//                "      \"pinfl\": \"33107806960016\",\n" +
//                "      \"name\": \"Muminov Sherzod Sodikovich\",\n" +
//                "      \"depName\": \"Chakana amaliyotlar hisobi bo'limi\",\n" +
//                "      \"depId\": \"50001076\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000701\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000927\",\n" +
//                "      \"pinfl\": \"30712902360049\",\n" +
//                "      \"name\": \"O'rolov Oybek Ximmatovich\",\n" +
//                "      \"depName\": \"Sho'ba korxonalari bilan ishlash bo'limi\",\n" +
//                "      \"depId\": \"50001868\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60004873\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000928\",\n" +
//                "      \"pinfl\": \"31209986940041\",\n" +
//                "      \"name\": \"Abdumutalibov Axmadullo Turg'unboy o'g'li\",\n" +
//                "      \"depName\": \"Kredit maxsulotlarini sotish boshqarmasi\",\n" +
//                "      \"depId\": \"50000051\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000715\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000930\",\n" +
//                "      \"pinfl\": \"32302913990096\",\n" +
//                "      \"name\": \"Raximov Shaxboz Furqat o'g'li\",\n" +
//                "      \"depName\": \"Kredit maxsulotlarini sotish boshqarmasi\",\n" +
//                "      \"depId\": \"50000051\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60000711\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000931\",\n" +
//                "      \"pinfl\": \"40611870170049\",\n" +
//                "      \"name\": \"Rasulmatova Muqaddas Bobirovna\",\n" +
//                "      \"depName\": \"Monitoring bo'limi\",\n" +
//                "      \"depId\": \"50001049\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003404\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000932\",\n" +
//                "      \"pinfl\": \"30808910171778\",\n" +
//                "      \"name\": \"Tulepbergenov Nurali Junaytovich\",\n" +
//                "      \"depName\": \"Farmatsevtika loyihalarini moliyalashtirish markazi\",\n" +
//                "      \"depId\": \"50001537\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003340\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000933\",\n" +
//                "      \"pinfl\": \"31905880060011\",\n" +
//                "      \"name\": \"Kamilov Ulug'bek Ismatillayevich\",\n" +
//                "      \"depName\": \"Monitoring bo'limi\",\n" +
//                "      \"depId\": \"50001049\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003405\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000934\",\n" +
//                "      \"pinfl\": \"42608920223088\",\n" +
//                "      \"name\": \"Abdullaxojayeva Zeboxon Ravshan qizi\",\n" +
//                "      \"depName\": \"Monitoring bo'limi\",\n" +
//                "      \"depId\": \"50001049\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003404\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000935\",\n" +
//                "      \"pinfl\": \"32207850220155\",\n" +
//                "      \"name\": \"Tairov Saidmajid Saidmamurovich\",\n" +
//                "      \"depName\": \"Qurilish monitoringi boshqarmasi\",\n" +
//                "      \"depId\": \"50000045\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60000534\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000937\",\n" +
//                "      \"pinfl\": \"43107750200034\",\n" +
//                "      \"name\": \"Ametova Nilufar Aminovna\",\n" +
//                "      \"depName\": \"Monitoring bo'limi\",\n" +
//                "      \"depId\": \"50001049\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003420\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000938\",\n" +
//                "      \"pinfl\": \"32304920560064\",\n" +
//                "      \"name\": \"Anvarov Javoxir Baxodir o'g'li\",\n" +
//                "      \"depName\": \"Monitoring bo'limi\",\n" +
//                "      \"depId\": \"50001049\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60002739\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000939\",\n" +
//                "      \"pinfl\": \"32107640221569\",\n" +
//                "      \"name\": \"Alimov Mansurdjan Maxmudovich\",\n" +
//                "      \"depName\": \"Qurilish monitoringi boshqarmasi\",\n" +
//                "      \"depId\": \"50000045\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i o'rinbosari\",\n" +
//                "      \"postId\": \"60000535\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000940\",\n" +
//                "      \"pinfl\": \"32811873930025\",\n" +
//                "      \"name\": \"Nazarov Nurbek Rustamovich\",\n" +
//                "      \"depName\": \"Monitoring bo'limi\",\n" +
//                "      \"depId\": \"50001049\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000539\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000941\",\n" +
//                "      \"pinfl\": \"32302840470074\",\n" +
//                "      \"name\": \"Soatov Sanjarbek Olimovich\",\n" +
//                "      \"depName\": \"Muxandislik bo'limi\",\n" +
//                "      \"depId\": \"50001050\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60000540\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000942\",\n" +
//                "      \"pinfl\": \"30402613100059\",\n" +
//                "      \"name\": \"Babajanov Usman Umarovich\",\n" +
//                "      \"depName\": \"Muxandislik bo'limi\",\n" +
//                "      \"depId\": \"50001050\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000541\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000944\",\n" +
//                "      \"pinfl\": \"30401900191701\",\n" +
//                "      \"name\": \"Tuxtashev Ulug'bek Eson o'g'li\",\n" +
//                "      \"depName\": \"Texnik nazorati bo'limi\",\n" +
//                "      \"depId\": \"50001051\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003242\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000945\",\n" +
//                "      \"pinfl\": \"32301480180017\",\n" +
//                "      \"name\": \"Tsoy Vladimir Grigoryevich\",\n" +
//                "      \"depName\": \"Muxandislik bo'limi\",\n" +
//                "      \"depId\": \"50001050\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60000544\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000946\",\n" +
//                "      \"pinfl\": \"31602716600011\",\n" +
//                "      \"name\": \"Abdushukurov Shuxrat Rasulmatovich\",\n" +
//                "      \"depName\": \"Texnik nazorati bo'limi\",\n" +
//                "      \"depId\": \"50001051\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60000545\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000947\",\n" +
//                "      \"pinfl\": \"30710912330087\",\n" +
//                "      \"name\": \"Yuldoshev Ulug'bek Qaxramonovich\",\n" +
//                "      \"depName\": \"Texnik nazorati bo'limi\",\n" +
//                "      \"depId\": \"50001051\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000549\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000949\",\n" +
//                "      \"pinfl\": \"32703712170065\",\n" +
//                "      \"name\": \"Nabiyev Abdumalik Samatovich\",\n" +
//                "      \"depName\": \"Texnik nazorati bo'limi\",\n" +
//                "      \"depId\": \"50001051\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000551\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000950\",\n" +
//                "      \"pinfl\": \"30111870560082\",\n" +
//                "      \"name\": \"Adilov Shoxrux Patchaxanovich\",\n" +
//                "      \"depName\": \"Texnik nazorati bo'limi\",\n" +
//                "      \"depId\": \"50001051\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000546\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000952\",\n" +
//                "      \"pinfl\": \"30109842890019\",\n" +
//                "      \"name\": \"Umarov Shokirjon Rustamovich\",\n" +
//                "      \"depName\": \"Texnik nazorati bo'limi\",\n" +
//                "      \"depId\": \"50001051\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000548\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000959\",\n" +
//                "      \"pinfl\": \"31812891110045\",\n" +
//                "      \"name\": \"Po'lotov Nishon Baxodirovich\",\n" +
//                "      \"depName\": \"Ekspert-tahlil guruhi\",\n" +
//                "      \"depId\": \"50000964\",\n" +
//                "      \"postName\": \"Ekspert (Buxoro BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60004951\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000971\",\n" +
//                "      \"pinfl\": \"40602923500052\",\n" +
//                "      \"name\": \"Matkarimova Dilaram Dauletbayevna\",\n" +
//                "      \"depName\": \"Harakatsiz kreditlarni hisobdan chiqarish bo'limi\",\n" +
//                "      \"depId\": \"50001475\",\n" +
//                "      \"postName\": \"Bosh yuriskonsul`t\",\n" +
//                "      \"postId\": \"60002644\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000990\",\n" +
//                "      \"pinfl\": \"31605795820019\",\n" +
//                "      \"name\": \"Rizayev Shuxrat Olimovich\",\n" +
//                "      \"depName\": \"Harakatsiz kreditlarni hisobdan chiqarish bo'limi\",\n" +
//                "      \"depId\": \"50001475\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60002646\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000992\",\n" +
//                "      \"pinfl\": \"30704843140028\",\n" +
//                "      \"name\": \"Sapayozov Sherzod Sharifbayevich\",\n" +
//                "      \"depName\": \"Bank mulklarini sog'lomlashtirish boshqarmasi\",\n" +
//                "      \"depId\": \"50001448\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60002628\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000993\",\n" +
//                "      \"pinfl\": \"31804930530055\",\n" +
//                "      \"name\": \"Zukirov Shamsiddin Axliddin ugli\",\n" +
//                "      \"depName\": \"Sud jarayonidagi kreditlar hisoboti va tahlili sektori\",\n" +
//                "      \"depId\": \"50001590\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60003709\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000994\",\n" +
//                "      \"pinfl\": \"30303843970013\",\n" +
//                "      \"name\": \"Qurbonov Zaxriddin Botirxon o'g'li\",\n" +
//                "      \"depName\": \"Harakatsiz kreditlarni hisobdan chiqarish bo'limi\",\n" +
//                "      \"depId\": \"50001475\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60002647\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000995\",\n" +
//                "      \"pinfl\": \"30208912600098\",\n" +
//                "      \"name\": \"Amonturdiyev Sharofiddin Asatullo ugli\",\n" +
//                "      \"depName\": \"Sotilgan mulklarni monitoring qilish bo'limi\",\n" +
//                "      \"depId\": \"50001479\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60002639\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000996\",\n" +
//                "      \"pinfl\": \"32302967140021\",\n" +
//                "      \"name\": \"Madrimov Shuxrat Baxodir o'g'li\",\n" +
//                "      \"depName\": \"Investitsiyalar boshqarmasi\",\n" +
//                "      \"depId\": \"50001867\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60004872\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000997\",\n" +
//                "      \"pinfl\": \"32206790600058\",\n" +
//                "      \"name\": \"Miliboyev Sayfulla Sadullayevich\",\n" +
//                "      \"depName\": \"Muammoli aktivlar bilan ishlash departamenti\",\n" +
//                "      \"depId\": \"50000047\",\n" +
//                "      \"postName\": \"Departament direktori o'rinbosari\",\n" +
//                "      \"postId\": \"60002904\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00000998\",\n" +
//                "      \"pinfl\": \"41510680100020\",\n" +
//                "      \"name\": \"Ziyayeva Nilufar Burxanovna\",\n" +
//                "      \"depName\": \"Tahliliy xisobotlar yig'ma bo'limi\",\n" +
//                "      \"depId\": \"50001476\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60002637\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001001\",\n" +
//                "      \"pinfl\": \"30505884040043\",\n" +
//                "      \"name\": \"Tilovov Jaxongir Ulashboyevich\",\n" +
//                "      \"depName\": \"Harakatsiz kreditlarni hisobdan chiqarish bo'limi\",\n" +
//                "      \"depId\": \"50001475\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60002636\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001002\",\n" +
//                "      \"pinfl\": \"32910666520015\",\n" +
//                "      \"name\": \"Turakulov Shuxrat Ergashevich\",\n" +
//                "      \"depName\": \"Tahliliy xisobotlar yig'ma bo'limi\",\n" +
//                "      \"depId\": \"50001476\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60002695\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001003\",\n" +
//                "      \"pinfl\": \"30904811880035\",\n" +
//                "      \"name\": \"Qodirov Sherzod Shukurovich\",\n" +
//                "      \"depName\": \"Harakatsiz kreditlarni hisobdan chiqarish bo'limi\",\n" +
//                "      \"depId\": \"50001475\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60002642\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001005\",\n" +
//                "      \"pinfl\": \"32508975350038\",\n" +
//                "      \"name\": \"Hamroyev Kamol Komil o'g'li\",\n" +
//                "      \"depName\": \"Tahliliy xisobotlar yig'ma bo'limi\",\n" +
//                "      \"depId\": \"50001476\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60002643\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001006\",\n" +
//                "      \"pinfl\": \"31402800210032\",\n" +
//                "      \"name\": \"Janibekov Jamshid Jumanazarovich\",\n" +
//                "      \"depName\": \"Bank mulklarini sotish bo'limi\",\n" +
//                "      \"depId\": \"50001478\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60002648\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001007\",\n" +
//                "      \"pinfl\": \"30108861860092\",\n" +
//                "      \"name\": \"Jabbarov Nodirjon Umirovich\",\n" +
//                "      \"depName\": \"Sotilgan mulklarni monitoring qilish bo'limi\",\n" +
//                "      \"depId\": \"50001479\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60002641\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001009\",\n" +
//                "      \"pinfl\": \"32609836780017\",\n" +
//                "      \"name\": \"Mirzayev Bexzod Elmurodovich\",\n" +
//                "      \"depName\": \"Pul muomalasi va valyuta ayirboshlash amaliyotlari boshqarmasi\",\n" +
//                "      \"depId\": \"50001871\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60004936\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001011\",\n" +
//                "      \"pinfl\": \"32311710201148\",\n" +
//                "      \"name\": \"Kosimov Abror Abdullaxoshimovich\",\n" +
//                "      \"depName\": \"Kassa amaliyotlari nazorati bo'limi\",\n" +
//                "      \"depId\": \"50001872\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60004937\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001012\",\n" +
//                "      \"pinfl\": \"43011820190027\",\n" +
//                "      \"name\": \"Toxtayeva Dilobar Zakirovna\",\n" +
//                "      \"depName\": \"Kassa amaliyotlari nazorati bo'limi\",\n" +
//                "      \"depId\": \"50001872\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60004938\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001014\",\n" +
//                "      \"pinfl\": \"31308920222811\",\n" +
//                "      \"name\": \"Mansurov Komiljon Maxmudjon og'li\",\n" +
//                "      \"depName\": \"Pul muomalasi va to'lovlarni monitoring qilish bo'limi\",\n" +
//                "      \"depId\": \"50001873\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60004939\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001016\",\n" +
//                "      \"pinfl\": \"31505950170060\",\n" +
//                "      \"name\": \"Maxmudjonov Axmadjon Muxammad og'li\",\n" +
//                "      \"depName\": \"Valyuta ayirboshlash amaliyotlari bo'limi\",\n" +
//                "      \"depId\": \"50001874\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60005065\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001017\",\n" +
//                "      \"pinfl\": \"30412860190040\",\n" +
//                "      \"name\": \"Abdullayev Oybek Xamidullayevich\",\n" +
//                "      \"depName\": \"Valyuta ayirboshlash amaliyotlari bo'limi\",\n" +
//                "      \"depId\": \"50001874\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60004942\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001018\",\n" +
//                "      \"pinfl\": \"31608822380049\",\n" +
//                "      \"name\": \"Saidov Dja'far Muzaffarovich\",\n" +
//                "      \"depName\": \"Raxbariyat\",\n" +
//                "      \"depId\": \"50000024\",\n" +
//                "      \"postName\": \"Boshqaruvchi direktor (COO)\",\n" +
//                "      \"postId\": \"60005223\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001019\",\n" +
//                "      \"pinfl\": \"30107875260016\",\n" +
//                "      \"name\": \"Axrarov Nodir Sobirovich\",\n" +
//                "      \"depName\": \"Strategik rivojlanish va iqtisodiy tahlil departamenti\",\n" +
//                "      \"depId\": \"50000039\",\n" +
//                "      \"postName\": \"Departament direktori\",\n" +
//                "      \"postId\": \"60000329\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001020\",\n" +
//                "      \"pinfl\": \"33105956540018\",\n" +
//                "      \"name\": \"Fatxullaev Abdulla Xamidulla o'g'li\",\n" +
//                "      \"depName\": \"Strategik rivojlanish va iqtisodiy tahlil departamenti\",\n" +
//                "      \"depId\": \"50000039\",\n" +
//                "      \"postName\": \"Menedjer\",\n" +
//                "      \"postId\": \"60000331\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001023\",\n" +
//                "      \"pinfl\": \"32005943380038\",\n" +
//                "      \"name\": \"Abdimajitov Aydos Farxat o'g'li\",\n" +
//                "      \"depName\": \"Byudjetni rejalashtirish va nazorat qilish boshqarmasi\",\n" +
//                "      \"depId\": \"50001492\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60004943\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001024\",\n" +
//                "      \"pinfl\": \"30801870500073\",\n" +
//                "      \"name\": \"Xamitov Saitmaxamad Shokirjonovich\",\n" +
//                "      \"depName\": \"Strategik marketing bo'limi\",\n" +
//                "      \"depId\": \"50001489\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60005214\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001025\",\n" +
//                "      \"pinfl\": \"31709900210929\",\n" +
//                "      \"name\": \"Azimov Sobitjon Sobirjon o'g'li\",\n" +
//                "      \"depName\": \"Buxgalteriya hisobi va moliyaviy nazorat departamenti\",\n" +
//                "      \"depId\": \"50000043\",\n" +
//                "      \"postName\": \"Departament direktori o'rinbosari - Bosh buxgalter o'rinbosari\",\n" +
//                "      \"postId\": \"60000468\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001027\",\n" +
//                "      \"pinfl\": \"32306883680027\",\n" +
//                "      \"name\": \"Narmuradov Farrux Ziyadullayevich\",\n" +
//                "      \"depName\": \"Tavakkalchiliklarni boshqarish departamenti\",\n" +
//                "      \"depId\": \"50001902\",\n" +
//                "      \"postName\": \"Departament direktori\",\n" +
//                "      \"postId\": \"60005034\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001028\",\n" +
//                "      \"pinfl\": \"32205840020011\",\n" +
//                "      \"name\": \"Gadaev Jaxongir Maxamadjanovich\",\n" +
//                "      \"depName\": \"Ekologik va ijtimoiy boshqaruv bo‘limi\",\n" +
//                "      \"depId\": \"50001910\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60005078\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001029\",\n" +
//                "      \"pinfl\": \"31905816540011\",\n" +
//                "      \"name\": \"Ochilov Jamoliddin Xamitovich\",\n" +
//                "      \"depName\": \"Tavakkalchiliklarni boshqarish departamenti\",\n" +
//                "      \"depId\": \"50001902\",\n" +
//                "      \"postName\": \"Departament direktori o'rinbosari\",\n" +
//                "      \"postId\": \"60005035\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001030\",\n" +
//                "      \"pinfl\": \"31105840240013\",\n" +
//                "      \"name\": \"Saatov Sa'dulla Ziyadullayevich\",\n" +
//                "      \"depName\": \"Kredit tavakkalchiligini boshqarish bo'limi\",\n" +
//                "      \"depId\": \"50001905\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60005043\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001031\",\n" +
//                "      \"pinfl\": \"42706776540013\",\n" +
//                "      \"name\": \"Axadova Nargis Alimjanovna\",\n" +
//                "      \"depName\": \"Tavakkalchiliklarni tahlil qilish va metodologiya bo'limi\",\n" +
//                "      \"depId\": \"50001904\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60005040\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001032\",\n" +
//                "      \"pinfl\": \"41703810240057\",\n" +
//                "      \"name\": \"Yusupova Lola Shavkatbayevna\",\n" +
//                "      \"depName\": \"Kredit ma‘muriyati bo‘limi\",\n" +
//                "      \"depId\": \"50001909\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60005074\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001033\",\n" +
//                "      \"pinfl\": \"30412936590011\",\n" +
//                "      \"name\": \"Sarbasov Nauan Baglanovich\",\n" +
//                "      \"depName\": \"Kredit tavakkalchiligini boshqarish bo'limi\",\n" +
//                "      \"depId\": \"50001905\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60005044\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001034\",\n" +
//                "      \"pinfl\": \"30411650260024\",\n" +
//                "      \"name\": \"Korniyenko Vladimir Vladimirovich\",\n" +
//                "      \"depName\": \"Tavakkalchiliklarni tahlil qilish va metodologiya bo'limi\",\n" +
//                "      \"depId\": \"50001904\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60005054\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001035\",\n" +
//                "      \"pinfl\": \"30901863680011\",\n" +
//                "      \"name\": \"Bekov Ulug'bek Olegovich\",\n" +
//                "      \"depName\": \"Anderrayting bo‘limi\",\n" +
//                "      \"depId\": \"50001908\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60005068\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001036\",\n" +
//                "      \"pinfl\": \"30811904320014\",\n" +
//                "      \"name\": \"Qosimov Shukurjon Shavkatovich\",\n" +
//                "      \"depName\": \"Kredit ma‘muriyati bo‘limi\",\n" +
//                "      \"depId\": \"50001909\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60005073\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001037\",\n" +
//                "      \"pinfl\": \"32304766780019\",\n" +
//                "      \"name\": \"Shukurov Komil Kodirovich\",\n" +
//                "      \"depName\": \"Anderrayting bo‘limi\",\n" +
//                "      \"depId\": \"50001908\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60005069\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001038\",\n" +
//                "      \"pinfl\": \"31208943950170\",\n" +
//                "      \"name\": \"Baylanov Orifjon Tolip o'g'li\",\n" +
//                "      \"depName\": \"Kredit tavakkalchiligini boshqarish bo'limi\",\n" +
//                "      \"depId\": \"50001905\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60005042\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001039\",\n" +
//                "      \"pinfl\": \"30911913940088\",\n" +
//                "      \"name\": \"Shakarov Jamxur Farxodovich\",\n" +
//                "      \"depName\": \"O'zb. Res. Markaziy banki Kredit axboroti davlat reyestri va kreditbyurosi bilan ishlash bo‘limi\",\n" +
//                "      \"depId\": \"50001911\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60005081\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001040\",\n" +
//                "      \"pinfl\": \"31104934280052\",\n" +
//                "      \"name\": \"Qosimov Xumoyun Ilyasjon o'g'li\",\n" +
//                "      \"depName\": \"Anderrayting bo‘limi\",\n" +
//                "      \"depId\": \"50001908\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60005067\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001041\",\n" +
//                "      \"pinfl\": \"31212864060010\",\n" +
//                "      \"name\": \"Karimov Shaxrux Raxmonberdiyevich\",\n" +
//                "      \"depName\": \"Kreditlash jarayonlarini qo'llab-quvvatlash va ESG boshqarmasi\",\n" +
//                "      \"depId\": \"50001900\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i o'rinbosari\",\n" +
//                "      \"postId\": \"60005110\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001042\",\n" +
//                "      \"pinfl\": \"32309925910018\",\n" +
//                "      \"name\": \"Valixonov Ayubxon Asqarxon o'g'li\",\n" +
//                "      \"depName\": \"Data Engineering va Sun'iy Intellekt texnologiyalari bo'limi\",\n" +
//                "      \"depId\": \"50001605\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003669\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001044\",\n" +
//                "      \"pinfl\": \"42609900720052\",\n" +
//                "      \"name\": \"Kuchkarova Mervert Aldiyar qizi\",\n" +
//                "      \"depName\": \"Data Engineering va Sun'iy Intellekt texnologiyalari bo'limi\",\n" +
//                "      \"depId\": \"50001605\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60003667\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001045\",\n" +
//                "      \"pinfl\": \"30306904040018\",\n" +
//                "      \"name\": \"Norboyev Abdulla Boynazarovich\",\n" +
//                "      \"depName\": \"Data Engineering va Sun'iy Intellekt texnologiyalari bo'limi\",\n" +
//                "      \"depId\": \"50001605\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003668\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001046\",\n" +
//                "      \"pinfl\": \"51912005850039\",\n" +
//                "      \"name\": \"Abdug'afforov Umidjon Shamsidinovich\",\n" +
//                "      \"depName\": \"Data Engineering va Sun'iy Intellekt texnologiyalari bo'limi\",\n" +
//                "      \"depId\": \"50001605\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60005007\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001047\",\n" +
//                "      \"pinfl\": \"31404953930010\",\n" +
//                "      \"name\": \"Tolmasov Jamshid Alisher o'g'li\",\n" +
//                "      \"depName\": \"Tavakkalchiliklarni tahlil qilish va metodologiya bo'limi\",\n" +
//                "      \"depId\": \"50001904\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60005039\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001048\",\n" +
//                "      \"pinfl\": \"30712881230056\",\n" +
//                "      \"name\": \"Raximov Baxtiyor Bobirovich\",\n" +
//                "      \"depName\": \"O'zb. Res. Markaziy banki Kredit axboroti davlat reyestri va kreditbyurosi bilan ishlash bo‘limi\",\n" +
//                "      \"depId\": \"50001911\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60005080\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001051\",\n" +
//                "      \"pinfl\": \"42111955740016\",\n" +
//                "      \"name\": \"Primova Gulizoda Rustam qizi\",\n" +
//                "      \"depName\": \"Bozor va likvidlilik tavakkalchiligini boshqarish bo'limi\",\n" +
//                "      \"depId\": \"50001903\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60005038\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001052\",\n" +
//                "      \"pinfl\": \"61608025260015\",\n" +
//                "      \"name\": \"Gaybnazarova Parvina Azamatovna\",\n" +
//                "      \"depName\": \"Operatsion tavakkalchiliklarni boshqarish bo'limi\",\n" +
//                "      \"depId\": \"50001906\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60005047\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001053\",\n" +
//                "      \"pinfl\": \"30504966590012\",\n" +
//                "      \"name\": \"Mamadiyorov Temur Tulkinovich\",\n" +
//                "      \"depName\": \"Operatsion tavakkalchiliklarni boshqarish bo'limi\",\n" +
//                "      \"depId\": \"50001906\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60005046\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001056\",\n" +
//                "      \"pinfl\": \"31603863450052\",\n" +
//                "      \"name\": \"Uteyev Salamat Maratovich\",\n" +
//                "      \"depName\": \"Garov mulkini baholash bo‘limi\",\n" +
//                "      \"depId\": \"50001912\",\n" +
//                "      \"postName\": \"Bosh mutaxassis (BXM bo‘yicha)\",\n" +
//                "      \"postId\": \"60005089\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001057\",\n" +
//                "      \"pinfl\": \"30206721840025\",\n" +
//                "      \"name\": \"Tangirov Baxtiyor Jovliyevich\",\n" +
//                "      \"depName\": \"Garov mulkini baholash bo‘limi\",\n" +
//                "      \"depId\": \"50001912\",\n" +
//                "      \"postName\": \"Bosh mutaxassis (BXM bo‘yicha)\",\n" +
//                "      \"postId\": \"60005091\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001058\",\n" +
//                "      \"pinfl\": \"31008806520027\",\n" +
//                "      \"name\": \"Nortojiyev Furkat Musinovich\",\n" +
//                "      \"depName\": \"Garov mulkini baholash bo‘limi\",\n" +
//                "      \"depId\": \"50001912\",\n" +
//                "      \"postName\": \"Bosh mutaxassis (BXM bo‘yicha)\",\n" +
//                "      \"postId\": \"60005090\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001059\",\n" +
//                "      \"pinfl\": \"32204883680020\",\n" +
//                "      \"name\": \"Kurbonov Ilxom Ergashevich\",\n" +
//                "      \"depName\": \"Garov mulkini baholash bo‘limi\",\n" +
//                "      \"depId\": \"50001912\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60005083\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001060\",\n" +
//                "      \"pinfl\": \"30909931581624\",\n" +
//                "      \"name\": \"Hamrayev Jahongir Akram o'g'li\",\n" +
//                "      \"depName\": \"Garov mulkini baholash bo‘limi\",\n" +
//                "      \"depId\": \"50001912\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60005084\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001061\",\n" +
//                "      \"pinfl\": \"32604922720043\",\n" +
//                "      \"name\": \"Ergashev Shaxzod Shuxrat o'g'li\",\n" +
//                "      \"depName\": \"Garov mulkini baholash bo‘limi\",\n" +
//                "      \"depId\": \"50001912\",\n" +
//                "      \"postName\": \"Bosh mutaxassis (BXM bo‘yicha)\",\n" +
//                "      \"postId\": \"60005095\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001062\",\n" +
//                "      \"pinfl\": \"33103930211499\",\n" +
//                "      \"name\": \"Abdullayev Navro'zbek Rashid o'g'li\",\n" +
//                "      \"depName\": \"Garov mulkini baholash bo‘limi\",\n" +
//                "      \"depId\": \"50001912\",\n" +
//                "      \"postName\": \"Bosh mutaxassis (BXM bo‘yicha)\",\n" +
//                "      \"postId\": \"60005092\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001063\",\n" +
//                "      \"pinfl\": \"32208997050102\",\n" +
//                "      \"name\": \"Uktamov Diyorbek Dilshodbek o'g'li\",\n" +
//                "      \"depName\": \"Garov mulkini baholash bo‘limi\",\n" +
//                "      \"depId\": \"50001912\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis(BXM bo‘yicha)\",\n" +
//                "      \"postId\": \"60005106\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001064\",\n" +
//                "      \"pinfl\": \"30108922380042\",\n" +
//                "      \"name\": \"Bahronov Shaxzodjon Baxtiyor o'g'li\",\n" +
//                "      \"depName\": \"Garov mulkini baholash bo‘limi\",\n" +
//                "      \"depId\": \"50001912\",\n" +
//                "      \"postName\": \"Bosh mutaxassis (BXM bo‘yicha)\",\n" +
//                "      \"postId\": \"60005093\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001065\",\n" +
//                "      \"pinfl\": \"31508916530010\",\n" +
//                "      \"name\": \"Semmari Amin \",\n" +
//                "      \"depName\": \"MXXS bo'yicha moliyaviy hisobot boshqarmasi\",\n" +
//                "      \"depId\": \"50001619\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60003717\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001066\",\n" +
//                "      \"pinfl\": \"32805890191279\",\n" +
//                "      \"name\": \"Muminov Ramiz Abdurashidovich\",\n" +
//                "      \"depName\": \"MXXS bo'yicha moliyaviy hisobot boshqarmasi\",\n" +
//                "      \"depId\": \"50001619\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003718\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001068\",\n" +
//                "      \"pinfl\": \"30204995050021\",\n" +
//                "      \"name\": \"Fozilov Oybek Avazbek o'g'li\",\n" +
//                "      \"depName\": \"MXXS bo'yicha moliyaviy hisobot boshqarmasi\",\n" +
//                "      \"depId\": \"50001619\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003719\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001069\",\n" +
//                "      \"pinfl\": \"51109017160038\",\n" +
//                "      \"name\": \"Erkinov Akbarshox O'ktamovich\",\n" +
//                "      \"depName\": \"MXXS bo'yicha moliyaviy hisobot boshqarmasi\",\n" +
//                "      \"depId\": \"50001619\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60005057\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001074\",\n" +
//                "      \"pinfl\": \"30608930270019\",\n" +
//                "      \"name\": \"Mo'minov Abdulaziz Qodir o'g'li\",\n" +
//                "      \"depName\": \"Boshqaruv hujjatlari bilan ishlash va kotibiyat boshqarmasi\",\n" +
//                "      \"depId\": \"50001564\",\n" +
//                "      \"postName\": \"Referent\",\n" +
//                "      \"postId\": \"60003502\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001075\",\n" +
//                "      \"pinfl\": \"30807880251244\",\n" +
//                "      \"name\": \"Raxmanov Rustambek Ravshanbekovich\",\n" +
//                "      \"depName\": \"Biznes analitiklar bo'limi\",\n" +
//                "      \"depId\": \"50001610\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60003859\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001076\",\n" +
//                "      \"pinfl\": \"40308830190077\",\n" +
//                "      \"name\": \"Maksudova Dilfuza Xasanovna\",\n" +
//                "      \"depName\": \"Xodimlarni tanlash va moslashtirish boshqarmasi\",\n" +
//                "      \"depId\": \"50000981\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60002764\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001078\",\n" +
//                "      \"pinfl\": \"41912840160040\",\n" +
//                "      \"name\": \"Mutalova Malika Saydullayevna\",\n" +
//                "      \"depName\": \"Xodimlarni boshqarish departamenti\",\n" +
//                "      \"depId\": \"50000032\",\n" +
//                "      \"postName\": \"Departament direktori\",\n" +
//                "      \"postId\": \"60004848\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001079\",\n" +
//                "      \"pinfl\": \"32707925680012\",\n" +
//                "      \"name\": \"Salomov Faxriddin Ergash o'g'li\",\n" +
//                "      \"depName\": \"Kompensatsiya va imtiyozlar boshqarmasi\",\n" +
//                "      \"depId\": \"50000983\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60002766\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001080\",\n" +
//                "      \"pinfl\": \"30809952560010\",\n" +
//                "      \"name\": \"Davronov Javlonbek Davron o'g'li\",\n" +
//                "      \"depName\": \"Kompensatsiya va imtiyozlar boshqarmasi\",\n" +
//                "      \"depId\": \"50000983\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60002769\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001081\",\n" +
//                "      \"pinfl\": \"43107976580013\",\n" +
//                "      \"name\": \"Azamova Nigina O'ktam qizi\",\n" +
//                "      \"depName\": \"Kompensatsiya va imtiyozlar boshqarmasi\",\n" +
//                "      \"depId\": \"50000983\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003856\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001082\",\n" +
//                "      \"pinfl\": \"30108830500024\",\n" +
//                "      \"name\": \"Safiyev Bexzod Mexridullayevich\",\n" +
//                "      \"depName\": \"Xodimlarni boshqarish departamenti\",\n" +
//                "      \"depId\": \"50000032\",\n" +
//                "      \"postName\": \"Departament direktori o'rinbosari\",\n" +
//                "      \"postId\": \"60005023\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001083\",\n" +
//                "      \"pinfl\": \"32305880220081\",\n" +
//                "      \"name\": \"Xaitkariyev Najmiddin  Shaxabiddinovich\",\n" +
//                "      \"depName\": \"Kadrlar bo'yicha ish yuritish boshqarmasi\",\n" +
//                "      \"depId\": \"50000984\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60002768\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001084\",\n" +
//                "      \"pinfl\": \"41404940430054\",\n" +
//                "      \"name\": \"Ibragimova Mohinur Muzaffar qizi\",\n" +
//                "      \"depName\": \"O'qitish va rivojlantirish boshqarmasi\",\n" +
//                "      \"depId\": \"50000982\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60004865\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001085\",\n" +
//                "      \"pinfl\": \"41010870200045\",\n" +
//                "      \"name\": \"Erkabayeva Dilfuza Rustamovna\",\n" +
//                "      \"depName\": \"Kadrlar bo'yicha ish yuritish boshqarmasi\",\n" +
//                "      \"depId\": \"50000984\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000165\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001086\",\n" +
//                "      \"pinfl\": \"40203694310055\",\n" +
//                "      \"name\": \"Ilalova Svetlana Nuzifovna\",\n" +
//                "      \"depName\": \"Xisob-kitob bo'limi\",\n" +
//                "      \"depId\": \"50001038\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60000490\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001087\",\n" +
//                "      \"pinfl\": \"40905880230016\",\n" +
//                "      \"name\": \"Fazilova Soxiba Vaxabjanovna\",\n" +
//                "      \"depName\": \"Xisob-kitob bo'limi\",\n" +
//                "      \"depId\": \"50001038\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000492\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001088\",\n" +
//                "      \"pinfl\": \"41404816600013\",\n" +
//                "      \"name\": \"Mirzayoqubova Charosxon Axrarovna\",\n" +
//                "      \"depName\": \"Xisob-kitob bo'limi\",\n" +
//                "      \"depId\": \"50001038\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003410\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001089\",\n" +
//                "      \"pinfl\": \"42409770250022\",\n" +
//                "      \"name\": \"Saidxujayeva Feruza Abdumalikovna\",\n" +
//                "      \"depName\": \"Xisob-kitob bo'limi\",\n" +
//                "      \"depId\": \"50001038\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003412\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001090\",\n" +
//                "      \"pinfl\": \"42106840240030\",\n" +
//                "      \"name\": \"Usmanbekova Nigora Mavlyanova\",\n" +
//                "      \"depName\": \"Xisob-kitob bo'limi\",\n" +
//                "      \"depId\": \"50001038\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003413\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001091\",\n" +
//                "      \"pinfl\": \"41501820200034\",\n" +
//                "      \"name\": \"Kamilova Zuxra Pulatovna\",\n" +
//                "      \"depName\": \"Xisob-kitob bo'limi\",\n" +
//                "      \"depId\": \"50001038\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003411\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001092\",\n" +
//                "      \"pinfl\": \"42203786570017\",\n" +
//                "      \"name\": \"Raxmanova Saodat Abdullajonovna\",\n" +
//                "      \"depName\": \"Xisob-kitob bo'limi\",\n" +
//                "      \"depId\": \"50001038\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000491\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001093\",\n" +
//                "      \"pinfl\": \"31512860192095\",\n" +
//                "      \"name\": \"Ibragimov Bobir Shuxratullayevich\",\n" +
//                "      \"depName\": \"Kadrlar bo'yicha ish yuritish boshqarmasi\",\n" +
//                "      \"depId\": \"50000984\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60000162\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001094\",\n" +
//                "      \"pinfl\": \"40905850200052\",\n" +
//                "      \"name\": \"Atajanova Kamola Mirxamidovna\",\n" +
//                "      \"depName\": \"O'qitish va rivojlantirish boshqarmasi\",\n" +
//                "      \"depId\": \"50000982\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60005009\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001097\",\n" +
//                "      \"pinfl\": \"31412967090037\",\n" +
//                "      \"name\": \"Matqurbanov Sarvarbek Alisher o'g'li\",\n" +
//                "      \"depName\": \"Kompensatsiya va imtiyozlar boshqarmasi\",\n" +
//                "      \"depId\": \"50000983\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60005008\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001098\",\n" +
//                "      \"pinfl\": \"42110830220115\",\n" +
//                "      \"name\": \"Muradova Madinaxon Saidaxrorovna\",\n" +
//                "      \"depName\": \"Kadrlar bo'yicha ish yuritish boshqarmasi\",\n" +
//                "      \"depId\": \"50000984\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60002409\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001099\",\n" +
//                "      \"pinfl\": \"41807880221731\",\n" +
//                "      \"name\": \"Urmanova Shaxnoza Miraxmatovna\",\n" +
//                "      \"depName\": \"O'qitish va rivojlantirish boshqarmasi\",\n" +
//                "      \"depId\": \"50000982\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60002770\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001100\",\n" +
//                "      \"pinfl\": \"30405862550044\",\n" +
//                "      \"name\": \"Tangmatov Bekzod Olimjonovich\",\n" +
//                "      \"depName\": \"Raxbariyat\",\n" +
//                "      \"depId\": \"50000024\",\n" +
//                "      \"postName\": \"Boshqaruvchi direktor (Chakana biznes bo'yicha)\",\n" +
//                "      \"postId\": \"60003336\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001101\",\n" +
//                "      \"pinfl\": \"31708850230056\",\n" +
//                "      \"name\": \"Kim Pavel Viktorovich\",\n" +
//                "      \"depName\": \"Chakana biznes departamenti\",\n" +
//                "      \"depId\": \"50000041\",\n" +
//                "      \"postName\": \"Departament direktori o'rinbosari\",\n" +
//                "      \"postId\": \"60000377\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001102\",\n" +
//                "      \"pinfl\": \"42704840020010\",\n" +
//                "      \"name\": \"Ismailova Zulfiya Sabirdjanovna\",\n" +
//                "      \"depName\": \"Hamkorlik dasturlarini muvofiqlashtirish va rivojlantirish bo'limi\",\n" +
//                "      \"depId\": \"50001019\",\n" +
//                "      \"postName\": \"Menedjer\",\n" +
//                "      \"postId\": \"60004000\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001103\",\n" +
//                "      \"pinfl\": \"31010954320011\",\n" +
//                "      \"name\": \"Anvarov Avazxon Jamshidjon o'g'li\",\n" +
//                "      \"depName\": \"Kredit bo'lmagan maxsulotlar ishlab chiqish boshqarmasi\",\n" +
//                "      \"depId\": \"50001540\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60003364\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001105\",\n" +
//                "      \"pinfl\": \"30812902100060\",\n" +
//                "      \"name\": \"Sotiboldiyev Shoxboz Umarjon o'g'li\",\n" +
//                "      \"depName\": \"Mintaqaviy sotuv boshqarmasi\",\n" +
//                "      \"depId\": \"50001018\",\n" +
//                "      \"postName\": \"Xududiy menedjer\",\n" +
//                "      \"postId\": \"60002908\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001108\",\n" +
//                "      \"pinfl\": \"32801890171343\",\n" +
//                "      \"name\": \"Mirzaxmedov Nodirjon Kudratillayevich\",\n" +
//                "      \"depName\": \"Kredit mahsulotlarini ishlab chiqish boshqarmasi\",\n" +
//                "      \"depId\": \"50001020\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60003357\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001112\",\n" +
//                "      \"pinfl\": \"30904913500019\",\n" +
//                "      \"name\": \"Maulenov Baurjan Baxitovich\",\n" +
//                "      \"depName\": \"Kredit bo'lmagan maxsulotlar ishlab chiqish boshqarmasi\",\n" +
//                "      \"depId\": \"50001540\",\n" +
//                "      \"postName\": \"Menedjer\",\n" +
//                "      \"postId\": \"60003365\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001113\",\n" +
//                "      \"pinfl\": \"30110913940018\",\n" +
//                "      \"name\": \"Umirov Ikromjon Ulugbekovich\",\n" +
//                "      \"depName\": \"Kredit bo'lmagan maxsulotlar ishlab chiqish boshqarmasi\",\n" +
//                "      \"depId\": \"50001540\",\n" +
//                "      \"postName\": \"Menedjer\",\n" +
//                "      \"postId\": \"60003367\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001116\",\n" +
//                "      \"pinfl\": \"30304880280053\",\n" +
//                "      \"name\": \"Ivanov Aleksey Valeryevich\",\n" +
//                "      \"depName\": \"Omnikanal tizimlarini rivojlantirish bo'limi\",\n" +
//                "      \"depId\": \"50001608\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003684\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001128\",\n" +
//                "      \"pinfl\": \"40402976850014\",\n" +
//                "      \"name\": \"Babayeva Gulnora Akmal qizi\",\n" +
//                "      \"depName\": \"Sifat nazorati bo'limi\",\n" +
//                "      \"depId\": \"50001548\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60005186\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001135\",\n" +
//                "      \"pinfl\": \"42204911070044\",\n" +
//                "      \"name\": \"Allanazarova Nargiza Bazarbayevna\",\n" +
//                "      \"depName\": \"Call center bo'limi\",\n" +
//                "      \"depId\": \"50001024\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60000412\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001136\",\n" +
//                "      \"pinfl\": \"40311930430044\",\n" +
//                "      \"name\": \"Obidova Zilola Kaxxramonovna\",\n" +
//                "      \"depName\": \"Kichik biznes uchun mahsulotlarni ishlab chiqish va joriy qilishboshqarmasi\",\n" +
//                "      \"depId\": \"50001079\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003141\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001140\",\n" +
//                "      \"pinfl\": \"41103860040016\",\n" +
//                "      \"name\": \"Abdullayeva Durdona Tulkinovna\",\n" +
//                "      \"depName\": \"Call center bo'limi\",\n" +
//                "      \"depId\": \"50001024\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003870\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001141\",\n" +
//                "      \"pinfl\": \"41705880261725\",\n" +
//                "      \"name\": \"Abzalova Dildora Xikmatullayevna\",\n" +
//                "      \"depName\": \"Call center bo'limi\",\n" +
//                "      \"depId\": \"50001024\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003284\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001142\",\n" +
//                "      \"pinfl\": \"41010920261899\",\n" +
//                "      \"name\": \"Sultanova Nodira Baxtiyorovna\",\n" +
//                "      \"depName\": \"Raqamli kanallar bo'limi\",\n" +
//                "      \"depId\": \"50001545\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003384\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001146\",\n" +
//                "      \"pinfl\": \"40607930170043\",\n" +
//                "      \"name\": \"Umarova Nilufar Baxtiyor qizi\",\n" +
//                "      \"depName\": \"Call center bo'limi\",\n" +
//                "      \"depId\": \"50001024\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003287\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001153\",\n" +
//                "      \"pinfl\": \"42504830240031\",\n" +
//                "      \"name\": \"Ataxodjayeva Feruza Nuriddinovna\",\n" +
//                "      \"depName\": \"Telemarketing bo'limi\",\n" +
//                "      \"depId\": \"50001025\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003288\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001154\",\n" +
//                "      \"pinfl\": \"40505940240050\",\n" +
//                "      \"name\": \"Miragzamova Feruza Shoraxmat qizi\",\n" +
//                "      \"depName\": \"Telemarketing bo'limi\",\n" +
//                "      \"depId\": \"50001025\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003289\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001156\",\n" +
//                "      \"pinfl\": \"31510996700010\",\n" +
//                "      \"name\": \"Mannabov Lazizjon Jasur o'g'li\",\n" +
//                "      \"depName\": \"Call center bo'limi\",\n" +
//                "      \"depId\": \"50001024\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60005185\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001158\",\n" +
//                "      \"pinfl\": \"60611006610030\",\n" +
//                "      \"name\": \"Maxkamova Komila Abdulla qizi\",\n" +
//                "      \"depName\": \"Soft collection bo'limi\",\n" +
//                "      \"depId\": \"50001026\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003860\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001159\",\n" +
//                "      \"pinfl\": \"30103824070011\",\n" +
//                "      \"name\": \"Xoliqov Djurabek Nurullayevich\",\n" +
//                "      \"depName\": \"Hard collection bo'limi\",\n" +
//                "      \"depId\": \"50001543\",\n" +
//                "      \"postName\": \"Menedjer\",\n" +
//                "      \"postId\": \"60005004\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001160\",\n" +
//                "      \"pinfl\": \"32003870640014\",\n" +
//                "      \"name\": \"Axunov Abduraxmon Vaxabjanovich\",\n" +
//                "      \"depName\": \"Hard collection bo'limi\",\n" +
//                "      \"depId\": \"50001543\",\n" +
//                "      \"postName\": \"Menedjer\",\n" +
//                "      \"postId\": \"60005006\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001161\",\n" +
//                "      \"pinfl\": \"30109910261879\",\n" +
//                "      \"name\": \"Egamnazarov Kodirjon Olim o'g'li\",\n" +
//                "      \"depName\": \"Monitoring bo'limi\",\n" +
//                "      \"depId\": \"50001544\",\n" +
//                "      \"postName\": \"Menedjer\",\n" +
//                "      \"postId\": \"60003382\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001162\",\n" +
//                "      \"pinfl\": \"30103846670017\",\n" +
//                "      \"name\": \"Anvarxonov Saidazimxon Ashrafxon o'g'li\",\n" +
//                "      \"depName\": \"Monitoring bo'limi\",\n" +
//                "      \"depId\": \"50001544\",\n" +
//                "      \"postName\": \"Menedjer\",\n" +
//                "      \"postId\": \"60003379\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001163\",\n" +
//                "      \"pinfl\": \"40606870480030\",\n" +
//                "      \"name\": \"Sulaymanova Dilnoza Baxtiyarovna\",\n" +
//                "      \"depName\": \"Monitoring bo'limi\",\n" +
//                "      \"depId\": \"50001544\",\n" +
//                "      \"postName\": \"Menedjer\",\n" +
//                "      \"postId\": \"60003380\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001164\",\n" +
//                "      \"pinfl\": \"30812844070016\",\n" +
//                "      \"name\": \"Otakulov Jasurbek Zubaydulloyevich\",\n" +
//                "      \"depName\": \"Tahlil boshqarmasi\",\n" +
//                "      \"depId\": \"50001541\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60003370\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001165\",\n" +
//                "      \"pinfl\": \"41804830550048\",\n" +
//                "      \"name\": \"Isayeva Ma'suda O'tkirovna\",\n" +
//                "      \"depName\": \"Tahlil boshqarmasi\",\n" +
//                "      \"depId\": \"50001541\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60003371\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001167\",\n" +
//                "      \"pinfl\": \"31708841530024\",\n" +
//                "      \"name\": \"Alibayev Zafar Asatullayevich\",\n" +
//                "      \"depName\": \"Tahlil boshqarmasi\",\n" +
//                "      \"depId\": \"50001541\",\n" +
//                "      \"postName\": \"Menedjer\",\n" +
//                "      \"postId\": \"60003372\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001168\",\n" +
//                "      \"pinfl\": \"31707940450015\",\n" +
//                "      \"name\": \"Mallayev Farux Narzulloyevich\",\n" +
//                "      \"depName\": \"Tahlil boshqarmasi\",\n" +
//                "      \"depId\": \"50001541\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003374\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001170\",\n" +
//                "      \"pinfl\": \"30811816530015\",\n" +
//                "      \"name\": \"Djumaniyazov Jaxongir Baxodirovich\",\n" +
//                "      \"depName\": \"Chakana bank texnologiyalari departamenti\",\n" +
//                "      \"depId\": \"50000042\",\n" +
//                "      \"postName\": \"Departament direktori\",\n" +
//                "      \"postId\": \"60000444\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001171\",\n" +
//                "      \"pinfl\": \"31510893450012\",\n" +
//                "      \"name\": \"Shaniyazov Farxad Oljabayevich\",\n" +
//                "      \"depName\": \"Chakana bank texnologiyalari departamenti\",\n" +
//                "      \"depId\": \"50000042\",\n" +
//                "      \"postName\": \"Departament direktori o'rinbosari\",\n" +
//                "      \"postId\": \"60000445\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001172\",\n" +
//                "      \"pinfl\": \"41111900560022\",\n" +
//                "      \"name\": \"Tashmirzayeva Nigina Ixtiyorovna\",\n" +
//                "      \"depName\": \"Milliy to’lov tizimlari va texnik qo’llab-quvvatlash bo’limi\",\n" +
//                "      \"depId\": \"50001538\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003348\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001173\",\n" +
//                "      \"pinfl\": \"30509920222743\",\n" +
//                "      \"name\": \"Ozodbekov Otabek Sherzod o'g'li\",\n" +
//                "      \"depName\": \"Xalqaro to'lov tizimlari bo'limi\",\n" +
//                "      \"depId\": \"50001030\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60000447\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001175\",\n" +
//                "      \"pinfl\": \"30103800160033\",\n" +
//                "      \"name\": \"Dmitriyev Gleb Yaroslavovich\",\n" +
//                "      \"depName\": \"Xalqaro to'lov tizimlari bo'limi\",\n" +
//                "      \"depId\": \"50001030\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000449\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001176\",\n" +
//                "      \"pinfl\": \"32309965550027\",\n" +
//                "      \"name\": \"To'rayev Bohodir Oybek o'g'li\",\n" +
//                "      \"depName\": \"Xalqaro to'lov tizimlari bo'limi\",\n" +
//                "      \"depId\": \"50001030\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000450\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001177\",\n" +
//                "      \"pinfl\": \"32106880290012\",\n" +
//                "      \"name\": \"Numanov Xurshid Djaxongirovich\",\n" +
//                "      \"depName\": \"Milliy to’lov tizimlari va texnik qo’llab-quvvatlash bo’limi\",\n" +
//                "      \"depId\": \"50001538\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60003345\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001178\",\n" +
//                "      \"pinfl\": \"30405880220062\",\n" +
//                "      \"name\": \"Sultanov Muzaffar Mirazizovich\",\n" +
//                "      \"depName\": \"Milliy to’lov tizimlari va texnik qo’llab-quvvatlash bo’limi\",\n" +
//                "      \"depId\": \"50001538\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003347\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001179\",\n" +
//                "      \"pinfl\": \"30905821650018\",\n" +
//                "      \"name\": \"Xalmanov Tursunbay Ermamatovich\",\n" +
//                "      \"depName\": \"Milliy to’lov tizimlari va texnik qo’llab-quvvatlash bo’limi\",\n" +
//                "      \"depId\": \"50001538\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003346\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001180\",\n" +
//                "      \"pinfl\": \"32111863920024\",\n" +
//                "      \"name\": \"Mavlanov Kamoliddin Shamsidinovich\",\n" +
//                "      \"depName\": \"Ekvayer va emissiya uskunalarni texnik qo’llab-quvvatlash va hisobiniyuritish bo’limi\",\n" +
//                "      \"depId\": \"50001539\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60003349\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001181\",\n" +
//                "      \"pinfl\": \"31111996590027\",\n" +
//                "      \"name\": \"Rixsiboyev Ismoiljon Faxriddin o'g'li\",\n" +
//                "      \"depName\": \"Ekvayer va emissiya uskunalarni texnik qo’llab-quvvatlash va hisobiniyuritish bo’limi\",\n" +
//                "      \"depId\": \"50001539\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003350\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001184\",\n" +
//                "      \"pinfl\": \"31001915050010\",\n" +
//                "      \"name\": \"Abdusattarov Umidjon Ibroximjon o'g'li\",\n" +
//                "      \"depName\": \"Masofaviy bank xizmatlarini rivojlantirish bo'limi\",\n" +
//                "      \"depId\": \"50001603\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60003648\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001185\",\n" +
//                "      \"pinfl\": \"32011985850031\",\n" +
//                "      \"name\": \"Muxammatov Nizom Axadovich\",\n" +
//                "      \"depName\": \"Masofaviy bank xizmatlarini rivojlantirish bo'limi\",\n" +
//                "      \"depId\": \"50001603\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003650\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001186\",\n" +
//                "      \"pinfl\": \"32512941220063\",\n" +
//                "      \"name\": \"Mashrabboyev Doniyorbek Sotvoldi o'g'li\",\n" +
//                "      \"depName\": \"Masofaviy bank xizmatlarini rivojlantirish bo'limi\",\n" +
//                "      \"depId\": \"50001603\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003649\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001187\",\n" +
//                "      \"pinfl\": \"30211951380030\",\n" +
//                "      \"name\": \"Xoshimjonov Shaxriyorbek Dilshodbek o'g'li\",\n" +
//                "      \"depName\": \"Masofaviy bank xizmatlarini rivojlantirish bo'limi\",\n" +
//                "      \"depId\": \"50001603\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003652\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001188\",\n" +
//                "      \"pinfl\": \"32012940330119\",\n" +
//                "      \"name\": \"Xayriyev Elzat Taxirovich\",\n" +
//                "      \"depName\": \"Masofaviy bank xizmatlarini rivojlantirish bo'limi\",\n" +
//                "      \"depId\": \"50001603\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003651\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001190\",\n" +
//                "      \"pinfl\": \"32002975200022\",\n" +
//                "      \"name\": \"Xojiyev Kamoliddin Abduraimjon o'g'li\",\n" +
//                "      \"depName\": \"DevOps muhandislari bo'limi\",\n" +
//                "      \"depId\": \"50001613\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003691\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001193\",\n" +
//                "      \"pinfl\": \"30705976840012\",\n" +
//                "      \"name\": \"O'rolboyev Jasurbek Karimjonovich\",\n" +
//                "      \"depName\": \"Asakabank AJ Bosh ofisi\",\n" +
//                "      \"depId\": \"50000001\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001194\",\n" +
//                "      \"pinfl\": \"30605710210012\",\n" +
//                "      \"name\": \"Pulatov Navfal Xaydarovich\",\n" +
//                "      \"depName\": \"Yuridik departamenti\",\n" +
//                "      \"depId\": \"50000033\",\n" +
//                "      \"postName\": \"Departament direktori\",\n" +
//                "      \"postId\": \"60000167\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001196\",\n" +
//                "      \"pinfl\": \"41205966670019\",\n" +
//                "      \"name\": \"Rustamova Kamola Adxam qizi\",\n" +
//                "      \"depName\": \"Savdoni moliyalashtirish bo'limi\",\n" +
//                "      \"depId\": \"50001071\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60002303\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001197\",\n" +
//                "      \"pinfl\": \"42910750190051\",\n" +
//                "      \"name\": \"Miroshnikova Yelena Ivanovna\",\n" +
//                "      \"depName\": \"Xalqaro moliya institutlari va kredit hujjatlari bilan ishlash hamdashartnomaviy ishlar boshqarmasi\",\n" +
//                "      \"depId\": \"50001591\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60003586\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001198\",\n" +
//                "      \"pinfl\": \"41409840222954\",\n" +
//                "      \"name\": \"Suxankova Anna Nikolayevna\",\n" +
//                "      \"depName\": \"Xalqaro moliya institutlari va kredit hujjatlari bilan ishlash hamdashartnomaviy ishlar boshqarmasi\",\n" +
//                "      \"depId\": \"50001591\",\n" +
//                "      \"postName\": \"Bosh yuriskonsul`t\",\n" +
//                "      \"postId\": \"60003588\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001199\",\n" +
//                "      \"pinfl\": \"42208940250011\",\n" +
//                "      \"name\": \"Temirova Nodira Kayumjanovna\",\n" +
//                "      \"depName\": \"Xalqaro moliya institutlari va kredit hujjatlari bilan ishlash hamdashartnomaviy ishlar boshqarmasi\",\n" +
//                "      \"depId\": \"50001591\",\n" +
//                "      \"postName\": \"Bosh yuriskonsul`t\",\n" +
//                "      \"postId\": \"60004947\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001200\",\n" +
//                "      \"pinfl\": \"42602986750032\",\n" +
//                "      \"name\": \"Nurutdinova Madina Mahmudjon qizi\",\n" +
//                "      \"depName\": \"Shartnomalar bilan ishlash bo'limi\",\n" +
//                "      \"depId\": \"50001592\",\n" +
//                "      \"postName\": \"Yetakchi yuriskonsul`t\",\n" +
//                "      \"postId\": \"60003592\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001201\",\n" +
//                "      \"pinfl\": \"40609776600018\",\n" +
//                "      \"name\": \"Tursunova Aziza Shuxratovna\",\n" +
//                "      \"depName\": \"Shartnomalar bilan ishlash bo'limi\",\n" +
//                "      \"depId\": \"50001592\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60003590\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001202\",\n" +
//                "      \"pinfl\": \"32512810261595\",\n" +
//                "      \"name\": \"Djavliyev Zokirjon Sherbayevich\",\n" +
//                "      \"depName\": \"Mehnat-xo'jalik nizolari va huquqiy ekspertiza bo'limi\",\n" +
//                "      \"depId\": \"50001593\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60003593\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001203\",\n" +
//                "      \"pinfl\": \"43008760270102\",\n" +
//                "      \"name\": \"Maxmatmuradova Lola Nematulloyevna\",\n" +
//                "      \"depName\": \"Shartnomalar bilan ishlash bo'limi\",\n" +
//                "      \"depId\": \"50001592\",\n" +
//                "      \"postName\": \"Bosh yuriskonsul`t\",\n" +
//                "      \"postId\": \"60003591\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001204\",\n" +
//                "      \"pinfl\": \"31407910171806\",\n" +
//                "      \"name\": \"Bolibekov Shahzod Bahodir o'g'li\",\n" +
//                "      \"depName\": \"Sud va majburiy tartibda undiruvni ta'minlash boshqarmasi\",\n" +
//                "      \"depId\": \"50001586\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60003576\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001206\",\n" +
//                "      \"pinfl\": \"31611730270023\",\n" +
//                "      \"name\": \"Sadikov Usmonjon Umarjanovich\",\n" +
//                "      \"depName\": \"Mehnat-xo'jalik nizolari va huquqiy ekspertiza bo'limi\",\n" +
//                "      \"depId\": \"50001593\",\n" +
//                "      \"postName\": \"Bosh yuriskonsul`t\",\n" +
//                "      \"postId\": \"60003595\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001225\",\n" +
//                "      \"pinfl\": \"32707920192628\",\n" +
//                "      \"name\": \"Xikmatullaev Olimxon Asatulla o'g'li\",\n" +
//                "      \"depName\": \"Bank xizmatlari markazlarida yuridik xizmati faoliyatinimuvofiqlashtirish bo'limi\",\n" +
//                "      \"depId\": \"50001321\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60000205\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001260\",\n" +
//                "      \"pinfl\": \"30508768660018\",\n" +
//                "      \"name\": \"Zakirov Sur'at Utkurovich\",\n" +
//                "      \"depName\": \"Raxbariyat\",\n" +
//                "      \"depId\": \"50000024\",\n" +
//                "      \"postName\": \"Boshqaruv Raisining birinchi o'rinbosari v.b.\",\n" +
//                "      \"postId\": \"60004968\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001263\",\n" +
//                "      \"pinfl\": \"32501850230063\",\n" +
//                "      \"name\": \"Mamadjanov Bunyod Baxtiyorovich\",\n" +
//                "      \"depName\": \"Raxbariyat\",\n" +
//                "      \"depId\": \"50000024\",\n" +
//                "      \"postName\": \"Boshqaruv Raisi o'rinbosari v.b.\",\n" +
//                "      \"postId\": \"60004969\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001264\",\n" +
//                "      \"pinfl\": \"30204840223152\",\n" +
//                "      \"name\": \"Talibdjanov Sa'dulla Ziyodullaevich\",\n" +
//                "      \"depName\": \"Raxbariyat\",\n" +
//                "      \"depId\": \"50000024\",\n" +
//                "      \"postName\": \"Boshqaruv Raisi o'rinbosari v.b.\",\n" +
//                "      \"postId\": \"60004970\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001265\",\n" +
//                "      \"pinfl\": \"32201841230028\",\n" +
//                "      \"name\": \"Umarov Sardorbek Mamasharifovich\",\n" +
//                "      \"depName\": \"Raxbariyat\",\n" +
//                "      \"depId\": \"50000024\",\n" +
//                "      \"postName\": \"Maslahatchi (IT va innovatsiyani rivojlantirish bo'yicha)\",\n" +
//                "      \"postId\": \"60005213\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001266\",\n" +
//                "      \"pinfl\": \"31107841240012\",\n" +
//                "      \"name\": \"Kadirov Ravshanbek Shoxruxbekovich\",\n" +
//                "      \"depName\": \"Raxbariyat\",\n" +
//                "      \"depId\": \"50000024\",\n" +
//                "      \"postName\": \"Moliyaviy direktor\",\n" +
//                "      \"postId\": \"60004002\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001267\",\n" +
//                "      \"pinfl\": \"32812790050034\",\n" +
//                "      \"name\": \"Yuldashev Farxod Xurramovich\",\n" +
//                "      \"depName\": \"G'aznachilik departamenti\",\n" +
//                "      \"depId\": \"50000035\",\n" +
//                "      \"postName\": \"Departament direktori o'rinbosari\",\n" +
//                "      \"postId\": \"60000251\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001269\",\n" +
//                "      \"pinfl\": \"30703850270018\",\n" +
//                "      \"name\": \"Shavkiyev Sardor Zavkiyevich\",\n" +
//                "      \"depName\": \"Aktiv, passiv va likvidlikni boshqarish boshqarmasi\",\n" +
//                "      \"depId\": \"50000992\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60000252\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001270\",\n" +
//                "      \"pinfl\": \"31411860070014\",\n" +
//                "      \"name\": \"Abdullayev Jamoliddin Xotamdjanovich\",\n" +
//                "      \"depName\": \"Strategik rivojlanish va iqtisodiy tahlil departamenti\",\n" +
//                "      \"depId\": \"50000039\",\n" +
//                "      \"postName\": \"Departament direktori o'rinbosari\",\n" +
//                "      \"postId\": \"60003130\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001271\",\n" +
//                "      \"pinfl\": \"30410890191529\",\n" +
//                "      \"name\": \"Dosmuxamedov Mirg'ulom Mirziyatovich\",\n" +
//                "      \"depName\": \"Aktiv va passivlarni tahlil qilish bo'limi\",\n" +
//                "      \"depId\": \"50000993\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000254\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001272\",\n" +
//                "      \"pinfl\": \"30401856780019\",\n" +
//                "      \"name\": \"Abduvaxidov Zokir Yunusovich\",\n" +
//                "      \"depName\": \"Aktiv va passivlarni tahlil qilish bo'limi\",\n" +
//                "      \"depId\": \"50000993\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000255\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001273\",\n" +
//                "      \"pinfl\": \"42208790100018\",\n" +
//                "      \"name\": \"Ibragimova Ra'no Amanullayevna\",\n" +
//                "      \"depName\": \"Aktiv va passivlarni tahlil qilish bo'limi\",\n" +
//                "      \"depId\": \"50000993\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000256\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001274\",\n" +
//                "      \"pinfl\": \"32006820190025\",\n" +
//                "      \"name\": \"Abidov Mansurxodja Rustamxodjaevich\",\n" +
//                "      \"depName\": \"Aktiv va passivlarni tahlil qilish bo'limi\",\n" +
//                "      \"depId\": \"50000993\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000257\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001275\",\n" +
//                "      \"pinfl\": \"32812850560022\",\n" +
//                "      \"name\": \"Turayev Umid Abrorkulovich\",\n" +
//                "      \"depName\": \"Aktiv va passivlarni tahlil qilish bo'limi\",\n" +
//                "      \"depId\": \"50000993\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003880\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001277\",\n" +
//                "      \"pinfl\": \"41305780050021\",\n" +
//                "      \"name\": \"Yusupova Ziyoda Islamovna\",\n" +
//                "      \"depName\": \" Bank likvidligini boshqarish bo'limi\",\n" +
//                "      \"depId\": \"50000994\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000259\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001278\",\n" +
//                "      \"pinfl\": \"42712930220062\",\n" +
//                "      \"name\": \"Abdullayeva Fayruz Xabibullo qizi\",\n" +
//                "      \"depName\": \" Bank likvidligini boshqarish bo'limi\",\n" +
//                "      \"depId\": \"50000994\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000260\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001279\",\n" +
//                "      \"pinfl\": \"31711880560033\",\n" +
//                "      \"name\": \"Kadirov Jaloliddin Ermatovich\",\n" +
//                "      \"depName\": \" Bank likvidligini boshqarish bo'limi\",\n" +
//                "      \"depId\": \"50000994\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60000258\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001280\",\n" +
//                "      \"pinfl\": \"41408870160016\",\n" +
//                "      \"name\": \"Gafurova Nargiza Kamalovna\",\n" +
//                "      \"depName\": \" Bank likvidligini boshqarish bo'limi\",\n" +
//                "      \"depId\": \"50000994\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60000262\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001282\",\n" +
//                "      \"pinfl\": \"32107900310921\",\n" +
//                "      \"name\": \"Abdulxayev Behzod Abdulaxad o'g'li\",\n" +
//                "      \"depName\": \"Investitsion banking va diling amaliyotlari boshqarmasi\",\n" +
//                "      \"depId\": \"50000995\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60000263\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001283\",\n" +
//                "      \"pinfl\": \"30608892870036\",\n" +
//                "      \"name\": \"Xatamov Kamoliddin Nuritdinovich\",\n" +
//                "      \"depName\": \"Aktiv va passivlarni tahlil qilish bo'limi\",\n" +
//                "      \"depId\": \"50000993\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60000253\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001284\",\n" +
//                "      \"pinfl\": \"41908810440032\",\n" +
//                "      \"name\": \"Musayeva Umida Ubaydullayevna\",\n" +
//                "      \"depName\": \"Korxonalar aksiyalari va ustav fondlariga qo'yilmalar bilan ishlashbo'limi\",\n" +
//                "      \"depId\": \"50001869\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60004874\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001285\",\n" +
//                "      \"pinfl\": \"31907966600016\",\n" +
//                "      \"name\": \"Mirvaliyev Sunnatilla Murod o'g'li\",\n" +
//                "      \"depName\": \"Investitsion banking va diling amaliyotlari boshqarmasi\",\n" +
//                "      \"depId\": \"50000995\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000267\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001287\",\n" +
//                "      \"pinfl\": \"32409941930046\",\n" +
//                "      \"name\": \"Toshtemirov Adham Ilxom o'g'li\",\n" +
//                "      \"depName\": \"Investitsion banking va diling amaliyotlari boshqarmasi\",\n" +
//                "      \"depId\": \"50000995\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60002760\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001288\",\n" +
//                "      \"pinfl\": \"40610830060026\",\n" +
//                "      \"name\": \"Yuldasheva Barno Shayusupovna\",\n" +
//                "      \"depName\": \"Investitsion banking va diling amaliyotlari boshqarmasi\",\n" +
//                "      \"depId\": \"50000995\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60005000\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001294\",\n" +
//                "      \"pinfl\": \"41411996600018\",\n" +
//                "      \"name\": \"Zakirova Aliya Ramilevna\",\n" +
//                "      \"depName\": \"Eskport-Import, pul hisob-kitob va konversion amaliyotlar bo`limi\",\n" +
//                "      \"depId\": \"50001680\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60005211\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001295\",\n" +
//                "      \"pinfl\": \"31602864140115\",\n" +
//                "      \"name\": \"Yusupov Nodirbek Alimjonovich\",\n" +
//                "      \"depName\": \"Biznes tahlili bo'limi\",\n" +
//                "      \"depId\": \"50001669\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60005191\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001298\",\n" +
//                "      \"pinfl\": \"32609985880011\",\n" +
//                "      \"name\": \"Sodiqov Akbarali Alijanovich\",\n" +
//                "      \"depName\": \"Kadrlar bo'yicha ish yuritish boshqarmasi\",\n" +
//                "      \"depId\": \"50000984\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003854\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001300\",\n" +
//                "      \"pinfl\": \"32910996670039\",\n" +
//                "      \"name\": \"Xikmatov Begzod Baxrom o'g'li\",\n" +
//                "      \"depName\": \"Ekvayer va emissiya uskunalarni texnik qo’llab-quvvatlash va hisobiniyuritish bo’limi\",\n" +
//                "      \"depId\": \"50001539\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60005002\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001301\",\n" +
//                "      \"pinfl\": \"51508007340023\",\n" +
//                "      \"name\": \"Abdikarimov Imranbek Mirabatovich\",\n" +
//                "      \"depName\": \"Savdoni moliyalashtirishni rivojlantirish boshqarmasi\",\n" +
//                "      \"depId\": \"50001673\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60005001\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001304\",\n" +
//                "      \"pinfl\": \"32007977310014\",\n" +
//                "      \"name\": \"Egamberdiyev Dilshodbek Nazarbek o'g'li\",\n" +
//                "      \"depName\": \"Jinoiy faoliyatdan olingan daromadlarni legallashtirishga, terrorizmnimoliyalashtirishga va ommaviy qirg‘in qurollarini tarqatishnimoliyalashtirishga qarshi kurashish boshqarmasi (JDL/TM)\",\n" +
//                "      \"depId\": \"50001928\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60005263\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001306\",\n" +
//                "      \"pinfl\": \"32408995840022\",\n" +
//                "      \"name\": \"Egamov Jahongir Faxriddinovich\",\n" +
//                "      \"depName\": \"Kredit tavakkalchiligini boshqarish bo'limi\",\n" +
//                "      \"depId\": \"50001905\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60005045\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001307\",\n" +
//                "      \"pinfl\": \"52506027340055\",\n" +
//                "      \"name\": \"Nurseitov Mirzabek Rashitovich\",\n" +
//                "      \"depName\": \"Operatsion tavakkalchiliklarni boshqarish bo'limi\",\n" +
//                "      \"depId\": \"50001906\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60005048\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001310\",\n" +
//                "      \"pinfl\": \"30310995920049\",\n" +
//                "      \"name\": \"Axmatxanov Afzalbek Axadjon o'g'li\",\n" +
//                "      \"depName\": \"Axborot xavfsizligi bo'limi\",\n" +
//                "      \"depId\": \"50000979\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60002442\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001311\",\n" +
//                "      \"pinfl\": \"42309803470066\",\n" +
//                "      \"name\": \"Yeshmuratova Amangul Kochkarovna\",\n" +
//                "      \"depName\": \"Soliq hisobi va hisobotlari boshqarmasi\",\n" +
//                "      \"depId\": \"50001035\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60002446\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001314\",\n" +
//                "      \"pinfl\": \"31909900190010\",\n" +
//                "      \"name\": \"Abduraxmonxo'jayev Boburxo'ja Xasanxo'ja o'g'l\",\n" +
//                "      \"depName\": \"Boshqaruv hujjatlari bilan ishlash va kotibiyat boshqarmasi\",\n" +
//                "      \"depId\": \"50001564\",\n" +
//                "      \"postName\": \"Referent\",\n" +
//                "      \"postId\": \"60003501\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001318\",\n" +
//                "      \"pinfl\": \"52602017060027\",\n" +
//                "      \"name\": \"Muxammadjonov Shamsiddin Muhiddin o'gli\",\n" +
//                "      \"depName\": \" Tashqi savdo shartnomalarini muvofiqlashtirish bo'limi\",\n" +
//                "      \"depId\": \"50001070\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60005012\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001325\",\n" +
//                "      \"pinfl\": \"32105843150028\",\n" +
//                "      \"name\": \"Qurbonov Jaloliddin Maxmudovich\",\n" +
//                "      \"depName\": \"Tranzaktsiya mahsulotlarini sotish boshqarmasi\",\n" +
//                "      \"depId\": \"50001078\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60000718\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001327\",\n" +
//                "      \"pinfl\": \"33112716590011\",\n" +
//                "      \"name\": \"Talipov Kamoliddin Fahrutdinovich\",\n" +
//                "      \"depName\": \"Asakabank AJ Bosh ofisi\",\n" +
//                "      \"depId\": \"50000001\",\n" +
//                "      \"postName\": \"Прочие\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001330\",\n" +
//                "      \"pinfl\": \"32307988660015\",\n" +
//                "      \"name\": \"Qodirov Timur Xasanboy o'g'li\",\n" +
//                "      \"depName\": \"Xodimlarni tanlash va moslashtirish boshqarmasi\",\n" +
//                "      \"depId\": \"50000981\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003857\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001334\",\n" +
//                "      \"pinfl\": \"31211680160018\",\n" +
//                "      \"name\": \"Vafayev Shuxrat Abdusharifovich\",\n" +
//                "      \"depName\": \"Asakabank AJ Bosh ofisi\",\n" +
//                "      \"depId\": \"50000001\",\n" +
//                "      \"postName\": \"Прочие\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001335\",\n" +
//                "      \"pinfl\": \"32104811050010\",\n" +
//                "      \"name\": \"Norqulov Ilxom Ibroximovich\",\n" +
//                "      \"depName\": \"Asakabank AJ Bosh ofisi\",\n" +
//                "      \"depId\": \"50000001\",\n" +
//                "      \"postName\": \"Прочие\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001336\",\n" +
//                "      \"pinfl\": \"30712790050013\",\n" +
//                "      \"name\": \"Yusupov Olim Anvarovich\",\n" +
//                "      \"depName\": \"Asakabank AJ Bosh ofisi\",\n" +
//                "      \"depId\": \"50000001\",\n" +
//                "      \"postName\": \"Прочие\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001340\",\n" +
//                "      \"pinfl\": \"40110840190082\",\n" +
//                "      \"name\": \"Akilova Aziza G'ayratovna\",\n" +
//                "      \"depName\": \"Bank ijro apparati\",\n" +
//                "      \"depId\": \"50000025\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001341\",\n" +
//                "      \"pinfl\": \"32011863820022\",\n" +
//                "      \"name\": \"Malikov Jafar Ziyodullaevich\",\n" +
//                "      \"depName\": \"Asakabank AJ Bosh ofisi\",\n" +
//                "      \"depId\": \"50000001\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001342\",\n" +
//                "      \"pinfl\": \"30906896600010\",\n" +
//                "      \"name\": \"Maxkamov Otabek Muxammadjonovich\",\n" +
//                "      \"depName\": \"Bank ijro apparati\",\n" +
//                "      \"depId\": \"50000025\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001343\",\n" +
//                "      \"pinfl\": \"31912816580017\",\n" +
//                "      \"name\": \"Olimjonov Lazizjon Naimkulovich\",\n" +
//                "      \"depName\": \"Asakabank AJ Bosh ofisi\",\n" +
//                "      \"depId\": \"50000001\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001344\",\n" +
//                "      \"pinfl\": \"32607884140047\",\n" +
//                "      \"name\": \"Xoshimov Nodirbek Anvarjonovich\",\n" +
//                "      \"depName\": \"Asakabank AJ Bosh ofisi\",\n" +
//                "      \"depId\": \"50000001\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001345\",\n" +
//                "      \"pinfl\": \"31307810270028\",\n" +
//                "      \"name\": \"Abdusalamov Djamshid Abdusalamovich\",\n" +
//                "      \"depName\": \"Asakabank AJ Bosh ofisi\",\n" +
//                "      \"depId\": \"50000001\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001348\",\n" +
//                "      \"pinfl\": \"\",\n" +
//                "      \"name\": \"Bazarbaeva Gulbaxar Axmetovna\",\n" +
//                "      \"depName\": \"Asakabank AJ Bosh ofisi\",\n" +
//                "      \"depId\": \"50000001\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001351\",\n" +
//                "      \"pinfl\": \"31810902400077\",\n" +
//                "      \"name\": \"Mukxamedov Pulat Nasridinovich\",\n" +
//                "      \"depName\": \"Korporativ xizmat ko'rsatish departamenti\",\n" +
//                "      \"depId\": \"50000052\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001353\",\n" +
//                "      \"pinfl\": \"32211910222449\",\n" +
//                "      \"name\": \"Mahkamov Azizjon Hikmatjon o'g'li\",\n" +
//                "      \"depName\": \"Asakabank AJ Bosh ofisi\",\n" +
//                "      \"depId\": \"50000001\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001354\",\n" +
//                "      \"pinfl\": \"30806540240055\",\n" +
//                "      \"name\": \"Ibragimov Xusan Komolovich\",\n" +
//                "      \"depName\": \"Asakabank AJ Bosh ofisi\",\n" +
//                "      \"depId\": \"50000001\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001355\",\n" +
//                "      \"pinfl\": \"32812790060017\",\n" +
//                "      \"name\": \"Tastanbekov Tohir Xudoyberganovich\",\n" +
//                "      \"depName\": \"Asakabank AJ Bosh ofisi\",\n" +
//                "      \"depId\": \"50000001\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001356\",\n" +
//                "      \"pinfl\": \"\",\n" +
//                "      \"name\": \"Toshev Asror Arslonovich\",\n" +
//                "      \"depName\": \"Asakabank AJ Bosh ofisi\",\n" +
//                "      \"depId\": \"50000001\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001357\",\n" +
//                "      \"pinfl\": \"41908830020014\",\n" +
//                "      \"name\": \"Bahodirova Malika Mirjalalovna\",\n" +
//                "      \"depName\": \"Asakabank AJ Bosh ofisi\",\n" +
//                "      \"depId\": \"50000001\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001358\",\n" +
//                "      \"pinfl\": \"42911796670037\",\n" +
//                "      \"name\": \"Ibragimova Gulnoza Abduhalilovna\",\n" +
//                "      \"depName\": \"Asakabank AJ Bosh ofisi\",\n" +
//                "      \"depId\": \"50000001\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001360\",\n" +
//                "      \"pinfl\": \"42706800290019\",\n" +
//                "      \"name\": \"Mavlanbekova Movluda Sabitovna\",\n" +
//                "      \"depName\": \"Asakabank AJ Bosh ofisi\",\n" +
//                "      \"depId\": \"50000001\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001361\",\n" +
//                "      \"pinfl\": \"43006730240010\",\n" +
//                "      \"name\": \"Artikova Mashhura Abdusatarovna\",\n" +
//                "      \"depName\": \"Asakabank AJ Bosh ofisi\",\n" +
//                "      \"depId\": \"50000001\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001362\",\n" +
//                "      \"pinfl\": \"41511770290038\",\n" +
//                "      \"name\": \"Madjitova Shahodat Mansurovna\",\n" +
//                "      \"depName\": \"Asakabank AJ Bosh ofisi\",\n" +
//                "      \"depId\": \"50000001\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001364\",\n" +
//                "      \"pinfl\": \"33012930200050\",\n" +
//                "      \"name\": \"Abdul-Qodir Nurmuhammad Farhodjon o'g'li\",\n" +
//                "      \"depName\": \"Data Engineering va Sun'iy Intellekt texnologiyalari bo'limi\",\n" +
//                "      \"depId\": \"50001605\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003670\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001366\",\n" +
//                "      \"pinfl\": \"62702006520015\",\n" +
//                "      \"name\": \"Karimova Xurshida Raufjon qizi\",\n" +
//                "      \"depName\": \"Xalqaro moliya institutlari va kredit hujjatlari bilan ishlash hamdashartnomaviy ishlar boshqarmasi\",\n" +
//                "      \"depId\": \"50001591\",\n" +
//                "      \"postName\": \"Yetakchi yuriskonsul`t\",\n" +
//                "      \"postId\": \"60003589\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001377\",\n" +
//                "      \"pinfl\": \"32704872380053\",\n" +
//                "      \"name\": \"Sidiyarov Mutal Keldiboyevich\",\n" +
//                "      \"depName\": \"Komplayens nazorat departamenti\",\n" +
//                "      \"depId\": \"50000040\",\n" +
//                "      \"postName\": \"Hududiy komplayens ofitseri (Zarafshon BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60005232\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001390\",\n" +
//                "      \"pinfl\": \"30310911230027\",\n" +
//                "      \"name\": \"Abdusalamov Bexzod Bobirbek o'g'li\",\n" +
//                "      \"depName\": \"Komplayens nazorat departamenti\",\n" +
//                "      \"depId\": \"50000040\",\n" +
//                "      \"postName\": \"Hududiy komplayens ofitseri (Andijon BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60005230\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001456\",\n" +
//                "      \"pinfl\": \"30308891661205\",\n" +
//                "      \"name\": \"Mamadiyorov Sindor Qodir o'g'li\",\n" +
//                "      \"depName\": \"Ekspert-tahlil guruhi\",\n" +
//                "      \"depId\": \"50000964\",\n" +
//                "      \"postName\": \"Ekspert (Jizzax BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60002977\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001465\",\n" +
//                "      \"pinfl\": \"41905885450010\",\n" +
//                "      \"name\": \"Abdiyeva Shaxnoza Abdusaliyevna\",\n" +
//                "      \"depName\": \"Hard collection bo'limi\",\n" +
//                "      \"depId\": \"50001543\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60003377\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001551\",\n" +
//                "      \"pinfl\": \"32609961000042\",\n" +
//                "      \"name\": \"Nasilloyev Sardor Baxtiyorovich\",\n" +
//                "      \"depName\": \"Korporativ, kichik va o'rta biznes segmentlarida mahsulotlar bilanishlash bo'limi\",\n" +
//                "      \"depId\": \"50001668\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60004930\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001661\",\n" +
//                "      \"pinfl\": \"30605682600013\",\n" +
//                "      \"name\": \"Djavliyev G'ayrat Choriyevich\",\n" +
//                "      \"depName\": \"Ekspert-tahlil guruhi\",\n" +
//                "      \"depId\": \"50000964\",\n" +
//                "      \"postName\": \"Ekspert (Qarshi BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60002976\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001676\",\n" +
//                "      \"pinfl\": \"31804922670084\",\n" +
//                "      \"name\": \"Soatov Humoyun Ravshan o'g'li\",\n" +
//                "      \"depName\": \"Bank xizmatlari markazlari kreditlari monitoringini nazorat qilishbo'limi\",\n" +
//                "      \"depId\": \"50001497\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60002927\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001749\",\n" +
//                "      \"pinfl\": \"32404914320091\",\n" +
//                "      \"name\": \"Ergashev Saloxiddin Saminjon o'g'li\",\n" +
//                "      \"depName\": \"Mijozlarga xizmat ko'rsatish boshqarmasi\",\n" +
//                "      \"depId\": \"50000975\",\n" +
//                "      \"postName\": \"Ekspert (Qo'qon BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60002900\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001757\",\n" +
//                "      \"pinfl\": \"32805977050011\",\n" +
//                "      \"name\": \"Axmadxo'jayev Ayubxon Akramxon o'g'li\",\n" +
//                "      \"depName\": \" Tashqi savdo shartnomalarini muvofiqlashtirish bo'limi\",\n" +
//                "      \"depId\": \"50001070\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000682\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001801\",\n" +
//                "      \"pinfl\": \"30304942110090\",\n" +
//                "      \"name\": \"Odashov Boburjon Ikromjon o'g'li\",\n" +
//                "      \"depName\": \"Bank xizmatlari markazlari kreditlari monitoringini nazorat qilishbo'limi\",\n" +
//                "      \"depId\": \"50001497\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60002923\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001804\",\n" +
//                "      \"pinfl\": \"31508762090025\",\n" +
//                "      \"name\": \"Urmonov Nodirjon Axmadjonovich\",\n" +
//                "      \"depName\": \"Garov mulkini baholash bo‘limi\",\n" +
//                "      \"depId\": \"50001912\",\n" +
//                "      \"postName\": \"Bosh mutaxassis (BXM bo‘yicha)\",\n" +
//                "      \"postId\": \"60005096\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001810\",\n" +
//                "      \"pinfl\": \"30205862160014\",\n" +
//                "      \"name\": \"Quchqorov Nurmirza Bekmirzaevich\",\n" +
//                "      \"depName\": \"Mintaqaviy sotuv boshqarmasi\",\n" +
//                "      \"depId\": \"50001018\",\n" +
//                "      \"postName\": \"Xududiy menedjer\",\n" +
//                "      \"postId\": \"60003620\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001920\",\n" +
//                "      \"pinfl\": \"33004966520017\",\n" +
//                "      \"name\": \"Nasriddinov Nizomiddin Jamoliddin o'g'li\",\n" +
//                "      \"depName\": \"Transport bo'limi\",\n" +
//                "      \"depId\": \"50001054\",\n" +
//                "      \"postName\": \"Yengil avtomobil xaydovchisi\",\n" +
//                "      \"postId\": \"60002447\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001924\",\n" +
//                "      \"pinfl\": \"41206930270994\",\n" +
//                "      \"name\": \"Tursunboyeva Nilufar Asad qizi\",\n" +
//                "      \"depName\": \"Xodimlarni tanlash va moslashtirish boshqarmasi\",\n" +
//                "      \"depId\": \"50000981\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60004867\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001932\",\n" +
//                "      \"pinfl\": \"30109850550088\",\n" +
//                "      \"name\": \"Zokirov Ismoil Zoxidovich\",\n" +
//                "      \"depName\": \"Bank mulklarini sotish bo'limi\",\n" +
//                "      \"depId\": \"50001478\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003302\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00001973\",\n" +
//                "      \"pinfl\": \"42008920211755\",\n" +
//                "      \"name\": \"Akramova Omila Nurilla qizi\",\n" +
//                "      \"depName\": \"Ichki xo'jalik amaliyotlari bo'limi\",\n" +
//                "      \"depId\": \"50001034\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60000477\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002155\",\n" +
//                "      \"pinfl\": \"30611934310085\",\n" +
//                "      \"name\": \"Sobirov Sarvarbek Zafarjon o'g'li\",\n" +
//                "      \"depName\": \"Garov mulkini baholash bo‘limi\",\n" +
//                "      \"depId\": \"50001912\",\n" +
//                "      \"postName\": \"Bosh mutaxassis (BXM bo‘yicha)\",\n" +
//                "      \"postId\": \"60005094\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002632\",\n" +
//                "      \"pinfl\": \"52906007210022\",\n" +
//                "      \"name\": \"Fozilov Kamron Nosirbek o'g'li\",\n" +
//                "      \"depName\": \"Asakabank AJ Bosh ofisi\",\n" +
//                "      \"depId\": \"50000001\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002633\",\n" +
//                "      \"pinfl\": \"50803016780024\",\n" +
//                "      \"name\": \"Nuraliyev Suxrob Telman o'g'li\",\n" +
//                "      \"depName\": \"Asakabank AJ Bosh ofisi\",\n" +
//                "      \"depId\": \"50000001\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002634\",\n" +
//                "      \"pinfl\": \"32301975360087\",\n" +
//                "      \"name\": \"Ergashev To'xtamurot Alisher o'g'li\",\n" +
//                "      \"depName\": \" Bank likvidligini boshqarish bo'limi\",\n" +
//                "      \"depId\": \"50000994\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60002368\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002642\",\n" +
//                "      \"pinfl\": \"30412810222151\",\n" +
//                "      \"name\": \"Baxramov Anvarjon Salimovich\",\n" +
//                "      \"depName\": \"Sanksiyalar, embargolar bilan ishlash boshqarmasi\",\n" +
//                "      \"depId\": \"50001929\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60005266\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002644\",\n" +
//                "      \"pinfl\": \"32712826670019\",\n" +
//                "      \"name\": \"Mirzaraximov Xurshid Odiljonovich\",\n" +
//                "      \"depName\": \"Xavfsizlik tartiboti va nazorat bo'limi\",\n" +
//                "      \"depId\": \"50000977\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60000111\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002649\",\n" +
//                "      \"pinfl\": \"31510996230016\",\n" +
//                "      \"name\": \"Jumaqulov Ergash Komiljonovich\",\n" +
//                "      \"depName\": \"Bank balansiga mulklarni qabul qilish bo'limi\",\n" +
//                "      \"depId\": \"50001477\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60003097\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002656\",\n" +
//                "      \"pinfl\": \"32210996290018\",\n" +
//                "      \"name\": \"Eshboltayev Jaxongir Ishonkulovich\",\n" +
//                "      \"depName\": \"Axborot xavfsizligi bo'limi\",\n" +
//                "      \"depId\": \"50000979\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60004923\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002660\",\n" +
//                "      \"pinfl\": \"32207996500067\",\n" +
//                "      \"name\": \"Miryunusov Mirsaid Umidjon o'g'li\",\n" +
//                "      \"depName\": \"Raqamli marketing bo'limi\",\n" +
//                "      \"depId\": \"50001580\",\n" +
//                "      \"postName\": \"Menedjer\",\n" +
//                "      \"postId\": \"60003542\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002661\",\n" +
//                "      \"pinfl\": \"\",\n" +
//                "      \"name\": \"Abdinazarov Bobur Kalandarovich\",\n" +
//                "      \"depName\": \"Asakabank AJ Bosh ofisi\",\n" +
//                "      \"depId\": \"50000001\",\n" +
//                "      \"postName\": \"Прочие\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002664\",\n" +
//                "      \"pinfl\": \"32103921220016\",\n" +
//                "      \"name\": \"Ahmadjonov Boburmirzo Abdurahmon o'g'li\",\n" +
//                "      \"depName\": \"Bank xizmatlari markazlarini rivojlantirish bo'limi\",\n" +
//                "      \"depId\": \"50001029\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60003375\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002665\",\n" +
//                "      \"pinfl\": \"41211696520023\",\n" +
//                "      \"name\": \"Xidirova Dilfuza Xursanovna\",\n" +
//                "      \"depName\": \"Devonxona sektori\",\n" +
//                "      \"depId\": \"50001566\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003509\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002681\",\n" +
//                "      \"pinfl\": \"32502986580026\",\n" +
//                "      \"name\": \"Nosirov Jahongir Ravshan o'g'li\",\n" +
//                "      \"depName\": \"Xavfsizlik tartiboti va nazorat bo'limi\",\n" +
//                "      \"depId\": \"50000977\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60004934\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002682\",\n" +
//                "      \"pinfl\": \"30102830450020\",\n" +
//                "      \"name\": \"Baratov Kobiljon Abdumuminovich\",\n" +
//                "      \"depName\": \"Monitoring bo'limi\",\n" +
//                "      \"depId\": \"50001049\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60002616\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002688\",\n" +
//                "      \"pinfl\": \"41707756180013\",\n" +
//                "      \"name\": \"Toshkanboyeva Nargiza Toshkanboyevna\",\n" +
//                "      \"depName\": \"Xodimlarni tanlash va moslashtirish boshqarmasi\",\n" +
//                "      \"depId\": \"50000981\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60002619\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002689\",\n" +
//                "      \"pinfl\": \"32002961620014\",\n" +
//                "      \"name\": \"Eshimov Hayitmurod Murtozaqul o'g'li\",\n" +
//                "      \"depName\": \"Ichki dasturiy ta'minotlarni ishlab chiqish bo'limi\",\n" +
//                "      \"depId\": \"50001604\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003661\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002690\",\n" +
//                "      \"pinfl\": \"32204966770044\",\n" +
//                "      \"name\": \"O'ktamov Shoxjaxon Akbarali o'g'li\",\n" +
//                "      \"depName\": \"Biznes tizimlarini qo'llab-quvvatlash bo'limi\",\n" +
//                "      \"depId\": \"50001616\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003703\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002691\",\n" +
//                "      \"pinfl\": \"32404821540018\",\n" +
//                "      \"name\": \"Mamanov Ruslanbek Abduhalikovich\",\n" +
//                "      \"depName\": \"Asakabank AJ Bosh ofisi\",\n" +
//                "      \"depId\": \"50000001\",\n" +
//                "      \"postName\": \"Прочие\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002692\",\n" +
//                "      \"pinfl\": \"42912730360030\",\n" +
//                "      \"name\": \"Abbosxonova Irodahon Abbasovna\",\n" +
//                "      \"depName\": \"Asakabank AJ Bosh ofisi\",\n" +
//                "      \"depId\": \"50000001\",\n" +
//                "      \"postName\": \"Прочие\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002693\",\n" +
//                "      \"pinfl\": \"31412764290045\",\n" +
//                "      \"name\": \"Ubaydullayev Mirzohid Murodilovich\",\n" +
//                "      \"depName\": \"Asakabank AJ Bosh ofisi\",\n" +
//                "      \"depId\": \"50000001\",\n" +
//                "      \"postName\": \"Прочие\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002694\",\n" +
//                "      \"pinfl\": \"32708996180098\",\n" +
//                "      \"name\": \"Azzamov Mahsudjon Marufjonovich\",\n" +
//                "      \"depName\": \"Ichki dasturiy ta'minotlarni ishlab chiqish bo'limi\",\n" +
//                "      \"depId\": \"50001604\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003663\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002699\",\n" +
//                "      \"pinfl\": \"31302986520106\",\n" +
//                "      \"name\": \"Bayrbekov Zokir Aldiyar o'g'li\",\n" +
//                "      \"depName\": \"Xavfsizlik va axborotlarni muhofaza qilish boshqarmasi\",\n" +
//                "      \"depId\": \"50000031\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002703\",\n" +
//                "      \"pinfl\": \"41406830170040\",\n" +
//                "      \"name\": \"Abdialimova Dildora Irkinovna\",\n" +
//                "      \"depName\": \"Loyihalarni ko'rib chiqish va tahlil qilish bo'limi\",\n" +
//                "      \"depId\": \"50001676\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003934\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002712\",\n" +
//                "      \"pinfl\": \"42101736530017\",\n" +
//                "      \"name\": \"Ulyanova Olga Gennadyevna\",\n" +
//                "      \"depName\": \"Asakabank AJ Bosh ofisi\",\n" +
//                "      \"depId\": \"50000001\",\n" +
//                "      \"postName\": \"Прочие\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002713\",\n" +
//                "      \"pinfl\": \"31807686530016\",\n" +
//                "      \"name\": \"Osipyan Ashot \",\n" +
//                "      \"depName\": \"Raxbariyat\",\n" +
//                "      \"depId\": \"50000024\",\n" +
//                "      \"postName\": \"Прочие\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002724\",\n" +
//                "      \"pinfl\": \"42611880191575\",\n" +
//                "      \"name\": \"Gapirova Fotima Abdusaminovna\",\n" +
//                "      \"depName\": \"Mijozlarga xizmat ko'rsatish boshqarmasi\",\n" +
//                "      \"depId\": \"50000975\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60000073\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002727\",\n" +
//                "      \"pinfl\": \"50110006450017\",\n" +
//                "      \"name\": \"Iskandarbekov Firdavs Bahodir o'g'li\",\n" +
//                "      \"depName\": \"Call center bo'limi\",\n" +
//                "      \"depId\": \"50001024\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003869\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002728\",\n" +
//                "      \"pinfl\": \"40203910201303\",\n" +
//                "      \"name\": \"Mametova Gulnoz Abduvaliyevna\",\n" +
//                "      \"depName\": \"Mijozlarga xizmat ko'rsatish boshqarmasi\",\n" +
//                "      \"depId\": \"50000975\",\n" +
//                "      \"postName\": \"Kotib - resepshionist\",\n" +
//                "      \"postId\": \"60002501\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002729\",\n" +
//                "      \"pinfl\": \"40405866540015\",\n" +
//                "      \"name\": \"Tulyaganova Aziza Yusuf qizi\",\n" +
//                "      \"depName\": \"Asakabank AJ Bosh ofisi\",\n" +
//                "      \"depId\": \"50000001\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002732\",\n" +
//                "      \"pinfl\": \"30407890580015\",\n" +
//                "      \"name\": \"Nodirov Bunyod Nodir o'g'li\",\n" +
//                "      \"depName\": \"Soft collection bo'limi\",\n" +
//                "      \"depId\": \"50001026\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003861\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002738\",\n" +
//                "      \"pinfl\": \"30109840560033\",\n" +
//                "      \"name\": \"Muminov Ziyodulla Mirkamilovich\",\n" +
//                "      \"depName\": \"Balans va yagona korrespondentlik hisobini konsolidatsiya qilish bo'limi\",\n" +
//                "      \"depId\": \"50001036\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60002671\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002740\",\n" +
//                "      \"pinfl\": \"32909822720026\",\n" +
//                "      \"name\": \"Xaydarov Laziz Berdimuratovich\",\n" +
//                "      \"depName\": \"Xavfsizlik tartiboti va nazorat bo'limi\",\n" +
//                "      \"depId\": \"50000977\",\n" +
//                "      \"postName\": \"Bosh mutaxassis (Zarafshon BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60004917\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002765\",\n" +
//                "      \"pinfl\": \"30608940260110\",\n" +
//                "      \"name\": \"Qahhorov Avazbek Qahramon o'g'li\",\n" +
//                "      \"depName\": \"Masofaviy bank xizmatlarini rivojlantirish bo'limi\",\n" +
//                "      \"depId\": \"50001603\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003653\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002778\",\n" +
//                "      \"pinfl\": \"40106756600034\",\n" +
//                "      \"name\": \"Kuts Larisa Nikolayevna\",\n" +
//                "      \"depName\": \"Kompensatsiya va imtiyozlar boshqarmasi\",\n" +
//                "      \"depId\": \"50000983\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60004866\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002795\",\n" +
//                "      \"pinfl\": \"32810890570021\",\n" +
//                "      \"name\": \"Mirzayev Suxrob Savronovich\",\n" +
//                "      \"depName\": \"Contact-Center boshqarmasi\",\n" +
//                "      \"depId\": \"50001023\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60002704\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002799\",\n" +
//                "      \"pinfl\": \"30302910171681\",\n" +
//                "      \"name\": \"Qudratov Kozimjon G'ayratilla o'g'li\",\n" +
//                "      \"depName\": \"Hisobot va tahlil boshqarmasi\",\n" +
//                "      \"depId\": \"50001495\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003019\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002800\",\n" +
//                "      \"pinfl\": \"42402900430046\",\n" +
//                "      \"name\": \"Saydiyeva Sabrina Amridinovna\",\n" +
//                "      \"depName\": \"Kompensatsiya va imtiyozlar boshqarmasi\",\n" +
//                "      \"depId\": \"50000983\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60005189\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002801\",\n" +
//                "      \"pinfl\": \"40505966610024\",\n" +
//                "      \"name\": \"Ergasheva Nargiza Hamidulla qizi\",\n" +
//                "      \"depName\": \"O'qitish va rivojlantirish boshqarmasi\",\n" +
//                "      \"depId\": \"50000982\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60000157\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002824\",\n" +
//                "      \"pinfl\": \"30307986610063\",\n" +
//                "      \"name\": \"Qobilov Asilbek Xusan o'g'li\",\n" +
//                "      \"depName\": \"Chakana biznes departamenti\",\n" +
//                "      \"depId\": \"50000041\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002826\",\n" +
//                "      \"pinfl\": \"41103860040016\",\n" +
//                "      \"name\": \"Abdullayeva Durdona To'lqinovna\",\n" +
//                "      \"depName\": \"Chakana biznes departamenti\",\n" +
//                "      \"depId\": \"50000041\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002828\",\n" +
//                "      \"pinfl\": \"41509998660021\",\n" +
//                "      \"name\": \"Raximova Malika Nurmuhammad qizi\",\n" +
//                "      \"depName\": \"Asakabank AJ Bosh ofisi\",\n" +
//                "      \"depId\": \"50000001\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002830\",\n" +
//                "      \"pinfl\": \"32006950170030\",\n" +
//                "      \"name\": \"Yalg'ashov Shoxrux To'lqin o'gli\",\n" +
//                "      \"depName\": \"Asakabank AJ Bosh ofisi\",\n" +
//                "      \"depId\": \"50000001\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002831\",\n" +
//                "      \"pinfl\": \"42807940210078\",\n" +
//                "      \"name\": \"Yo'ldoshova Nigina Alisher qizi\",\n" +
//                "      \"depName\": \"Telemarketing bo'limi\",\n" +
//                "      \"depId\": \"50001025\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002833\",\n" +
//                "      \"pinfl\": \"50110006450017\",\n" +
//                "      \"name\": \"Iskandarbekov Firdavs Baxodir o'g'li\",\n" +
//                "      \"depName\": \"Chakana biznes departamenti\",\n" +
//                "      \"depId\": \"50000041\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002834\",\n" +
//                "      \"pinfl\": \"51705006520021\",\n" +
//                "      \"name\": \"Maxamadjonov Azizbek Rustam o'g'li\",\n" +
//                "      \"depName\": \"Call center bo'limi\",\n" +
//                "      \"depId\": \"50001024\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002837\",\n" +
//                "      \"pinfl\": \"50207038660032\",\n" +
//                "      \"name\": \"Boxodirov Shuxratbek Dilshod o'g'li\",\n" +
//                "      \"depName\": \"Call center bo'limi\",\n" +
//                "      \"depId\": \"50001024\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002839\",\n" +
//                "      \"pinfl\": \"30405997200029\",\n" +
//                "      \"name\": \"Sultonov Munisbek Shermat o'g'li\",\n" +
//                "      \"depName\": \"Soft collection bo'limi\",\n" +
//                "      \"depId\": \"50001026\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002840\",\n" +
//                "      \"pinfl\": \"53003016600028\",\n" +
//                "      \"name\": \"Abduraxmonov Abdulaziz Iqboljon o'g'li\",\n" +
//                "      \"depName\": \"NPS bo'limi\",\n" +
//                "      \"depId\": \"50001547\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002841\",\n" +
//                "      \"pinfl\": \"42105976850030\",\n" +
//                "      \"name\": \"Rahmataliyeva Nasibaxon Marufjon qiziz\",\n" +
//                "      \"depName\": \"Asakabank AJ Bosh ofisi\",\n" +
//                "      \"depId\": \"50000001\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002845\",\n" +
//                "      \"pinfl\": \"42103740270055\",\n" +
//                "      \"name\": \"Mamadaliyeva Zulxumor Ruzimuradovna\",\n" +
//                "      \"depName\": \"Qonunchilikka, regulyativ talablarga va ESGga muvofiqlik bo‘limi\",\n" +
//                "      \"depId\": \"50001926\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60005255\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002873\",\n" +
//                "      \"pinfl\": \"30711842890063\",\n" +
//                "      \"name\": \"Raxmanov Safar Alijanovich\",\n" +
//                "      \"depName\": \"Komplayens nazorat departamenti\",\n" +
//                "      \"depId\": \"50000040\",\n" +
//                "      \"postName\": \"Hududiy komplayens ofitseri (Guliston BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60005245\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002875\",\n" +
//                "      \"pinfl\": \"32105800560022\",\n" +
//                "      \"name\": \"Beknazarov Jasur Baxodirovich\",\n" +
//                "      \"depName\": \"Ishlarni boshqarish departamenti\",\n" +
//                "      \"depId\": \"50000046\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002877\",\n" +
//                "      \"pinfl\": \"41110776540013\",\n" +
//                "      \"name\": \"Yusupova Dildora Raxmatillayevna\",\n" +
//                "      \"depName\": \"Ishlarni boshqarish departamenti\",\n" +
//                "      \"depId\": \"50000046\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002880\",\n" +
//                "      \"pinfl\": \"30610820190031\",\n" +
//                "      \"name\": \"Tulyaganov Kudratilla Asatullayevich\",\n" +
//                "      \"depName\": \"Raxbariyat\",\n" +
//                "      \"depId\": \"50000024\",\n" +
//                "      \"postName\": \"Boshqaruv Raisi v.b.\",\n" +
//                "      \"postId\": \"60004967\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002881\",\n" +
//                "      \"pinfl\": \"40502963450039\",\n" +
//                "      \"name\": \"Mirametova Nurziya Xojakimet qizi\",\n" +
//                "      \"depName\": \"Asakabank AJ Bosh ofisi\",\n" +
//                "      \"depId\": \"50000001\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002888\",\n" +
//                "      \"pinfl\": \"32204960010016\",\n" +
//                "      \"name\": \"Xabibullayev Abdulla Zabixullayevich\",\n" +
//                "      \"depName\": \"Bank ijro apparati\",\n" +
//                "      \"depId\": \"50000025\",\n" +
//                "      \"postName\": \"Boshqaruv Raisining birinchi yordamchisi-direktor o'rinbosari\",\n" +
//                "      \"postId\": \"60003095\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002890\",\n" +
//                "      \"pinfl\": \"41410905550013\",\n" +
//                "      \"name\": \"Karimova Sadaf Lutfullayevna\",\n" +
//                "      \"depName\": \"Kompensatsiya va imtiyozlar boshqarmasi\",\n" +
//                "      \"depId\": \"50000983\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60003355\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002894\",\n" +
//                "      \"pinfl\": \"30606776560013\",\n" +
//                "      \"name\": \"Unarov Askarali Xamidovich\",\n" +
//                "      \"depName\": \"Garov mulkini baholash bo‘limi\",\n" +
//                "      \"depId\": \"50001912\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60005082\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002900\",\n" +
//                "      \"pinfl\": \"32608976520071\",\n" +
//                "      \"name\": \"Babayev Nodirbek Maksudbek o'g'li\",\n" +
//                "      \"depName\": \" Tashqi savdo shartnomalarini muvofiqlashtirish bo'limi\",\n" +
//                "      \"depId\": \"50001070\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60000685\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002903\",\n" +
//                "      \"pinfl\": \"32705951890014\",\n" +
//                "      \"name\": \"Jabborov Muhiddin Faxriddinovich\",\n" +
//                "      \"depName\": \"Savdoni moliyalashtirish bo'limi\",\n" +
//                "      \"depId\": \"50001071\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60003122\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002904\",\n" +
//                "      \"pinfl\": \"30908786520011\",\n" +
//                "      \"name\": \"Ibragimov Shuxrat Usmonovich\",\n" +
//                "      \"depName\": \"Transport bo'limi\",\n" +
//                "      \"depId\": \"50001054\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60003899\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002906\",\n" +
//                "      \"pinfl\": \"32402985900044\",\n" +
//                "      \"name\": \"Xolmirzayev Kozimjon Baxromjon o'g'li\",\n" +
//                "      \"depName\": \"Ichki dasturiy ta'minotlarni ishlab chiqish bo'limi\",\n" +
//                "      \"depId\": \"50001604\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003665\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002916\",\n" +
//                "      \"pinfl\": \"30512891000010\",\n" +
//                "      \"name\": \"Xamroyev Ilyosjon Ilxomjonovich\",\n" +
//                "      \"depName\": \"Tashkiliy ishlar bo'limi (Administratsion)\",\n" +
//                "      \"depId\": \"50001618\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003704\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002923\",\n" +
//                "      \"pinfl\": \"42110966590047\",\n" +
//                "      \"name\": \"Abdusalomova Mushtariy Shovkat qizi\",\n" +
//                "      \"depName\": \"Call center bo'limi\",\n" +
//                "      \"depId\": \"50001024\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002931\",\n" +
//                "      \"pinfl\": \"51406017160018\",\n" +
//                "      \"name\": \"Yuldashev Maratbek Shokirjon o'g'li\",\n" +
//                "      \"depName\": \"Call center bo'limi\",\n" +
//                "      \"depId\": \"50001024\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002941\",\n" +
//                "      \"pinfl\": \"32101985780011\",\n" +
//                "      \"name\": \"Lutfulloyev Murtazo Narzullo o'g'li\",\n" +
//                "      \"depName\": \"Masofaviy bank xizmatlarini rivojlantirish bo'limi\",\n" +
//                "      \"depId\": \"50001603\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003656\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002951\",\n" +
//                "      \"pinfl\": \"31708820222713\",\n" +
//                "      \"name\": \"Turabov Erkinjon Yakubdjanovich\",\n" +
//                "      \"depName\": \"Yuridik departamenti\",\n" +
//                "      \"depId\": \"50000033\",\n" +
//                "      \"postName\": \"Departament direktori o'rinbosari\",\n" +
//                "      \"postId\": \"60003149\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002959\",\n" +
//                "      \"pinfl\": \"30112986530011\",\n" +
//                "      \"name\": \"Gafurov Abrorbek Dilshodbek o'g'li\",\n" +
//                "      \"depName\": \"Loyiha ofisi\",\n" +
//                "      \"depId\": \"50000030\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60003151\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002960\",\n" +
//                "      \"pinfl\": \"41901850210067\",\n" +
//                "      \"name\": \"Kim Yelena Valentinovna\",\n" +
//                "      \"depName\": \"Jinoiy faoliyatdan olingan daromadlarni legallashtirishga, terrorizmnimoliyalashtirishga va ommaviy qirg‘in qurollarini tarqatishnimoliyalashtirishga qarshi kurashish boshqarmasi (JDL/TM)\",\n" +
//                "      \"depId\": \"50001928\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60005261\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002967\",\n" +
//                "      \"pinfl\": \"32402995040026\",\n" +
//                "      \"name\": \"Yo'ldashev Ibroximjon Raximjon o'g'li\",\n" +
//                "      \"depName\": \"Masofaviy bank xizmatlarini rivojlantirish bo'limi\",\n" +
//                "      \"depId\": \"50001603\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003655\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002972\",\n" +
//                "      \"pinfl\": \"30909845250012\",\n" +
//                "      \"name\": \"Kadirov Faxriddin Badriddinovich\",\n" +
//                "      \"depName\": \"Mijozlarga xizmat ko'rsatish boshqarmasi\",\n" +
//                "      \"depId\": \"50000975\",\n" +
//                "      \"postName\": \"Ekspert (Buxoro BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60002885\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00002976\",\n" +
//                "      \"pinfl\": \"32412900222524\",\n" +
//                "      \"name\": \"Yunusov Solijon Abduxalikovich\",\n" +
//                "      \"depName\": \"Marketing departamenti\",\n" +
//                "      \"depId\": \"50000026\",\n" +
//                "      \"postName\": \"Departament direktori\",\n" +
//                "      \"postId\": \"60000060\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003012\",\n" +
//                "      \"pinfl\": \"32010976000017\",\n" +
//                "      \"name\": \"Anvarxonov Azizxon Akmalxonovich\",\n" +
//                "      \"depName\": \"Matbuot markazi\",\n" +
//                "      \"depId\": \"50000027\",\n" +
//                "      \"postName\": \"Matbuot markazi boshlig'i\",\n" +
//                "      \"postId\": \"60000091\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003021\",\n" +
//                "      \"pinfl\": \"41802913970053\",\n" +
//                "      \"name\": \"Lutfiloyeva Maftunaxon Ibodilloyevna\",\n" +
//                "      \"depName\": \" Tashqi savdo shartnomalarini muvofiqlashtirish bo'limi\",\n" +
//                "      \"depId\": \"50001070\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60005013\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003031\",\n" +
//                "      \"pinfl\": \"32105916610017\",\n" +
//                "      \"name\": \"Telitsin Vladimir Vladimirovich\",\n" +
//                "      \"depName\": \"Biznes tizimlarini rivojlantirish bo'limi\",\n" +
//                "      \"depId\": \"50001606\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60003680\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003046\",\n" +
//                "      \"pinfl\": \"42610776500013\",\n" +
//                "      \"name\": \"Isamitdinova Ra’no Raximdjanovna\",\n" +
//                "      \"depName\": \"Kadrlar bo'yicha ish yuritish boshqarmasi\",\n" +
//                "      \"depId\": \"50000984\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003048\",\n" +
//                "      \"pinfl\": \"30511806450018\",\n" +
//                "      \"name\": \"Anarkulov Ismoil Rasuljonovich\",\n" +
//                "      \"depName\": \"Garov mulkini baholash bo‘limi\",\n" +
//                "      \"depId\": \"50001912\",\n" +
//                "      \"postName\": \"Bosh mutaxassis (BXM bo‘yicha)\",\n" +
//                "      \"postId\": \"60005088\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003051\",\n" +
//                "      \"pinfl\": \"52005008660022\",\n" +
//                "      \"name\": \"Umarov Javohir Alimardon o'g'li\",\n" +
//                "      \"depName\": \"Texnik ta'minot va texnikalarni hisobini yuritish bo'limi\",\n" +
//                "      \"depId\": \"50001598\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003639\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003052\",\n" +
//                "      \"pinfl\": \"42907910211196\",\n" +
//                "      \"name\": \"Abduraxmanova Feruza Miraziz qizi\",\n" +
//                "      \"depName\": \"Bankrot korxonalar bilan ishlash bo'limi\",\n" +
//                "      \"depId\": \"50001589\",\n" +
//                "      \"postName\": \"Bosh yuriskonsul`t\",\n" +
//                "      \"postId\": \"60003583\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003053\",\n" +
//                "      \"pinfl\": \"30502910241467\",\n" +
//                "      \"name\": \"Zaynutdinov Rustam Djalaldinovich\",\n" +
//                "      \"depName\": \"Dasturlarni shakllantirish boshqarmasi\",\n" +
//                "      \"depId\": \"50000965\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60002980\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003055\",\n" +
//                "      \"pinfl\": \"30701890470036\",\n" +
//                "      \"name\": \"Sulaymanov Davron Abduvohidovich\",\n" +
//                "      \"depName\": \"Tahlil boshqarmasi\",\n" +
//                "      \"depId\": \"50001541\",\n" +
//                "      \"postName\": \"Menedjer\",\n" +
//                "      \"postId\": \"60003373\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003056\",\n" +
//                "      \"pinfl\": \"32706872170106\",\n" +
//                "      \"name\": \"Sulaymanov Bekzod Anvarovich\",\n" +
//                "      \"depName\": \"Kredit monitoringi departamenti\",\n" +
//                "      \"depId\": \"50000053\",\n" +
//                "      \"postName\": \"Departament direktori\",\n" +
//                "      \"postId\": \"60000750\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003057\",\n" +
//                "      \"pinfl\": \"30801930223090\",\n" +
//                "      \"name\": \"Zokirov Orifjon Mirzoxid o'g'li\",\n" +
//                "      \"depName\": \"Muxandislik bo'limi\",\n" +
//                "      \"depId\": \"50001050\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60000543\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003060\",\n" +
//                "      \"pinfl\": \"31701830210019\",\n" +
//                "      \"name\": \"Sadikov Anvar Adxamovich\",\n" +
//                "      \"depName\": \"Farmatsevtika loyihalarini moliyalashtirish markazi\",\n" +
//                "      \"depId\": \"50001537\",\n" +
//                "      \"postName\": \"Markaz direktori\",\n" +
//                "      \"postId\": \"60003339\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003062\",\n" +
//                "      \"pinfl\": \"52407048030016\",\n" +
//                "      \"name\": \"Olimjonov Olimjon Zafarjon o'g'li\",\n" +
//                "      \"depName\": \"Ichki dasturiy ta'minotlarni ishlab chiqish bo'limi\",\n" +
//                "      \"depId\": \"50001604\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60003711\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003064\",\n" +
//                "      \"pinfl\": \"30111976770011\",\n" +
//                "      \"name\": \"Mirxomidov Miralisher Mirmaxmud o'g'li\",\n" +
//                "      \"depName\": \"Data Engineering va Sun'iy Intellekt texnologiyalari bo'limi\",\n" +
//                "      \"depId\": \"50001605\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003673\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003068\",\n" +
//                "      \"pinfl\": \"31301944330010\",\n" +
//                "      \"name\": \"Rets Dmitriy Alekseyevich\",\n" +
//                "      \"depName\": \"Omnikanal tizimlarini rivojlantirish bo'limi\",\n" +
//                "      \"depId\": \"50001608\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003683\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003073\",\n" +
//                "      \"pinfl\": \"32701965890035\",\n" +
//                "      \"name\": \"Abduraxmanov Yunusali Xakimjon o‘g‘li\",\n" +
//                "      \"depName\": \"Omnikanal tizimlarini rivojlantirish bo'limi\",\n" +
//                "      \"depId\": \"50001608\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003687\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003074\",\n" +
//                "      \"pinfl\": \"42201986500014\",\n" +
//                "      \"name\": \"Yuldasheva Gulchehra Baxtiyorovna\",\n" +
//                "      \"depName\": \"Biznes tizimlarini rivojlantirish bo'limi\",\n" +
//                "      \"depId\": \"50001606\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003679\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003083\",\n" +
//                "      \"pinfl\": \"51609006570027\",\n" +
//                "      \"name\": \"Jur'atov Ravshan Rustam o'g'li\",\n" +
//                "      \"depName\": \"Call center bo'limi\",\n" +
//                "      \"depId\": \"50001024\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003084\",\n" +
//                "      \"pinfl\": \"61501005740041\",\n" +
//                "      \"name\": \"Raimova Xulkar Farxod qizi\",\n" +
//                "      \"depName\": \"Telemarketing bo'limi\",\n" +
//                "      \"depId\": \"50001025\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003085\",\n" +
//                "      \"pinfl\": \"40709890171361\",\n" +
//                "      \"name\": \"Igamnazarova Zulayxo Sunnatullayevna\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"Farrosh\",\n" +
//                "      \"postId\": \"60000591\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003087\",\n" +
//                "      \"pinfl\": \"31402900171525\",\n" +
//                "      \"name\": \"Karimov Ulug'bek Bozorovich\",\n" +
//                "      \"depName\": \"Call center bo'limi\",\n" +
//                "      \"depId\": \"50001024\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003088\",\n" +
//                "      \"pinfl\": \"32405887190029\",\n" +
//                "      \"name\": \"Avezov Jasurbek Shavkatovich\",\n" +
//                "      \"depName\": \"Call center bo'limi\",\n" +
//                "      \"depId\": \"50001024\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003089\",\n" +
//                "      \"pinfl\": \"31007872630043\",\n" +
//                "      \"name\": \"Boymurodov Rafiq Norqobilovich\",\n" +
//                "      \"depName\": \"Komplayens nazorat departamenti\",\n" +
//                "      \"depId\": \"50000040\",\n" +
//                "      \"postName\": \"Hududiy komplayens ofitseri (Qarshi BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60005247\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003091\",\n" +
//                "      \"pinfl\": \"32203810060029\",\n" +
//                "      \"name\": \"Biynazov Furkatjon Nematullayevich\",\n" +
//                "      \"depName\": \"Mijozlar bazasini qo'llab-quvvatlash va rivojlantirish boshqarmasi\",\n" +
//                "      \"depId\": \"50001535\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60003338\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003092\",\n" +
//                "      \"pinfl\": \"31810986610067\",\n" +
//                "      \"name\": \"Adilov Azizjon Nigmatullayevich\",\n" +
//                "      \"depName\": \"Investitsion banking va diling amaliyotlari boshqarmasi\",\n" +
//                "      \"depId\": \"50000995\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003335\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003098\",\n" +
//                "      \"pinfl\": \"30509892550024\",\n" +
//                "      \"name\": \"Maxmudov Fayzullo Xusan o'g'li\",\n" +
//                "      \"depName\": \"Kredit mahsulotlarini ishlab chiqish boshqarmasi\",\n" +
//                "      \"depId\": \"50001020\",\n" +
//                "      \"postName\": \"Menedjer\",\n" +
//                "      \"postId\": \"60003884\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003102\",\n" +
//                "      \"pinfl\": \"31112986930032\",\n" +
//                "      \"name\": \"Xomidov Ulug'bek Islomjon o'g'li\",\n" +
//                "      \"depName\": \"Masofaviy bank xizmatlarini rivojlantirish bo'limi\",\n" +
//                "      \"depId\": \"50001603\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60003713\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003104\",\n" +
//                "      \"pinfl\": \"31310726520019\",\n" +
//                "      \"name\": \"Kochkarov Rustam Ravshanbekovich\",\n" +
//                "      \"depName\": \"Farmatsevtika loyihalarini moliyalashtirish markazi\",\n" +
//                "      \"depId\": \"50001537\",\n" +
//                "      \"postName\": \"Markaz direktori o'rinbosari\",\n" +
//                "      \"postId\": \"60003354\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003112\",\n" +
//                "      \"pinfl\": \"32107730560066\",\n" +
//                "      \"name\": \"Raximdjanov Oqiljon Sobirjonovich\",\n" +
//                "      \"depName\": \"\",\n" +
//                "      \"depId\": \"\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003130\",\n" +
//                "      \"pinfl\": \"30711910480028\",\n" +
//                "      \"name\": \"Urumboyev Kamol Erkin o'g'li\",\n" +
//                "      \"depName\": \"Ijro nazorati boshqarmasi\",\n" +
//                "      \"depId\": \"50001565\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003496\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003131\",\n" +
//                "      \"pinfl\": \"42301955540026\",\n" +
//                "      \"name\": \"Islamova Zilola Abdukarimovna\",\n" +
//                "      \"depName\": \"Telemarketing bo'limi\",\n" +
//                "      \"depId\": \"50001025\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003132\",\n" +
//                "      \"pinfl\": \"43105987720017\",\n" +
//                "      \"name\": \"Daminova Zilola Otabek qizi\",\n" +
//                "      \"depName\": \"Telemarketing bo'limi\",\n" +
//                "      \"depId\": \"50001025\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003133\",\n" +
//                "      \"pinfl\": \"42906911931205\",\n" +
//                "      \"name\": \"Kobilova Mexriniso Mardonovna\",\n" +
//                "      \"depName\": \"Telemarketing bo'limi\",\n" +
//                "      \"depId\": \"50001025\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003140\",\n" +
//                "      \"pinfl\": \"31207841040011\",\n" +
//                "      \"name\": \"Rasulov Dilmurod Tuymurodovich\",\n" +
//                "      \"depName\": \"Kredit risklarini audit qilish guruhi\",\n" +
//                "      \"depId\": \"50000988\",\n" +
//                "      \"postName\": \"Auditor\",\n" +
//                "      \"postId\": \"60000235\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003141\",\n" +
//                "      \"pinfl\": \"40310860240022\",\n" +
//                "      \"name\": \"Allayorova Gulzoda Vaxobovna\",\n" +
//                "      \"depName\": \"Sud ijro hujjatlari bilan ishlash bo'limi\",\n" +
//                "      \"depId\": \"50001588\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60005056\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003142\",\n" +
//                "      \"pinfl\": \"40911921230020\",\n" +
//                "      \"name\": \"Matkabulova Xurshidabonu Ulugbek qizi\",\n" +
//                "      \"depName\": \"Matbuot markazi\",\n" +
//                "      \"depId\": \"50000027\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003402\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003144\",\n" +
//                "      \"pinfl\": \"32412986820023\",\n" +
//                "      \"name\": \"Iskandarov Qosimjon Komiljon O'g'li\",\n" +
//                "      \"depName\": \"Xodimlarni tanlash va moslashtirish boshqarmasi\",\n" +
//                "      \"depId\": \"50000981\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003356\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003146\",\n" +
//                "      \"pinfl\": \"62809026590111\",\n" +
//                "      \"name\": \"Safarova Laylo Alisher qizi\",\n" +
//                "      \"depName\": \"Telemarketing bo'limi\",\n" +
//                "      \"depId\": \"50001025\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003147\",\n" +
//                "      \"pinfl\": \"62912006590044\",\n" +
//                "      \"name\": \"Xoshimxo'jayeva Sevara Sharafutdin qizi\",\n" +
//                "      \"depName\": \"Telemarketing bo'limi\",\n" +
//                "      \"depId\": \"50001025\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003148\",\n" +
//                "      \"pinfl\": \"61311047190025\",\n" +
//                "      \"name\": \"Ergashova Xamidaxon Akmalovna\",\n" +
//                "      \"depName\": \"Telemarketing bo'limi\",\n" +
//                "      \"depId\": \"50001025\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003149\",\n" +
//                "      \"pinfl\": \"51906036520058\",\n" +
//                "      \"name\": \"Dosmuxamedov Tal'at Toxir o'g'li\",\n" +
//                "      \"depName\": \"Call center bo'limi\",\n" +
//                "      \"depId\": \"50001024\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003150\",\n" +
//                "      \"pinfl\": \"50906016520013\",\n" +
//                "      \"name\": \"Adambayev Keulimjoy Askarbay o'g'li\",\n" +
//                "      \"depName\": \"Telemarketing bo'limi\",\n" +
//                "      \"depId\": \"50001025\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003157\",\n" +
//                "      \"pinfl\": \"51808006830045\",\n" +
//                "      \"name\": \"Tulkinov Saidislombek Abdumutal o'g'li\",\n" +
//                "      \"depName\": \"Call center bo'limi\",\n" +
//                "      \"depId\": \"50001024\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003159\",\n" +
//                "      \"pinfl\": \"32408956490011\",\n" +
//                "      \"name\": \"Shoyimov Oybek Olim o'g'li\",\n" +
//                "      \"depName\": \"Xalqaro moliyalashtirish bo'limi\",\n" +
//                "      \"depId\": \"50000996\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60005294\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003160\",\n" +
//                "      \"pinfl\": \"61003006560030\",\n" +
//                "      \"name\": \"Kamalova Vazira Akmal qizi\",\n" +
//                "      \"depName\": \"Telemarketing bo'limi\",\n" +
//                "      \"depId\": \"50001025\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003161\",\n" +
//                "      \"pinfl\": \"31109995470019\",\n" +
//                "      \"name\": \"Amirov Ulug'bek Baxriddin o'g'li\",\n" +
//                "      \"depName\": \"Soft collection bo'limi\",\n" +
//                "      \"depId\": \"50001026\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003162\",\n" +
//                "      \"pinfl\": \"30607966760020\",\n" +
//                "      \"name\": \"Bekbo'tayev Sanjar Muxiddin o'g'li\",\n" +
//                "      \"depName\": \"Chakana biznes departamenti\",\n" +
//                "      \"depId\": \"50000041\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003163\",\n" +
//                "      \"pinfl\": \"51801006540055\",\n" +
//                "      \"name\": \"Anvarov Akmal Akrom o'g'li\",\n" +
//                "      \"depName\": \"Chakana biznes departamenti\",\n" +
//                "      \"depId\": \"50000041\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003164\",\n" +
//                "      \"pinfl\": \"32407952390060\",\n" +
//                "      \"name\": \"Abdivayitov Xurshid Fahriddin o'g'li\",\n" +
//                "      \"depName\": \"Chakana biznes departamenti\",\n" +
//                "      \"depId\": \"50000041\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003165\",\n" +
//                "      \"pinfl\": \"31706986570037\",\n" +
//                "      \"name\": \"Raxmonberdiyev Komronbek Jurabekovich\",\n" +
//                "      \"depName\": \"Xalqaro moliyalashtirish bo'limi\",\n" +
//                "      \"depId\": \"50000996\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60003527\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003166\",\n" +
//                "      \"pinfl\": \"51108026540022\",\n" +
//                "      \"name\": \"Ravshanov Dostonbek Davron o'g'li\",\n" +
//                "      \"depName\": \"Savdoni moliyalashtirishni tarkibiy tuzish va tashkiliy quvvatlashbo'limi\",\n" +
//                "      \"depId\": \"50001480\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60003528\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003169\",\n" +
//                "      \"pinfl\": \"30701965460010\",\n" +
//                "      \"name\": \"Norbayev Jurabek Erkin o'g'li\",\n" +
//                "      \"depName\": \"Mehnat-xo'jalik nizolari va huquqiy ekspertiza bo'limi\",\n" +
//                "      \"depId\": \"50001593\",\n" +
//                "      \"postName\": \"Bosh yuriskonsul`t\",\n" +
//                "      \"postId\": \"60003594\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003172\",\n" +
//                "      \"pinfl\": \"52811036730013\",\n" +
//                "      \"name\": \"Yuldashev Aziz Iftixarovich\",\n" +
//                "      \"depName\": \"Raqamli kanallar bo'limi\",\n" +
//                "      \"depId\": \"50001545\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003523\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003174\",\n" +
//                "      \"pinfl\": \"32107896840042\",\n" +
//                "      \"name\": \"Zulfikarov Timur Rustamovich\",\n" +
//                "      \"depName\": \"Transport bo'limi\",\n" +
//                "      \"depId\": \"50001054\",\n" +
//                "      \"postName\": \"Yengil avtomobil xaydovchisi\",\n" +
//                "      \"postId\": \"60003524\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003175\",\n" +
//                "      \"pinfl\": \"32201901821100\",\n" +
//                "      \"name\": \"Usmanov Ravshan Eshboyevich\",\n" +
//                "      \"depName\": \"Bankrot korxonalar bilan ishlash bo'limi\",\n" +
//                "      \"depId\": \"50001589\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60003582\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003178\",\n" +
//                "      \"pinfl\": \"31609786580016\",\n" +
//                "      \"name\": \"Nabiyev Shavkat Radjabaliyevich\",\n" +
//                "      \"depName\": \"Bank ijro apparati\",\n" +
//                "      \"depId\": \"50000025\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003179\",\n" +
//                "      \"pinfl\": \"32712882350029\",\n" +
//                "      \"name\": \"Mamadiyorov Shuxrat Nuraliyevich\",\n" +
//                "      \"depName\": \"Ekspert-tahlil guruhi\",\n" +
//                "      \"depId\": \"50000964\",\n" +
//                "      \"postName\": \"Ekspert (Navoiy BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60003478\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003180\",\n" +
//                "      \"pinfl\": \"32401960540022\",\n" +
//                "      \"name\": \"Baratov Begzod Rustam o'g'li\",\n" +
//                "      \"depName\": \"Masofaviy bank xizmatlarini rivojlantirish bo'limi\",\n" +
//                "      \"depId\": \"50001603\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003714\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003181\",\n" +
//                "      \"pinfl\": \"30512986960034\",\n" +
//                "      \"name\": \"Ahmadjonov Ravshanjon Ruzali o'g'li\",\n" +
//                "      \"depName\": \"Ichki dasturiy ta'minotlarni ishlab chiqish bo'limi\",\n" +
//                "      \"depId\": \"50001604\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003712\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003182\",\n" +
//                "      \"pinfl\": \"30201901040037\",\n" +
//                "      \"name\": \"Raximov Salim G'afurovich\",\n" +
//                "      \"depName\": \"Kredit risklarini audit qilish guruhi\",\n" +
//                "      \"depId\": \"50000988\",\n" +
//                "      \"postName\": \"Auditor\",\n" +
//                "      \"postId\": \"60000236\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003183\",\n" +
//                "      \"pinfl\": \"52011006070060\",\n" +
//                "      \"name\": \"Eshquvvatov Elbek Zafar o'g'li\",\n" +
//                "      \"depName\": \"Masofaviy bank xizmatlarini rivojlantirish bo'limi\",\n" +
//                "      \"depId\": \"50001603\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003715\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003184\",\n" +
//                "      \"pinfl\": \"32507816670018\",\n" +
//                "      \"name\": \"Paydayev Xasan Ibragimovich\",\n" +
//                "      \"depName\": \"Matbuot markazi\",\n" +
//                "      \"depId\": \"50000027\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003189\",\n" +
//                "      \"pinfl\": \"30407816590014\",\n" +
//                "      \"name\": \"Usmonov Jahongir Qosimjonovich\",\n" +
//                "      \"depName\": \"Muammoli aktivlar bilan ishlash departamenti\",\n" +
//                "      \"depId\": \"50000047\",\n" +
//                "      \"postName\": \"Departament direktori\",\n" +
//                "      \"postId\": \"60003344\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003190\",\n" +
//                "      \"pinfl\": \"50502036050017\",\n" +
//                "      \"name\": \"Ablayev Mirkomil Zafar o'g'li\",\n" +
//                "      \"depName\": \"Data Engineering va Sun'iy Intellekt texnologiyalari bo'limi\",\n" +
//                "      \"depId\": \"50001605\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60003716\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003194\",\n" +
//                "      \"pinfl\": \"32504920261857\",\n" +
//                "      \"name\": \"Nuriddinov Ilxomjon Baxtiyor o'g'li\",\n" +
//                "      \"depName\": \"Raqamli ishlab chiqarish bo'limi\",\n" +
//                "      \"depId\": \"50001581\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60003549\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003199\",\n" +
//                "      \"pinfl\": \"31703890231627\",\n" +
//                "      \"name\": \"Djurayev Shamsiddin Zokirjanovich\",\n" +
//                "      \"depName\": \"Mintaqaviy sotuv boshqarmasi\",\n" +
//                "      \"depId\": \"50001018\",\n" +
//                "      \"postName\": \"Xududiy menedjer\",\n" +
//                "      \"postId\": \"60002905\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003200\",\n" +
//                "      \"pinfl\": \"52309016780030\",\n" +
//                "      \"name\": \"Sadriddinov Fazliddin Akmalovich\",\n" +
//                "      \"depName\": \"Investitsion banking va diling amaliyotlari boshqarmasi\",\n" +
//                "      \"depId\": \"50000995\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60003153\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003201\",\n" +
//                "      \"pinfl\": \"33010956810042\",\n" +
//                "      \"name\": \"Miraxmedov Avaz Baxtiyor o'g'li\",\n" +
//                "      \"depName\": \"Tadqiqotlar bo'limi\",\n" +
//                "      \"depId\": \"50001584\",\n" +
//                "      \"postName\": \"Menedjer\",\n" +
//                "      \"postId\": \"60003575\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003202\",\n" +
//                "      \"pinfl\": \"32308940210156\",\n" +
//                "      \"name\": \"Xislatov Qaxramon Tal'at o'g'li\",\n" +
//                "      \"depName\": \"Ko'chmas mulk sektori\",\n" +
//                "      \"depId\": \"50001053\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60000563\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003203\",\n" +
//                "      \"pinfl\": \"32708996520038\",\n" +
//                "      \"name\": \"Sayitkulov Jahongir Ilhomovich\",\n" +
//                "      \"depName\": \"Biznes tahlili bo'limi\",\n" +
//                "      \"depId\": \"50001669\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60005192\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003209\",\n" +
//                "      \"pinfl\": \"31805870060013\",\n" +
//                "      \"name\": \"Sadikov Yakub Gapurjanovich\",\n" +
//                "      \"depName\": \"Mehnat muhofazasi va xavfsizlik texnikasi bo'limi\",\n" +
//                "      \"depId\": \"50001870\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60004925\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003212\",\n" +
//                "      \"pinfl\": \"51008015840017\",\n" +
//                "      \"name\": \"Azimjonov Hayotjon Vohitjon o'g'li\",\n" +
//                "      \"depName\": \"Call center bo'limi\",\n" +
//                "      \"depId\": \"50001024\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003213\",\n" +
//                "      \"pinfl\": \"51601045900016\",\n" +
//                "      \"name\": \"Alisherov Ahatbek Oybek o'g'li\",\n" +
//                "      \"depName\": \"Telemarketing bo'limi\",\n" +
//                "      \"depId\": \"50001025\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003214\",\n" +
//                "      \"pinfl\": \"60806006740018\",\n" +
//                "      \"name\": \"Asatjanova Asel Azat qizi\",\n" +
//                "      \"depName\": \"Telemarketing bo'limi\",\n" +
//                "      \"depId\": \"50001025\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003215\",\n" +
//                "      \"pinfl\": \"50702046520010\",\n" +
//                "      \"name\": \"Asatullayev Doston Dilshodovich\",\n" +
//                "      \"depName\": \"Raqamli kanallar bo'limi\",\n" +
//                "      \"depId\": \"50001545\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003216\",\n" +
//                "      \"pinfl\": \"52907046540017\",\n" +
//                "      \"name\": \"Boymurodov Anvar Akbar o'g'li\",\n" +
//                "      \"depName\": \"Telemarketing bo'limi\",\n" +
//                "      \"depId\": \"50001025\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003217\",\n" +
//                "      \"pinfl\": \"30406997420011\",\n" +
//                "      \"name\": \"Mirzakhoshimov Umidjon Baxodir o'g'li\",\n" +
//                "      \"depName\": \"Telemarketing bo'limi\",\n" +
//                "      \"depId\": \"50001025\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003218\",\n" +
//                "      \"pinfl\": \"32808985460012\",\n" +
//                "      \"name\": \"Esanbayev Khusniddin Muhammad o'g'li\",\n" +
//                "      \"depName\": \"Call center bo'limi\",\n" +
//                "      \"depId\": \"50001024\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003219\",\n" +
//                "      \"pinfl\": \"62211046610016\",\n" +
//                "      \"name\": \"Eshquvvatova Nigora Normuratovna\",\n" +
//                "      \"depName\": \"Telemarketing bo'limi\",\n" +
//                "      \"depId\": \"50001025\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003220\",\n" +
//                "      \"pinfl\": \"52209015900018\",\n" +
//                "      \"name\": \"Abdurazzaqov Diyorbek Azamatjon o'g'li\",\n" +
//                "      \"depName\": \"Call center bo'limi\",\n" +
//                "      \"depId\": \"50001024\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003221\",\n" +
//                "      \"pinfl\": \"61009025450048\",\n" +
//                "      \"name\": \"Mavlonova Madina Jahongir qizi\",\n" +
//                "      \"depName\": \"Telemarketing bo'limi\",\n" +
//                "      \"depId\": \"50001025\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003222\",\n" +
//                "      \"pinfl\": \"51907006570048\",\n" +
//                "      \"name\": \"Nasullayev Sherzod O'tkur o'g'li\",\n" +
//                "      \"depName\": \"Call center bo'limi\",\n" +
//                "      \"depId\": \"50001024\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003226\",\n" +
//                "      \"pinfl\": \"52604017190018\",\n" +
//                "      \"name\": \"Xabibullayev San'atbek Abdullayevich\",\n" +
//                "      \"depName\": \"Ekvayer va emissiya uskunalarni texnik qo’llab-quvvatlash va hisobiniyuritish bo’limi\",\n" +
//                "      \"depId\": \"50001539\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60003753\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003237\",\n" +
//                "      \"pinfl\": \"51910036520033\",\n" +
//                "      \"name\": \"Volkov Danila Vadimovich\",\n" +
//                "      \"depName\": \"Mijozlar bilan munosabatlarni o'rnatish va rivojlantirish bo'limi\",\n" +
//                "      \"depId\": \"50001625\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003773\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003240\",\n" +
//                "      \"pinfl\": \"31902852870012\",\n" +
//                "      \"name\": \"Miravitov Jaxongir Abdusattarovich\",\n" +
//                "      \"depName\": \"Ekspert-tahlil guruhi\",\n" +
//                "      \"depId\": \"50000964\",\n" +
//                "      \"postName\": \"Ekspert (Guliston BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60003767\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003244\",\n" +
//                "      \"pinfl\": \"32004800250059\",\n" +
//                "      \"name\": \"Raximov Ravshan Xamidovich\",\n" +
//                "      \"depName\": \"AT loyihalarni boshqarish va hisobini yuritish bo'limi\",\n" +
//                "      \"depId\": \"50001597\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60003707\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003245\",\n" +
//                "      \"pinfl\": \"31605910171554\",\n" +
//                "      \"name\": \"Xodjayev Ibraim Olimovich\",\n" +
//                "      \"depName\": \"\",\n" +
//                "      \"depId\": \"\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003246\",\n" +
//                "      \"pinfl\": \"42103950430010\",\n" +
//                "      \"name\": \"Bogdanova Anna Aleksandrovna\",\n" +
//                "      \"depName\": \"Tadqiqotlar bo'limi\",\n" +
//                "      \"depId\": \"50001584\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60003777\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003254\",\n" +
//                "      \"pinfl\": \"41302953180031\",\n" +
//                "      \"name\": \"Jumaniyazova Nozima Obodovna\",\n" +
//                "      \"depName\": \"Data Engineering va Sun'iy Intellekt texnologiyalari bo'limi\",\n" +
//                "      \"depId\": \"50001605\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003675\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003260\",\n" +
//                "      \"pinfl\": \"31809996640010\",\n" +
//                "      \"name\": \"Atayarov Feruz Boxodir o'g'li\",\n" +
//                "      \"depName\": \"Xodimlarni tanlash va moslashtirish boshqarmasi\",\n" +
//                "      \"depId\": \"50000981\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000156\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003261\",\n" +
//                "      \"pinfl\": \"32505940270012\",\n" +
//                "      \"name\": \"Axmedov Shoxrux Burxonovich\",\n" +
//                "      \"depName\": \"Investitsion banking va diling amaliyotlari boshqarmasi\",\n" +
//                "      \"depId\": \"50000995\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60002270\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003263\",\n" +
//                "      \"pinfl\": \"51401006840030\",\n" +
//                "      \"name\": \"Olimjonov Mirzabek Olimjonovich\",\n" +
//                "      \"depName\": \"Call center bo'limi\",\n" +
//                "      \"depId\": \"50001024\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003264\",\n" +
//                "      \"pinfl\": \"61308016570018\",\n" +
//                "      \"name\": \"Xolmatova Munisa Mansur qizi\",\n" +
//                "      \"depName\": \"Telemarketing bo'limi\",\n" +
//                "      \"depId\": \"50001025\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003266\",\n" +
//                "      \"pinfl\": \"32707810171678\",\n" +
//                "      \"name\": \"Fayziyev Raxmatulla Nematillayevich\",\n" +
//                "      \"depName\": \"Harakatsiz kreditlarni hisobdan chiqarish bo'limi\",\n" +
//                "      \"depId\": \"50001475\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003866\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003267\",\n" +
//                "      \"pinfl\": \"43011927340026\",\n" +
//                "      \"name\": \"Joldasova Farida Alliyarovna\",\n" +
//                "      \"depName\": \"Telemarketing bo'limi\",\n" +
//                "      \"depId\": \"50001025\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003269\",\n" +
//                "      \"pinfl\": \"31505823880016\",\n" +
//                "      \"name\": \"Mamatkarimov Nodir Bahodirovich\",\n" +
//                "      \"depName\": \"Ekspert-tahlil guruhi\",\n" +
//                "      \"depId\": \"50000964\",\n" +
//                "      \"postName\": \"Ekspert (Samarqand BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60003871\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003272\",\n" +
//                "      \"pinfl\": \"51104005720021\",\n" +
//                "      \"name\": \"Muxammadiyev Sherzod Baxtiyor o'g'li\",\n" +
//                "      \"depName\": \"Biznes tizimlarini qo'llab-quvvatlash bo'limi\",\n" +
//                "      \"depId\": \"50001616\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60003865\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003275\",\n" +
//                "      \"pinfl\": \"32303730190056\",\n" +
//                "      \"name\": \"Mamatov Ismoil Maxamadinovich\",\n" +
//                "      \"depName\": \"Xavfsizlik tartiboti va nazorat bo'limi\",\n" +
//                "      \"depId\": \"50000977\",\n" +
//                "      \"postName\": \"Bosh mutaxassis (Avtotransport BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60004916\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003282\",\n" +
//                "      \"pinfl\": \"32309890640019\",\n" +
//                "      \"name\": \"Ishabayev Umid Mavlyudbekovich\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003284\",\n" +
//                "      \"pinfl\": \"30103986580012\",\n" +
//                "      \"name\": \"Jumayev Nuriddin Dusmurod o'g'li\",\n" +
//                "      \"depName\": \"Masofaviy bank xizmatlarini rivojlantirish bo'limi\",\n" +
//                "      \"depId\": \"50001603\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003654\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003285\",\n" +
//                "      \"pinfl\": \"30904976960047\",\n" +
//                "      \"name\": \"Sultonov Qodirjon Mahammadjon o'g'li\",\n" +
//                "      \"depName\": \"Matbuot markazi\",\n" +
//                "      \"depId\": \"50000027\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003877\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003286\",\n" +
//                "      \"pinfl\": \"51708006540031\",\n" +
//                "      \"name\": \"Shoabdukarimov Dilshodbek Ulug'bek o'g'li\",\n" +
//                "      \"depName\": \"Xalqaro to'lov tizimlari bo'limi\",\n" +
//                "      \"depId\": \"50001030\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003882\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003293\",\n" +
//                "      \"pinfl\": \"30105961860018\",\n" +
//                "      \"name\": \"Elmurodov Dilshodbek Panji o'g'li\",\n" +
//                "      \"depName\": \"Soft collection bo'limi\",\n" +
//                "      \"depId\": \"50001026\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003294\",\n" +
//                "      \"pinfl\": \"52806045890018\",\n" +
//                "      \"name\": \"Odilxanov Asrorxon Obidxon o'g'li\",\n" +
//                "      \"depName\": \"Soft collection bo'limi\",\n" +
//                "      \"depId\": \"50001026\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003302\",\n" +
//                "      \"pinfl\": \"42107995540020\",\n" +
//                "      \"name\": \"Akbarova E'zoza Anvarjon qizi\",\n" +
//                "      \"depName\": \"Muxandislik bo'limi\",\n" +
//                "      \"depId\": \"50001050\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60000542\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003303\",\n" +
//                "      \"pinfl\": \"31611985740036\",\n" +
//                "      \"name\": \"Abriyev Jo'rabek To'lqin o'gli\",\n" +
//                "      \"depName\": \"Data Engineering va Sun'iy Intellekt texnologiyalari bo'limi\",\n" +
//                "      \"depId\": \"50001605\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003887\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003306\",\n" +
//                "      \"pinfl\": \"42208950190060\",\n" +
//                "      \"name\": \"Umarova Shoxista Bahodir qizi\",\n" +
//                "      \"depName\": \"Brend marketingi bo'limi\",\n" +
//                "      \"depId\": \"50001579\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60003881\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003308\",\n" +
//                "      \"pinfl\": \"30904965310015\",\n" +
//                "      \"name\": \"Majidov Amirxon Abdumalik o'g'li\",\n" +
//                "      \"depName\": \"Garov mulkini baholash bo‘limi\",\n" +
//                "      \"depId\": \"50001912\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60005085\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003309\",\n" +
//                "      \"pinfl\": \"30206954310038\",\n" +
//                "      \"name\": \"Azimov Abdulaxadhon Ahmadxon o'g'li\",\n" +
//                "      \"depName\": \"Ichki dasturiy ta'minotlarni ishlab chiqish bo'limi\",\n" +
//                "      \"depId\": \"50001604\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60003664\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003328\",\n" +
//                "      \"pinfl\": \"30306942380011\",\n" +
//                "      \"name\": \"Raxmonov Hamza Akramjon o'g'li\",\n" +
//                "      \"depName\": \"Mijozlarga xizmat ko'rsatish boshqarmasi\",\n" +
//                "      \"depId\": \"50000975\",\n" +
//                "      \"postName\": \"Ekspert (Yunusobod BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60002896\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003329\",\n" +
//                "      \"pinfl\": \"30702932380054\",\n" +
//                "      \"name\": \"Boymurodov Alisher Raximberdi o'g'li\",\n" +
//                "      \"depName\": \"Raxbariyat\",\n" +
//                "      \"depId\": \"50000024\",\n" +
//                "      \"postName\": \"Maslahatchi\",\n" +
//                "      \"postId\": \"60003992\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003331\",\n" +
//                "      \"pinfl\": \"32605931931369\",\n" +
//                "      \"name\": \"Axmedov Sardorbek Abdukarim o'g'li\",\n" +
//                "      \"depName\": \"Ekspert-tahlil guruhi\",\n" +
//                "      \"depId\": \"50000964\",\n" +
//                "      \"postName\": \"Ekspert (Termiz BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60003895\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003335\",\n" +
//                "      \"pinfl\": \"31905986540028\",\n" +
//                "      \"name\": \"Abdunazarov Abduaziz Ravshanjonovich\",\n" +
//                "      \"depName\": \"Analitika bo'limi\",\n" +
//                "      \"depId\": \"50001583\",\n" +
//                "      \"postName\": \"Menedjer (digital analitika bo'yicha)\",\n" +
//                "      \"postId\": \"60005190\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003336\",\n" +
//                "      \"pinfl\": \"31201790060056\",\n" +
//                "      \"name\": \"Blagovidov Igor Borisovich\",\n" +
//                "      \"depName\": \"Raqamli marketing bo'limi\",\n" +
//                "      \"depId\": \"50001580\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60004005\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003337\",\n" +
//                "      \"pinfl\": \"31904950210022\",\n" +
//                "      \"name\": \"Tursunov Nozimjon Nodirjon o'g'li\",\n" +
//                "      \"depName\": \"Ekspert-tahlil guruhi\",\n" +
//                "      \"depId\": \"50000964\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003338\",\n" +
//                "      \"pinfl\": \"33108940230074\",\n" +
//                "      \"name\": \"Riskulov Saidazim Shakir o'g'li\",\n" +
//                "      \"depName\": \"Transport bo'limi\",\n" +
//                "      \"depId\": \"50001054\",\n" +
//                "      \"postName\": \"Yengil avtomobil xaydovchisi\",\n" +
//                "      \"postId\": \"60004036\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003339\",\n" +
//                "      \"pinfl\": \"50506016560031\",\n" +
//                "      \"name\": \"Xaydarov Umid O'ktam o'g'li\",\n" +
//                "      \"depName\": \"Call center bo'limi\",\n" +
//                "      \"depId\": \"50001024\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003341\",\n" +
//                "      \"pinfl\": \"51503036610066\",\n" +
//                "      \"name\": \"Samijonov Shohjahon Shukurillojon o'g'li\",\n" +
//                "      \"depName\": \"Call center bo'limi\",\n" +
//                "      \"depId\": \"50001024\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003342\",\n" +
//                "      \"pinfl\": \"31402953450082\",\n" +
//                "      \"name\": \"Pirjanov Abdirasulla Baxtiyarovich\",\n" +
//                "      \"depName\": \"Call center bo'limi\",\n" +
//                "      \"depId\": \"50001024\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003343\",\n" +
//                "      \"pinfl\": \"50306046530015\",\n" +
//                "      \"name\": \"Abdumalikov Abdulla Baxtiyor o'g'li\",\n" +
//                "      \"depName\": \"Call center bo'limi\",\n" +
//                "      \"depId\": \"50001024\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003346\",\n" +
//                "      \"pinfl\": \"52007055310019\",\n" +
//                "      \"name\": \"Raxmedinov Temur Nuriddin o'g'li\",\n" +
//                "      \"depName\": \"Soft collection bo'limi\",\n" +
//                "      \"depId\": \"50001026\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003349\",\n" +
//                "      \"pinfl\": \"32605860200024\",\n" +
//                "      \"name\": \"Mirxabibov Nodir Sobirjonovich\",\n" +
//                "      \"depName\": \"G'aznachilik departamenti\",\n" +
//                "      \"depId\": \"50000035\",\n" +
//                "      \"postName\": \"Departament direktori\",\n" +
//                "      \"postId\": \"60004003\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003354\",\n" +
//                "      \"pinfl\": \"30110890201238\",\n" +
//                "      \"name\": \"Saliyev Sherzod Ikromovich\",\n" +
//                "      \"depName\": \"Raxbariyat\",\n" +
//                "      \"depId\": \"50000024\",\n" +
//                "      \"postName\": \"Boshqaruv Raisi o'rinbosari v.b.\",\n" +
//                "      \"postId\": \"60004971\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003357\",\n" +
//                "      \"pinfl\": \"32308600560021\",\n" +
//                "      \"name\": \"Madaliyev Abduvasik Abduvaxitovich\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003368\",\n" +
//                "      \"pinfl\": \"30512977250029\",\n" +
//                "      \"name\": \"Kalimbetov Dilmurat Kaxraman o'g'li\",\n" +
//                "      \"depName\": \"Ichki dasturiy ta'minotlarni ishlab chiqish bo'limi\",\n" +
//                "      \"depId\": \"50001604\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60004853\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003369\",\n" +
//                "      \"pinfl\": \"32403760251155\",\n" +
//                "      \"name\": \"Shausmanov Nodir Shaxaydarovich\",\n" +
//                "      \"depName\": \"Transport bo'limi\",\n" +
//                "      \"depId\": \"50001054\",\n" +
//                "      \"postName\": \"Yengil avtomobil xaydovchisi\",\n" +
//                "      \"postId\": \"60004858\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003370\",\n" +
//                "      \"pinfl\": \"32501736500013\",\n" +
//                "      \"name\": \"Nurmatov Alisher Maratovich\",\n" +
//                "      \"depName\": \"Texnik ta'minot va texnikalarni hisobini yuritish bo'limi\",\n" +
//                "      \"depId\": \"50001598\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60004857\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003376\",\n" +
//                "      \"pinfl\": \"30402792940011\",\n" +
//                "      \"name\": \"Bakirov Umid Sayibjonovich\",\n" +
//                "      \"depName\": \"Sud ijro hujjatlari bilan ishlash bo'limi\",\n" +
//                "      \"depId\": \"50001588\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60003580\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003379\",\n" +
//                "      \"pinfl\": \"32101776530018\",\n" +
//                "      \"name\": \"Abdug'aniyev Ulug'bek Burxoniddin o'g'li\",\n" +
//                "      \"depName\": \"Komplayens nazorat departamenti\",\n" +
//                "      \"depId\": \"50000040\",\n" +
//                "      \"postName\": \"Departament direktori\",\n" +
//                "      \"postId\": \"60000338\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003380\",\n" +
//                "      \"pinfl\": \"32010940190074\",\n" +
//                "      \"name\": \"Olimjonov Izzatjon Shuxrat o'g'li\",\n" +
//                "      \"depName\": \"Qarzdorliklarni sud tartibida undirish bo'limi\",\n" +
//                "      \"depId\": \"50001587\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60003577\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003381\",\n" +
//                "      \"pinfl\": \"43108751430019\",\n" +
//                "      \"name\": \"Saidova Umidaxon Arabovna\",\n" +
//                "      \"depName\": \"Strategik rejalashtirish va tahlil boshqarmasi\",\n" +
//                "      \"depId\": \"50001488\",\n" +
//                "      \"postName\": \"Boshqarma boshlig'i\",\n" +
//                "      \"postId\": \"60003299\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003384\",\n" +
//                "      \"pinfl\": \"32602850760018\",\n" +
//                "      \"name\": \"Zaynitdinov Xusnitdin Gaynitdinovich\",\n" +
//                "      \"depName\": \"Transport bo'limi\",\n" +
//                "      \"depId\": \"50001054\",\n" +
//                "      \"postName\": \"Yengil avtomobil xaydovchisi\",\n" +
//                "      \"postId\": \"60002400\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003387\",\n" +
//                "      \"pinfl\": \"30206790580103\",\n" +
//                "      \"name\": \"Saipov Jamshid Akbarovich\",\n" +
//                "      \"depName\": \"Yuridik departamenti\",\n" +
//                "      \"depId\": \"50000033\",\n" +
//                "      \"postName\": \"Departament direktori o'rinbosari\",\n" +
//                "      \"postId\": \"60000168\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003394\",\n" +
//                "      \"pinfl\": \"31811956610014\",\n" +
//                "      \"name\": \"Vahobov Anvar Abdumannop o'g'li\",\n" +
//                "      \"depName\": \"Sho'ba korxonalari bilan ishlash bo'limi\",\n" +
//                "      \"depId\": \"50001868\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60004901\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003396\",\n" +
//                "      \"pinfl\": \"42612976580031\",\n" +
//                "      \"name\": \"Nazarova Zuxra Botir qizi\",\n" +
//                "      \"depName\": \"Mahsulotlar marketingi bo'limi\",\n" +
//                "      \"depId\": \"50001578\",\n" +
//                "      \"postName\": \"Menedjer\",\n" +
//                "      \"postId\": \"60004922\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003398\",\n" +
//                "      \"pinfl\": \"52611016030027\",\n" +
//                "      \"name\": \"Achilbayev Temurbek Ulug'bek o'gli\",\n" +
//                "      \"depName\": \"Aktiv va passivlarni tahlil qilish bo'limi\",\n" +
//                "      \"depId\": \"50000993\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60004946\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003402\",\n" +
//                "      \"pinfl\": \"32711952940018\",\n" +
//                "      \"name\": \"Siddiqov Dilshod Ilyos o'g'li\",\n" +
//                "      \"depName\": \"Bank xizmatlari markazlari kreditlari monitoringini nazorat qilishbo'limi\",\n" +
//                "      \"depId\": \"50001497\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60002926\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003403\",\n" +
//                "      \"pinfl\": \"53006056490019\",\n" +
//                "      \"name\": \"Abdurafikov Sarvar Bekzodovich\",\n" +
//                "      \"depName\": \"Loyiha ofisi\",\n" +
//                "      \"depId\": \"50000030\",\n" +
//                "      \"postName\": \"Tajriba orttiruvchi\",\n" +
//                "      \"postId\": \"60004948\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003404\",\n" +
//                "      \"pinfl\": \"51809017140031\",\n" +
//                "      \"name\": \"Raximov Otabek Ulug'bek o'g'li\",\n" +
//                "      \"depName\": \"Call center bo'limi\",\n" +
//                "      \"depId\": \"50001024\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003405\",\n" +
//                "      \"pinfl\": \"52104016840074\",\n" +
//                "      \"name\": \"Madaminov Avazbek O'tkir o'g'li\",\n" +
//                "      \"depName\": \"\",\n" +
//                "      \"depId\": \"\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003406\",\n" +
//                "      \"pinfl\": \"60504026590047\",\n" +
//                "      \"name\": \"Turdiqulova Gulshodabonu Toshtemir qizi\",\n" +
//                "      \"depName\": \"Call center bo'limi\",\n" +
//                "      \"depId\": \"50001024\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003411\",\n" +
//                "      \"pinfl\": \"52205018660045\",\n" +
//                "      \"name\": \"Egamnazarov Xasan Baxtiyor o'g'li\",\n" +
//                "      \"depName\": \"Ekvayer va emissiya uskunalarni texnik qo’llab-quvvatlash va hisobiniyuritish bo’limi\",\n" +
//                "      \"depId\": \"50001539\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60004953\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003412\",\n" +
//                "      \"pinfl\": \"30609922110018\",\n" +
//                "      \"name\": \"Mamatov Muzaffarxon Nuriddinxon o'g'li\",\n" +
//                "      \"depName\": \"Bankrot korxonalar bilan ishlash bo'limi\",\n" +
//                "      \"depId\": \"50001589\",\n" +
//                "      \"postName\": \"Bosh yuriskonsul`t\",\n" +
//                "      \"postId\": \"60004864\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003415\",\n" +
//                "      \"pinfl\": \"32709790660047\",\n" +
//                "      \"name\": \"Tashmatov Maxamadali Ismoilovich\",\n" +
//                "      \"depName\": \"Xavfsizlik tartiboti va nazorat bo'limi\",\n" +
//                "      \"depId\": \"50000977\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003419\",\n" +
//                "      \"pinfl\": \"51411015470038\",\n" +
//                "      \"name\": \"Xayitboyev Nurali Sherali o'g'li\",\n" +
//                "      \"depName\": \"Soft collection bo'limi\",\n" +
//                "      \"depId\": \"50001026\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003420\",\n" +
//                "      \"pinfl\": \"40808906530027\",\n" +
//                "      \"name\": \"Kononova Yuliya Vladimorovna\",\n" +
//                "      \"depName\": \"Chakana biznes departamenti\",\n" +
//                "      \"depId\": \"50000041\",\n" +
//                "      \"postName\": \"Departament direktori o'rinbosari\",\n" +
//                "      \"postId\": \"60002664\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003422\",\n" +
//                "      \"pinfl\": \"51611036460016\",\n" +
//                "      \"name\": \"Muxtorov Shoxusan O'tkirjon o'g'li\",\n" +
//                "      \"depName\": \"Call center bo'limi\",\n" +
//                "      \"depId\": \"50001024\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003423\",\n" +
//                "      \"pinfl\": \"33105866600024\",\n" +
//                "      \"name\": \"Maslov Nikita Aleksandrovich\",\n" +
//                "      \"depName\": \"Chakana biznes departamenti\",\n" +
//                "      \"depId\": \"50000041\",\n" +
//                "      \"postName\": \"Departament direktori o'rinbosari\",\n" +
//                "      \"postId\": \"60004949\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003424\",\n" +
//                "      \"pinfl\": \"61510046500022\",\n" +
//                "      \"name\": \"Zokirova Munisa Maxkam qizi\",\n" +
//                "      \"depName\": \"Call center bo'limi\",\n" +
//                "      \"depId\": \"50001024\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003426\",\n" +
//                "      \"pinfl\": \"31810902400077\",\n" +
//                "      \"name\": \"Muxamedov Pulat Nasridinovich\",\n" +
//                "      \"depName\": \"Savdoni moliyalashtirishni rivojlantirish boshqarmasi\",\n" +
//                "      \"depId\": \"50001673\",\n" +
//                "      \"postName\": \"Bosh mutaxassis\",\n" +
//                "      \"postId\": \"60005015\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003428\",\n" +
//                "      \"pinfl\": \"61204016530048\",\n" +
//                "      \"name\": \"Jumayeva Sevinch Shokirovna\",\n" +
//                "      \"depName\": \"Xalqaro moliya institutlari va kredit hujjatlari bilan ishlash hamdashartnomaviy ishlar boshqarmasi\",\n" +
//                "      \"depId\": \"50001591\",\n" +
//                "      \"postName\": \"Yetakchi yuriskonsul`t\",\n" +
//                "      \"postId\": \"60005028\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003429\",\n" +
//                "      \"pinfl\": \"41611975490014\",\n" +
//                "      \"name\": \"Qobilova Zarifa Djurabay qizi\",\n" +
//                "      \"depName\": \"Soft collection bo'limi\",\n" +
//                "      \"depId\": \"50001026\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003430\",\n" +
//                "      \"pinfl\": \"31204965450027\",\n" +
//                "      \"name\": \"Eshonqulov Shuhratjon Qo'chqar o'g'li\",\n" +
//                "      \"depName\": \"Axborot xavfsizligi bo'limi\",\n" +
//                "      \"depId\": \"50000979\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60000125\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003434\",\n" +
//                "      \"pinfl\": \"31710976570015\",\n" +
//                "      \"name\": \"Xolmatov Shahzod Sherzod o'g'li\",\n" +
//                "      \"depName\": \"Kredit bo'lmagan maxsulotlar ishlab chiqish boshqarmasi\",\n" +
//                "      \"depId\": \"50001540\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60005026\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003436\",\n" +
//                "      \"pinfl\": \"32607965080037\",\n" +
//                "      \"name\": \"Buvashev Sardorbek Obobakirjon o'g'li\",\n" +
//                "      \"depName\": \"DevOps muhandislari bo'limi\",\n" +
//                "      \"depId\": \"50001613\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60005055\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003441\",\n" +
//                "      \"pinfl\": \"32406996600012\",\n" +
//                "      \"name\": \"Kanayev Doston Baxodir o'g'li\",\n" +
//                "      \"depName\": \"Data Engineering va Sun'iy Intellekt texnologiyalari bo'limi\",\n" +
//                "      \"depId\": \"50001605\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60005063\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003444\",\n" +
//                "      \"pinfl\": \"32111920760017\",\n" +
//                "      \"name\": \"Qayumov Olimjon Abduqaxxor o'g'li\",\n" +
//                "      \"depName\": \"Boshqaruv hujjatlari bilan ishlash va kotibiyat boshqarmasi\",\n" +
//                "      \"depId\": \"50001564\",\n" +
//                "      \"postName\": \"Referent\",\n" +
//                "      \"postId\": \"60003499\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003452\",\n" +
//                "      \"pinfl\": \"32710966690016\",\n" +
//                "      \"name\": \"Raximjonov Temur Sobirjon o'g'li\",\n" +
//                "      \"depName\": \"Soliq hisobi va hisobotlari boshqarmasi\",\n" +
//                "      \"depId\": \"50001035\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003457\",\n" +
//                "      \"pinfl\": \"51801035900011\",\n" +
//                "      \"name\": \"Sobirov Javlonbek Iminbek o'g'li\",\n" +
//                "      \"depName\": \"Raqamli ishlab chiqarish bo'limi\",\n" +
//                "      \"depId\": \"50001581\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60005133\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003458\",\n" +
//                "      \"pinfl\": \"51301006040031\",\n" +
//                "      \"name\": \"Muxtarov Nizomiddin Abdumajid o'g'li\",\n" +
//                "      \"depName\": \"Axborot xavfsizligi bo'limi\",\n" +
//                "      \"depId\": \"50000979\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60005134\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003459\",\n" +
//                "      \"pinfl\": \"51305036090015\",\n" +
//                "      \"name\": \"Polvonov Murodjon Mamatmurod o'g'li\",\n" +
//                "      \"depName\": \"Raqamli ishlab chiqarish bo'limi\",\n" +
//                "      \"depId\": \"50001581\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60005133\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003460\",\n" +
//                "      \"pinfl\": \"50203036320019\",\n" +
//                "      \"name\": \"Omonturdiyev Azamat Sharifjon\",\n" +
//                "      \"depName\": \"Farmatsevtika loyihalarini moliyalashtirish markazi\",\n" +
//                "      \"depId\": \"50001537\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60005137\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003461\",\n" +
//                "      \"pinfl\": \"52504056580040\",\n" +
//                "      \"name\": \"Ibrohimov Botirjon Shokirjon o'g'li\",\n" +
//                "      \"depName\": \"Xalqaro reyting agentliklari va korrespondent-banklar bilanishlash bo'limi\",\n" +
//                "      \"depId\": \"50001647\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60005132\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003462\",\n" +
//                "      \"pinfl\": \"50906055760025\",\n" +
//                "      \"name\": \"Abdisamatov Bekuzzamon Bexzod o'g'li\",\n" +
//                "      \"depName\": \"Savdoni moliyalashtirish bo'limi\",\n" +
//                "      \"depId\": \"50001071\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60005135\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003467\",\n" +
//                "      \"pinfl\": \"63005046530015\",\n" +
//                "      \"name\": \"Jurayeva Mavluda Obid qizi\",\n" +
//                "      \"depName\": \"Call center bo'limi\",\n" +
//                "      \"depId\": \"50001024\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003470\",\n" +
//                "      \"pinfl\": \"43003940170089\",\n" +
//                "      \"name\": \"Akramova Zuxra xon Shuxratovna\",\n" +
//                "      \"depName\": \"Bank xizmatlari markazlarini rivojlantirish bo'limi\",\n" +
//                "      \"depId\": \"50001029\",\n" +
//                "      \"postName\": \"Menedjer\",\n" +
//                "      \"postId\": \"60002491\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003471\",\n" +
//                "      \"pinfl\": \"31806997100028\",\n" +
//                "      \"name\": \"Yuldashov Mukhammadjon Muzaffar o'g'li\",\n" +
//                "      \"depName\": \"Soft collection bo'limi\",\n" +
//                "      \"depId\": \"50001026\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003475\",\n" +
//                "      \"pinfl\": \"52306026290016\",\n" +
//                "      \"name\": \"Ergashev Akmal Sherali o'g'li\",\n" +
//                "      \"depName\": \"Dasturiy ta'minotlarni joriy etish va qo'llab-quvvatlash boshqarmasi\",\n" +
//                "      \"depId\": \"50001614\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60005176\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003478\",\n" +
//                "      \"pinfl\": \"31705850600050\",\n" +
//                "      \"name\": \"Narimov Farxod Ravshanovish\",\n" +
//                "      \"depName\": \"Buxgalteriya hisobi va moliyaviy nazorat departamenti\",\n" +
//                "      \"depId\": \"50000043\",\n" +
//                "      \"postName\": \"Departament direktori o'rinbosari - Bosh buxgalter o'rinbosari\",\n" +
//                "      \"postId\": \"60005128\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003479\",\n" +
//                "      \"pinfl\": \"51406017160018\",\n" +
//                "      \"name\": \"Yuldoshev Maratbek Shokirjon og'li\",\n" +
//                "      \"depName\": \"Sifat nazorati bo'limi\",\n" +
//                "      \"depId\": \"50001548\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60005182\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003480\",\n" +
//                "      \"pinfl\": \"50702046520010\",\n" +
//                "      \"name\": \"Asatullayev Doston Dishodovich\",\n" +
//                "      \"depName\": \"Raqamli kanallar bo'limi\",\n" +
//                "      \"depId\": \"50001545\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60005184\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003481\",\n" +
//                "      \"pinfl\": \"61311047190025\",\n" +
//                "      \"name\": \"Ergashova Xamidaxon Akmalovna\",\n" +
//                "      \"depName\": \"Sifat nazorati bo'limi\",\n" +
//                "      \"depId\": \"50001548\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60005183\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003482\",\n" +
//                "      \"pinfl\": \"30606882900042\",\n" +
//                "      \"name\": \"Xolmatov Saidkul Allamuratovich\",\n" +
//                "      \"depName\": \"Farmatsevtika loyihalarini moliyalashtirish markazi\",\n" +
//                "      \"depId\": \"50001537\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003483\",\n" +
//                "      \"pinfl\": \"61308016570018\",\n" +
//                "      \"name\": \"Xolmatova Munisa Mansur qizi\",\n" +
//                "      \"depName\": \"Kredit bo'lmagan maxsulotlar ishlab chiqish boshqarmasi\",\n" +
//                "      \"depId\": \"50001540\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60005178\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003484\",\n" +
//                "      \"pinfl\": \"61003006560030\",\n" +
//                "      \"name\": \"Kamalova Vazira Akmal qizi\",\n" +
//                "      \"depName\": \"Kredit bo'lmagan maxsulotlar ishlab chiqish boshqarmasi\",\n" +
//                "      \"depId\": \"50001540\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60005179\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003485\",\n" +
//                "      \"pinfl\": \"43011927340026\",\n" +
//                "      \"name\": \"Joldasova Farida Alliyarovna\",\n" +
//                "      \"depName\": \"Kredit mahsulotlarini ishlab chiqish boshqarmasi\",\n" +
//                "      \"depId\": \"50001020\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60003361\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003486\",\n" +
//                "      \"pinfl\": \"31402953450082\",\n" +
//                "      \"name\": \"Pirjanov Abdirasulla Baxtiyarovich\",\n" +
//                "      \"depName\": \"Kredit bo'lmagan maxsulotlar ishlab chiqish boshqarmasi\",\n" +
//                "      \"depId\": \"50001540\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60005180\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003489\",\n" +
//                "      \"pinfl\": \"32509880070026\",\n" +
//                "      \"name\": \"Musadjanov Latif Rustamovich\",\n" +
//                "      \"depName\": \"Kredit bo'lmagan maxsulotlar ishlab chiqish boshqarmasi\",\n" +
//                "      \"depId\": \"50001540\",\n" +
//                "      \"postName\": \"Ekspert\",\n" +
//                "      \"postId\": \"60005188\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003490\",\n" +
//                "      \"pinfl\": \"32205926520035\",\n" +
//                "      \"name\": \"Andreyv Ruslan Aleksandrovich\",\n" +
//                "      \"depName\": \"O'qitish va rivojlantirish boshqarmasi\",\n" +
//                "      \"depId\": \"50000982\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003492\",\n" +
//                "      \"pinfl\": \"31504986850014\",\n" +
//                "      \"name\": \"Abdusamatov Jahongir Shavket o'g'li\",\n" +
//                "      \"depName\": \"Soft collection bo'limi\",\n" +
//                "      \"depId\": \"50001026\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003495\",\n" +
//                "      \"pinfl\": \"61501005740041\",\n" +
//                "      \"name\": \"Raimova Xulkar Farxod qizi\",\n" +
//                "      \"depName\": \"Telemarketing bo'limi\",\n" +
//                "      \"depId\": \"50001025\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60003290\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003496\",\n" +
//                "      \"pinfl\": \"51401025540014\",\n" +
//                "      \"name\": \"Abdullayev Askarjon Otabek o'g'li\",\n" +
//                "      \"depName\": \"Omnikanal tizimlarini rivojlantirish bo'limi\",\n" +
//                "      \"depId\": \"50001608\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60005193\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003499\",\n" +
//                "      \"pinfl\": \"51006056260041\",\n" +
//                "      \"name\": \"Normurodov Og'abek Ahtam o'g'li\",\n" +
//                "      \"depName\": \"Ekspert-tahlil guruhi\",\n" +
//                "      \"depId\": \"50000964\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60005175\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003502\",\n" +
//                "      \"pinfl\": \"30401952720030\",\n" +
//                "      \"name\": \"Choriyev Husniddin Jumanazar o'g'li\",\n" +
//                "      \"depName\": \"Qarzdorliklarni sud tartibida undirish bo'limi\",\n" +
//                "      \"depId\": \"50001587\",\n" +
//                "      \"postName\": \"Bosh yuriskonsul`t\",\n" +
//                "      \"postId\": \"60005194\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003503\",\n" +
//                "      \"pinfl\": \"32903930830028\",\n" +
//                "      \"name\": \"Nurmanov Sherzod Sobirgali o'g'li\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"Elektrik\",\n" +
//                "      \"postId\": \"60000576\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003508\",\n" +
//                "      \"pinfl\": \"51409037150014\",\n" +
//                "      \"name\": \"Abdullayev Anvar G'ayrat o'g'li\",\n" +
//                "      \"depName\": \"Byudjetni rejalashtirish va nazorat qilish boshqarmasi\",\n" +
//                "      \"depId\": \"50001492\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60005205\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003509\",\n" +
//                "      \"pinfl\": \"52109016670030\",\n" +
//                "      \"name\": \"Sag'dullayev Yorqin Asatilla o'g'li\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003510\",\n" +
//                "      \"pinfl\": \"31210966750073\",\n" +
//                "      \"name\": \"Turgunov Azizxo'ja Nuriddin o'g'li\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003511\",\n" +
//                "      \"pinfl\": \"43006868680018\",\n" +
//                "      \"name\": \"Zufarova Shaxzoda Sherzodovna\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003512\",\n" +
//                "      \"pinfl\": \"41003820211244\",\n" +
//                "      \"name\": \"Usmanova Feruza Gapirjonovna\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003513\",\n" +
//                "      \"pinfl\": \"31206710250029\",\n" +
//                "      \"name\": \"Vaxabov Mamirjon Patixovich\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003514\",\n" +
//                "      \"pinfl\": \"32607902600036\",\n" +
//                "      \"name\": \"Meyliyev Elbek Abdimurodovich\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003515\",\n" +
//                "      \"pinfl\": \"30409790210018\",\n" +
//                "      \"name\": \"Ashirov Yakubjon Ilxamovich\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003516\",\n" +
//                "      \"pinfl\": \"30206854250058\",\n" +
//                "      \"name\": \"Sheraliyev Abduvoxid Abduvoxobovich\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003517\",\n" +
//                "      \"pinfl\": \"41101890720045\",\n" +
//                "      \"name\": \"Nosirova Naima Akrom qizi\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003518\",\n" +
//                "      \"pinfl\": \"41608736590012\",\n" +
//                "      \"name\": \"Axmedova Muxtabar Shakirovna\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003519\",\n" +
//                "      \"pinfl\": \"41006900261461\",\n" +
//                "      \"name\": \"Tuxliyeva Surayyo Talipovna\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003520\",\n" +
//                "      \"pinfl\": \"40608850050037\",\n" +
//                "      \"name\": \"Bakirova Mashkura Tuxtapulatovna\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003521\",\n" +
//                "      \"pinfl\": \"31111600190036\",\n" +
//                "      \"name\": \"Aliyev Boxodir Mansurovich\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003522\",\n" +
//                "      \"pinfl\": \"51106045850034\",\n" +
//                "      \"name\": \"Murodillayev Lazizjon Akromjon o'g'li\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003523\",\n" +
//                "      \"pinfl\": \"42608840200026\",\n" +
//                "      \"name\": \"Alimova Barno Nigmatullayevna\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003524\",\n" +
//                "      \"pinfl\": \"42607810170013\",\n" +
//                "      \"name\": \"Rasulova Gulnora Axmadjanovna\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003525\",\n" +
//                "      \"pinfl\": \"30404893150027\",\n" +
//                "      \"name\": \"Yusupov Izzat Ikromjonovich\",\n" +
//                "      \"depName\": \"Xavfsizlik tartiboti va nazorat bo'limi\",\n" +
//                "      \"depId\": \"50000977\",\n" +
//                "      \"postName\": \"Bosh mutaxassis (Urganch BXM bo'yicha)\",\n" +
//                "      \"postId\": \"60005212\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003526\",\n" +
//                "      \"pinfl\": \"31406696800018\",\n" +
//                "      \"name\": \"Isakov Sadridin Abdukarimovich\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003527\",\n" +
//                "      \"pinfl\": \"41203890171284\",\n" +
//                "      \"name\": \"Shamansurova Barno Abdusattarovna\",\n" +
//                "      \"depName\": \"Binodan foydalanish bo'limi\",\n" +
//                "      \"depId\": \"50001055\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003536\",\n" +
//                "      \"pinfl\": \"51201017250022\",\n" +
//                "      \"name\": \"Sadullayev Bekzod Baxram og'li\",\n" +
//                "      \"depName\": \"Ekspert-tahlil guruhi\",\n" +
//                "      \"depId\": \"50000964\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60005175\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003537\",\n" +
//                "      \"pinfl\": \"60307026520076\",\n" +
//                "      \"name\": \"Jamolova Sevara Saydaxmad qizi\",\n" +
//                "      \"depName\": \"Bank xizmatlari markazlarini rivojlantirish bo'limi\",\n" +
//                "      \"depId\": \"50001029\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60005215\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003539\",\n" +
//                "      \"pinfl\": \"52102035980016\",\n" +
//                "      \"name\": \"Abdumajidov Xurshid Abduhalim o'g'li\",\n" +
//                "      \"depName\": \"Savdoni moliyalashtirish bo'limi\",\n" +
//                "      \"depId\": \"50001071\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60005135\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003540\",\n" +
//                "      \"pinfl\": \"51707036600018\",\n" +
//                "      \"name\": \"Abduraxmonov Shaxzod Farrux o'g'li\",\n" +
//                "      \"depName\": \"Kichik biznes uchun mahsulotlarni ishlab chiqish va joriy qilishboshqarmasi\",\n" +
//                "      \"depId\": \"50001079\",\n" +
//                "      \"postName\": \"Mutaxassis\",\n" +
//                "      \"postId\": \"60005222\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003541\",\n" +
//                "      \"pinfl\": \"40610910261725\",\n" +
//                "      \"name\": \"Sandiboyeva Mohinur Qo'ldosh qizi\",\n" +
//                "      \"depName\": \"Ekspert-tahlil guruhi\",\n" +
//                "      \"depId\": \"50000964\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003545\",\n" +
//                "      \"pinfl\": \"31804996180025\",\n" +
//                "      \"name\": \"Xotamboyev Shaxzod Ixtiyor\",\n" +
//                "      \"depName\": \"Farmatsevtika loyihalarini moliyalashtirish markazi\",\n" +
//                "      \"depId\": \"50001537\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60004903\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003547\",\n" +
//                "      \"pinfl\": \"51011025580046\",\n" +
//                "      \"name\": \"Ne'matov Doniyorbek Ismatillo o'g'li\",\n" +
//                "      \"depName\": \"Bank dasturiy ta'minotlarni qo'llab-quvvatlash bo'limi\",\n" +
//                "      \"depId\": \"50001617\",\n" +
//                "      \"postName\": \"Tajriba orttiruvchi\",\n" +
//                "      \"postId\": \"60005197\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003549\",\n" +
//                "      \"pinfl\": \"51711056610049\",\n" +
//                "      \"name\": \"Raximov Azizbek Toxirjon o'g'li\",\n" +
//                "      \"depName\": \"Call center bo'limi\",\n" +
//                "      \"depId\": \"50001024\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003550\",\n" +
//                "      \"pinfl\": \"62210026590045\",\n" +
//                "      \"name\": \"Mendaliyeva Aziza Timurovna\",\n" +
//                "      \"depName\": \"Call center bo'limi\",\n" +
//                "      \"depId\": \"50001024\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003551\",\n" +
//                "      \"pinfl\": \"62010045450014\",\n" +
//                "      \"name\": \"Murodqosimova Sevinch Jalilovna\",\n" +
//                "      \"depName\": \"Call center bo'limi\",\n" +
//                "      \"depId\": \"50001024\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003552\",\n" +
//                "      \"pinfl\": \"33007965550076\",\n" +
//                "      \"name\": \"Pardayev Shamshodbek Xolmatovich\",\n" +
//                "      \"depName\": \"Call center bo'limi\",\n" +
//                "      \"depId\": \"50001024\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003553\",\n" +
//                "      \"pinfl\": \"51902006450048\",\n" +
//                "      \"name\": \"Murodinov Murodin Raxmatboy o'g'li\",\n" +
//                "      \"depName\": \"Call center bo'limi\",\n" +
//                "      \"depId\": \"50001024\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003555\",\n" +
//                "      \"pinfl\": \"41706906600023\",\n" +
//                "      \"name\": \"Jumikova Madina Bolatovna\",\n" +
//                "      \"depName\": \"Telemarketing bo'limi\",\n" +
//                "      \"depId\": \"50001025\",\n" +
//                "      \"postName\": \"Bo'lim boshlig'i\",\n" +
//                "      \"postId\": \"60005274\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003556\",\n" +
//                "      \"pinfl\": \"31902863910066\",\n" +
//                "      \"name\": \"Yaxshiboyev Akbar Ibrohimovich\",\n" +
//                "      \"depName\": \"Ekspert-tahlil guruhi\",\n" +
//                "      \"depId\": \"50000964\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003558\",\n" +
//                "      \"pinfl\": \"51104025840020\",\n" +
//                "      \"name\": \"G'aybullayev Quvonchbek Abdumajid o'g'li\",\n" +
//                "      \"depName\": \"Matbuot markazi\",\n" +
//                "      \"depId\": \"50000027\",\n" +
//                "      \"postName\": \"Yetakchi mutaxassis\",\n" +
//                "      \"postId\": \"60005291\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003591\",\n" +
//                "      \"pinfl\": \"42108830270092\",\n" +
//                "      \"name\": \"Sadikova Dildora Baxtiyerovna\",\n" +
//                "      \"depName\": \"Soft collection bo'limi\",\n" +
//                "      \"depId\": \"50001026\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003592\",\n" +
//                "      \"pinfl\": \"52308056540174\",\n" +
//                "      \"name\": \"Obidjoniv Komronbek Yodgorovich\",\n" +
//                "      \"depName\": \"Soft collection bo'limi\",\n" +
//                "      \"depId\": \"50001026\",\n" +
//                "      \"postName\": \"ГПХ\",\n" +
//                "      \"postId\": \"99999999\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"codeFilial\": \"00873\",\n" +
//                "      \"empTabNum\": \"00003623\",\n" +
//                "      \"pinfl\": \"30608872880053\",\n" +
//                "      \"name\": \"Begaliyev Furkat Abdualimovich\",\n" +
//                "      \"depName\": \"Tranzaktsiya mahsulotlarini sotish boshqarmasi\",\n" +
//                "      \"depId\": \"50001078\",\n" +
//                "      \"postName\": \"Menedjer\",\n" +
//                "      \"postId\": \"60005224\"\n" +
//                "    }\n" +
//                "  ]\n" +
//                "}";
//    }
//
//
//}
