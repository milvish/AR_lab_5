package com.google.ar.core.codelabs.hellogeospatial.helpers

import kotlinx.serialization.Serializable


@Serializable
data class JsonAnchor(val lat: Double,
                      val lon: Double,
                      val alt: Double,
                      val qx: Float,
                      val qy: Float,
                      val qz: Float,
                      val qw: Float)
