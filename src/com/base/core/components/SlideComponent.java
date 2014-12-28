package com.base.core.components;

public class SlideComponent extends GameComponent{
	public float mx, my, mz;
	
	public SlideComponent(float x, float y, float z)
	{
		mx = x;
		my = y;
		mz = z;
	}
	
	public void update()
	{
		parentTransform.x += mx * parentObject.engine.getDeltaTime();
		parentTransform.y += my * parentObject.engine.getDeltaTime();
		parentTransform.z += mz * parentObject.engine.getDeltaTime();
		System.out.println(parentTransform.x);
	}
}
