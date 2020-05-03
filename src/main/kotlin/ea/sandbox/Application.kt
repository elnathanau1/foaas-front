package ea.sandbox

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("ea.sandbox")
                .mainClass(Application.javaClass)
                .start()
    }
}