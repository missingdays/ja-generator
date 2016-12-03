
package ja.generator

import java.awt.Color
import java.io.PrintWriter

fun main(args : Array<String>){
    val vg = VisualGenerator()

    var tick : Long = 0
    for(x in 100..200){
        val circle = Circle()
        circle.radius = 40
        circle.borderColor = Color.red
        circle.x = x
        circle.y = x

        vg.addEvent(tick, Event(tick, circle))
        tick++
    }

    PrintWriter("example/simple.json").use {
        it.print(vg.toJSON().toString())
    }
}