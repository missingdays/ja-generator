/**
 * Created by missingdays on 03.12.16.
 */

package ja.generator

import org.json.JSONObject
import java.awt.Color

open class Figure {
    var x : Int = 0
    var y : Int = 0
    var borderColor : Color = Color.white
    var fillColor : Color = Color.white

    open fun toJSON() : JSONObject {
        val obj = JSONObject()

        obj.put("x", x)
        obj.put("y", y)
        obj.put("borderColor", borderColor.rgb)
        obj.put("fillColor", fillColor.rgb)
        obj.put("type", "figure")

        return obj
    }
}