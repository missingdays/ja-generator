/**
 * Created by missingdays on 03.12.16.
 */

package ja.generator

import org.json.JSONObject

class Circle : Figure{
    var radius = 0

    constructor() : super()

    override fun toJSON() : JSONObject{
        val obj = super.toJSON()

        obj.put("type", "circle")
        obj.put("radius", radius)

        return obj
    }
}