/**
 * Created by missingdays on 04.12.16.
 */

package ja.generator

import org.json.JSONObject

class Rectangle : Figure {
    constructor()

    var size : Size = Size(0, 0)

    override fun toJSON(): JSONObject {
        val obj = super.toJSON()
        obj.put("width", size.width)
        obj.put("height", size.height)
        return obj
    }
}