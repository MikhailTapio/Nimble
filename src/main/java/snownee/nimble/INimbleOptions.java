package snownee.nimble;

import net.minecraft.client.CameraType;

public interface INimbleOptions {

	CameraType getOriginalCameraType();

	void setOriginalCameraType(CameraType mode);

}
