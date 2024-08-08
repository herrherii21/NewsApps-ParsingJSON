package com.example.newsapps

    //Nama        : Heri ;
    //NIM         : 10121914 ;
    //Kelas       : IF9K ;
    //Mata Kuliah : Pemrograman Android ;
    //Dosen       : Rizki Adam Kurniawan S.Kom., M.Kom. ;
    //Selesai     : 08 Agustus 2024. 14:00 ;

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("top-headlines?country=id&apiKey=0d3a4ce30fb941858f391a7d09abf157")
    fun getTopHeadlines(): Call<ArticleResponse>
}
