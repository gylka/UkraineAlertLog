package net.gylka.ukrainealertlog

enum class Region(svgIds: Set<String>, telegramTag: String) {
    CherkasyOblast(setOf("Cherkasy Oblast"), ""),
    ChernihivOblast(setOf("Chernihiv Oblast"), ""),
    ChernivtsiOblast(setOf("Chernivtsi Oblast"), ""),
    Crimea(setOf("Crimea", "Sevastopol"), ""),
    DnipropetrovskOblast(setOf("Dnipropetrovsk Oblast"), ""),
    DonetskOblast(setOf("Donetsk Oblast"), ""),
    IvanoFrankivskOblast(setOf("Ivano-Frankivsk Oblast"), ""),
    KharkivOblast(setOf("Kharkiv Oblast"), ""),
    KhersonOblast(setOf("Kherson Oblast"), ""),
    KhmelnytskyiOblast(setOf("Khmelnytskyi Oblast"), ""),
    KirovohradOblast(setOf("Kirovohrad Oblast"), ""),
    KyivOblast(setOf("Kyiv", "Kyiv Oblast"), ""),
    LuhanskOblast(setOf("Luhansk Oblast"), ""),
    LvivOblast(setOf("Lviv Oblast"), ""),
    MykolaivOblast(setOf("Mykolaiv Oblast"), ""),
    OdesaOblast(setOf("Odesa Oblast"), ""),
    PoltavaOblast(setOf("Poltava Oblast"), ""),
    RivneOblast(setOf("Rivne Oblast"), ""),
    SumyOblast(setOf("Sumy Oblast"), ""),
    TernopilOblast(setOf("Ternopil Oblast"), ""),
    VinnytsyaOblast(setOf("Vinnytsya Oblast"), ""),
    VolynOblast(setOf("Volyn Oblast"), ""),
    ZakarpattiaOblast(setOf("Zakarpattia Oblast"), ""),
    ZaporizhzhiaOblast(setOf("Zaporizhzhia Oblast"), ""),
    ZhytomyrOblast(setOf("Zhytomyr Oblast"), "")
}