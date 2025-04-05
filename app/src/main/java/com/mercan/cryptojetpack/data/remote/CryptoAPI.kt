package com.mercan.cryptojetpack.data.remote

import com.mercan.cryptojetpack.data.remote.dto.CryptoDto
import com.mercan.cryptojetpack.util.Constants.API_KEY
import com.mercan.cryptojetpack.util.Constants.CONTENT_TYPE
import retrofit2.http.GET
import retrofit2.http.Header

interface CryptoAPI {
    @GET("economy/cripto")
    suspend fun getCrypto(
        @Header("content-type") type: String = CONTENT_TYPE,
        @Header("authorization") apiKey: String = API_KEY,
    ): CryptoDto
}