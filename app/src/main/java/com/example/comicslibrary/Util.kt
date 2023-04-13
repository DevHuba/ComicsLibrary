package com.example.comicslibrary

import java.math.BigInteger
import java.security.MessageDigest

fun getHash(timestamp: String, privateKey: String, publicKey: String): String {
    val hashStr = timestamp + privateKey + publicKey
    val messageDigest = MessageDigest.getInstance("MD5")
    return BigInteger(
        1, messageDigest.digest(hashStr.toByteArray())
    ).toString(16).padStart(32, '0')
}