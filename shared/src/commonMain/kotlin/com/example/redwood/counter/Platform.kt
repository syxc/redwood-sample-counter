package com.example.redwood.counter

interface Platform {
  val name: String
}

expect fun getPlatform(): Platform
