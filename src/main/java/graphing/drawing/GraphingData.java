/**
 * This class is for converting data into minecraft Vertex form
 * @author nicholas Blackburn
 */

package graphing.drawing;

import java.util.ArrayList;

import com.mojang.blaze3d.platform.GlStateManager;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.math.vector.Vector2f;

public class GraphingData {
    
    private Vector2f vector2d;

    public void dataVertex(Double x, Double y){
        this.vector2d = new Vector2f(x.floatValue(), y.floatValue());
    }

    public void Graph(ArrayList <Vector2f> points, Screen gui){

    }




    
}
