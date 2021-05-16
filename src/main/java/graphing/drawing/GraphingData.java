/**
 * This class is for converting data into minecraft Vertex form
 * @author nicholas Blackburn
 */

package graphing.drawing;

import com.mojang.blaze3d.platform.GlStateManager;

import net.minecraft.util.math.vector.Vector2f;

public class GraphingData {
    
    private Vector2f vector2d;
    
    public void dataVertex(Double x, Double y){
        vector2d = new Vector2f(x.floatValue(), y.floatValue());
    
    }

    
}
