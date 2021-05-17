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
    private static ArrayList <Vector2f> graphPoints;


    public GraphingData(Double x,Double y){
        this.vector2d = new Vector2f(x.floatValue(), y.floatValue());
    }

    // this is for trying to get data from the vector points and load them from the array
    public void Graph(ArrayList <Vector2f> points, Screen gui){
        for(int i = 0; i<=points.size(); i++){
            
        }
    }




    
}
