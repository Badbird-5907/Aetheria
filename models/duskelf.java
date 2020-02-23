//Made with Blockbench
//Paste this code into your mod.

import org.lwjgl.opengl.GL11;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class steve extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer rightear;
	private final ModelRenderer leftear;

	public steve() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head, 0.0F, 3.1416F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(Body, 0.0F, 3.1416F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.cubeList.add(new ModelBox(RightArm, 24, 24, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 32, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeg, 0.0F, 3.1416F, 0.0F);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 36, 36, -2.1F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeg, 0.0F, 3.1416F, 0.0F);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 32, 0, -1.9F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		rightear = new ModelRenderer(this);
		rightear.setRotationPoint(4.0F, -3.0F, 0.0F);
		setRotationAngle(rightear, 0.0F, -0.4363F, 0.0F);
		rightear.cubeList.add(new ModelBox(rightear, 0, 0, -1.0F, -2.0F, 0.0F, 2, 3, 1, 0.0F, false));
		rightear.cubeList.add(new ModelBox(rightear, 0, 4, 1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));
		rightear.cubeList.add(new ModelBox(rightear, 20, 16, 1.0F, -2.0F, 0.0F, 4, 1, 1, 0.0F, false));

		leftear = new ModelRenderer(this);
		leftear.setRotationPoint(-4.0F, -3.0F, 0.0F);
		setRotationAngle(leftear, 0.0F, 0.4363F, 0.0F);
		leftear.cubeList.add(new ModelBox(leftear, 0, 0, -1.0F, -2.0F, 0.0F, 2, 3, 1, 0.0F, false));
		leftear.cubeList.add(new ModelBox(leftear, 0, 4, -2.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));
		leftear.cubeList.add(new ModelBox(leftear, 20, 16, -5.0F, -2.0F, 0.0F, 4, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Head.render(f5);
		Body.render(f5);
		RightArm.render(f5);
		LeftArm.render(f5);
		RightLeg.render(f5);
		LeftLeg.render(f5);
		rightear.render(f5);
		leftear.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}