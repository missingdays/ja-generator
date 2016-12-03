/**
 * Created by missingdays on 02.12.16.
 */

package ja.generator

import org.json.JSONArray
import org.json.JSONObject
import java.io.StringWriter
import java.util.*

class VisualGenerator {
    val eventMap : HashMap<Long, MutableList<Event>> = HashMap()

    fun addEvent(tick : Long, event : Event){
        if(!eventMap.contains(tick)){
            eventMap.put(tick, mutableListOf<Event>())
        }

        eventMap[tick]?.add(event)
    }

    fun toJSON() : JSONObject {
        val obj = JSONObject()
        val eventArray = JSONArray()

        for((tick, events) in eventMap){
            for(event in events){
                eventArray.put(event.toJSON())
            }
        }

        obj.put("data", eventArray)

        return obj
    }

}