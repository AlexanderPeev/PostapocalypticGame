/**
 * TODO Write file description here. 
 * First generated: 4.08.2015 г. 15:40:04
 */
package com.alexanderpeev.projects.java.games.pa.game;

import com.jme3.app.SimpleApplication;
import com.jme3.light.AmbientLight;
import com.jme3.light.PointLight;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.renderer.RenderManager;
import com.jme3.renderer.queue.RenderQueue;
import com.jme3.scene.Geometry;
import com.jme3.scene.LightNode;
import com.jme3.scene.shape.Box;

public class Hello3d extends SimpleApplication {

	public Hello3d() {

		// TODO: JMonkeyEngine Test

	}

	@Override
	public void simpleInitApp() {
		Vector3f floorMin = new Vector3f(-100F, -5F, -100F), floorMax = new Vector3f(
				100F, -0.5F, 100F), itemMin = new Vector3f(-0.5F, 0F, -0.5F), itemMax = new Vector3f(
				0.5F, 1.0F, 0.5F), cameraPos = new Vector3f(0F, 2F, 10F), lightPos = new Vector3f(
				-50F, 20F, 10F);

		Box boxFloor = new Box(floorMin, floorMax);
		Geometry geomFloor = new Geometry("Floor", boxFloor);

		Material matFloor = new Material(assetManager,
				"Common/MatDefs/Misc/Unshaded.j3md");
		matFloor.setColor("Color", ColorRGBA.Gray);
		geomFloor.setMaterial(matFloor);

		rootNode.attachChild(geomFloor);

		Box boxItem = new Box(itemMin, itemMax);
		Geometry geomItem = new Geometry("Item", boxItem);

		Material mat = new Material(assetManager,
				"Common/MatDefs/Misc/Unshaded.j3md");
		mat.setColor("Color", ColorRGBA.Green);
		geomItem.setMaterial(mat);

		rootNode.attachChild(geomItem);

		AmbientLight ambLight = new AmbientLight();

		ambLight.setColor(ColorRGBA.Cyan);

		LightNode lightAmb = new LightNode("AmbLight", ambLight);

		lightAmb.setShadowMode(RenderQueue.ShadowMode.CastAndReceive);

		rootNode.attachChild(lightAmb);

		PointLight topLight = new PointLight();

		topLight.setColor(ColorRGBA.Yellow);
		topLight.setPosition(lightPos);
		topLight.setRadius(300);

		LightNode light = new LightNode("Light", topLight);

		light.setShadowMode(RenderQueue.ShadowMode.CastAndReceive);

		rootNode.attachChild(light);

		cam.setLocation(cameraPos);

	}

	@Override
	public void simpleUpdate(float tpf) {
		// TODO: add update code
	}

	@Override
	public void simpleRender(RenderManager rm) {
		// TODO: add render code
	}

	public static void main(String[] args) {

		Hello3d app = new Hello3d();

		app.start();

	}

}