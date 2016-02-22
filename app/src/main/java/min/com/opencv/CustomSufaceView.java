package min.com.opencv;

import android.content.Context;
import android.hardware.Camera;
import android.hardware.Camera.Size;
import android.util.AttributeSet;
import org.opencv.android.JavaCameraView;

public class CustomSufaceView extends JavaCameraView {

    public CustomSufaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Camera.Parameters getParameters(){
    	Camera.Parameters params = mCamera.getParameters();
    	return params;
    }

    public void setParameters(Camera.Parameters params){
    	mCamera.setParameters(params);
    }

    public Size getResolution() {
        return mCamera.getParameters().getPreviewSize();
    }
}
