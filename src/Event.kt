/**
 * Created by missingdays on 02.12.16.
 */

package ja.generator

import org.json.JSONObject

class Event{
    val tick : Long
    val figure : Figure

    constructor(tick : Long, figure : Figure){
        this.tick = tick
        this.figure = figure
    }

    fun toJSON() : JSONObject {
        val obj = JSONObject()

        obj.put("tick", tick)
        obj.put("figure", figure.toJSON())

        return obj
    }
}