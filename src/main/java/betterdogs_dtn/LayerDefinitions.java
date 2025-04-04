package betterdogs_dtn;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class LayerDefinitions {

	public static LayerDefinition borzoi() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 10.0F, 6.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition borzoi_tail_full2 = real_tail.addOrReplaceChild("borzoi_tail_full2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.5753F, 0.9418F, 0.2182F, 0.0F, 0.0F));

		PartDefinition borzoi_tail_full_rot2 = borzoi_tail_full2.addOrReplaceChild("borzoi_tail_full_rot2", CubeListBuilder.create().texOffs(1990, 23).addBox(-1.0F, -1.7823F, -5.3515F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.2F))
		.texOffs(2145, 5).addBox(-1.0F, -5.1823F, -5.3515F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.0F, -0.65F, -1.25F, 0.7418F, 0.0F, 0.0F));

		PartDefinition borzoi_tail_bottom2 = borzoi_tail_full_rot2.addOrReplaceChild("borzoi_tail_bottom2", CubeListBuilder.create(), PartPose.offset(0.5F, 0.25F, -5.75F));

		PartDefinition borzoi_tail_bottom_rot2 = borzoi_tail_bottom2.addOrReplaceChild("borzoi_tail_bottom_rot2", CubeListBuilder.create().texOffs(1990, 9).addBox(-1.0F, -1.9106F, -5.2762F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.19F))
		.texOffs(2147, 20).addBox(-1.0F, -4.2906F, -5.2762F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.19F)), PartPose.offsetAndRotation(0.0F, 0.75F, 0.5F, 0.3491F, 0.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(1.75F, 15.0F, -7.5F));

		PartDefinition borzoi_leg7 = left_front_leg.addOrReplaceChild("borzoi_leg7", CubeListBuilder.create().texOffs(2193, 1).addBox(-1.0F, -2.0F, -7.05F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(2220, 0).addBox(-1.0F, 0.0F, -7.05F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.15F, 2.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-1.75F, 15.0F, -7.5F));

		PartDefinition borzoi_leg8 = right_front_leg.addOrReplaceChild("borzoi_leg8", CubeListBuilder.create().texOffs(2193, 1).mirror().addBox(-0.85F, -0.3F, -9.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(2220, 0).mirror().addBox(-0.85F, 1.7F, -9.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(1.5F, 15.0F, 5.0F));

		PartDefinition borzoi_leg6 = left_hind_leg.addOrReplaceChild("borzoi_leg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.75F, 0.0F, -0.5F, 1.5708F, 0.0F, 0.0F));

		PartDefinition borzoi_leg3_side2 = borzoi_leg6.addOrReplaceChild("borzoi_leg3_side2", CubeListBuilder.create().texOffs(1990, 17).addBox(-1.9F, -0.25F, -11.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(2105, 0).addBox(-1.9F, -1.25F, -9.0F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition borzoi_leg3_coat2 = borzoi_leg3_side2.addOrReplaceChild("borzoi_leg3_coat2", CubeListBuilder.create().texOffs(2070, 0).addBox(-1.5535F, -2.5224F, -0.3561F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(0.5035F, -3.0439F, -1.9724F, -1.5708F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-1.5F, 15.0F, 5.0F));

		PartDefinition borzoi_leg5 = right_hind_leg.addOrReplaceChild("borzoi_leg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.75F, 0.0F, -0.5F, 1.5708F, 0.0F, 0.0F));

		PartDefinition borzoi_leg4_side2 = borzoi_leg5.addOrReplaceChild("borzoi_leg4_side2", CubeListBuilder.create().texOffs(1990, 17).mirror().addBox(-0.1F, -0.25F, -11.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(2105, 0).mirror().addBox(-0.1F, -1.25F, -9.0F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition borzoi_leg4_coat2 = borzoi_leg4_side2.addOrReplaceChild("borzoi_leg4_coat2", CubeListBuilder.create().texOffs(2070, 0).mirror().addBox(0.5535F, -2.5224F, -0.3561F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5035F, -3.0439F, -1.9724F, -1.5708F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.9F, 0.9F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bone = body.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition borzoi_body_r1 = bone.addOrReplaceChild("borzoi_body_r1", CubeListBuilder.create().texOffs(2072, 16).addBox(-2.5F, -0.6F, 9.6F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.0F, 12.1F, -0.9F, 1.5708F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 4.55F, -9.2F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition borzoi_head_rot = real_head.addOrReplaceChild("borzoi_head_rot", CubeListBuilder.create(), PartPose.offset(0.0F, 21.2F, 9.2F));

		PartDefinition borzoi_head_main = borzoi_head_rot.addOrReplaceChild("borzoi_head_main", CubeListBuilder.create().texOffs(1902, 6).addBox(-2.5F, -2.5F, -3.0F, 5.0F, 5.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offset(0.0F, -20.7F, -8.2F));

		PartDefinition borzoi_head_beard = borzoi_head_rot.addOrReplaceChild("borzoi_head_beard", CubeListBuilder.create(), PartPose.offset(0.0F, -18.3F, -10.85F));

		PartDefinition borzoi_head_beard_rot = borzoi_head_beard.addOrReplaceChild("borzoi_head_beard_rot", CubeListBuilder.create().texOffs(2099, 16).addBox(-3.5F, -2.5F, -0.5F, 7.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offset(0.0F, 0.25F, 0.8F));

		PartDefinition borzoi_head_top = borzoi_head_rot.addOrReplaceChild("borzoi_head_top", CubeListBuilder.create().texOffs(1902, 2).mirror().addBox(-3.5F, -1.4039F, 0.5287F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.05F, -22.5632F, -7.875F, -0.48F, 0.0F, 0.0F));

		PartDefinition borzoi_neck = borzoi_head_rot.addOrReplaceChild("borzoi_neck", CubeListBuilder.create().texOffs(2089, 1).addBox(-2.0F, -1.2815F, -3.9672F, 3.0F, 5.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, -18.85F, -6.4F, 0.3491F, 0.0F, 0.0F));

		PartDefinition borzoi_eye_right = borzoi_head_rot.addOrReplaceChild("borzoi_eye_right", CubeListBuilder.create().texOffs(1569, 23).addBox(-1.15F, 0.25F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offset(-1.3084F, -22.4931F, -10.85F));

		PartDefinition borzoi_pupil_right = borzoi_eye_right.addOrReplaceChild("borzoi_pupil_right", CubeListBuilder.create().texOffs(1496, 4).mirror().addBox(-1.8416F, -10.7431F, -9.55F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offset(0.7584F, 10.3931F, 8.75F));

		PartDefinition borzoi_eye_left = borzoi_head_rot.addOrReplaceChild("borzoi_eye_left", CubeListBuilder.create().texOffs(1569, 23).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offset(1.9584F, -21.7431F, -10.65F));

		PartDefinition borzoi_pupil_left = borzoi_eye_left.addOrReplaceChild("borzoi_pupil_left", CubeListBuilder.create().texOffs(1496, 4).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.5F)), PartPose.offset(-0.5668F, -0.1F, -0.5F));

		PartDefinition borzoi_mouth = borzoi_head_rot.addOrReplaceChild("borzoi_mouth", CubeListBuilder.create().texOffs(2070, 2).addBox(-1.5F, 0.1681F, -5.819F, 3.0F, 2.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -21.7162F, -11.1634F, 0.3142F, 0.0F, 0.0F));

		PartDefinition borzoi_jaw = borzoi_mouth.addOrReplaceChild("borzoi_jaw", CubeListBuilder.create().texOffs(1868, 14).addBox(-1.5F, -0.8728F, -4.6692F, 3.0F, 1.0F, 6.0F, new CubeDeformation(-0.22F))
		.texOffs(425, 7).addBox(-1.5F, -1.3728F, -4.6692F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.23F)), PartPose.offset(0.0F, 2.5735F, -0.1806F));

		PartDefinition borzoi_jaw_bottom = borzoi_jaw.addOrReplaceChild("borzoi_jaw_bottom", CubeListBuilder.create().texOffs(2038, 25).addBox(-1.5F, -0.5937F, -2.965F, 3.0F, 1.0F, 6.0F, new CubeDeformation(-0.24F)), PartPose.offset(0.0F, 0.2417F, -1.6027F));

		PartDefinition borzoi_tongue_rot = borzoi_jaw.addOrReplaceChild("borzoi_tongue_rot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.25F, -2.2736F, -0.9235F, 0.0436F, 0.0F, 0.0F));

		PartDefinition borzoi_tongue = borzoi_tongue_rot.addOrReplaceChild("borzoi_tongue", CubeListBuilder.create().texOffs(1448, 15).addBox(-1.4921F, -2.3241F, -3.2057F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.4F)), PartPose.offset(-0.2864F, 3.1239F, -1.5346F));

		PartDefinition borzoi_nose = borzoi_mouth.addOrReplaceChild("borzoi_nose", CubeListBuilder.create().texOffs(1855, 9).addBox(-1.5F, 0.2404F, -1.2273F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.65F)), PartPose.offsetAndRotation(0.0F, -0.529F, -5.412F, -0.0611F, 0.0F, 0.0F));

		PartDefinition borzoi_bridge = borzoi_head_rot.addOrReplaceChild("borzoi_bridge", CubeListBuilder.create().texOffs(1519, 0).addBox(-0.5F, 0.0101F, -1.9293F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -21.8698F, -11.3651F, 0.6109F, 0.0F, 0.0F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(2.5F, -0.3F, 2.2F));

		PartDefinition borzoi_ear_left2 = left_ear.addOrReplaceChild("borzoi_ear_left2", CubeListBuilder.create(), PartPose.offset(-0.5F, 0.0F, 0.75F));

		PartDefinition borzoi_ear_left_rot2 = borzoi_ear_left2.addOrReplaceChild("borzoi_ear_left_rot2", CubeListBuilder.create().texOffs(1933, 14).addBox(-0.8556F, -0.6131F, -2.3301F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9684F, -1.633F, -1.3565F, 3.1358F, 0.9915F, 2.1281F));

		PartDefinition borzoi_ear_left_fuzz2 = borzoi_ear_left_rot2.addOrReplaceChild("borzoi_ear_left_fuzz2", CubeListBuilder.create().texOffs(1918, 17).addBox(-1.0351F, -2.5097F, -2.871F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.474F, 1.7047F, -1.224F, 0.1852F, -0.5391F, -0.035F));

		PartDefinition borzoi_sideburns = left_ear.addOrReplaceChild("borzoi_sideburns", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.3F, -0.85F, -2.7F, -0.1745F, 0.0F, 0.0F));

		PartDefinition borzoi_sideburn_left_r1 = borzoi_sideburns.addOrReplaceChild("borzoi_sideburn_left_r1", CubeListBuilder.create().texOffs(2010, 0).mirror().addBox(2.1914F, -23.6094F, 18.2495F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(5.9993F, 22.35F, -16.4488F, 0.0F, -0.1745F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-2.5F, -0.3F, 2.2F));

		PartDefinition borzoi_ear_right2 = right_ear.addOrReplaceChild("borzoi_ear_right2", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 0.75F));

		PartDefinition borzoi_ear_right_rot2 = borzoi_ear_right2.addOrReplaceChild("borzoi_ear_right_rot2", CubeListBuilder.create().texOffs(1933, 14).mirror().addBox(-0.1444F, -0.6131F, -2.3301F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4684F, -0.633F, -1.3565F, 3.1358F, -0.9915F, -2.1281F));

		PartDefinition borzoi_ear_right_fuzz2 = borzoi_ear_right_rot2.addOrReplaceChild("borzoi_ear_right_fuzz2", CubeListBuilder.create().texOffs(1918, 17).mirror().addBox(0.0351F, -2.5097F, -2.871F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.474F, 1.7047F, -1.224F, 0.1852F, 0.5391F, 0.035F));

		PartDefinition borzoi_sideburn_right = right_ear.addOrReplaceChild("borzoi_sideburn_right", CubeListBuilder.create().texOffs(2010, 0).addBox(-2.0876F, -2.7363F, -0.0183F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3F, 0.4559F, -0.7905F, -0.1745F, 0.1745F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create().texOffs(2175, 18).addBox(-3.0F, -2.0F, -2.5F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.2F))
		.texOffs(2129, 0).addBox(-3.0F, -2.0F, -7.9F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.2F))
		.texOffs(2180, 4).addBox(2.0F, -2.0F, -7.9F, 1.0F, 8.0F, 5.0F, new CubeDeformation(0.2F))
		.texOffs(2180, 4).mirror().addBox(-3.0F, -2.0F, -7.9F, 1.0F, 8.0F, 5.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 12.0F, -7.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition borzoi_mane_coat_left2 = upper_body.addOrReplaceChild("borzoi_mane_coat_left2", CubeListBuilder.create(), PartPose.offset(2.45F, 1.0F, 2.6F));

		PartDefinition borzoi_mane_coat_left_rot2 = borzoi_mane_coat_left2.addOrReplaceChild("borzoi_mane_coat_left_rot2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5267F, 1.0F, -0.4373F, -1.5708F, -0.0436F, 0.0F));

		PartDefinition borzoi_mane_coat_right2 = upper_body.addOrReplaceChild("borzoi_mane_coat_right2", CubeListBuilder.create(), PartPose.offset(-2.7F, 1.0F, 2.6F));

		PartDefinition borzoi_mane_coat_right_rot2 = borzoi_mane_coat_right2.addOrReplaceChild("borzoi_mane_coat_right_rot2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2767F, 1.0F, -0.4373F, -1.5708F, 0.0436F, 0.0F));

		PartDefinition borzoi_mane_coat_front2 = upper_body.addOrReplaceChild("borzoi_mane_coat_front2", CubeListBuilder.create(), PartPose.offset(0.2F, -1.85F, 1.35F));

		PartDefinition borzoi_mane_coat_front_rot2 = borzoi_mane_coat_front2.addOrReplaceChild("borzoi_mane_coat_front_rot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -2.75F, -1.5708F, 0.0F, -1.5708F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
    
	public static LayerDefinition corgi() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 16.0F, 4.75F, 1.9635F, 0.0F, 0.0F));

		var real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.ZERO);

		PartDefinition real_tail2 = real_tail.addOrReplaceChild("real_tail2", CubeListBuilder.create(), PartPose.offset(-1.0F, -5.6429F, 1.7223F));

		PartDefinition corgi_tail3 = real_tail2.addOrReplaceChild("corgi_tail3", CubeListBuilder.create(), PartPose.offset(1.0F, 4.8F, -2.2F));

		PartDefinition corgitail_rot3 = corgi_tail3.addOrReplaceChild("corgitail_rot3", CubeListBuilder.create().texOffs(404, 14).addBox(-2.0F, -3.8884F, 1.9255F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0F, 3.0F, -3.35F, -0.2618F, 0.0F, 0.0F));

		PartDefinition corgitail_bottom_top3 = corgitail_rot3.addOrReplaceChild("corgitail_bottom_top3", CubeListBuilder.create().texOffs(412, 15).addBox(-1.0F, -12.4581F, 9.3695F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, 12.5F, -5.75F, 0.1309F, 0.0F, 0.0F));

		PartDefinition corgitail_top_bottom3 = corgitail_rot3.addOrReplaceChild("corgitail_top_bottom3", CubeListBuilder.create().texOffs(413, 26).addBox(-1.0F, -6.1116F, 4.6246F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, -7.0F, 6.75F, 3.1416F, 0.0F, 0.0F));

		PartDefinition corgitail_bottom_bottom3 = corgitail_rot3.addOrReplaceChild("corgitail_bottom_bottom3", CubeListBuilder.create().texOffs(420, 13).addBox(-1.0F, 11.6873F, -4.195F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, 15.0F, 0.0F, -3.0107F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create().texOffs(405, 26).addBox(-0.9F, 1.5F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offset(-1.6F, 18.75F, 5.5F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create().texOffs(405, 26).addBox(-1.0F, 1.5F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offset(1.6F, 18.75F, 5.55F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create().texOffs(405, 25).addBox(-1.0F, -0.1F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offset(-1.75F, 19.25F, -3.8F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create().texOffs(405, 25).addBox(-1.0F, -0.1F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offset(1.75F, 19.25F, -3.8F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 19.5F, 2.0F));

		PartDefinition dddd2 = body.addOrReplaceChild("dddd2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9F, -2.5F, 0.0436F, 0.0F, 0.0F));

		PartDefinition bone178_r1 = dddd2.addOrReplaceChild("bone178_r1", CubeListBuilder.create().texOffs(377, 19).addBox(-2.5F, -2.5F, 4.3F, 5.0F, 7.0F, 6.0F, new CubeDeformation(-0.08F)), PartPose.offsetAndRotation(0.0F, 4.35F, 2.25F, 1.5708F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create().texOffs(402, 0).addBox(-2.0F, -2.65F, -3.7F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 17.75F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 15.5F, -5.0F));

		var real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.ZERO);

		PartDefinition real_head2 = real_head.addOrReplaceChild("real_head2", CubeListBuilder.create(), PartPose.offset(0.0F, -1.5F, -2.0F));

		PartDefinition right_ear = real_head2.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-1.5F, 0.0F, 0.5F));

		PartDefinition corgi_ear_right2 = right_ear.addOrReplaceChild("corgi_ear_right2", CubeListBuilder.create().texOffs(422, 27).mirror().addBox(-1.1826F, -4.3668F, -0.7878F, 3.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1087F, -1.5863F, 1.0947F, 0.0F, 0.3491F, -0.3927F));

		PartDefinition left_ear = real_head2.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(1.5F, 0.0F, 0.5F));

		PartDefinition corgi_ear_left2 = left_ear.addOrReplaceChild("corgi_ear_left2", CubeListBuilder.create().texOffs(422, 27).addBox(-1.8174F, -4.3668F, -0.7878F, 3.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1087F, -1.5863F, 1.0947F, 0.0F, -0.3491F, 0.3927F));

		PartDefinition corgi_head_full2 = real_head2.addOrReplaceChild("corgi_head_full2", CubeListBuilder.create().texOffs(371, 0).addBox(-3.5F, -2.0F, -2.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offset(1.0F, 0.25F, 1.5F));

		PartDefinition corgi_mouth_full2 = corgi_head_full2.addOrReplaceChild("corgi_mouth_full2", CubeListBuilder.create().texOffs(368, 11).addBox(-1.5F, -0.1283F, -2.2822F, 3.0F, 2.0F, 5.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.0F, 0.6316F, -2.7778F, 0.2618F, 0.0F, 0.0F));

		PartDefinition corgi_nose2 = corgi_mouth_full2.addOrReplaceChild("corgi_nose2", CubeListBuilder.create().texOffs(686, 0).addBox(-1.0F, -0.5942F, -1.1425F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offsetAndRotation(0.0F, 0.1626F, -1.5233F, -0.0436F, 0.0F, 0.0F));

		PartDefinition corgi_jaw_tongue2 = corgi_mouth_full2.addOrReplaceChild("corgi_jaw_tongue2", CubeListBuilder.create(), PartPose.offset(0.0F, 2.3427F, 1.0712F));

		PartDefinition corgi_mouth_rot2 = corgi_jaw_tongue2.addOrReplaceChild("corgi_mouth_rot2", CubeListBuilder.create().texOffs(389, 0).addBox(-1.5F, -1.0551F, -3.2113F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.29F))
		.texOffs(17, 0).addBox(-1.5F, -1.4551F, -3.2113F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition corgi_chin2 = corgi_mouth_rot2.addOrReplaceChild("corgi_chin2", CubeListBuilder.create().texOffs(560, 0).addBox(-1.5F, 0.0308F, -3.478F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)), PartPose.offset(0.0F, -0.6805F, 0.2881F));

		PartDefinition corgi_tongue2 = corgi_mouth_rot2.addOrReplaceChild("corgi_tongue2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.8247F, -2.2323F));

		PartDefinition corgi_tongue_rot2 = corgi_tongue2.addOrReplaceChild("corgi_tongue_rot2", CubeListBuilder.create().texOffs(123, 19).addBox(-1.5F, -2.5489F, -2.4103F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.7F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition corgi_smile_full2 = corgi_mouth_full2.addOrReplaceChild("corgi_smile_full2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.22F, 1.5825F, 0.825F, -0.1309F, 0.0F, 0.0F));

		PartDefinition corgi_smile_left2 = corgi_smile_full2.addOrReplaceChild("corgi_smile_left2", CubeListBuilder.create().texOffs(400, 0).addBox(-0.3806F, -0.3429F, -0.4472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition corgi_smile_right2 = corgi_smile_full2.addOrReplaceChild("corgi_smile_right2", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(-0.6194F, -0.3429F, -0.4472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.44F, 0.0F, 0.0F, -0.1308F, 0.0057F, 0.0433F));

		PartDefinition corgi_bridge2 = corgi_head_full2.addOrReplaceChild("corgi_bridge2", CubeListBuilder.create().texOffs(379, 12).addBox(-0.5F, 0.0087F, 0.1804F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-1.0F, -0.4256F, -1.9369F, -0.5672F, 0.0F, 0.0F));

		PartDefinition corgi_eyes2 = corgi_head_full2.addOrReplaceChild("corgi_eyes2", CubeListBuilder.create().texOffs(678, 0).addBox(-1.0F, -0.85F, -0.94F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
		.texOffs(400, 2).addBox(-0.2F, -0.2F, -0.44F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.04F)), PartPose.offset(0.32F, -0.22F, -1.55F));

		PartDefinition mane_sub_2 = corgi_eyes2.addOrReplaceChild("mane_sub_2", CubeListBuilder.create().texOffs(678, 0).mirror().addBox(-3.64F, -0.85F, -0.94F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(400, 2).mirror().addBox(-3.44F, -0.2F, -0.44F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.04F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition corgi_top2 = corgi_head_full2.addOrReplaceChild("corgi_top2", CubeListBuilder.create().texOffs(926, 17).addBox(-2.5F, -1.1202F, -0.0867F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -5.25F, 0.3F, -0.2618F, 0.0F, 0.0F));

		PartDefinition corgi_tuft_left2 = corgi_head_full2.addOrReplaceChild("corgi_tuft_left2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.55F, -0.75F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition head_sub_2 = corgi_tuft_left2.addOrReplaceChild("head_sub_2", CubeListBuilder.create().texOffs(637, 0).mirror().addBox(-2.5086F, -1.15F, -0.0381F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition corgi_tuft_right2 = corgi_head_full2.addOrReplaceChild("corgi_tuft_right2", CubeListBuilder.create().texOffs(637, 0).addBox(-2.4913F, -1.15F, -0.0381F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.55F, -0.75F, 0.0F, 0.0F, 0.3927F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition shih_tzu() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 14.75F, 5.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(-1.0F, -3.5F, 3.0F));

		PartDefinition shihtzu_staart2 = real_tail.addOrReplaceChild("shihtzu_staart2", CubeListBuilder.create().texOffs(1706, 20).addBox(-1.1044F, -0.6833F, -0.9584F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.09F))
		.texOffs(1755, 17).addBox(2.0756F, -0.6833F, -2.9584F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.09F)), PartPose.offsetAndRotation(0.85F, 3.1F, -2.3F, 0.1085F, 0.1284F, 0.8822F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(1.75F, 17.25F, 4.5F));

		PartDefinition shihtzu_leg6 = left_hind_leg.addOrReplaceChild("shihtzu_leg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 16.75F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition shihtzu_leg2_rot3 = shihtzu_leg6.addOrReplaceChild("shihtzu_leg2_rot3", CubeListBuilder.create().texOffs(1455, 22).mirror().addBox(0.0F, -12.0F, -3.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.5F, 3.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-1.75F, 17.25F, 4.5F));

		PartDefinition shihtzu_leg5 = right_hind_leg.addOrReplaceChild("shihtzu_leg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 16.75F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition shihtzu_leg2_rot2 = shihtzu_leg5.addOrReplaceChild("shihtzu_leg2_rot2", CubeListBuilder.create().texOffs(1455, 22).addBox(-2.0F, -12.0F, -3.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.5F, 3.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 16.0F, -4.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition shihtzu_leg3 = left_front_leg.addOrReplaceChild("shihtzu_leg3", CubeListBuilder.create(), PartPose.offset(1.25F, -3.0F, 1.0F));

		PartDefinition shihtzu_leg4_rot3 = shihtzu_leg3.addOrReplaceChild("shihtzu_leg4_rot3", CubeListBuilder.create().texOffs(1455, 22).addBox(-2.0F, 6.0F, -0.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.5F, 3.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 16.0F, -4.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition shihtzu_leg2 = right_front_leg.addOrReplaceChild("shihtzu_leg2", CubeListBuilder.create(), PartPose.offset(-1.25F, -3.0F, 1.0F));

		PartDefinition shihtzu_leg4_rot2 = shihtzu_leg2.addOrReplaceChild("shihtzu_leg4_rot2", CubeListBuilder.create().texOffs(1455, 22).mirror().addBox(0.0F, 6.0F, -0.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.5F, 3.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 18.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition shihtzu_body2 = body.addOrReplaceChild("shihtzu_body2", CubeListBuilder.create().texOffs(1833, 0).addBox(-3.5F, -0.475F, -6.05F, 7.0F, 6.0F, 3.0F, new CubeDeformation(-0.15F))
		.texOffs(1427, 13).addBox(-3.5F, -0.025F, -3.45F, 7.0F, 6.0F, 7.0F, new CubeDeformation(0.09F)), PartPose.offset(0.0F, -1.775F, 0.35F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 17.5F, -3.5F, 1.5708F, 0.0F, 0.0F));

		PartDefinition shihtzu_mane2 = upper_body.addOrReplaceChild("shihtzu_mane2", CubeListBuilder.create().texOffs(1424, 0).addBox(-3.5F, -6.0F, -8.35F, 7.0F, 6.0F, 7.0F, new CubeDeformation(0.1F)), PartPose.offset(0.0F, 3.75F, 4.85F));

		PartDefinition shihtzu_mane_hair2 = shihtzu_mane2.addOrReplaceChild("shihtzu_mane_hair2", CubeListBuilder.create().texOffs(1813, 0).addBox(-3.5F, -3.0F, -7.75F, 7.0F, 6.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, -3.0F, -3.4F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 14.0F, -7.0F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition wqdqf = real_head.addOrReplaceChild("wqdqf", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition right_ear = wqdqf.addOrReplaceChild("right_ear", CubeListBuilder.create().texOffs(1468, 11).mirror().addBox(-2.0F, -0.9F, -1.5F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false)
		.texOffs(1783, 17).mirror().addBox(-2.0F, 2.9F, -1.5F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.55F, 0.5F, 0.15F, -1.5708F, 0.0F, 0.0F));

		PartDefinition left_ear = wqdqf.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(1468, 11).addBox(0.0F, -0.9F, -1.5F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.1F))
		.texOffs(1783, 17).addBox(0.0F, 2.9F, -1.5F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.55F, 0.5F, 0.15F, -1.5708F, 0.0F, 0.0F));

		PartDefinition shihtzu_head2 = wqdqf.addOrReplaceChild("shihtzu_head2", CubeListBuilder.create(), PartPose.offset(0.0F, 2.5F, -3.25F));

		PartDefinition shihtzu_head_rot2 = shihtzu_head2.addOrReplaceChild("shihtzu_head_rot2", CubeListBuilder.create().texOffs(1402, 0).addBox(-3.0F, -0.4F, 3.75F, 6.0F, 6.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -7.8F, 4.75F, -1.5708F, 0.0F, 0.0F));

		PartDefinition shihtzu2 = shihtzu_head_rot2.addOrReplaceChild("shihtzu2", CubeListBuilder.create(), PartPose.offset(0.0F, 11.3F, 13.0F));

		PartDefinition shihtzu_tong2 = shihtzu2.addOrReplaceChild("shihtzu_tong2", CubeListBuilder.create(), PartPose.offset(0.0F, -6.25F, -9.85F));

		PartDefinition shihtzu_tong_rot2 = shihtzu_tong2.addOrReplaceChild("shihtzu_tong_rot2", CubeListBuilder.create().texOffs(1495, 20).addBox(-1.0F, -1.8381F, -0.9441F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.25F, 0.5672F, 0.0F, 0.0F));

		PartDefinition shihtzu_neusbrug2 = shihtzu2.addOrReplaceChild("shihtzu_neusbrug2", CubeListBuilder.create().texOffs(1463, 27).addBox(-1.0F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offset(0.0F, -9.05F, -9.55F));

		PartDefinition shihtzu_longhair2 = shihtzu2.addOrReplaceChild("shihtzu_longhair2", CubeListBuilder.create().texOffs(1685, 1).addBox(-2.0F, -5.9F, -10.05F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition mane_sub_2 = shihtzu_longhair2.addOrReplaceChild("mane_sub_2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition shihtzu_baard2 = shihtzu_longhair2.addOrReplaceChild("shihtzu_baard2", CubeListBuilder.create().texOffs(1621, 11).addBox(-3.0F, -0.15F, -0.05F, 6.0F, 3.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offset(0.0F, -5.75F, -9.2F));

		PartDefinition shihtzu_hair2 = shihtzu_longhair2.addOrReplaceChild("shihtzu_hair2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -11.5F, -8.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition shihtzu_hair_rot2 = shihtzu_hair2.addOrReplaceChild("shihtzu_hair_rot2", CubeListBuilder.create().texOffs(1627, 0).addBox(-1.5F, -2.25F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 1.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition shihtzu_mond2 = shihtzu2.addOrReplaceChild("shihtzu_mond2", CubeListBuilder.create().texOffs(1474, 3).addBox(-1.5F, -10.3F, -10.251F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.95F))
		.texOffs(1503, 4).addBox(-1.0F, -7.5F, -10.35F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(1538, 18).addBox(-2.0F, -8.7F, -10.05F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1537, 29).addBox(-2.0F, -6.7F, -10.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1537, 29).addBox(1.0F, -6.7F, -10.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1571, 1).addBox(-2.0F, -8.3F, -10.55F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition shihtzu_ear_left2 = shihtzu2.addOrReplaceChild("shihtzu_ear_left2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition shihtzu_ear_right2 = shihtzu2.addOrReplaceChild("shihtzu_ear_right2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition mane_sub_3 = shihtzu_ear_right2.addOrReplaceChild("mane_sub_3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}

	public static LayerDefinition chihuahua() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 14.3F, 5.25F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create().texOffs(992, 23).addBox(-1.0F, -0.2532F, -1.2242F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create().texOffs(968, 21).mirror().addBox(-0.5F, 1.15F, -0.9F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.3F)).mirror(false)
		.texOffs(942, 21).mirror().addBox(-0.5F, 1.35F, -1.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offset(1.35F, 17.5F, 5.45F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create().texOffs(968, 21).addBox(-0.5F, 1.15F, -0.9F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.3F))
		.texOffs(942, 21).addBox(-0.5F, 1.35F, -1.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offset(-1.35F, 17.5F, 5.45F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create().texOffs(968, 21).mirror().addBox(-0.6F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.3F)).mirror(false), PartPose.offset(1.75F, 18.75F, -3.75F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create().texOffs(968, 21).addBox(-0.4F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.3F)), PartPose.offset(-1.75F, 18.75F, -3.75F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(947, 19).addBox(-2.5F, -2.25F, -2.25F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.0F, 16.75F, 1.95F, 1.5708F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create().texOffs(967, 22).addBox(-2.5F, -2.65F, -2.25F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, 16.75F, -2.2F, 1.5708F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 12.75F, -6.25F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-1.75F, -2.25F, -0.5F));

		PartDefinition oor2 = right_ear.addOrReplaceChild("oor2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6116F, -11.1457F, 0.65F, 0.0F, 0.0F, -0.3927F));

		PartDefinition oor3 = oor2.addOrReplaceChild("oor3", CubeListBuilder.create().texOffs(973, 13).addBox(-6.8068F, 6.5058F, 0.5836F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1661F, 0.0829F, -0.147F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(1.75F, -2.25F, -0.5F));

		PartDefinition oor4 = left_ear.addOrReplaceChild("oor4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6116F, -11.1457F, 0.65F, 0.0F, 0.0F, 0.3927F));

		PartDefinition oor5 = oor4.addOrReplaceChild("oor5", CubeListBuilder.create().texOffs(973, 13).mirror().addBox(3.8068F, 6.5058F, 0.5836F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1661F, -0.0829F, 0.147F));

		PartDefinition chihuahuaheadd2 = real_head.addOrReplaceChild("chihuahuaheadd2", CubeListBuilder.create().texOffs(1690, 0).addBox(-2.5F, -0.15F, -8.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(1680, 18).addBox(-2.5F, -1.8F, -7.1F, 5.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(841, 19).addBox(-5.0F, -0.15F, -7.95F, 3.0F, 5.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offset(0.0F, -2.5F, 6.75F));

		PartDefinition pomeranian_tong2 = chihuahuaheadd2.addOrReplaceChild("pomeranian_tong2", CubeListBuilder.create(), PartPose.offset(0.0F, -5.7834F, -8.3671F));

		PartDefinition pomeranian_tong_rot2 = pomeranian_tong2.addOrReplaceChild("pomeranian_tong_rot2", CubeListBuilder.create().texOffs(995, 1).addBox(-1.0F, 5.8165F, 6.9888F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.9599F, 0.0F, 0.0F));

		PartDefinition mane_sub_3 = chihuahuaheadd2.addOrReplaceChild("mane_sub_3", CubeListBuilder.create().texOffs(841, 19).mirror().addBox(1.75F, -0.15F, -7.95F, 3.0F, 5.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone2 = chihuahuaheadd2.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(308, 18).addBox(-1.0F, 3.2507F, -11.4181F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -8.1259F, -8.022F, 1.1868F, 0.0F, 0.0F));

		PartDefinition mond2 = chihuahuaheadd2.addOrReplaceChild("mond2", CubeListBuilder.create().texOffs(1087, 16).addBox(-1.5F, 10.0537F, -3.0617F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F))
		.texOffs(978, 15).addBox(-1.5F, 10.8037F, -3.1617F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(0.0F, -7.4827F, -8.5314F, 0.1222F, 0.0F, 0.0F));

		PartDefinition bone3 = mond2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(1000, 28).addBox(-1.0F, 10.5755F, -2.1968F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
		.texOffs(958, 30).addBox(-1.0F, 11.6269F, -1.8615F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
		.texOffs(875, 29).addBox(-0.5F, 11.4262F, -1.7601F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -0.52F, -0.0436F, 0.0F, 0.0F));

		PartDefinition bone4 = chihuahuaheadd2.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(902, 28).addBox(-1.55F, 9.85F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offset(-0.8F, -8.75F, -7.65F));

		PartDefinition bone6 = chihuahuaheadd2.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(0.8F, -8.75F, -7.65F));

		PartDefinition mane_sub_4 = bone6.addOrReplaceChild("mane_sub_4", CubeListBuilder.create().texOffs(902, 28).mirror().addBox(-0.45F, 9.85F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition border_collie() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 12.5F, 6.5F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bordercollie_tail2 = real_tail.addOrReplaceChild("bordercollie_tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.45F, 2.5F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bordercollie_tail_rot2 = bordercollie_tail2.addOrReplaceChild("bordercollie_tail_rot2", CubeListBuilder.create().texOffs(100, 20).addBox(-1.0F, -23.5237F, 3.8556F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(63, 13).addBox(-1.0F, -23.5237F, 6.8556F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -11.0F, -11.5F, -1.5708F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-1.5F, 16.25F, 5.75F));

		PartDefinition bordercollie_leg6 = right_hind_leg.addOrReplaceChild("bordercollie_leg6", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 0.0F));

		PartDefinition bordercollie_leg1_rot3 = bordercollie_leg6.addOrReplaceChild("bordercollie_leg1_rot3", CubeListBuilder.create().texOffs(124, 0).mirror().addBox(-1.0F, -1.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -0.25F, -0.25F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(1.5F, 16.25F, 5.75F));

		PartDefinition bordercollie_leg5 = left_hind_leg.addOrReplaceChild("bordercollie_leg5", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 0.0F));

		PartDefinition bordercollie_leg1_rot2 = bordercollie_leg5.addOrReplaceChild("bordercollie_leg1_rot2", CubeListBuilder.create().texOffs(124, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.25F, -0.25F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-1.5F, 18.0F, -5.5F));

		PartDefinition bordercollie_leg3 = right_front_leg.addOrReplaceChild("bordercollie_leg3", CubeListBuilder.create(), PartPose.offset(0.0F, -6.25F, 4.75F));

		PartDefinition bordercollie_leg4_rot2 = bordercollie_leg3.addOrReplaceChild("bordercollie_leg4_rot2", CubeListBuilder.create().texOffs(106, 2).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.25F, -4.5F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(1.5F, 18.0F, -5.5F));

		PartDefinition bordercollie_leg2 = left_front_leg.addOrReplaceChild("bordercollie_leg2", CubeListBuilder.create(), PartPose.offset(0.0F, -6.25F, 4.75F));

		PartDefinition bordercollie_leg4_rot3 = bordercollie_leg2.addOrReplaceChild("bordercollie_leg4_rot3", CubeListBuilder.create().texOffs(106, 2).mirror().addBox(-1.0F, -1.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 5.25F, -4.5F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bordercollie_body2 = body.addOrReplaceChild("bordercollie_body2", CubeListBuilder.create().texOffs(43, 18).addBox(-3.5F, -5.0F, -3.75F, 7.0F, 7.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(96, 0).addBox(3.0F, -5.0F, -5.7F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(96, 5).addBox(-3.0F, -5.0F, -5.7F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.3F, 1.2F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.5F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bordercollie_mane2 = upper_body.addOrReplaceChild("bordercollie_mane2", CubeListBuilder.create().texOffs(70, 16).addBox(-4.0F, -3.5F, -8.5F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(1819, 9).addBox(-4.0F, -3.5F, -10.5F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(96, 0).addBox(-3.0F, -2.3F, -10.4F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(96, 0).addBox(3.0F, -2.3F, -10.4F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.2F, 4.7F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 10.0F, -7.25F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition whatever = real_head.addOrReplaceChild("whatever", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.75F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bordercollie_head2 = whatever.addOrReplaceChild("bordercollie_head2", CubeListBuilder.create(), PartPose.offset(0.0F, -2.25F, 7.5F));

		PartDefinition bordercollie_head_rot2 = bordercollie_head2.addOrReplaceChild("bordercollie_head_rot2", CubeListBuilder.create().texOffs(73, 5).addBox(-2.25F, -2.35F, -8.15F, 6.0F, 5.0F, 5.0F, new CubeDeformation(0.08F))
		.texOffs(1686, 23).addBox(-3.75F, -3.0F, -7.5F, 9.0F, 7.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(72, 4).addBox(0.25F, -2.49F, -8.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.04F)), PartPose.offsetAndRotation(-0.75F, 7.75F, -7.5F, -1.5708F, 0.0F, 0.0F));

		PartDefinition bone2 = bordercollie_head_rot2.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(96, 14).addBox(-0.5F, 6.2247F, 6.6264F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.75F, -9.706F, -11.5752F, -0.4363F, 0.0F, 0.0F));

		PartDefinition collie_mouth2 = bordercollie_head_rot2.addOrReplaceChild("collie_mouth2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.25F, 0.65F, -6.05F, 0.0436F, 0.0F, 0.0F));

		PartDefinition bone3 = collie_mouth2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(36, 13).addBox(-1.5F, 7.75F, -1.6263F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -8.0626F, -5.2431F, 0.2443F, 0.0F, 0.0F));

		PartDefinition collie_nose2 = bone3.addOrReplaceChild("collie_nose2", CubeListBuilder.create().texOffs(1422, 14).addBox(-1.5F, 8.2912F, -0.3224F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(0.0F, -1.4133F, -1.6124F, -0.0873F, 0.0F, 0.0F));

		PartDefinition collie_jaw2 = collie_mouth2.addOrReplaceChild("collie_jaw2", CubeListBuilder.create(), PartPose.offset(0.5F, -8.275F, -3.5518F));

		PartDefinition collie_jaw_rot2 = collie_jaw2.addOrReplaceChild("collie_jaw_rot2", CubeListBuilder.create().texOffs(14, 24).addBox(-1.5F, 8.7919F, -5.3356F, 3.0F, 1.0F, 7.0F, new CubeDeformation(-0.25F))
		.texOffs(107, 5).addBox(-1.5F, 9.2919F, -5.3356F, 3.0F, 1.0F, 7.0F, new CubeDeformation(-0.25F))
		.texOffs(543, 0).addBox(-1.5F, 9.7019F, -5.3356F, 3.0F, 1.0F, 7.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, 0.4538F, 0.0F, 0.0F));

		PartDefinition bordercollie_tongue2 = collie_jaw2.addOrReplaceChild("bordercollie_tongue2", CubeListBuilder.create(), PartPose.offset(0.25F, 2.6985F, -2.2603F));

		PartDefinition bordercollie_tongue_rot2 = bordercollie_tongue2.addOrReplaceChild("bordercollie_tongue_rot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5111F, -0.8342F, 0.7854F, 0.0F, 0.0F));

		PartDefinition bordercollie_tongue_walk2 = bordercollie_tongue_rot2.addOrReplaceChild("bordercollie_tongue_walk2", CubeListBuilder.create().texOffs(615, 15).addBox(-1.6974F, 8.5915F, -8.0003F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.5F)), PartPose.offset(0.0F, -2.1F, 2.0F));

		PartDefinition oog2 = bordercollie_head_rot2.addOrReplaceChild("oog2", CubeListBuilder.create().texOffs(45, 13).addBox(-0.2013F, 0.6812F, -2.56F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(53, 14).addBox(0.5487F, 0.6912F, -2.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(74, 8).addBox(0.5487F, 0.6912F, -2.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.6F, -1.6F, -5.8F, 0.0F, 0.0F, -0.0436F));

		PartDefinition oog3 = bordercollie_head_rot2.addOrReplaceChild("oog3", CubeListBuilder.create().texOffs(45, 13).addBox(1.9513F, 0.6812F, -2.56F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(53, 14).addBox(1.2013F, 0.6912F, -2.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(57, 14).addBox(1.2013F, 0.6912F, -2.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.85F, -1.7F, -5.8F, 0.0F, 0.0F, 0.0436F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offsetAndRotation(1.75F, -1.75F, -0.5F, 1.5639F, -0.1569F, 0.3583F));

		PartDefinition collie_ear_right_rot_r1 = left_ear.addOrReplaceChild("collie_ear_right_rot_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8156F, -0.2839F, 1.2672F, -1.5708F, 0.0436F, 3.1416F));

		PartDefinition collie_ear_hinge_left_r1 = left_ear.addOrReplaceChild("collie_ear_hinge_left_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8156F, -0.2839F, 3.7672F, -1.5708F, 0.0436F, 3.1416F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.75F, -1.75F, -0.5F, 1.5639F, 0.1569F, -0.3583F));

		PartDefinition collie_ear_left_rot_r1 = right_ear.addOrReplaceChild("collie_ear_left_rot_r1", CubeListBuilder.create().texOffs(45, 2).mirror().addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8156F, -0.2839F, 1.2672F, -1.5708F, -0.0436F, -3.1416F));

		PartDefinition collie_ear_hinge_right_r1 = right_ear.addOrReplaceChild("collie_ear_hinge_right_r1", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8156F, -0.2839F, 3.7672F, -1.5708F, -0.0436F, -3.1416F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}	
	
	public static LayerDefinition basset_hound() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 13.5F, 8.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(-1.0F, -1.5F, 0.0F));

		PartDefinition basset_tail2 = real_tail.addOrReplaceChild("basset_tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 12.75F, -5.25F, -1.5708F, 0.0F, 0.0F));

		PartDefinition basset_tail_rot2 = basset_tail2.addOrReplaceChild("basset_tail_rot2", CubeListBuilder.create().texOffs(1665, 1).addBox(-0.55F, -13.7268F, 4.1864F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.0F, 1.0F, 2.0F, 1.4835F, 0.0F, 0.0F));

		PartDefinition basset_tail_bottom2 = basset_tail_rot2.addOrReplaceChild("basset_tail_bottom2", CubeListBuilder.create().texOffs(1497, 24).addBox(-0.55F, -13.879F, 9.9848F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.0F, 8.605F, -1.8211F, 0.2618F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-2.0F, 17.0F, 7.25F));

		PartDefinition basset_leg2 = right_hind_leg.addOrReplaceChild("basset_leg2", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0F, -9.25F));

		PartDefinition basset_leg1_rot3 = basset_leg2.addOrReplaceChild("basset_leg1_rot3", CubeListBuilder.create().texOffs(1168, 22).mirror().addBox(-3.0F, -8.0F, 6.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, 0.0F, 2.0F));

		PartDefinition boxer3 = basset_leg1_rot3.addOrReplaceChild("boxer3", CubeListBuilder.create().texOffs(1580, 20).mirror().addBox(-2.5F, -8.7992F, 6.0349F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, -1.65F, 0.0436F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(2.0F, 17.0F, 7.25F));

		PartDefinition basset_leg5 = left_hind_leg.addOrReplaceChild("basset_leg5", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0F, -9.25F));

		PartDefinition basset_leg1_rot2 = basset_leg5.addOrReplaceChild("basset_leg1_rot2", CubeListBuilder.create().texOffs(1168, 22).addBox(1.0F, -8.0F, 6.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 0.0F, 2.0F));

		PartDefinition boxer2 = basset_leg1_rot2.addOrReplaceChild("boxer2", CubeListBuilder.create().texOffs(1580, 20).addBox(0.5F, -8.7992F, 6.0349F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, 0.3F, -1.65F, 0.0436F, 0.0F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-2.25F, 19.25F, -4.0F));

		PartDefinition basset_leg7 = right_front_leg.addOrReplaceChild("basset_leg7", CubeListBuilder.create(), PartPose.offset(-1.0F, 3.75F, 8.0F));

		PartDefinition basset_leg3_rot3 = basset_leg7.addOrReplaceChild("basset_leg3_rot3", CubeListBuilder.create().texOffs(668, 0).mirror().addBox(-3.25F, -8.25F, -5.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offset(3.5F, 1.0F, -4.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(2.25F, 19.25F, -4.0F));

		PartDefinition basset_leg6 = left_front_leg.addOrReplaceChild("basset_leg6", CubeListBuilder.create(), PartPose.offset(1.0F, 3.75F, 8.0F));

		PartDefinition basset_leg3_rot2 = basset_leg6.addOrReplaceChild("basset_leg3_rot2", CubeListBuilder.create().texOffs(668, 0).addBox(1.25F, -8.25F, -5.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(-3.5F, 1.0F, -4.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 16.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition basset_body2 = body.addOrReplaceChild("basset_body2", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition basset_body_rot2 = basset_body2.addOrReplaceChild("basset_body_rot2", CubeListBuilder.create().texOffs(1717, 0).addBox(-3.0F, -6.7F, -5.3F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.2F))
		.texOffs(484, 0).addBox(1.0F, -2.95F, -6.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.1F))
		.texOffs(484, 0).addBox(-3.0F, -2.95F, -6.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offset(0.0F, 6.0F, 2.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 17.0F, -2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition basset_mane2 = upper_body.addOrReplaceChild("basset_mane2", CubeListBuilder.create().texOffs(434, 6).addBox(-3.5F, -3.0F, -3.5F, 7.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.75F, 0.5F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 10.5F, -7.0F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition real_headyj = real_head.addOrReplaceChild("real_headyj", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition left_ear = real_headyj.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(3.0F, 1.0F, 0.0F));

		PartDefinition mane_sub_45_r1 = left_ear.addOrReplaceChild("mane_sub_45_r1", CubeListBuilder.create().texOffs(529, 5).mirror().addBox(-3.4F, -4.0F, -2.875F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(1705, 5).mirror().addBox(-3.4F, 0.0F, -3.125F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.8948F, -0.7183F, -2.7498F, -1.5304F, -0.0705F, -0.3959F));

		PartDefinition right_ear = real_headyj.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-3.0F, 1.0F, 0.0F));

		PartDefinition mane_sub_46_r1 = right_ear.addOrReplaceChild("mane_sub_46_r1", CubeListBuilder.create().texOffs(529, 5).addBox(2.4F, -4.0F, -2.875F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(1705, 5).addBox(2.4F, 0.0F, -3.125F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.8948F, -0.7183F, -2.7498F, -1.5304F, 0.0705F, 0.3959F));

		PartDefinition basset_head2 = real_headyj.addOrReplaceChild("basset_head2", CubeListBuilder.create(), PartPose.offset(0.0F, 1.25F, -0.25F));

		PartDefinition bassethound2 = basset_head2.addOrReplaceChild("bassethound2", CubeListBuilder.create().texOffs(1709, 18).addBox(-2.9833F, -2.2833F, -1.1667F, 6.0F, 7.0F, 7.0F, new CubeDeformation(-0.1F))
		.texOffs(1257, 0).addBox(-0.4833F, -2.1833F, -1.0667F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.01F))
		.texOffs(1474, 0).addBox(-2.1833F, -0.7333F, -1.0667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F))
		.texOffs(1470, 0).addBox(-2.7333F, -0.5333F, -1.0667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F))
		.texOffs(1474, 0).addBox(1.1667F, -0.7333F, -1.0667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F))
		.texOffs(1470, 0).addBox(1.7167F, -0.5333F, -1.0667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(-0.0167F, -2.5833F, 0.2667F, -1.5708F, 0.0F, 0.0F));

		PartDefinition basset_neck_sack_right2 = bassethound2.addOrReplaceChild("basset_neck_sack_right2", CubeListBuilder.create(), PartPose.offset(-1.0832F, -4.7877F, -1.5667F));

		PartDefinition bassetnekzakrechtss2 = basset_neck_sack_right2.addOrReplaceChild("bassetnekzakrechtss2", CubeListBuilder.create().texOffs(385, 7).addBox(-0.5856F, 9.6346F, 0.0827F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0545F, -0.248F, 0.0454F, 0.0436F, 0.0F, 0.0436F));

		PartDefinition basset_neck_sack_left2 = bassethound2.addOrReplaceChild("basset_neck_sack_left2", CubeListBuilder.create(), PartPose.offset(1.1166F, -4.7877F, -1.5667F));

		PartDefinition bassetnekzalinkss2 = basset_neck_sack_left2.addOrReplaceChild("bassetnekzalinkss2", CubeListBuilder.create().texOffs(385, 7).mirror().addBox(-1.4689F, 9.3866F, 0.1281F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0436F, 0.0F, -0.0436F));

		PartDefinition basset_mouth2 = bassethound2.addOrReplaceChild("basset_mouth2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0167F, -6.9833F, -5.0167F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone2 = basset_mouth2.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(1409, 15).addBox(-1.5F, 8.608F, -0.4815F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.7F)), PartPose.offsetAndRotation(0.0F, -0.5767F, -2.2714F, 0.1309F, 0.0F, 0.0F));

		PartDefinition mond2 = basset_mouth2.addOrReplaceChild("mond2", CubeListBuilder.create().texOffs(1463, 19).addBox(-1.95F, 7.4624F, -0.7035F, 2.0F, 4.0F, 4.0F, new CubeDeformation(-0.3F))
		.texOffs(226, 15).addBox(-0.5F, 7.6507F, -0.4204F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.11F))
		.texOffs(1294, 7).addBox(-1.0F, 9.7722F, -0.5651F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F))
		.texOffs(340, 27).addBox(-1.6F, 10.1222F, -0.3151F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.11F))
		.texOffs(340, 27).addBox(0.4F, 10.1222F, -0.3151F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.0F, 0.9292F, -0.7504F, 0.0873F, 0.0F, 0.0F));

		PartDefinition mane_sub_4 = mond2.addOrReplaceChild("mane_sub_4", CubeListBuilder.create().texOffs(1463, 19).mirror().addBox(-0.05F, 7.4624F, -0.7035F, 2.0F, 4.0F, 4.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition neus2 = mond2.addOrReplaceChild("neus2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -1.9595F, 15.3032F, 1.1345F, 0.0F, 0.0F));

		PartDefinition bone3 = neus2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(1531, 29).addBox(-1.0F, 7.7726F, -7.1331F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5F, -13.3889F, -4.948F, -0.3054F, 0.0F, 0.0F));

		PartDefinition bone4 = neus2.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(940, 27).addBox(-0.5F, -5.7631F, -7.6743F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3555F, -13.9238F, -0.829F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition irish_terrier() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 14.25F, 8.25F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition irishterrier_tail3 = real_tail.addOrReplaceChild("irishterrier_tail3", CubeListBuilder.create(), PartPose.offset(0.5F, 0.45F, -5.75F));

		PartDefinition irishterrier_tail_rot3 = irishterrier_tail3.addOrReplaceChild("irishterrier_tail_rot3", CubeListBuilder.create(), PartPose.offset(-0.5F, 1.413F, 6.155F));

		PartDefinition irishterrier_tail_bottom3 = irishterrier_tail_rot3.addOrReplaceChild("irishterrier_tail_bottom3", CubeListBuilder.create().texOffs(1809, 16).addBox(-1.5F, -6.2F, 3.1F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, 3.2F, -4.1F));

		PartDefinition irishterrier_tail_top3 = irishterrier_tail_rot3.addOrReplaceChild("irishterrier_tail_top3", CubeListBuilder.create(), PartPose.offset(0.0F, 2.45F, -0.1F));

		PartDefinition irishterrier_tail_top_rot3 = irishterrier_tail_top3.addOrReplaceChild("irishterrier_tail_top_rot3", CubeListBuilder.create().texOffs(1597, 0).addBox(-1.0F, -0.32F, -0.86F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.15F, -0.3F, 1.2217F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(1.5F, 18.0F, 7.0F));

		PartDefinition irishterrier_left_hind_leg = left_hind_leg.addOrReplaceChild("irishterrier_left_hind_leg", CubeListBuilder.create().texOffs(1853, 15).addBox(-1.0F, -0.25F, -6.5F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(1252, 15).addBox(-1.0F, -2.25F, -1.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -0.05F, 1.5708F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-1.5F, 18.0F, 7.0F));

		PartDefinition irishterrier_right_hind_leg = right_hind_leg.addOrReplaceChild("irishterrier_right_hind_leg", CubeListBuilder.create().texOffs(1853, 15).mirror().addBox(-1.0F, -0.25F, -6.5F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(1252, 15).mirror().addBox(-1.0F, -2.25F, -1.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5F, -0.05F, 1.5708F, 0.0F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, 19.0F, -5.25F, 1.5708F, 0.0F, 0.0F));

		PartDefinition irishterrier_front_right_leg = right_front_leg.addOrReplaceChild("irishterrier_front_right_leg", CubeListBuilder.create().texOffs(1853, 0).mirror().addBox(-1.0F, 2.0F, -10.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -3.0F, 4.55F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(1.5F, 19.0F, -5.25F));

		PartDefinition irishterrier_front_left_leg = left_front_leg.addOrReplaceChild("irishterrier_front_left_leg", CubeListBuilder.create().texOffs(1853, 0).addBox(-0.75F, -1.0F, -6.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, -0.55F, 0.05F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 16.0F, 1.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition asd = body.addOrReplaceChild("asd", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition irishterrier_body2 = asd.addOrReplaceChild("irishterrier_body2", CubeListBuilder.create().texOffs(1921, 19).addBox(-2.5F, 0.0F, -2.1F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(0.0F, -0.45F, -0.3F, 1.5708F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 15.0F, -4.25F, 1.5708F, 0.0F, 0.0F));

		PartDefinition irishterrier_mane = upper_body.addOrReplaceChild("irishterrier_mane", CubeListBuilder.create().texOffs(1895, 17).addBox(-3.0F, -14.25F, -1.55F, 6.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 11.25F, -2.75F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 9.5F, -7.0F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-1.75F, -1.75F, -1.25F));

		PartDefinition irishterrier_ear_right = right_ear.addOrReplaceChild("irishterrier_ear_right", CubeListBuilder.create().texOffs(715, 4).mirror().addBox(-0.6913F, -2.149F, -1.4808F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9368F, -0.0527F, 1.2733F, 0.3106F, 0.1871F, -0.1555F));

		PartDefinition bone191 = irishterrier_ear_right.addOrReplaceChild("bone191", CubeListBuilder.create().texOffs(771, 4).mirror().addBox(-0.343F, 0.6753F, -0.662F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3483F, -2.0768F, -0.5358F, -0.8727F, 0.0F, 0.0F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(1.5F, -1.75F, -1.25F));

		PartDefinition irishterrier_ear_left = left_ear.addOrReplaceChild("irishterrier_ear_left", CubeListBuilder.create().texOffs(715, 4).addBox(-2.3087F, -2.149F, -1.4808F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1868F, -0.0527F, 1.2733F, 0.3106F, -0.1871F, 0.1555F));

		PartDefinition bone184 = irishterrier_ear_left.addOrReplaceChild("bone184", CubeListBuilder.create().texOffs(771, 4).addBox(-1.457F, 0.1267F, -0.0712F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8517F, -2.1768F, -1.3358F, -0.8727F, 0.0F, 0.0F));

		PartDefinition irishterrier_head = real_head.addOrReplaceChild("irishterrier_head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.25F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition irishterrier_neck_full = irishterrier_head.addOrReplaceChild("irishterrier_neck_full", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -1.75F, 3.25F, -1.5708F, 0.0F, 0.0F));

		PartDefinition irishterrier_neck = irishterrier_neck_full.addOrReplaceChild("irishterrier_neck", CubeListBuilder.create(), PartPose.offset(-1.0F, 2.85F, 1.35F));

		PartDefinition irishterrier_neck_rot = irishterrier_neck.addOrReplaceChild("irishterrier_neck_rot", CubeListBuilder.create().texOffs(7, 8).addBox(-2.0F, -1.6F, -2.9F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, -0.25F, 0.3491F, 0.0F, 0.0F));

		PartDefinition irishterrier_head_full = irishterrier_head.addOrReplaceChild("irishterrier_head_full", CubeListBuilder.create(), PartPose.offset(1.0F, -1.75F, 2.75F));

		PartDefinition irishterrier_head_rot = irishterrier_head_full.addOrReplaceChild("irishterrier_head_rot", CubeListBuilder.create().texOffs(1763, 11).addBox(-3.5F, -4.25F, -2.3F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, -1.5708F, 0.0F, 0.0F));

		PartDefinition irishterrier_eye_left = irishterrier_head_rot.addOrReplaceChild("irishterrier_eye_left", CubeListBuilder.create().texOffs(751, 6).addBox(1.06F, -17.35F, 1.63F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(751, 4).addBox(1.36F, -17.2F, 1.635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 14.0F, -4.0F));

		PartDefinition irishterrier_eye_right = irishterrier_head_rot.addOrReplaceChild("irishterrier_eye_right", CubeListBuilder.create().texOffs(751, 6).mirror().addBox(-2.06F, -17.35F, 1.63F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(751, 4).mirror().addBox(-2.36F, -17.2F, 1.635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-1.0F, 14.0F, -4.0F));

		PartDefinition irishterrier_mouth2 = irishterrier_head_rot.addOrReplaceChild("irishterrier_mouth2", CubeListBuilder.create().texOffs(1602, 13).addBox(-2.0F, -2.9899F, -1.3271F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.46F, -4.2348F, 0.2967F, 0.0F, 0.0F));

		PartDefinition irishterrier_neusbrug = irishterrier_mouth2.addOrReplaceChild("irishterrier_neusbrug", CubeListBuilder.create().texOffs(1576, 7).addBox(-1.0F, -0.5381F, -1.9909F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -2.9719F, 2.6553F, 0.5672F, 0.0F, 0.0F));

		PartDefinition bone197 = irishterrier_mouth2.addOrReplaceChild("bone197", CubeListBuilder.create().texOffs(401, 19).addBox(-2.0F, -1.6406F, -0.859F, 4.0F, 3.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.403F, -0.5783F, -0.0873F, 0.0F, 0.0F));

		PartDefinition irishterrier_mouth = irishterrier_mouth2.addOrReplaceChild("irishterrier_mouth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.248F, 1.8622F, 0.0436F, 0.0F, 0.0F));

		PartDefinition irishterrier_mouth_beard = irishterrier_mouth.addOrReplaceChild("irishterrier_mouth_beard", CubeListBuilder.create().texOffs(1121, 2).addBox(-1.5F, 0.3251F, 0.5771F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.7894F, -3.7479F));

		PartDefinition bone204 = irishterrier_mouth.addOrReplaceChild("bone204", CubeListBuilder.create().texOffs(751, 18).addBox(-1.5F, -0.5688F, -1.4452F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.6833F, -1.7257F));

		PartDefinition irishterrier_tongue = irishterrier_mouth.addOrReplaceChild("irishterrier_tongue", CubeListBuilder.create(), PartPose.offset(0.25F, 2.9235F, -3.7429F));

		PartDefinition irishterrier_tongue_rot = irishterrier_tongue.addOrReplaceChild("irishterrier_tongue_rot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.239F, 0.0F, 0.0F));

		PartDefinition irishterrier_tongue2 = irishterrier_tongue_rot.addOrReplaceChild("irishterrier_tongue2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, -0.7F, -0.0436F, 0.0F, 0.0F));

		PartDefinition bone182 = irishterrier_mouth2.addOrReplaceChild("bone182", CubeListBuilder.create().texOffs(739, 2).addBox(-1.5F, -1.6298F, -0.861F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.7F)), PartPose.offset(-0.05F, -2.0342F, -1.4958F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}

	public static LayerDefinition boxer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.4F, 3.4F, 1.5708F, 0.0F, 0.0F));

		PartDefinition asd = body.addOrReplaceChild("asd", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition body_rotation = asd.addOrReplaceChild("body_rotation", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6F, -1.4F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_sub_1 = body_rotation.addOrReplaceChild("body_sub_1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition boxer_body = body_sub_1.addOrReplaceChild("boxer_body", CubeListBuilder.create().texOffs(515, 16).addBox(-3.5F, -2.25F, -3.0F, 7.0F, 9.0F, 7.0F, new CubeDeformation(-0.3F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 11.0F, 8.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create().texOffs(1583, 12).addBox(-0.5F, -0.2936F, -0.6989F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition boxer_tail_bottom = real_tail.addOrReplaceChild("boxer_tail_bottom", CubeListBuilder.create().texOffs(1576, 0).addBox(-0.999F, -4.1654F, 2.1673F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.202F)), PartPose.offsetAndRotation(0.5F, 8.35F, -4.15F, -0.5672F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 10.0F, -8.4F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head_main = real_head.addOrReplaceChild("head_main", CubeListBuilder.create().texOffs(1558, 5).addBox(-4.0F, -3.05F, -3.5F, 6.0F, 6.0F, 6.0F, new CubeDeformation(-0.1F))
		.texOffs(1571, 12).addBox(-2.0F, 2.35F, -2.6F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F))
		.texOffs(1602, 23).addBox(-1.5F, -2.9714F, -3.42F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offset(1.0F, 0.15F, 1.4F));

		PartDefinition eye_brow_right = head_main.addOrReplaceChild("eye_brow_right", CubeListBuilder.create().texOffs(1548, 0).addBox(-1.9001F, -13.4965F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.25F, 10.7F, 1.3F, 0.0F, 0.0F, -0.0349F));

		PartDefinition eye_brow_left = head_main.addOrReplaceChild("eye_brow_left", CubeListBuilder.create().texOffs(1548, 0).addBox(-2.1374F, -13.5254F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.25F, 10.8F, 1.3F, 0.0F, 0.0F, 0.0349F));

		PartDefinition boxer_mouth = head_main.addOrReplaceChild("boxer_mouth", CubeListBuilder.create().texOffs(1566, 17).addBox(-2.0F, -14.0002F, -5.99F, 4.0F, 3.0F, 3.0F, new CubeDeformation(-0.16F))
		.texOffs(1520, 26).addBox(-2.0F, -12.2483F, -6.85F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(1522, 29).addBox(-2.0F, -10.9083F, -5.6293F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
		.texOffs(1522, 29).addBox(1.0F, -10.9083F, -5.6293F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
		.texOffs(1520, 26).addBox(1.0F, -12.2483F, -6.85F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 13.4F, 0.35F, -0.0436F, 0.0F, 0.0F));

		PartDefinition boxer_nose = head_main.addOrReplaceChild("boxer_nose", CubeListBuilder.create().texOffs(1566, 0).addBox(1.0F, -11.3828F, -10.2424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-2.5F, 11.45F, 3.85F, -0.0698F, 0.0F, 0.0F));

		PartDefinition boxer_lip = head_main.addOrReplaceChild("boxer_lip", CubeListBuilder.create().texOffs(1554, 0).addBox(1.0F, -11.6957F, -9.68F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 12.05F, 3.15F, -0.0524F, 0.0F, 0.0F));

		PartDefinition boxer_jaw = head_main.addOrReplaceChild("boxer_jaw", CubeListBuilder.create().texOffs(1587, 12).addBox(1.0F, -11.5017F, -9.5002F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.5F, 12.05F, 3.75F, 0.0175F, 0.0F, 0.0F));

		PartDefinition boxer_eye_left = head_main.addOrReplaceChild("boxer_eye_left", CubeListBuilder.create().texOffs(1562, 0).addBox(0.8022F, -11.5999F, -9.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.03F))
		.texOffs(1566, 0).addBox(0.4522F, -11.5999F, -9.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offset(-0.5F, 9.8F, 5.8F));

		PartDefinition boxer_eye_right = head_main.addOrReplaceChild("boxer_eye_right", CubeListBuilder.create().texOffs(1566, 0).addBox(1.5417F, -11.578F, -9.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F))
		.texOffs(1562, 0).addBox(1.1917F, -11.578F, -9.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.03F)), PartPose.offset(-4.5F, 9.8F, 5.9F));

		PartDefinition boxer_nose_bridge = head_main.addOrReplaceChild("boxer_nose_bridge", CubeListBuilder.create().texOffs(1557, 17).addBox(-0.5F, -10.5311F, -5.2581F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(-1.0F, 9.6F, -2.6F, -0.3927F, 0.0F, 0.0F));

		PartDefinition boxer_ear_right = real_head.addOrReplaceChild("boxer_ear_right", CubeListBuilder.create().texOffs(1577, 17).addBox(1.8923F, -13.6578F, -5.7154F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1550, 4).addBox(2.1423F, -13.7578F, -8.5154F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(1550, 4).addBox(2.8478F, -13.978F, -8.5865F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(1555, 4).addBox(2.1695F, -10.7517F, -7.9193F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.25F, 10.6F, 7.15F, 0.0F, -0.1309F, 0.0873F));

		PartDefinition boxer_ear_left = real_head.addOrReplaceChild("boxer_ear_left", CubeListBuilder.create().texOffs(1577, 17).addBox(2.1077F, -13.6578F, -5.7154F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1550, 4).addBox(1.8577F, -13.7578F, -8.5154F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(1550, 4).addBox(1.1522F, -13.978F, -8.5865F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(1555, 4).addBox(1.8393F, -10.7517F, -8.0189F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.25F, 11.0F, 7.9F, 0.0F, 0.1309F, -0.0873F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-2.5F, 16.0F, 7.0F));

		PartDefinition doberman_rot6 = right_hind_leg.addOrReplaceChild("doberman_rot6", CubeListBuilder.create().texOffs(1168, 22).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, 2.0F, 0.0F));

		PartDefinition boxer3 = doberman_rot6.addOrReplaceChild("boxer3", CubeListBuilder.create().texOffs(1580, 20).addBox(-2.5F, -8.8492F, 6.0349F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.5F, 6.35F, -8.65F, 0.0436F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(1.0F, 16.0F, 7.0F));

		PartDefinition doberman_rot3 = left_hind_leg.addOrReplaceChild("doberman_rot3", CubeListBuilder.create().texOffs(1168, 22).addBox(1.0F, -8.0F, 6.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 8.0F, -7.0F));

		PartDefinition boxer2 = doberman_rot3.addOrReplaceChild("boxer2", CubeListBuilder.create().texOffs(1580, 20).addBox(0.5F, -8.7992F, 6.0349F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, 0.3F, -1.65F, 0.0436F, 0.0F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-2.5F, 16.0F, -4.0F));

		PartDefinition doberman_rot5 = right_front_leg.addOrReplaceChild("doberman_rot5", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, 1.0F, -4.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition doberman_rot4_r1 = doberman_rot5.addOrReplaceChild("doberman_rot4_r1", CubeListBuilder.create().texOffs(1159, 14).addBox(-3.25F, -9.0F, 10.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0F, 8.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(1.6F, 16.0F, -4.0F));

		PartDefinition doberman_rot4 = left_front_leg.addOrReplaceChild("doberman_rot4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6F, 1.0F, -4.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition doberman_rot3_r1 = doberman_rot4.addOrReplaceChild("doberman_rot3_r1", CubeListBuilder.create().texOffs(1159, 14).addBox(1.35F, -9.0F, 10.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0F, 8.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create().texOffs(1580, 18).addBox(-3.5F, -3.0F, -4.5F, 7.0F, 6.0F, 8.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(0.0F, 13.6F, -3.0F, 1.5708F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}

	public static LayerDefinition bull_terrier() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 12.0F, 8.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Bullterrier6 = real_tail.addOrReplaceChild("Bullterrier6", CubeListBuilder.create().texOffs(722, 15).addBox(-1.5F, 0.0F, -2.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 0.0F, 2.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-2.5F, 16.0F, 7.0F));

		PartDefinition Bullterrier3 = right_hind_leg.addOrReplaceChild("Bullterrier3", CubeListBuilder.create().texOffs(699, 12).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(0.5F, 16.0F, 7.0F));

		PartDefinition Bullterrier2 = left_hind_leg.addOrReplaceChild("Bullterrier2", CubeListBuilder.create().texOffs(699, 12).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-2.5F, 16.0F, -4.0F));

		PartDefinition Bullterrier5 = right_front_leg.addOrReplaceChild("Bullterrier5", CubeListBuilder.create().texOffs(699, 12).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(0.5F, 16.0F, -4.0F));

		PartDefinition Bullterrier4 = left_front_leg.addOrReplaceChild("Bullterrier4", CubeListBuilder.create().texOffs(699, 12).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.7F, 4.1F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bull_terrier_body2 = body.addOrReplaceChild("bull_terrier_body2", CubeListBuilder.create().texOffs(730, 16).addBox(-3.5F, -6.95F, -4.15F, 7.0F, 9.0F, 7.0F, new CubeDeformation(0.05F)), PartPose.offset(0.0F, 2.9F, 0.7F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.7F, -2.8F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bull_terrier_mane2 = upper_body.addOrReplaceChild("bull_terrier_mane2", CubeListBuilder.create().texOffs(715, 0).addBox(-4.0F, -13.0F, -7.55F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 9.8F, 3.7F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 9.35F, -7.1F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-2.0F, -0.85F, 2.4F));

		PartDefinition bull_terrier_ear_right2 = right_ear.addOrReplaceChild("bull_terrier_ear_right2", CubeListBuilder.create().texOffs(709, 1).addBox(-2.6327F, -11.0449F, -9.5769F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.2F))
		.texOffs(695, 0).addBox(-2.6181F, -11.058F, -9.8989F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(709, 1).addBox(-2.1893F, -11.6592F, -9.5381F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(3.5F, 7.45F, 8.65F, 0.0F, 0.0873F, -0.1309F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(2.0F, -1.15F, 2.2F));

		PartDefinition bull_terrier_ear_left2 = left_ear.addOrReplaceChild("bull_terrier_ear_left2", CubeListBuilder.create().texOffs(709, 1).addBox(-4.3559F, -10.9144F, -9.5121F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.2F))
		.texOffs(695, 0).addBox(-4.3705F, -10.9274F, -9.8289F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(709, 1).addBox(-3.7993F, -11.5287F, -9.4733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(1.5F, 8.25F, 9.2F, 0.0F, -0.0873F, 0.1309F));

		PartDefinition bull_terrier_head_rot = real_head.addOrReplaceChild("bull_terrier_head_rot", CubeListBuilder.create().texOffs(693, 0).addBox(-3.5F, -4.25F, -2.1F, 5.0F, 5.0F, 6.0F, new CubeDeformation(0.2F))
		.texOffs(710, 29).addBox(-3.61F, -4.05F, -2.365F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(710, 29).addBox(0.61F, -4.05F, -2.365F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 2.6F, 0.4F));

		PartDefinition bull_terrier_mouth2 = bull_terrier_head_rot.addOrReplaceChild("bull_terrier_mouth2", CubeListBuilder.create().texOffs(694, 23).addBox(-2.0F, -11.4289F, -8.5006F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.03F))
		.texOffs(710, 27).addBox(-1.5F, -8.1061F, -8.1855F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.05F))
		.texOffs(693, 3).addBox(-0.95F, -11.1532F, -8.6976F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(-1.0F, 6.85F, 4.45F, 0.2094F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}

	public static LayerDefinition german_shepherd() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 12.0F, 8.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition germanausshepherd_tail2 = real_tail.addOrReplaceChild("germanausshepherd_tail2", CubeListBuilder.create().texOffs(359, 2).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(365, 19).addBox(-1.5F, 0.0F, -5.0F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, 0.5F, -0.4712F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-2.5F, 16.0F, 7.0F));

		PartDefinition GermansheperdHusky4 = right_hind_leg.addOrReplaceChild("GermansheperdHusky4", CubeListBuilder.create().texOffs(279, 2).addBox(-2.0F, -0.25F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(0.5F, 16.0F, 7.0F));

		PartDefinition GermansheperdHusky3 = left_hind_leg.addOrReplaceChild("GermansheperdHusky3", CubeListBuilder.create().texOffs(279, 2).addBox(-2.0F, -0.25F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-2.5F, 16.0F, -4.0F));

		PartDefinition GermanAussheperdHusky4 = right_front_leg.addOrReplaceChild("GermanAussheperdHusky4", CubeListBuilder.create().texOffs(257, 22).addBox(-2.0F, -0.25F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(0.5F, 16.0F, -4.0F));

		PartDefinition GermanAussheperdHusky3 = left_front_leg.addOrReplaceChild("GermanAussheperdHusky3", CubeListBuilder.create().texOffs(257, 22).addBox(-2.0F, -0.25F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.5F, 3.6F, 1.5708F, 0.0F, 0.0F));

		PartDefinition asd = body.addOrReplaceChild("asd", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition germansheperd_body2 = asd.addOrReplaceChild("germansheperd_body2", CubeListBuilder.create().texOffs(336, 5).addBox(-3.5F, -4.0F, -0.5F, 7.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.2F, -3.55F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.0F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition german_shepherd_mane2 = upper_body.addOrReplaceChild("german_shepherd_mane2", CubeListBuilder.create().texOffs(308, 14).addBox(-4.0F, -13.0F, -7.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 10.0F, 3.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 9.0F, -6.8F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-2.0F, -1.6F, 0.3F));

		PartDefinition germanshepherd_ear_right2 = right_ear.addOrReplaceChild("germanshepherd_ear_right2", CubeListBuilder.create().texOffs(330, 0).addBox(-1.1271F, -4.4713F, -0.529F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F))
		.texOffs(316, 2).addBox(-0.1271F, -5.4413F, -0.529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, 0.865F, -0.75F, -0.0168F, -0.1312F, -0.169F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(2.0F, -1.6F, 0.3F));

		PartDefinition germanshepherd_ear_left2 = left_ear.addOrReplaceChild("germanshepherd_ear_left2", CubeListBuilder.create().texOffs(330, 0).mirror().addBox(-1.8729F, -4.4713F, -0.529F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
		.texOffs(316, 2).mirror().addBox(-0.8729F, -5.4413F, -0.529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.865F, -0.75F, -0.0168F, 0.1312F, 0.169F));

		PartDefinition germansheperd_head_rot2 = real_head.addOrReplaceChild("germansheperd_head_rot2", CubeListBuilder.create(), PartPose.offset(4.0F, 7.75F, 2.55F));

		PartDefinition germansheperd_head2 = germansheperd_head_rot2.addOrReplaceChild("germansheperd_head2", CubeListBuilder.create().texOffs(299, 0).addBox(-3.0F, -5.7275F, -4.2487F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(327, 5).addBox(-4.0F, -3.7275F, -3.2487F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(287, 12).addBox(-5.0F, -8.7075F, -2.6987F, 10.0F, 10.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(327, 5).addBox(3.0F, -3.7275F, -3.2487F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(338, 0).addBox(-1.95F, -4.0275F, -4.2687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F))
		.texOffs(338, 0).addBox(0.95F, -4.0275F, -4.2687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F))
		.texOffs(342, 0).addBox(1.7F, -4.0275F, -4.2587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(342, 0).addBox(-2.7F, -4.0275F, -4.2587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, -4.5225F, -0.2513F));

		PartDefinition mouth2 = germansheperd_head2.addOrReplaceChild("mouth2", CubeListBuilder.create().texOffs(317, 7).addBox(-1.5F, -0.8724F, -1.3784F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.7812F, -6.2237F, 0.1745F, 0.0F, 0.0F));

		PartDefinition neus2 = mouth2.addOrReplaceChild("neus2", CubeListBuilder.create().texOffs(479, 13).addBox(-1.5F, -0.869F, -1.1981F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(0.0F, -0.9062F, -1.325F, 0.0436F, 0.0F, 0.0F));

		PartDefinition germanshepherd_mouth_rot2 = mouth2.addOrReplaceChild("germanshepherd_mouth_rot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.448F, 3.3576F, 0.1309F, 0.0F, 0.0F));

		PartDefinition germanshepherd_mouth2 = germanshepherd_mouth_rot2.addOrReplaceChild("germanshepherd_mouth2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition germanshepherd_jaw2 = germanshepherd_mouth2.addOrReplaceChild("germanshepherd_jaw2", CubeListBuilder.create().texOffs(131, 11).addBox(-1.5F, -0.7778F, -3.5075F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.03F))
		.texOffs(221, 25).addBox(-1.5F, -1.0778F, -3.5075F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.05F))
		.texOffs(316, 0).addBox(-1.5F, -0.3944F, -3.4849F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.05F)), PartPose.offset(0.0F, 0.2881F, -1.0452F));

		PartDefinition germanshepherd_tongue_rot2 = germanshepherd_mouth2.addOrReplaceChild("germanshepherd_tongue_rot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.25F, 1.4792F, -3.7447F, 0.239F, 0.0F, 0.0F));

		PartDefinition germanshepherd_tongue2 = germanshepherd_tongue_rot2.addOrReplaceChild("germanshepherd_tongue2", CubeListBuilder.create().texOffs(294, 22).addBox(-1.6974F, -2.5932F, -2.2246F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.35F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition nose_bridge2 = germansheperd_head2.addOrReplaceChild("nose_bridge2", CubeListBuilder.create().texOffs(336, 3).addBox(-1.0F, -0.1768F, -1.2402F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -3.1825F, -4.7398F, 0.5236F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}

	public static LayerDefinition rottweiler() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 11.0F, 8.25F));

		var real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.ZERO);

		PartDefinition real_tail2 = real_tail.addOrReplaceChild("real_tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 1.5F, -1.25F, 1.2217F, 0.0F, 0.0F));

		PartDefinition rottweiler7 = real_tail2.addOrReplaceChild("rottweiler7", CubeListBuilder.create().texOffs(1307, 8).addBox(-1.999F, 2.3617F, -0.174F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(2.5F, -1.0F, 4.0F, -1.2217F, 0.0F, 0.0F));

		PartDefinition bone2 = rottweiler7.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(1317, 20).addBox(-0.999F, -1.4F, 1.2439F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-1.0F, 7.1F, -1.4F, -0.5672F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-2.5F, 16.0F, 7.0F));

		PartDefinition rottweiler4 = right_hind_leg.addOrReplaceChild("rottweiler4", CubeListBuilder.create().texOffs(1295, 13).addBox(-3.5F, -8.0F, 6.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 8.0F, -7.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(0.5F, 16.0F, 7.0F));

		PartDefinition rottweiler3 = left_hind_leg.addOrReplaceChild("rottweiler3", CubeListBuilder.create().texOffs(1295, 13).addBox(1.5F, -8.0F, 6.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 8.0F, -7.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-2.5F, 16.0F, -4.0F));

		PartDefinition rottweiler6 = right_front_leg.addOrReplaceChild("rottweiler6", CubeListBuilder.create().texOffs(1295, 13).addBox(-3.5F, -8.0F, -5.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 8.0F, 4.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(0.5F, 16.0F, -4.0F));

		PartDefinition rottweiler5 = left_front_leg.addOrReplaceChild("rottweiler5", CubeListBuilder.create().texOffs(1295, 13).addBox(1.5F, -8.0F, -5.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 8.0F, 4.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.2F, 4.2F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_sub_2 = body.addOrReplaceChild("body_sub_2", CubeListBuilder.create(), PartPose.offset(0.0F, -2.2F, 0.2F));

		PartDefinition rottweiler2 = body_sub_2.addOrReplaceChild("rottweiler2", CubeListBuilder.create().texOffs(1312, 0).addBox(-3.5F, -3.75F, -1.75F, 7.0F, 7.0F, 9.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, -0.15F, -0.35F, -1.5708F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 14.7F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane_sub_2 = upper_body.addOrReplaceChild("mane_sub_2", CubeListBuilder.create(), PartPose.offset(1.0F, 2.5F, 3.2F));

		PartDefinition rottweiler10 = mane_sub_2.addOrReplaceChild("rottweiler10", CubeListBuilder.create().texOffs(1331, 18).addBox(-8.0F, -6.75F, -1.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 1.25F, -5.8F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 9.9F, -6.2F));
		
		var real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.ZERO);
		
		PartDefinition real_head2 = real_head.addOrReplaceChild("real_head2", CubeListBuilder.create(), PartPose.offset(0.0F, 3.6F, -0.8F));

		PartDefinition right_ear = real_head2.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-3.0F, -5.5F, 0.5F));

		PartDefinition rottweiler_ear_right2 = right_ear.addOrReplaceChild("rottweiler_ear_right2", CubeListBuilder.create().texOffs(1301, 23).addBox(1.75F, -13.4F, -6.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1323, 26).addBox(2.0F, -13.5F, -9.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(1295, 23).addBox(2.0271F, -10.494F, -8.4039F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.75F, 11.95F, 7.25F, 0.0F, -0.0873F, 0.0873F));

		PartDefinition left_ear = real_head2.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(3.5F, -5.4F, 0.5F));

		PartDefinition rottweiler_ear_left2 = left_ear.addOrReplaceChild("rottweiler_ear_left2", CubeListBuilder.create().texOffs(1301, 23).addBox(2.25F, -13.4F, -6.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1323, 26).addBox(2.0F, -13.5F, -9.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(1295, 23).addBox(1.9816F, -10.494F, -8.5035F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, 12.25F, 7.25F, 0.0F, 0.0873F, -0.0873F));

		PartDefinition rottweiler9 = real_head2.addOrReplaceChild("rottweiler9", CubeListBuilder.create().texOffs(1299, 20).addBox(-4.0F, -3.05F, -3.5F, 6.0F, 6.0F, 6.0F, new CubeDeformation(-0.1F))
		.texOffs(1291, 0).addBox(-1.5F, -0.65F, -6.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F))
		.texOffs(1291, 0).addBox(-1.5F, 0.35F, -6.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offset(1.0F, -3.75F, 1.25F));

		PartDefinition rottweiler_mouth2 = rottweiler9.addOrReplaceChild("rottweiler_mouth2", CubeListBuilder.create().texOffs(1293, 0).addBox(-2.0F, -13.9915F, -7.2911F, 4.0F, 3.0F, 4.0F, new CubeDeformation(-0.1F))
		.texOffs(1305, 3).addBox(-2.0F, -11.2308F, -7.2876F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, 13.4F, 0.35F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rottweiler_eye_left2 = rottweiler9.addOrReplaceChild("rottweiler_eye_left2", CubeListBuilder.create().texOffs(1273, 19).addBox(0.8022F, -11.5999F, -9.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.06F))
		.texOffs(1291, 0).addBox(0.4522F, -11.5999F, -9.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offset(-0.5F, 9.8F, 5.8F));

		PartDefinition rottweiler_eye_right2 = rottweiler9.addOrReplaceChild("rottweiler_eye_right2", CubeListBuilder.create().texOffs(1291, 0).addBox(1.5417F, -11.578F, -9.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F))
		.texOffs(1311, 0).addBox(1.8418F, -12.83F, -9.39F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
		.texOffs(1311, 0).addBox(4.0918F, -12.83F, -9.39F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
		.texOffs(1273, 19).addBox(1.1917F, -11.578F, -9.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.06F)), PartPose.offset(-4.5F, 9.8F, 5.9F));

		PartDefinition bridge2 = rottweiler9.addOrReplaceChild("bridge2", CubeListBuilder.create().texOffs(1305, 0).addBox(-1.0F, -8.9044F, -7.2387F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, 9.2F, -2.5F, -0.6109F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}

	public static LayerDefinition pug() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 13.75F, 7.0F, 1.8326F, 0.0F, 0.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.75F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition Pug7 = real_tail.addOrReplaceChild("Pug7", CubeListBuilder.create().texOffs(447, 0).addBox(-2.0F, -2.63F, -1.11F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(2.0F, 0.0F, 2.0F));

		PartDefinition bone2 = Pug7.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(433, 1).addBox(-1.0F, -9.13F, 1.89F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.201F)), PartPose.offset(-1.0F, 8.5F, -5.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-1.5F, 19.0F, 4.5F));

		PartDefinition pug5 = right_hind_leg.addOrReplaceChild("pug5", CubeListBuilder.create().texOffs(456, 2).addBox(-2.0F, 1.0F, -3.25F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -3.0F, 2.5F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(1.5F, 19.0F, 4.5F));

		PartDefinition pug2 = left_hind_leg.addOrReplaceChild("pug2", CubeListBuilder.create().texOffs(456, 2).addBox(-2.0F, 1.0F, -3.25F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -3.0F, 2.5F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-1.5F, 19.0F, -4.0F));

		PartDefinition pug6 = right_front_leg.addOrReplaceChild("pug6", CubeListBuilder.create().texOffs(456, 2).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -3.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(1.5F, 19.0F, -4.0F));

		PartDefinition pug4 = left_front_leg.addOrReplaceChild("pug4", CubeListBuilder.create().texOffs(456, 2).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -3.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 16.55F, 1.6F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_rotation2 = body.addOrReplaceChild("body_rotation2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.4F, 2.55F));

		PartDefinition body_sub_2 = body_rotation2.addOrReplaceChild("body_sub_2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Pug9 = body_sub_2.addOrReplaceChild("Pug9", CubeListBuilder.create().texOffs(457, 13).addBox(-3.0F, -2.0F, -5.5F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.45F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 16.6F, -2.7F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane_sub_2 = upper_body.addOrReplaceChild("mane_sub_2", CubeListBuilder.create(), PartPose.offset(0.0F, 2.2F, 5.1F));

		PartDefinition Pugbasset2 = mane_sub_2.addOrReplaceChild("Pugbasset2", CubeListBuilder.create().texOffs(434, 6).addBox(-3.5F, -5.25F, -8.5F, 7.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 14.5F, -7.6F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-2.0F, -4.0F, 1.1F));

		PartDefinition pug_ear_right2 = right_ear.addOrReplaceChild("pug_ear_right2", CubeListBuilder.create().texOffs(462, 28).addBox(2.5347F, -8.1303F, -8.3997F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F))
		.texOffs(462, 28).addBox(2.4695F, -7.6514F, -8.2716F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F))
		.texOffs(471, 28).addBox(3.1674F, -7.6338F, -8.7542F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(8.0F, -2.0F, 1.75F, 1.2654F, 1.7017F, -0.0436F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(2.0F, -4.0F, 1.1F));

		PartDefinition pug_ear_left2 = left_ear.addOrReplaceChild("pug_ear_left2", CubeListBuilder.create().texOffs(462, 28).addBox(1.6933F, -7.5982F, -8.6747F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F))
		.texOffs(462, 28).addBox(1.6281F, -8.0771F, -8.8028F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F))
		.texOffs(471, 28).addBox(2.4107F, -7.5916F, -9.3494F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(-7.5F, -2.0F, -5.5F, 1.2217F, -1.7017F, 0.0436F));

		PartDefinition Pug3 = real_head.addOrReplaceChild("Pug3", CubeListBuilder.create().texOffs(449, 22).addBox(-1.5F, 1.5F, 3.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.1F))
		.texOffs(449, 22).addBox(-1.5F, 1.75F, 2.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F))
		.texOffs(449, 22).addBox(-1.5F, 1.75F, 2.35F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F))
		.texOffs(431, 20).addBox(-3.0F, -1.0F, 3.75F, 6.0F, 6.0F, 6.0F, new CubeDeformation(-0.05F))
		.texOffs(433, 24).addBox(-0.5F, 1.25F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
		.texOffs(455, 28).addBox(-0.5F, -0.95F, 3.79F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(465, 26).addBox(-0.5F, -0.99F, 4.29F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(458, 28).addBox(-2.0F, 0.75F, 3.7999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
		.texOffs(458, 28).addBox(1.0F, 0.75F, 3.7999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
		.texOffs(458, 30).addBox(-2.5F, 0.75F, 3.799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F))
		.texOffs(458, 30).addBox(1.5F, 0.75F, 3.799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offset(0.0F, -1.5F, -5.4F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition australian_shepherd() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 11.75F, 7.75F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(-1.0F, -0.25F, -2.25F));

		PartDefinition aus_tail = real_tail.addOrReplaceChild("aus_tail", CubeListBuilder.create().texOffs(359, 2).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(365, 19).addBox(-1.5F, 0.0F, -5.0F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 1.05F, 1.75F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-1.5F, 17.0F, 8.0F));

		PartDefinition leg9 = right_hind_leg.addOrReplaceChild("leg9", CubeListBuilder.create(), PartPose.offset(4.0F, -1.0F, -1.0F));

		PartDefinition Nieuwwolfausshepherd6 = leg9.addOrReplaceChild("Nieuwwolfausshepherd6", CubeListBuilder.create().texOffs(864, 10).mirror().addBox(0.0F, -0.2477F, -2.3523F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false)
		.texOffs(852, 9).mirror().addBox(0.0F, -0.1F, -0.2F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offset(-5.0F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(1.5F, 17.0F, 8.0F));

		PartDefinition leg1 = left_hind_leg.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offset(-4.0F, -1.0F, -1.0F));

		PartDefinition Nieuwwolfausshepherd4 = leg1.addOrReplaceChild("Nieuwwolfausshepherd4", CubeListBuilder.create().texOffs(864, 10).addBox(-2.0F, -0.2477F, -2.3523F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.1F))
		.texOffs(852, 9).addBox(-2.0F, -0.1F, -0.2F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offset(5.0F, 0.0F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-1.5F, 18.0F, -4.0F));

		PartDefinition leg10 = right_front_leg.addOrReplaceChild("leg10", CubeListBuilder.create(), PartPose.offset(4.0F, -2.0F, 0.0F));

		PartDefinition GermanAussheperdHusky5 = leg10.addOrReplaceChild("GermanAussheperdHusky5", CubeListBuilder.create().texOffs(257, 22).mirror().addBox(0.0F, -0.25F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offset(-5.0F, 0.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(1.5F, 18.0F, -4.0F));

		PartDefinition leg3 = left_front_leg.addOrReplaceChild("leg3", CubeListBuilder.create(), PartPose.offset(-4.0F, -2.0F, 0.0F));

		PartDefinition GermanAussheperdHusky = leg3.addOrReplaceChild("GermanAussheperdHusky", CubeListBuilder.create().texOffs(257, 22).addBox(-2.0F, -0.25F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(5.0F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(730, 16).addBox(-3.5F, -0.95F, -3.15F, 7.0F, 9.0F, 7.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(0.0F, 15.0F, 1.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 15.0F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane2 = upper_body.addOrReplaceChild("mane2", CubeListBuilder.create().texOffs(715, 0).addBox(-4.0F, -5.5F, -2.05F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.5F, -1.5F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 9.5F, -7.25F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-2.25F, -2.0F, -0.5F));

		PartDefinition oor15 = right_ear.addOrReplaceChild("oor15", CubeListBuilder.create().texOffs(933, 0).addBox(2.147F, -12.957F, -8.3258F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(933, 0).addBox(2.647F, -9.9672F, -8.3093F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(933, 0).addBox(2.1224F, -12.9566F, -7.7519F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-9.0F, 11.2F, -3.25F, -1.1956F, 0.829F, 0.0F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(2.25F, -2.0F, -0.5F));

		PartDefinition oor16 = left_ear.addOrReplaceChild("oor16", CubeListBuilder.create().texOffs(933, 0).mirror().addBox(-5.147F, -12.9753F, -8.3723F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(933, 0).mirror().addBox(-4.647F, -9.9855F, -8.3558F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(933, 0).mirror().addBox(-5.1224F, -12.9749F, -7.7984F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(9.0F, 11.25F, -3.25F, -1.1956F, -0.829F, 0.0F));

		PartDefinition australianshepherd_head = real_head.addOrReplaceChild("australianshepherd_head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, 2.25F, 1.5708F, 0.0F, 0.0F));

		PartDefinition australianshepherd_head_rot = australianshepherd_head.addOrReplaceChild("australianshepherd_head_rot", CubeListBuilder.create().texOffs(933, 0).addBox(-4.0F, -5.75F, -2.1F, 6.0F, 6.0F, 5.0F, new CubeDeformation(-0.1F))
		.texOffs(955, 0).addBox(-6.0F, -6.55F, -0.35F, 10.0F, 8.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(628, 0).addBox(-4.9F, 1.45F, -0.34F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(950, 0).addBox(0.0F, -3.85F, -2.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(950, 3).addBox(0.6F, -3.85F, -2.03F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(950, 3).addBox(-3.5F, -3.85F, -2.03F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0F, -2.75F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mane_sub_9 = australianshepherd_head_rot.addOrReplaceChild("mane_sub_9", CubeListBuilder.create().texOffs(950, 0).mirror().addBox(-3.0F, -3.85F, -2.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone165 = australianshepherd_head_rot.addOrReplaceChild("bone165", CubeListBuilder.create().texOffs(628, 0).addBox(-5.9F, -15.5F, -8.99F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -13.05F, 8.65F, 0.0F, 0.0F, -3.1416F));

		PartDefinition bone42 = australianshepherd_head_rot.addOrReplaceChild("bone42", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, -7.4F, 12.8F, 1.1781F, 0.0F, 0.0F));

		PartDefinition bone179 = bone42.addOrReplaceChild("bone179", CubeListBuilder.create().texOffs(213, 26).addBox(-1.0F, -0.7828F, -1.9243F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5F, -12.4163F, -10.3409F, -0.4363F, 0.0F, 0.0F));

		PartDefinition bone164 = bone42.addOrReplaceChild("bone164", CubeListBuilder.create().texOffs(239, 28).addBox(1.0F, -12.0808F, -8.7317F, 1.0F, 0.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, -4.3692F, 3.6917F, 0.3927F, 0.0F, 0.0F));

		PartDefinition bone44 = australianshepherd_head_rot.addOrReplaceChild("bone44", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -1.7805F, -3.9914F, 0.1833F, 0.0F, 0.0F));

		PartDefinition bone180 = bone44.addOrReplaceChild("bone180", CubeListBuilder.create().texOffs(1156, 26).addBox(-1.5F, -1.2909F, -1.41F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.85F)), PartPose.offsetAndRotation(0.0F, -0.39F, -0.8447F, -0.0436F, 0.0F, 0.0F));

		PartDefinition bone140 = bone44.addOrReplaceChild("bone140", CubeListBuilder.create().texOffs(934, 11).addBox(-1.5F, -1.0F, -3.5F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.05F)), PartPose.offset(0.0F, 0.2093F, 2.2775F));

		PartDefinition ausshepherd_jaw = bone44.addOrReplaceChild("ausshepherd_jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 1.5576F, 2.2055F));

		PartDefinition ausshepherd_jaw_rot = ausshepherd_jaw.addOrReplaceChild("ausshepherd_jaw_rot", CubeListBuilder.create().texOffs(652, 1).addBox(-1.5F, -0.1533F, -3.3171F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F))
		.texOffs(950, 13).addBox(-1.5F, -0.657F, -3.3944F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
		.texOffs(411, 21).addBox(-1.5F, -1.0079F, -3.3594F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition ausshepherd_tongue = bone44.addOrReplaceChild("ausshepherd_tongue", CubeListBuilder.create(), PartPose.offset(0.25F, 3.354F, 1.3792F));

		PartDefinition ausshepherd_tongue_rot = ausshepherd_tongue.addOrReplaceChild("ausshepherd_tongue_rot", CubeListBuilder.create().texOffs(294, 27).addBox(-1.6974F, -2.7991F, -1.6243F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0F, 0.5111F, -0.9342F, 0.6109F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition beagle() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 13.4F, 6.85F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(-1.0F, -1.5F, -0.75F));

		PartDefinition beagle_tail = real_tail.addOrReplaceChild("beagle_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition Beagle8 = beagle_tail.addOrReplaceChild("Beagle8", CubeListBuilder.create().texOffs(677, 17).addBox(-2.0F, -2.3397F, -1.8808F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 4.0F, -1.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-2.0F, 18.0F, 6.0F));

		PartDefinition leg2 = right_hind_leg.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offset(2.5F, -2.0F, 1.0F));

		PartDefinition Beagle5 = leg2.addOrReplaceChild("Beagle5", CubeListBuilder.create().texOffs(669, 17).addBox(-2.5F, 0.0F, -2.05F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(669, 17).addBox(-2.5F, 2.0F, -2.85F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offset(-1.0F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(2.0F, 18.0F, 6.0F));

		PartDefinition leg1 = left_hind_leg.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offset(-4.5F, -2.0F, 1.0F));

		PartDefinition Beagle4 = leg1.addOrReplaceChild("Beagle4", CubeListBuilder.create().texOffs(669, 17).addBox(-1.5F, 0.0F, -2.05F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(669, 17).addBox(-1.5F, 2.0F, -2.85F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offset(5.0F, 0.0F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-2.25F, 19.5F, -4.0F));

		PartDefinition leg4 = right_front_leg.addOrReplaceChild("leg4", CubeListBuilder.create(), PartPose.offset(2.75F, -3.5F, 0.0F));

		PartDefinition Beagle7 = leg4.addOrReplaceChild("Beagle7", CubeListBuilder.create().texOffs(686, 22).addBox(-2.5F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 0.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(2.0F, 19.5F, -4.0F));

		PartDefinition leg3 = left_front_leg.addOrReplaceChild("leg3", CubeListBuilder.create(), PartPose.offset(-4.5F, -3.5F, 0.0F));

		PartDefinition Beagle6 = leg3.addOrReplaceChild("Beagle6", CubeListBuilder.create().texOffs(686, 22).addBox(-1.5F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 16.5F, 1.5F, 1.5708F, 0.0F, 0.0F));

		PartDefinition ad = body.addOrReplaceChild("ad", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition beagle_body = ad.addOrReplaceChild("beagle_body", CubeListBuilder.create(), PartPose.offset(0.0F, -2.5F, 0.5F));

		PartDefinition body_rotation = beagle_body.addOrReplaceChild("body_rotation", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_sub_1 = body_rotation.addOrReplaceChild("body_sub_1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Beagle2 = body_sub_1.addOrReplaceChild("Beagle2", CubeListBuilder.create().texOffs(641, 7).addBox(-4.0F, -2.1F, -5.0F, 8.0F, 8.0F, 6.0F, new CubeDeformation(-0.201F)), PartPose.offset(0.0F, 0.0F, 0.2F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 16.5F, -2.5F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation = upper_body.addOrReplaceChild("mane_rotation", CubeListBuilder.create(), PartPose.offset(0.0F, 2.0F, 0.0F));

		PartDefinition mane_sub_1 = mane_rotation.addOrReplaceChild("mane_sub_1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Beagle3 = mane_sub_1.addOrReplaceChild("Beagle3", CubeListBuilder.create().texOffs(669, 4).addBox(-5.0F, -2.65F, -5.75F, 8.0F, 6.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offset(1.0F, -2.5F, 2.5F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 11.0F, -6.5F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-3.0F, -1.0F, 1.0F));

		PartDefinition oor5 = right_ear.addOrReplaceChild("oor5", CubeListBuilder.create().texOffs(643, 24).addBox(0.9343F, -15.95F, -9.1938F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(591, 28).addBox(0.9375F, -11.95F, -8.9246F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(567, 28).addBox(1.498F, -16.95F, -9.2556F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.3F, 16.25F, 6.25F, -0.0175F, -0.4451F, 0.0F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(3.0F, -1.0F, 1.0F));

		PartDefinition oor2 = left_ear.addOrReplaceChild("oor2", CubeListBuilder.create().texOffs(643, 24).mirror().addBox(-1.9343F, -15.95F, -9.1938F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(591, 28).mirror().addBox(-1.9375F, -11.95F, -8.9246F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(567, 28).mirror().addBox(-2.498F, -16.95F, -9.2556F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.3F, 16.25F, 6.25F, -0.0175F, 0.4451F, 0.0F));

		PartDefinition beagle_head = real_head.addOrReplaceChild("beagle_head", CubeListBuilder.create(), PartPose.offset(-1.0F, 3.0F, 3.25F));

		PartDefinition Beagle = beagle_head.addOrReplaceChild("Beagle", CubeListBuilder.create().texOffs(619, 20).addBox(-4.0F, -3.15F, -2.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -2.0F, -3.0F));

		PartDefinition bone33 = Beagle.addOrReplaceChild("bone33", CubeListBuilder.create().texOffs(654, 24).addBox(-4.9F, -11.25F, -8.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(-0.1F))
		.texOffs(568, 26).addBox(-3.9F, -11.3F, -8.0517F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 10.3F, 2.7F, 0.0349F, 0.0F, 0.0F));

		PartDefinition neus2 = bone33.addOrReplaceChild("neus2", CubeListBuilder.create().texOffs(577, 6).addBox(0.1F, -7.6828F, -7.9586F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.0001F))
		.texOffs(581, 28).addBox(0.5F, -7.6846F, -7.9586F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(577, 6).addBox(0.9F, -7.6828F, -7.9586F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.0001F)), PartPose.offsetAndRotation(-3.9F, -5.7748F, 2.6915F, 0.2618F, 0.0F, 0.0F));

		PartDefinition bone34 = bone33.addOrReplaceChild("bone34", CubeListBuilder.create().texOffs(670, 27).addBox(-2.1F, -8.7482F, -7.4F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.11F))
		.texOffs(575, 29).addBox(0.8F, -8.4982F, -6.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.101F))
		.texOffs(575, 29).addBox(-2.0F, -8.4982F, -6.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.101F)), PartPose.offsetAndRotation(-2.8F, -0.107F, -0.3982F, -0.0175F, 0.0F, 0.0F));

		PartDefinition oog = Beagle.addOrReplaceChild("oog", CubeListBuilder.create().texOffs(594, 23).addBox(2.4963F, -11.4694F, -7.03F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(637, 24).addBox(2.0457F, -11.4707F, -7.02F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.55F, 9.7F, 5.0F));

		PartDefinition oog2 = Beagle.addOrReplaceChild("oog2", CubeListBuilder.create().texOffs(594, 23).addBox(0.5455F, -11.4457F, -7.03F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(637, 24).addBox(1.146F, -11.4457F, -7.02F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 9.7F, 5.0F));

		PartDefinition bone32 = Beagle.addOrReplaceChild("bone32", CubeListBuilder.create().texOffs(557, 30).addBox(0.501F, -9.773F, -5.0722F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.001F))
		.texOffs(653, 22).addBox(0.1F, -9.7093F, -5.05F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F))
		.texOffs(653, 22).addBox(0.9F, -9.7093F, -5.05F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-2.0F, 7.55F, 0.55F, -0.2443F, 0.0F, 0.0F));

		PartDefinition bone36 = Beagle.addOrReplaceChild("bone36", CubeListBuilder.create().texOffs(582, 29).addBox(0.5F, -7.6852F, -7.1994F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 4.5252F, 5.1914F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}	
	
	public static LayerDefinition bernese_dog() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 10.55F, 8.75F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition asca = real_tail.addOrReplaceChild("asca", CubeListBuilder.create(), PartPose.offset(-1.0F, 2.25F, -0.75F));

		PartDefinition stbernard8 = asca.addOrReplaceChild("stbernard8", CubeListBuilder.create().texOffs(1545, 18).addBox(-2.5F, -3.9022F, 0.3997F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(1557, 20).addBox(-2.5F, -3.9022F, -2.6003F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 1.0F, -1.35F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create().texOffs(709, 15).mirror().addBox(-0.5F, -0.25F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.3F)).mirror(false), PartPose.offset(-2.5F, 16.0F, 7.0F));

		PartDefinition bone11 = right_hind_leg.addOrReplaceChild("bone11", CubeListBuilder.create().texOffs(542, 9).mirror().addBox(2.5F, -7.9F, 2.95F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, 7.65F, 1.35F, 0.0F, -3.1416F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create().texOffs(709, 15).addBox(-1.5F, -0.25F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.3F)), PartPose.offset(2.5F, 16.0F, 7.0F));

		PartDefinition bone10 = left_hind_leg.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(542, 9).addBox(-2.5F, -7.9F, 2.95F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 7.65F, 1.35F, 0.0F, 3.1416F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create().texOffs(1504, 8).mirror().addBox(-0.5F, -0.35F, -1.25F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.3F)).mirror(false)
		.texOffs(550, 9).mirror().addBox(-0.5F, -0.65F, 1.05F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.5F, 16.0F, -4.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create().texOffs(1504, 8).addBox(-1.5F, -0.35F, -1.25F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.3F))
		.texOffs(550, 9).addBox(0.5F, -0.65F, 1.05F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 16.0F, -4.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.75F, 2.5F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_sub_2 = body.addOrReplaceChild("body_sub_2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.5F, 0.0F));

		PartDefinition stbernardbernese3 = body_sub_2.addOrReplaceChild("stbernardbernese3", CubeListBuilder.create().texOffs(1528, 2).addBox(-3.5F, -3.4F, -0.15F, 7.0F, 8.0F, 8.0F, new CubeDeformation(0.4F))
		.texOffs(1534, 8).addBox(-3.5F, -3.4F, -2.95F, 7.0F, 8.0F, 2.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, -1.25F, 0.9F, -1.5708F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.5F, -3.75F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane_sub_2 = upper_body.addOrReplaceChild("mane_sub_2", CubeListBuilder.create(), PartPose.offset(0.0F, 3.25F, 2.0F));

		PartDefinition stbernardbernese6 = mane_sub_2.addOrReplaceChild("stbernardbernese6", CubeListBuilder.create().texOffs(1503, 9).addBox(-8.0F, -7.75F, -2.1F, 8.0F, 8.0F, 9.0F, new CubeDeformation(0.2F)), PartPose.offset(4.0F, 1.25F, -4.5F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 6.5F, -7.5F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-3.0F, -1.0F, 1.0F));

		PartDefinition oor2 = right_ear.addOrReplaceChild("oor2", CubeListBuilder.create().texOffs(1569, 23).addBox(1.0342F, -19.3969F, -12.3696F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(1539, 28).addBox(1.057F, -14.4153F, -12.0191F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(1494, 15).addBox(1.2265F, -13.4298F, -12.0137F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.75F, 17.6F, 9.05F, -0.0436F, -0.2182F, 0.1745F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(3.0F, -1.0F, 1.0F));

		PartDefinition oor3 = left_ear.addOrReplaceChild("oor3", CubeListBuilder.create().texOffs(1569, 23).mirror().addBox(-2.0342F, -19.3969F, -12.3696F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(1539, 28).mirror().addBox(-2.057F, -14.4153F, -12.0191F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(1494, 15).mirror().addBox(-2.2265F, -13.4298F, -12.0137F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(7.75F, 17.6F, 9.05F, -0.0436F, 0.2182F, -0.1745F));

		PartDefinition asccsa2 = real_head.addOrReplaceChild("asccsa2", CubeListBuilder.create(), PartPose.offset(-1.0F, 6.0F, 2.5F));

		PartDefinition bernesemountaindog2 = asccsa2.addOrReplaceChild("bernesemountaindog2", CubeListBuilder.create().texOffs(1638, 18).addBox(-3.5F, -20.05F, -11.85F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(1456, 30).addBox(-2.3F, -18.0F, -11.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F))
		.texOffs(1467, 29).addBox(-0.5F, -20.01F, -11.81F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F))
		.texOffs(1467, 29).addBox(-0.5F, -18.91F, -11.81F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F))
		.texOffs(1460, 30).addBox(-2.85F, -18.0F, -11.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.08F))
		.texOffs(1456, 30).addBox(1.25F, -18.0F, -11.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F))
		.texOffs(1460, 30).addBox(1.8F, -18.0F, -11.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.08F)), PartPose.offset(1.0F, 11.55F, 7.5F));

		PartDefinition bone2 = bernesemountaindog2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.75F, 5.25F, 0.3491F, 0.0F, 0.0F));

		PartDefinition bone3 = bernesemountaindog2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(1478, 0).addBox(3.9525F, -11.8972F, -7.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.25F, -6.9F, -3.95F, 0.0F, 0.0F, -0.1309F));

		PartDefinition bone4 = bernesemountaindog2.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(1478, 0).addBox(2.5775F, -11.8799F, -7.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2F, -7.9F, -3.95F, 0.0F, 0.0F, 0.1309F));

		PartDefinition mond2 = bernesemountaindog2.addOrReplaceChild("mond2", CubeListBuilder.create().texOffs(1667, 25).addBox(-1.5F, -10.8276F, -8.4093F, 4.0F, 3.0F, 4.0F, new CubeDeformation(-0.13F))
		.texOffs(553, 30).addBox(0.0F, -9.9246F, -8.3149F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -6.4F, -6.65F, 0.0524F, 0.0F, 0.0F));

		PartDefinition bone5 = mond2.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(1452, 30).addBox(2.0F, -12.7397F, -8.3555F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.3F)), PartPose.offset(-2.0F, 2.25F, 0.25F));

		PartDefinition bone6 = mond2.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(1631, 11).addBox(-1.5F, -8.5093F, -9.2932F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.23F))
		.texOffs(966, 9).addBox(-1.5F, -8.0393F, -9.2932F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F))
		.texOffs(1659, 18).addBox(-1.0F, -8.0993F, -9.1672F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.28F)), PartPose.offsetAndRotation(0.0F, 0.5893F, 0.3898F, -0.0524F, 0.0F, 0.0F));

		PartDefinition head_sub_2 = bone6.addOrReplaceChild("head_sub_2", CubeListBuilder.create().texOffs(965, 8).mirror().addBox(0.5F, -8.0393F, -9.2932F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition neus2 = mond2.addOrReplaceChild("neus2", CubeListBuilder.create().texOffs(1446, 29).addBox(0.0F, -13.2162F, -4.9212F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.056F)), PartPose.offsetAndRotation(0.0F, -10.415F, 9.0455F, 1.1694F, 0.0F, 0.0F));

		PartDefinition bone7 = neus2.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(1430, 29).addBox(-0.5F, -16.1343F, -6.5443F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
		.texOffs(1438, 29).addBox(-0.5F, -16.1343F, -4.9444F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.3555F, -13.9238F, -0.829F, 0.0F, 0.0F));

		PartDefinition bone8 = bernesemountaindog2.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4F, -7.5F, 0.35F, 0.0436F, 0.0F, -1.1781F));

		PartDefinition oor4 = bernesemountaindog2.addOrReplaceChild("oor4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4F, -10.5F, 0.75F, 0.0F, -0.1745F, 0.0F));

		PartDefinition oor5 = bernesemountaindog2.addOrReplaceChild("oor5", CubeListBuilder.create(), PartPose.offsetAndRotation(6.15F, -10.5F, 0.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition bone9 = oor5.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4924F, 3.0F, -0.3132F, 0.0436F, 0.0F, 1.1781F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition dachshund() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 16.0F, 7.5F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition dachshund_tail = tail.addOrReplaceChild("dachshund_tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3064F, 0.2981F, 1.5708F, 0.0F, 0.0F));

		PartDefinition dachshund_tail_rotation = dachshund_tail.addOrReplaceChild("dachshund_tail_rotation", CubeListBuilder.create().texOffs(860, 11).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.75F, -1.5708F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-1.5F, 18.0F, 7.0F));

		PartDefinition Dachshundjackrusselleg1_rotation3 = right_hind_leg.addOrReplaceChild("Dachshundjackrusselleg1_rotation3", CubeListBuilder.create(), PartPose.offset(0.0F, 5.0F, -11.5F));

		PartDefinition mane_sub_4 = Dachshundjackrusselleg1_rotation3.addOrReplaceChild("mane_sub_4", CubeListBuilder.create().texOffs(925, 2).addBox(-1.0F, -4.0F, 9.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(1.5F, 18.0F, 7.0F));

		PartDefinition Dachshundjackrusselleg1_rotation2 = left_hind_leg.addOrReplaceChild("Dachshundjackrusselleg1_rotation2", CubeListBuilder.create(), PartPose.offset(0.0F, 5.0F, -11.5F));

		PartDefinition mane_sub_87 = Dachshundjackrusselleg1_rotation2.addOrReplaceChild("mane_sub_87", CubeListBuilder.create().texOffs(925, 2).mirror().addBox(-1.0F, -4.0F, 9.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-1.5F, 19.0F, -3.5F));

		PartDefinition Dachshundjackrusselleg3_rotation3 = right_front_leg.addOrReplaceChild("Dachshundjackrusselleg3_rotation3", CubeListBuilder.create(), PartPose.offset(0.0F, -2.5F, -3.0F));

		PartDefinition mane_sub_3 = Dachshundjackrusselleg3_rotation3.addOrReplaceChild("mane_sub_3", CubeListBuilder.create().texOffs(925, 0).addBox(-1.0F, 0.5F, 2.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(1.5F, 19.0F, -3.5F));

		PartDefinition Dachshundjackrusselleg3_rotation2 = left_front_leg.addOrReplaceChild("Dachshundjackrusselleg3_rotation2", CubeListBuilder.create(), PartPose.offset(0.0F, -2.5F, -3.0F));

		PartDefinition mane_sub_2 = Dachshundjackrusselleg3_rotation2.addOrReplaceChild("mane_sub_2", CubeListBuilder.create().texOffs(925, 0).mirror().addBox(-1.0F, 0.5F, 2.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 17.5F, 3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition Dachshund_body2 = body.addOrReplaceChild("Dachshund_body2", CubeListBuilder.create().texOffs(909, 18).addBox(-2.5F, -5.75F, -6.7F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.05F)), PartPose.offset(0.0F, 4.0F, 4.1F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 18.25F, -2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition dachshundmane2 = upper_body.addOrReplaceChild("dachshundmane2", CubeListBuilder.create().texOffs(1741, 0).addBox(-3.0F, -12.75F, -10.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 9.0F, 7.25F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 13.5F, -6.0F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(2.0F, -1.5F, 0.25F));

		PartDefinition dachshund_ear_left2 = left_ear.addOrReplaceChild("dachshund_ear_left2", CubeListBuilder.create().texOffs(902, 10).addBox(6.0406F, -10.6247F, -9.3223F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(914, 1).addBox(5.8624F, -7.9415F, -8.5785F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3371F, 11.7042F, 8.7746F, -0.1554F, 0.6055F, -0.0722F));

		PartDefinition bone27_r1 = dachshund_ear_left2.addOrReplaceChild("bone27_r1", CubeListBuilder.create().texOffs(904, 18).addBox(0.9364F, -5.3589F, 6.6052F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4995F, -6.3938F, -15.4367F, 0.0F, -0.3927F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-2.0F, -1.5F, 0.25F));

		PartDefinition dachshund_ear_right2 = right_ear.addOrReplaceChild("dachshund_ear_right2", CubeListBuilder.create().texOffs(902, 10).mirror().addBox(-7.0406F, -10.6247F, -9.3223F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(914, 1).mirror().addBox(-6.8624F, -7.9415F, -8.5785F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3371F, 11.7042F, 8.7746F, -0.1554F, -0.6055F, 0.0722F));

		PartDefinition bone28_r1 = dachshund_ear_right2.addOrReplaceChild("bone28_r1", CubeListBuilder.create().texOffs(904, 18).mirror().addBox(-1.9364F, -5.3589F, 6.6052F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.4995F, -6.3938F, -15.4367F, 0.0F, 0.3927F, 0.0F));

		PartDefinition Dachshund_head3 = real_head.addOrReplaceChild("Dachshund_head3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.0F, 10.5F, 1.5708F, 0.0F, 0.0F));

		PartDefinition Dachshund_rotation3 = Dachshund_head3.addOrReplaceChild("Dachshund_rotation3", CubeListBuilder.create().texOffs(882, 0).addBox(-2.5F, 7.4F, 0.75F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-0.2F))
		.texOffs(869, 1).addBox(-1.8F, 8.7829F, 0.83F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(869, 1).addBox(0.8F, 8.7829F, 0.83F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -13.5F, 4.4F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mond3 = Dachshund_rotation3.addOrReplaceChild("mond3", CubeListBuilder.create().texOffs(902, 0).addBox(-1.5F, 1.4358F, -11.2038F, 3.0F, 2.0F, 5.0F, new CubeDeformation(-0.3F))
		.texOffs(962, 14).addBox(-1.5F, 2.8311F, -11.2038F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.305F))
		.texOffs(1124, 8).addBox(-1.5F, 0.755F, -11.9853F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.9F))
		.texOffs(869, 1).addBox(-0.5F, 2.4419F, -11.154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 7.35F, 7.9F, 0.1134F, 0.0F, 0.0F));

		PartDefinition bone4 = mond3.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(1062, 11).addBox(-1.5F, 10.7145F, 1.2287F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.307F)), PartPose.offsetAndRotation(0.0F, -7.7035F, -11.941F, -0.0436F, 0.0F, 0.0F));

		PartDefinition bone5 = mond3.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(909, 8).addBox(-1.0F, -0.5522F, -15.7482F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -3.84F, 5.1581F, 0.3927F, 0.0F, 0.0F));

		PartDefinition dachshund_neck3 = Dachshund_head3.addOrReplaceChild("dachshund_neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -12.2293F, 0.1298F, 0.3927F, 0.0F, 0.0F));

		PartDefinition dachshund_neck_rotation3 = dachshund_neck3.addOrReplaceChild("dachshund_neck_rotation3", CubeListBuilder.create().texOffs(887, 22).addBox(-1.95F, 7.8853F, -2.3062F, 4.0F, 4.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.05F, 0.0164F, 1.3462F, -1.5708F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition english_bulldog() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 13.0F, 6.5F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition wgwegew = real_tail.addOrReplaceChild("wgwegew", CubeListBuilder.create(), PartPose.offset(0.0F, 13.75F, -8.75F));

		PartDefinition englishbulldog4 = wgwegew.addOrReplaceChild("englishbulldog4", CubeListBuilder.create().texOffs(1108, 21).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offset(1.0F, -12.0F, 10.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-2.0F, 18.5F, 4.75F));

		PartDefinition englishbulldog6 = right_hind_leg.addOrReplaceChild("englishbulldog6", CubeListBuilder.create().texOffs(1116, 11).mirror().addBox(-0.5F, 0.0F, -3.25F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-0.5F, -2.5F, 2.25F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(2.0F, 18.5F, 4.75F));

		PartDefinition englishbulldog5 = left_hind_leg.addOrReplaceChild("englishbulldog5", CubeListBuilder.create().texOffs(1116, 11).addBox(-1.5F, 0.0F, -3.25F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, -2.5F, 2.25F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-2.0F, 19.0F, -4.0F));

		PartDefinition ewg3 = right_front_leg.addOrReplaceChild("ewg3", CubeListBuilder.create(), PartPose.offset(4.5F, -3.0F, 0.0F));

		PartDefinition englishbulldog3 = ewg3.addOrReplaceChild("englishbulldog3", CubeListBuilder.create().texOffs(1102, 12).mirror().addBox(-0.5F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 0.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(2.0F, 19.0F, -4.0F));

		PartDefinition ewg2 = left_front_leg.addOrReplaceChild("ewg2", CubeListBuilder.create(), PartPose.offset(-4.5F, -3.0F, 0.0F));

		PartDefinition englishbulldog2 = ewg2.addOrReplaceChild("englishbulldog2", CubeListBuilder.create().texOffs(1102, 12).addBox(-1.5F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 16.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_sub_2 = body.addOrReplaceChild("body_sub_2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition englishbulldog11 = body_sub_2.addOrReplaceChild("englishbulldog11", CubeListBuilder.create().texOffs(1101, 0).addBox(-3.0F, 0.0F, -5.2F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 0.0F, 0.4F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 16.0F, -2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane_sub_2 = upper_body.addOrReplaceChild("mane_sub_2", CubeListBuilder.create(), PartPose.offset(0.0F, 1.5F, 4.5F));

		PartDefinition englishbulldog10 = mane_sub_2.addOrReplaceChild("englishbulldog10", CubeListBuilder.create().texOffs(1073, 0).addBox(-3.5F, -5.25F, -8.0F, 7.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 14.75F, -7.0F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(2.0F, -2.25F, 0.5F));

		PartDefinition ear_left3 = left_ear.addOrReplaceChild("ear_left3", CubeListBuilder.create().texOffs(1102, 24).addBox(2.4384F, -9.0665F, -5.0365F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(7.35F, 1.6F, -7.2F, 0.3054F, -2.9234F, -1.0908F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-2.0F, -2.25F, 0.5F));

		PartDefinition ear_right3 = right_ear.addOrReplaceChild("ear_right3", CubeListBuilder.create().texOffs(1102, 24).mirror().addBox(-3.4384F, -9.0665F, -5.0365F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-7.35F, 1.6F, -7.2F, 0.3054F, 2.9234F, 1.0908F));

		PartDefinition ehheht2 = real_head.addOrReplaceChild("ehheht2", CubeListBuilder.create(), PartPose.offset(-1.0F, -1.25F, 0.0F));

		PartDefinition Englishbulldog9 = ehheht2.addOrReplaceChild("Englishbulldog9", CubeListBuilder.create().texOffs(1066, 20).addBox(-4.0F, -1.5F, -2.25F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(1105, 29).addBox(-2.5F, 3.05F, -3.65F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.05F))
		.texOffs(1037, 0).addBox(-3.15F, -0.3261F, -2.3555F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1072, 0).addBox(-3.55F, -0.3244F, -2.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
		.texOffs(1072, 0).addBox(0.45F, -0.3244F, -2.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
		.texOffs(1037, 0).addBox(0.1F, -0.3261F, -2.3555F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.25F, 0.0F));

		PartDefinition mond2 = Englishbulldog9.addOrReplaceChild("mond2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1F, 0.1F));

		PartDefinition bone2 = mond2.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(1090, 25).addBox(0.0F, -10.2056F, -3.8644F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.06F)), PartPose.offsetAndRotation(-2.0F, 11.9F, -0.85F, -0.0524F, 0.0F, 0.0F));

		PartDefinition bone3 = mond2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(1090, 27).addBox(-2.5F, -11.209F, -4.7871F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 12.2F, 0.95F, -0.0436F, 0.0F, 0.0F));

		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(1084, 21).addBox(0.6011F, -9.4651F, -4.2296F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(-2.9F, -0.5F, -1.2F, 0.0F, 0.0F, 0.0436F));

		PartDefinition bone5 = bone3.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(1084, 21).addBox(1.3945F, -9.3652F, -4.2296F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(-0.1F, -0.5F, -1.2F, 0.0F, 0.0F, -0.0436F));

		PartDefinition bone6 = mond2.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(1091, 22).addBox(-1.5F, -9.6462F, -5.2409F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, 11.5F, 1.05F, 0.0436F, 0.0F, 0.0F));

		PartDefinition bone7 = mond2.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(1062, 22).addBox(-1.5F, -8.8258F, -5.1722F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(-1.0F, 8.8F, 2.45F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone8 = mond2.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(1037, 2).addBox(-0.5F, -8.4002F, -4.9808F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-1.0F, 9.5F, 1.05F, -0.0175F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition king_charles() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 15.35F, 6.7F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition kingcharles_tail_rotation2 = real_tail.addOrReplaceChild("kingcharles_tail_rotation2", CubeListBuilder.create().texOffs(1219, 2).addBox(-1.0F, -4.0F, -2.2F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F))
		.texOffs(1215, 22).addBox(-1.0F, -4.0F, 0.2F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 3.3969F, -1.7509F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-1.4F, 18.5F, 5.6F));

		PartDefinition KingCharlesleg4 = right_hind_leg.addOrReplaceChild("KingCharlesleg4", CubeListBuilder.create(), PartPose.offset(-0.2F, 3.2F, -10.6F));

		PartDefinition bone7 = KingCharlesleg4.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(405, 26).mirror().addBox(-1.1F, -0.45F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offset(0.1F, -1.0F, 9.65F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(1.4F, 18.5F, 5.6F));

		PartDefinition KingCharlesleg5 = left_hind_leg.addOrReplaceChild("KingCharlesleg5", CubeListBuilder.create(), PartPose.offset(0.2F, 3.2F, -10.6F));

		PartDefinition bone6 = KingCharlesleg5.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(405, 26).addBox(-0.9F, -0.45F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offset(-0.1F, -1.0F, 9.65F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-1.85F, 20.15F, -3.9F));

		PartDefinition KingCharlesleg3 = right_front_leg.addOrReplaceChild("KingCharlesleg3", CubeListBuilder.create(), PartPose.offset(0.1F, -7.0F, 0.3F));

		PartDefinition bone9 = KingCharlesleg3.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(405, 25).mirror().addBox(-2.5F, -5.0F, 3.4F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offset(1.5F, 11.05F, -4.55F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(1.85F, 20.15F, -3.9F));

		PartDefinition KingCharlesleg2 = left_front_leg.addOrReplaceChild("KingCharlesleg2", CubeListBuilder.create(), PartPose.offset(-0.1F, -7.0F, 0.3F));

		PartDefinition bone8 = KingCharlesleg2.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(405, 25).addBox(0.5F, -5.0F, 3.4F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offset(-1.5F, 11.05F, -4.55F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 17.9F, 2.2F, 1.5708F, 0.0F, 0.0F));

		PartDefinition kingcharles_body2 = body.addOrReplaceChild("kingcharles_body2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.2F, 2.25F));

		PartDefinition kingcharlesbody2 = kingcharles_body2.addOrReplaceChild("kingcharlesbody2", CubeListBuilder.create().texOffs(1191, 14).addBox(-3.0F, -5.95F, -5.1F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(1213, 0).addBox(2.3F, -5.8F, -6.9F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(1213, 0).addBox(-2.2F, -5.8F, -6.9F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 18.2F, -2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition king_charles_mane2 = upper_body.addOrReplaceChild("king_charles_mane2", CubeListBuilder.create().texOffs(1189, 0).addBox(-3.0F, -12.75F, -9.75F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.1F))
		.texOffs(1223, 25).addBox(2.3F, -10.8F, -11.75F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(1223, 25).addBox(-2.2F, -10.8F, -11.75F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.1F, 9.0F, 7.2F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 13.5F, -6.4F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-2.0F, -3.0F, -0.1F));

		PartDefinition ear_right2 = right_ear.addOrReplaceChild("ear_right2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 17.1F, 8.6F, 0.0F, -0.1745F, 0.0F));

		PartDefinition head_sub_2 = ear_right2.addOrReplaceChild("head_sub_2", CubeListBuilder.create().texOffs(1179, 0).mirror().addBox(-3.4204F, -16.5F, -9.3922F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.05F)).mirror(false)
		.texOffs(1179, 0).mirror().addBox(-4.1272F, -16.3F, -9.3692F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(1179, 11).mirror().addBox(-3.4204F, -12.8F, -8.8922F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.01F)).mirror(false)
		.texOffs(1196, 27).mirror().addBox(-2.8987F, -10.8F, -8.8768F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(2.0F, -3.0F, -0.1F));

		PartDefinition ear_left2 = left_ear.addOrReplaceChild("ear_left2", CubeListBuilder.create().texOffs(1179, 0).addBox(2.4204F, -16.5F, -9.3922F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.05F))
		.texOffs(1179, 0).addBox(3.1272F, -16.3F, -9.3692F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.2F))
		.texOffs(1179, 11).addBox(2.4204F, -12.8F, -8.8922F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.01F))
		.texOffs(1196, 27).addBox(2.8987F, -10.8F, -8.8768F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 17.1F, 8.6F, 0.0F, 0.1745F, 0.0F));

		PartDefinition head3 = real_head.addOrReplaceChild("head3", CubeListBuilder.create(), PartPose.offset(-1.0F, 0.25F, 0.45F));

		PartDefinition kingcharles2 = head3.addOrReplaceChild("kingcharles2", CubeListBuilder.create().texOffs(1176, 22).addBox(-2.5F, -12.4F, -9.0F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.2F))
		.texOffs(1138, 22).addBox(-1.95F, -11.15F, -9.215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1138, 22).addBox(0.9F, -11.15F, -9.215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 9.75F, 7.05F));

		PartDefinition bone2 = kingcharles2.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(1176, 22).addBox(-2.0F, -7.95F, -8.849F, 5.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offset(-0.5F, -0.6F, -0.25F));

		PartDefinition bone3 = kingcharles2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(1676, 12).addBox(-1.0F, -10.9805F, -5.6244F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.9F))
		.texOffs(1150, 21).addBox(0.0F, -8.797F, -4.3628F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(1174, 16).addBox(-1.0F, -10.0873F, -4.6621F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F))
		.texOffs(543, 28).addBox(-0.91F, -8.6927F, -4.4591F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.07F)), PartPose.offsetAndRotation(-0.5F, -0.15F, -6.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(580, 23).addBox(-0.5F, -10.6471F, -3.8299F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 2.4824F, -1.1583F, -0.0436F, 0.0F, 0.0F));

		PartDefinition bone5 = bone3.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(543, 28).addBox(1.3153F, -9.16F, -4.4957F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.07F)), PartPose.offsetAndRotation(-7.25F, -10.0079F, 0.0366F, 0.0F, 0.0F, 1.5708F));

		PartDefinition neus2 = kingcharles2.addOrReplaceChild("neus2", CubeListBuilder.create().texOffs(1153, 6).addBox(0.0F, -8.5046F, -0.6268F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(-0.5F, -5.95F, -2.15F, 1.0036F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}	
	
	public static LayerDefinition west_cairn_terrier() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 14.9F, 5.3F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition west_staart2 = real_tail.addOrReplaceChild("west_staart2", CubeListBuilder.create(), PartPose.offset(0.0F, 7.9233F, -5.3675F));

		PartDefinition west_staart_rot2 = west_staart2.addOrReplaceChild("west_staart_rot2", CubeListBuilder.create().texOffs(1464, 0).addBox(-1.0F, -5.8584F, -0.7796F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -7.75F, 4.85F, 0.0F, 0.0F, -3.1416F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-2.5F, 16.0F, 7.0F));

		PartDefinition west_shihtzu_leg2_rot2 = right_hind_leg.addOrReplaceChild("west_shihtzu_leg2_rot2", CubeListBuilder.create().texOffs(1455, 22).addBox(-2.0F, 2.0F, -3.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.75F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create().texOffs(1455, 22).mirror().addBox(0.25F, 2.0F, -3.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.5F, 16.0F, 7.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-2.5F, 16.0F, -4.0F));

		PartDefinition west_shihtzu_leg4_rot2 = right_front_leg.addOrReplaceChild("west_shihtzu_leg4_rot2", CubeListBuilder.create(), PartPose.offset(-0.25F, 0.0F, 2.5F));

		PartDefinition mane_sub_6 = west_shihtzu_leg4_rot2.addOrReplaceChild("mane_sub_6", CubeListBuilder.create().texOffs(1455, 22).mirror().addBox(0.0F, 2.0F, -3.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(0.5F, 16.0F, -4.0F));

		PartDefinition west_shihtzu_leg3_rot2 = left_front_leg.addOrReplaceChild("west_shihtzu_leg3_rot2", CubeListBuilder.create().texOffs(1455, 22).addBox(-2.0F, 2.0F, -3.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.25F, 0.0F, 2.5F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 17.7F, 2.1F, 1.5708F, 0.0F, 0.0F));

		PartDefinition west_shihtzu_body2 = body.addOrReplaceChild("west_shihtzu_body2", CubeListBuilder.create().texOffs(1833, 0).addBox(-3.5F, -5.475F, -6.05F, 7.0F, 6.0F, 3.0F, new CubeDeformation(-0.15F))
		.texOffs(1427, 13).addBox(-3.5F, -5.025F, -3.45F, 7.0F, 6.0F, 7.0F, new CubeDeformation(0.09F)), PartPose.offset(0.0F, 3.125F, 0.05F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 17.5F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition west_shihtzu_mane2 = upper_body.addOrReplaceChild("west_shihtzu_mane2", CubeListBuilder.create().texOffs(1424, 0).addBox(-3.5F, -6.0F, -8.35F, 7.0F, 6.0F, 7.0F, new CubeDeformation(0.1F)), PartPose.offset(0.0F, 3.25F, 4.85F));

		PartDefinition west_shihtzu_mane_hair2 = west_shihtzu_mane2.addOrReplaceChild("west_shihtzu_mane_hair2", CubeListBuilder.create().texOffs(1813, 0).addBox(-3.5F, -3.0F, -7.75F, 7.0F, 6.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, -3.0F, -3.4F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 13.5F, -5.9F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-2.0F, -3.0F, -0.6F));

		PartDefinition bone2 = right_ear.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(1457, 1).addBox(-1.521F, -0.9837F, -2.1F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(-0.35F, -1.05F, 2.2F, 0.0F, 0.0F, -0.3927F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(2.0F, -3.0F, -0.6F));

		PartDefinition bone3 = left_ear.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.35F, -1.05F, 2.2F, 0.0F, 0.0F, 0.3927F));

		PartDefinition mane_sub_2 = bone3.addOrReplaceChild("mane_sub_2", CubeListBuilder.create().texOffs(1457, 1).mirror().addBox(-1.479F, -0.9837F, -2.1F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.05F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition west_shihtzu_head_rot2 = real_head.addOrReplaceChild("west_shihtzu_head_rot2", CubeListBuilder.create().texOffs(1402, 0).addBox(-3.0F, -0.4F, 3.75F, 6.0F, 6.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, -2.55F, -5.4F));

		PartDefinition shihtzu2 = west_shihtzu_head_rot2.addOrReplaceChild("shihtzu2", CubeListBuilder.create(), PartPose.offset(0.0F, 11.3F, 13.0F));

		PartDefinition shihtzu_tong2 = shihtzu2.addOrReplaceChild("shihtzu_tong2", CubeListBuilder.create(), PartPose.offset(0.0F, -6.25F, -9.85F));

		PartDefinition shihtzu_tong_rot2 = shihtzu_tong2.addOrReplaceChild("shihtzu_tong_rot2", CubeListBuilder.create().texOffs(1495, 20).addBox(-1.0F, -1.8381F, -0.9441F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.25F, 0.5672F, 0.0F, 0.0F));

		PartDefinition shihtzu_neusbrug2 = shihtzu2.addOrReplaceChild("shihtzu_neusbrug2", CubeListBuilder.create().texOffs(1463, 27).addBox(-1.0F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offset(0.0F, -9.05F, -9.55F));

		PartDefinition shihtzu_longhair2 = shihtzu2.addOrReplaceChild("shihtzu_longhair2", CubeListBuilder.create().texOffs(1685, 1).addBox(-2.0F, -5.9F, -10.05F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F))
		.texOffs(1783, 17).addBox(2.55F, -7.0F, -8.75F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition mane_sub_3 = shihtzu_longhair2.addOrReplaceChild("mane_sub_3", CubeListBuilder.create().texOffs(1783, 17).mirror().addBox(-4.55F, -7.0F, -8.75F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition shihtzu_baard2 = shihtzu_longhair2.addOrReplaceChild("shihtzu_baard2", CubeListBuilder.create().texOffs(1621, 11).addBox(-3.0F, -0.15F, -0.05F, 6.0F, 3.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offset(0.0F, -5.75F, -9.2F));

		PartDefinition shihtzu_hair2 = shihtzu_longhair2.addOrReplaceChild("shihtzu_hair2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -11.5F, -8.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition shihtzu_hair_rot2 = shihtzu_hair2.addOrReplaceChild("shihtzu_hair_rot2", CubeListBuilder.create().texOffs(1627, 0).addBox(-1.5F, -2.25F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 1.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition shihtzu_mond2 = shihtzu2.addOrReplaceChild("shihtzu_mond2", CubeListBuilder.create().texOffs(1474, 3).addBox(-1.5F, -10.3F, -10.251F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.95F))
		.texOffs(1503, 4).addBox(-1.0F, -7.5F, -10.35F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(1538, 18).addBox(-2.0F, -8.7F, -10.05F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1537, 29).addBox(-2.0F, -6.7F, -10.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1537, 29).addBox(1.0F, -6.7F, -10.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1571, 1).addBox(-2.0F, -8.3F, -10.55F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition shihtzu_ear_left2 = shihtzu2.addOrReplaceChild("shihtzu_ear_left2", CubeListBuilder.create().texOffs(1468, 11).addBox(2.55F, -10.8F, -8.75F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition shihtzu_ear_right2 = shihtzu2.addOrReplaceChild("shihtzu_ear_right2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition mane_sub_4 = shihtzu_ear_right2.addOrReplaceChild("mane_sub_4", CubeListBuilder.create().texOffs(1468, 11).mirror().addBox(-4.55F, -10.8F, -8.75F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition westie2 = west_shihtzu_head_rot2.addOrReplaceChild("westie2", CubeListBuilder.create().texOffs(1873, 22).addBox(-5.0F, -13.6F, -8.4F, 10.0F, 9.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offset(0.0F, 11.3F, 13.0F));

		PartDefinition west_eye3 = westie2.addOrReplaceChild("west_eye3", CubeListBuilder.create().texOffs(1445, 3).addBox(-1.1F, -0.7F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offset(1.4F, -9.7F, -8.801F));

		PartDefinition west_eye4 = westie2.addOrReplaceChild("west_eye4", CubeListBuilder.create(), PartPose.offset(-1.4F, -9.7F, -8.801F));

		PartDefinition mane_sub_5 = west_eye4.addOrReplaceChild("mane_sub_5", CubeListBuilder.create().texOffs(1445, 3).mirror().addBox(-0.9F, -0.7F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head_sub_2 = westie2.addOrReplaceChild("head_sub_2", CubeListBuilder.create().texOffs(1452, 8).mirror().addBox(-3.55F, -0.8F, 5.65F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offset(0.0F, -11.3F, -13.0F));

		PartDefinition bone4 = westie2.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(1380, 20).addBox(1.5F, 8.0811F, -10.6643F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -21.2494F, -13.2151F, 1.1781F, 0.0F, 0.0F));

		PartDefinition snor5 = westie2.addOrReplaceChild("snor5", CubeListBuilder.create().texOffs(1402, 11).addBox(-1.0F, -10.0466F, -6.4956F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 0.0961F, -5.9803F, -0.3054F, 0.0F, 0.0F));

		PartDefinition west_mond2 = westie2.addOrReplaceChild("west_mond2", CubeListBuilder.create().texOffs(1418, 26).addBox(-2.0F, -1.2163F, -2.5603F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(1409, 21).addBox(-1.5F, 0.3895F, -2.4955F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(1419, 3).addBox(-1.0F, -0.0807F, -3.019F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
		.texOffs(1424, 5).addBox(-0.5F, -0.3591F, -2.7287F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -7.5746F, -8.7216F, 0.2182F, 0.0F, 0.0F));

		PartDefinition west_neus2 = west_mond2.addOrReplaceChild("west_neus2", CubeListBuilder.create().texOffs(1445, 3).addBox(-1.0F, -1.0084F, -0.3634F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, -0.6451F, -2.8488F, 0.0873F, 0.0F, 0.0F));

		PartDefinition snor6 = west_mond2.addOrReplaceChild("snor6", CubeListBuilder.create().texOffs(1419, 0).addBox(0.0F, -9.8763F, -5.2821F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 9.1129F, 1.8258F, -0.0873F, 0.0F, 0.0F));

		PartDefinition snor7 = west_mond2.addOrReplaceChild("snor7", CubeListBuilder.create().texOffs(1370, 0).addBox(-2.453F, -9.6684F, -5.1333F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 8.6439F, 2.5469F, 0.0F, 0.0F, 0.0873F));

		PartDefinition snor8 = west_mond2.addOrReplaceChild("snor8", CubeListBuilder.create().texOffs(1370, 0).addBox(-1.567F, -9.6185F, -5.1333F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4F, 8.2443F, 2.5644F, 0.0F, 0.0F, -0.0873F));

		PartDefinition bone5 = west_mond2.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(1370, 0).addBox(-1.8659F, -8.9686F, -4.8964F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9F, 9.2439F, 2.5469F));

		PartDefinition west_tong2 = westie2.addOrReplaceChild("west_tong2", CubeListBuilder.create(), PartPose.offset(0.0F, -5.75F, -10.45F));

		PartDefinition west_rot2 = west_tong2.addOrReplaceChild("west_rot2", CubeListBuilder.create().texOffs(1489, 14).addBox(-1.0F, -1.3F, -0.4135F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.75F, 0.5672F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition labrador_golden_retriever() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 10.55F, 8.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Labrador3 = real_tail.addOrReplaceChild("Labrador3", CubeListBuilder.create().texOffs(184, 0).addBox(-1.0F, -12.0F, 9.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(207, 1).addBox(-1.0F, -12.0F, 7.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 11.85F, -10.25F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-1.75F, 16.0F, 7.0F));

		PartDefinition Labradorpoedel_leg2_rot2 = right_hind_leg.addOrReplaceChild("Labradorpoedel_leg2_rot2", CubeListBuilder.create().texOffs(199, 0).addBox(0.6F, -8.2F, 6.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(-1.5F, 8.0F, -7.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(1.75F, 16.0F, 7.0F));

		PartDefinition Labradorpoedel_leg1_rot2 = left_hind_leg.addOrReplaceChild("Labradorpoedel_leg1_rot2", CubeListBuilder.create(), PartPose.offset(-1.65F, 8.0F, -7.0F));

		PartDefinition mane_sub_3 = Labradorpoedel_leg1_rot2.addOrReplaceChild("mane_sub_3", CubeListBuilder.create().texOffs(199, 0).mirror().addBox(0.6F, -8.2F, 6.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-2.0F, 16.0F, -4.0F));

		PartDefinition labrador4_rot2 = right_front_leg.addOrReplaceChild("labrador4_rot2", CubeListBuilder.create().texOffs(199, 0).addBox(-2.25F, -8.2F, -4.8F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F))
		.texOffs(210, 20).addBox(-1.5F, -8.0F, -2.8F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.25F, 7.95F, 3.25F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(2.0F, 16.0F, -4.0F));

		PartDefinition labrador3_rot2 = left_front_leg.addOrReplaceChild("labrador3_rot2", CubeListBuilder.create().texOffs(210, 20).addBox(1.5F, -8.0F, -2.8F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 8.0F, 3.4F));

		PartDefinition mane_sub_2 = labrador3_rot2.addOrReplaceChild("mane_sub_2", CubeListBuilder.create().texOffs(199, 0).mirror().addBox(1.0F, -8.2F, -5.05F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.5F, 3.5F, 1.5708F, 0.0F, 0.0F));

		PartDefinition Labrador_body_main2 = body.addOrReplaceChild("Labrador_body_main2", CubeListBuilder.create().texOffs(169, 9).addBox(-3.5F, -5.5F, -3.505F, 7.0F, 9.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(199, 18).addBox(-3.5F, -5.5F, -5.495F, 7.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.75F, -0.495F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.5F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition Labrador_mane2 = upper_body.addOrReplaceChild("Labrador_mane2", CubeListBuilder.create().texOffs(199, 10).addBox(-4.0F, -6.0F, -11.7F, 8.0F, 6.0F, 2.0F, new CubeDeformation(0.2F))
		.texOffs(137, 11).addBox(-4.0F, -6.0F, -9.3F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 3.0F, 5.3F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 10.15F, -8.0F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-3.0F, -1.45F, 0.1F));

		PartDefinition oor3 = right_ear.addOrReplaceChild("oor3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0068F, 2.4354F, 0.1975F, -0.1018F, -0.5655F, 0.0395F));

		PartDefinition head_sub_2 = oor3.addOrReplaceChild("head_sub_2", CubeListBuilder.create().texOffs(196, 0).mirror().addBox(-0.1883F, 1.1763F, -0.5502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(192, 0).mirror().addBox(-0.3333F, 0.3858F, -1.0381F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
		.texOffs(178, 6).mirror().addBox(-0.58F, -0.4538F, -1.0575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(172, 2).mirror().addBox(-0.58F, -3.4535F, -1.5662F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(166, 0).mirror().addBox(-1.13F, -2.7035F, -0.5662F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(3.0F, -1.35F, 0.1F));

		PartDefinition oor2 = left_ear.addOrReplaceChild("oor2", CubeListBuilder.create().texOffs(196, 0).addBox(-0.8117F, 1.1763F, -0.5502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(192, 0).addBox(-0.6667F, 0.3858F, -1.0381F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
		.texOffs(178, 6).addBox(-0.42F, -0.4538F, -1.0575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(172, 2).addBox(-0.42F, -3.4535F, -1.5662F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(166, 0).addBox(0.13F, -2.7035F, -0.5662F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0068F, 2.3354F, 0.1975F, -0.1018F, 0.5655F, -0.0395F));

		PartDefinition labrador_head2 = real_head.addOrReplaceChild("labrador_head2", CubeListBuilder.create(), PartPose.offset(0.0F, 2.35F, 10.75F));

		PartDefinition Labrador_head_rot2 = labrador_head2.addOrReplaceChild("Labrador_head_rot2", CubeListBuilder.create().texOffs(132, 0).addBox(-3.0F, -4.3333F, -4.4167F, 6.0F, 5.0F, 5.0F, new CubeDeformation(0.1F))
		.texOffs(132, 0).addBox(-3.0F, -1.6333F, -4.4167F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.09F))
		.texOffs(160, 25).addBox(0.0F, 0.4667F, -4.1667F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.6667F, -7.7833F));

		PartDefinition neus2 = Labrador_head_rot2.addOrReplaceChild("neus2", CubeListBuilder.create().texOffs(354, 1).addBox(-1.0F, -0.7202F, -0.95F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -0.6831F, -7.0058F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone2 = neus2.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(109, 21).addBox(-0.55F, -0.3151F, -0.5655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
		.texOffs(118, 22).addBox(-0.5F, -0.5249F, -0.3605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(0.0F, 0.8249F, 0.0995F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone3 = Labrador_head_rot2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(112, 15).addBox(1.45F, -9.656F, -8.4217F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.07F)), PartPose.offsetAndRotation(-3.0F, 10.0667F, 1.4833F, 0.0349F, 0.0F, 0.0F));

		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(109, 26).addBox(-0.4652F, -0.6018F, -2.014F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.045F)), PartPose.offsetAndRotation(1.95F, -10.6559F, -6.6147F, 0.0F, 0.0F, 0.0873F));

		PartDefinition bone5 = bone3.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(109, 26).addBox(-0.6348F, -0.6018F, -2.014F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.045F)), PartPose.offsetAndRotation(4.05F, -10.6559F, -6.6147F, 0.0F, 0.0F, -0.0873F));

		PartDefinition bone6 = bone3.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(121, 26).addBox(-2.05F, -12.3082F, -11.6392F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.1F))
		.texOffs(93, 17).addBox(-1.9F, -11.7997F, -9.4847F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.09F))
		.texOffs(93, 17).addBox(-0.2F, -11.7997F, -9.4847F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.09F)), PartPose.offsetAndRotation(3.5F, 2.041F, 2.4827F, -0.0611F, 0.0F, 0.0F));

		PartDefinition bone7 = bone3.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(129, 25).addBox(-1.0F, -0.9134F, -1.5751F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(3.0F, -10.8666F, -6.5459F, 0.3316F, 0.0F, 0.0F));

		PartDefinition bone9 = Labrador_head_rot2.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(169, 2).addBox(3.5F, -11.263F, -9.5176F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(-4.0F, 10.9667F, 0.4333F, -0.3665F, 0.0F, 0.0F));

		PartDefinition oog2 = Labrador_head_rot2.addOrReplaceChild("oog2", CubeListBuilder.create().texOffs(121, 24).addBox(3.513F, -8.55F, -6.4154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(140, 25).addBox(2.9456F, -8.6F, -6.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(-5.35F, 5.9167F, 1.9833F, 0.0F, 0.0436F, 0.0F));

		PartDefinition bone10 = Labrador_head_rot2.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(121, 24).addBox(0.4F, -8.55F, -6.4402F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(140, 25).addBox(1.0044F, -8.6F, -6.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.45F, 5.9167F, 1.7833F, 0.0F, -0.0436F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition dalmatian() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 11.0F, 8.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Dalmatier7 = real_tail.addOrReplaceChild("Dalmatier7", CubeListBuilder.create().texOffs(525, 7).addBox(-1.5F, 0.0F, -2.25F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -0.3F, 1.6F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-1.5F, 16.0F, 7.0F));

		PartDefinition Dalmatier2 = right_hind_leg.addOrReplaceChild("Dalmatier2", CubeListBuilder.create().texOffs(517, 6).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(517, 6).addBox(-2.0F, 0.25F, -2.25F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offset(1.0F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(1.5F, 16.0F, 7.0F));

		PartDefinition Dalmatier3 = left_hind_leg.addOrReplaceChild("Dalmatier3", CubeListBuilder.create().texOffs(517, 6).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 0.0F, 0.0F));

		PartDefinition bone8 = Dalmatier3.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(517, 6).addBox(0.5F, -7.75F, 6.75F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offset(-2.5F, 8.0F, -9.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-1.5F, 16.0F, -4.0F));

		PartDefinition Dalmatier6 = right_front_leg.addOrReplaceChild("Dalmatier6", CubeListBuilder.create().texOffs(507, 5).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 0.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(1.5F, 16.0F, -4.0F));

		PartDefinition Dalmatier5 = left_front_leg.addOrReplaceChild("Dalmatier5", CubeListBuilder.create().texOffs(507, 5).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.5F, 2.2F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_sub_2 = body.addOrReplaceChild("body_sub_2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.2F, -0.5F));

		PartDefinition Dalmatierboxer2 = body_sub_2.addOrReplaceChild("Dalmatierboxer2", CubeListBuilder.create().texOffs(515, 16).addBox(-3.5F, -2.25F, -3.0F, 7.0F, 9.0F, 7.0F, new CubeDeformation(-0.3F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.8F, -2.6F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane_sub_2 = upper_body.addOrReplaceChild("mane_sub_2", CubeListBuilder.create(), PartPose.offset(0.0F, 2.1F, 2.3F));

		PartDefinition Dalmatier9 = mane_sub_2.addOrReplaceChild("Dalmatier9", CubeListBuilder.create().texOffs(483, 11).addBox(-4.0F, -5.5F, -6.25F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 8.7F, -7.5F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-3.7F, -1.2F, 0.0F));

		PartDefinition ear_right2 = right_ear.addOrReplaceChild("ear_right2", CubeListBuilder.create().texOffs(478, 25).addBox(0.6141F, -12.1009F, -9.9394F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.1F))
		.texOffs(466, 0).addBox(0.7992F, -8.1992F, -9.2945F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-4.55F, 11.25F, 7.25F, -0.0873F, -0.2182F, 0.1309F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(3.7F, -1.2F, 0.0F));

		PartDefinition ear_left2 = left_ear.addOrReplaceChild("ear_left2", CubeListBuilder.create().texOffs(478, 25).addBox(3.4479F, -11.4766F, -9.7708F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.1F))
		.texOffs(494, 28).addBox(3.2342F, -7.5836F, -9.1917F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.05F, 11.0F, 8.5F, -0.0873F, 0.3927F, -0.1309F));

		PartDefinition Dalmatier4 = real_head.addOrReplaceChild("Dalmatier4", CubeListBuilder.create().texOffs(466, 0).addBox(-4.0F, -5.5F, -2.25F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 2.8F, 0.5F));

		PartDefinition mond2 = Dalmatier4.addOrReplaceChild("mond2", CubeListBuilder.create().texOffs(490, 0).addBox(-0.5F, -11.8515F, -7.18F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.1F))
		.texOffs(512, 0).addBox(-0.5F, -11.8515F, -7.43F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.09F)), PartPose.offsetAndRotation(-2.0F, 8.45F, 2.85F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone2 = mond2.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(492, 1).addBox(0.55F, -10.2047F, -6.1214F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, -3.2622F, 1.7302F, 0.2182F, 0.0F, 0.0F));

		PartDefinition bone3 = mond2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(520, 0).addBox(1.0F, -10.4544F, -7.6512F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-0.45F, -1.1364F, -0.2333F, -0.0436F, 0.0F, 0.0F));

		PartDefinition bone4 = mond2.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(486, 27).addBox(0.0F, -8.9583F, -6.5677F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.4F, -0.0436F, 0.0F, 0.0F));

		PartDefinition bone5 = Dalmatier4.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(490, 2).addBox(1.7998F, -10.5F, -7.78F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F))
		.texOffs(490, 0).addBox(1.1998F, -10.5F, -7.78F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.04F)), PartPose.offsetAndRotation(-4.35F, 6.3F, 5.6F, 0.0F, 0.0436F, 0.0F));

		PartDefinition bone6 = Dalmatier4.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(490, 2).addBox(0.2957F, -10.5F, -7.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F))
		.texOffs(490, 0).addBox(0.8957F, -10.5F, -7.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.04F)), PartPose.offsetAndRotation(-0.65F, 6.3F, 5.4F, 0.0F, -0.0436F, 0.0F));

		PartDefinition bone7 = Dalmatier4.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(500, 0).addBox(-0.45F, -9.2862F, -0.9526F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.09F)), PartPose.offsetAndRotation(-1.0F, -1.0F, 6.25F, 1.309F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition great_dane() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 9.0F, 8.75F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition erhehe = real_tail.addOrReplaceChild("erhehe", CubeListBuilder.create(), PartPose.offset(0.0F, 4.5F, -10.9F));

		PartDefinition erhej = erhehe.addOrReplaceChild("erhej", CubeListBuilder.create(), PartPose.offset(-1.0F, -2.0F, 8.0F));

		PartDefinition greatdane8 = erhej.addOrReplaceChild("greatdane8", CubeListBuilder.create().texOffs(1291, 18).addBox(-2.0F, -1.5436F, 2.0511F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offset(2.5F, -1.0F, 0.0F));

		PartDefinition bone118 = greatdane8.addOrReplaceChild("bone118", CubeListBuilder.create().texOffs(1265, 20).addBox(-0.999F, -4.1654F, 2.1673F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.202F)), PartPose.offsetAndRotation(-1.0F, 7.1F, -1.4F, -0.5672F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-0.5F, 16.0F, 7.0F));

		PartDefinition wegewg2 = right_hind_leg.addOrReplaceChild("wegewg2", CubeListBuilder.create(), PartPose.offset(3.0F, 0.0F, 0.0F));

		PartDefinition greatdane2 = wegewg2.addOrReplaceChild("greatdane2", CubeListBuilder.create().texOffs(1285, 0).mirror().addBox(0.0F, -0.25F, -0.5F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offset(-5.75F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(0.5F, 16.0F, 7.0F));

		PartDefinition wegewg = left_hind_leg.addOrReplaceChild("wegewg", CubeListBuilder.create(), PartPose.offset(-3.0F, 0.0F, 0.0F));

		PartDefinition greatdane4 = wegewg.addOrReplaceChild("greatdane4", CubeListBuilder.create().texOffs(1285, 0).addBox(-2.0F, -0.25F, -0.5F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(5.75F, 0.0F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-2.5F, 16.0F, -4.0F));

		PartDefinition htjr3 = right_front_leg.addOrReplaceChild("htjr3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition greatdanebasset2 = htjr3.addOrReplaceChild("greatdanebasset2", CubeListBuilder.create().texOffs(668, 0).mirror().addBox(0.0F, -0.25F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offset(-0.75F, 0.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(2.5F, 16.0F, -4.0F));

		PartDefinition htjr2 = left_front_leg.addOrReplaceChild("htjr2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition greatdanebasset3 = htjr2.addOrReplaceChild("greatdanebasset3", CubeListBuilder.create().texOffs(668, 0).addBox(-2.0F, -0.25F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(0.75F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.0F, 3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_sub_1 = body.addOrReplaceChild("body_sub_1", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, -2.0F));

		PartDefinition greatdane3 = body_sub_1.addOrReplaceChild("greatdane3", CubeListBuilder.create().texOffs(1269, 18).addBox(-3.5F, -4.6F, -0.75F, 7.0F, 6.0F, 8.0F, new CubeDeformation(0.4F))
		.texOffs(1234, 14).addBox(1.3F, 2.2F, 4.25F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.4F))
		.texOffs(1234, 14).addBox(-3.3F, 2.2F, 4.25F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, -0.25F, 1.15F, -1.5708F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.5F, -4.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane_sub_2 = upper_body.addOrReplaceChild("mane_sub_2", CubeListBuilder.create(), PartPose.offset(0.0F, 3.5F, -5.0F));

		PartDefinition greatdane7 = mane_sub_2.addOrReplaceChild("greatdane7", CubeListBuilder.create().texOffs(1260, 1).addBox(-8.0F, -7.75F, 2.9F, 8.0F, 8.0F, 9.0F, new CubeDeformation(0.2F)), PartPose.offset(4.0F, 1.25F, -3.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 4.0F, -9.0F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(2.75F, -1.25F, 0.5F));

		PartDefinition oor3 = left_ear.addOrReplaceChild("oor3", CubeListBuilder.create().texOffs(1252, 23).addBox(2.0653F, -19.4291F, -12.8019F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(1257, 21).addBox(2.1602F, -19.4155F, -12.3189F, 1.0F, 6.0F, 5.0F, new CubeDeformation(-0.1F))
		.texOffs(1228, 3).addBox(2.0979F, -13.629F, -11.942F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.45F, 18.75F, 10.65F, -0.0436F, 0.2182F, -0.1745F));

		PartDefinition oor5 = left_ear.addOrReplaceChild("oor5", CubeListBuilder.create().texOffs(1255, 10).addBox(-2.4902F, -15.05F, -10.0117F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.3F))
		.texOffs(1250, 14).addBox(-2.5887F, -12.55F, -10.429F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(3.4F, 8.75F, 9.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition bone4 = oor5.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4924F, 3.0F, -0.3132F, 0.0436F, 0.0F, 1.1781F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-2.75F, -1.25F, 0.5F));

		PartDefinition oor2 = right_ear.addOrReplaceChild("oor2", CubeListBuilder.create().texOffs(1252, 23).mirror().addBox(-3.0653F, -19.4291F, -12.8019F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
		.texOffs(1257, 21).mirror().addBox(-3.1602F, -19.4155F, -12.3189F, 1.0F, 6.0F, 5.0F, new CubeDeformation(-0.1F)).mirror(false)
		.texOffs(1228, 3).mirror().addBox(-3.0979F, -13.629F, -11.942F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.45F, 18.75F, 10.65F, -0.0436F, -0.2182F, 0.1745F));

		PartDefinition oor4 = right_ear.addOrReplaceChild("oor4", CubeListBuilder.create().texOffs(1255, 10).mirror().addBox(1.4902F, -15.05F, -10.0117F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.3F)).mirror(false)
		.texOffs(1250, 14).mirror().addBox(1.5887F, -12.55F, -10.429F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.3F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 8.75F, 9.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition bone5 = oor4.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4924F, 3.0F, -0.3132F, 0.0436F, 0.0F, -1.1781F));

		PartDefinition wgwgw2 = real_head.addOrReplaceChild("wgwgw2", CubeListBuilder.create(), PartPose.offset(-1.0F, 9.5F, 2.0F));

		PartDefinition greatdane6 = wgwgw2.addOrReplaceChild("greatdane6", CubeListBuilder.create().texOffs(1229, 0).addBox(-3.0F, -20.25F, -11.75F, 6.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(1211, 27).addBox(-0.5F, -17.55F, -16.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F))
		.texOffs(1211, 27).addBox(-1.85F, -18.95F, -11.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.09F))
		.texOffs(1249, 0).addBox(-2.3F, -18.95F, -11.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.08F))
		.texOffs(1211, 27).addBox(0.8F, -18.95F, -11.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.09F))
		.texOffs(1249, 0).addBox(1.25F, -18.95F, -11.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.08F)), PartPose.offset(1.0F, 8.5F, 7.5F));

		PartDefinition bone2 = greatdane6.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(1285, 26).addBox(-2.0F, -14.4097F, -9.1813F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(0.0F, -2.75F, 5.25F, 0.3491F, 0.0F, 0.0F));

		PartDefinition mond2 = greatdane6.addOrReplaceChild("mond2", CubeListBuilder.create().texOffs(1229, 22).addBox(-1.75F, -12.033F, -9.62F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(1222, 14).addBox(0.0F, -12.033F, -9.62F, 1.0F, 4.0F, 5.0F, new CubeDeformation(-0.01F))
		.texOffs(1243, 22).addBox(0.75F, -12.033F, -9.62F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(1248, 0).addBox(-0.5F, -8.724F, -9.5079F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.1F))
		.texOffs(1203, 27).addBox(-1.75F, -7.1672F, -9.4895F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.05F))
		.texOffs(1229, 14).addBox(-1.75F, -7.1581F, -6.5894F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.06F))
		.texOffs(1226, 24).addBox(-1.75F, -6.3854F, -7.924F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
		.texOffs(1185, 14).addBox(0.75F, -7.1672F, -9.4895F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.05F))
		.texOffs(1229, 14).addBox(0.75F, -7.1581F, -6.5894F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.06F))
		.texOffs(1226, 24).addBox(0.75F, -6.3854F, -7.924F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, -6.0F, -6.25F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neus2 = mond2.addOrReplaceChild("neus2", CubeListBuilder.create().texOffs(1238, 23).addBox(0.0F, -14.3019F, -4.9991F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.5976F, 4.6741F, 0.48F, 0.0F, 0.0F));

		PartDefinition bone3 = greatdane6.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4F, -7.5F, 0.35F, 0.0436F, 0.0F, -1.1781F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition jack_russel() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 15.6F, 6.75F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition jackrussel_tail2 = real_tail.addOrReplaceChild("jackrussel_tail2", CubeListBuilder.create().texOffs(169, 8).addBox(-1.0F, 1.4085F, -12.39F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 4.05F, -11.8F, 3.1416F, 0.0F, 0.0F));

		PartDefinition bone2 = jackrussel_tail2.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(336, 6).addBox(-1.0F, -6.7861F, -13.0094F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, -4.1877F, -0.7674F, 0.6981F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-1.5F, 18.0F, 7.5F));

		PartDefinition mane_sub_5 = right_hind_leg.addOrReplaceChild("mane_sub_5", CubeListBuilder.create().texOffs(925, 2).addBox(-1.0F, -4.0F, 9.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, -12.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(1.5F, 18.0F, 7.5F));

		PartDefinition mane_sub_4 = left_hind_leg.addOrReplaceChild("mane_sub_4", CubeListBuilder.create().texOffs(925, 2).mirror().addBox(-1.0F, -4.0F, 9.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 5.0F, -12.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-1.25F, 19.0F, -3.5F));

		PartDefinition mane_sub_3 = right_front_leg.addOrReplaceChild("mane_sub_3", CubeListBuilder.create().texOffs(925, 0).addBox(-1.0F, 3.5F, 0.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.25F, -5.5F, -1.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(1.25F, 19.0F, -3.5F));

		PartDefinition mane_sub_2 = left_front_leg.addOrReplaceChild("mane_sub_2", CubeListBuilder.create().texOffs(925, 0).mirror().addBox(-1.0F, 3.5F, 0.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.25F, -5.5F, -1.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(1670, 0).addBox(-2.5F, -3.75F, -1.5F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.04F)), PartPose.offsetAndRotation(0.0F, 18.8F, 3.55F, 1.5708F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 17.5F, -2.5F, 1.5708F, 0.0F, 0.0F));

		PartDefinition jack_russel_mane2 = upper_body.addOrReplaceChild("jack_russel_mane2", CubeListBuilder.create().texOffs(1648, 3).addBox(-2.5F, -12.75F, -9.55F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.05F)), PartPose.offset(0.0F, 9.5F, 6.5F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 14.75F, -5.75F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(156, 25).mirror().addBox(-1.0434F, -1.3139F, -1.631F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(2.1508F, -1.8793F, -0.104F, 2.9621F, -1.4798F, -1.8075F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create().texOffs(156, 25).addBox(-0.9566F, -1.3139F, -1.631F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-2.1508F, -1.8793F, -0.104F, 2.9621F, 1.4798F, 1.8075F));

		PartDefinition Jackrussel_head2 = real_head.addOrReplaceChild("Jackrussel_head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2438F, 1.208F, 1.5708F, 0.0F, 0.0F));

		PartDefinition Jackrussel_head_rot_r1 = Jackrussel_head2.addOrReplaceChild("Jackrussel_head_rot_r1", CubeListBuilder.create().texOffs(1634, 0).addBox(-2.5F, -14.55F, 1.0F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(115, 26).addBox(-1.8F, -13.3701F, 0.9456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
		.texOffs(115, 26).addBox(0.8F, -13.3701F, 0.9456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
		.texOffs(119, 26).addBox(0.7F, -14.3701F, 0.8456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(119, 26).addBox(-1.7F, -14.3701F, 0.8456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -3.7128F, -10.8692F, -1.5272F, 0.0F, 0.0F));

		PartDefinition mond2 = Jackrussel_head2.addOrReplaceChild("mond2", CubeListBuilder.create().texOffs(0, 7).addBox(-1.5F, -1.868F, -1.5657F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-1.03F)), PartPose.offsetAndRotation(0.0F, -5.4319F, 0.3408F, -1.3963F, 0.0F, 0.0F));

		PartDefinition bone4 = mond2.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(58, 0).addBox(-1.5F, -0.4101F, -1.8206F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.3F))
		.texOffs(112, 23).addBox(-0.5F, -0.1201F, -1.1243F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6856F, 1.092F, 0.0436F, 0.0F, 0.0F));

		PartDefinition bone5 = bone4.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(58, 5).addBox(-1.5F, -0.8518F, -1.9449F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.31F))
		.texOffs(28, 25).addBox(-1.49F, -0.4818F, -1.9549F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.32F)), PartPose.offset(0.0F, 1.7917F, 0.1242F));

		PartDefinition bone6 = mond2.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6152F, 1.0095F, -0.0524F, 0.0F, 0.0F));

		PartDefinition neus2 = mond2.addOrReplaceChild("neus2", CubeListBuilder.create().texOffs(89, 0).addBox(-0.5F, -1.3758F, -0.1815F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -0.93F, 1.4199F, -1.0472F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition pomeranian() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 17.0F, 4.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition pomeranian_tail_r1 = real_tail.addOrReplaceChild("pomeranian_tail_r1", CubeListBuilder.create().texOffs(1859, 26).addBox(-2.0F, -6.85F, -2.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(-0.4F))
		.texOffs(1845, 25).addBox(-2.0F, -4.65F, -2.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, -1.1805F, -0.4719F, -2.618F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create().texOffs(968, 21).mirror().addBox(-0.5F, 1.0F, -2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-1.35F, 18.85F, 4.85F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create().texOffs(968, 21).addBox(-0.5F, 1.0F, -2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.35F, 18.85F, 4.85F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create().texOffs(968, 21).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-1.45F, 20.025F, -3.275F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create().texOffs(968, 21).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.45F, 20.025F, -3.275F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 19.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition pomeranian_body2 = body.addOrReplaceChild("pomeranian_body2", CubeListBuilder.create().texOffs(1789, 0).addBox(-3.0F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offset(0.0F, 0.45F, 0.25F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 19.0F, -1.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition pomeranian_mane2 = upper_body.addOrReplaceChild("pomeranian_mane2", CubeListBuilder.create().texOffs(1817, 19).addBox(-3.5F, -3.0F, -8.5F, 7.0F, 6.0F, 7.0F, new CubeDeformation(-0.4F)), PartPose.offset(0.0F, -1.2F, 5.25F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 16.5F, -5.0F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(1.5F, -2.25F, -1.5F));

		PartDefinition pomeranian_ear_left3 = left_ear.addOrReplaceChild("pomeranian_ear_left3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2616F, -4.1457F, -11.05F, 0.0F, 0.0F, 0.3927F));

		PartDefinition oor3 = pomeranian_ear_left3.addOrReplaceChild("oor3", CubeListBuilder.create().texOffs(973, 13).mirror().addBox(0.6512F, -1.1647F, 11.66F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1661F, -0.0829F, 0.147F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-1.5F, -2.25F, -1.5F));

		PartDefinition pomeranian_ear_right3 = right_ear.addOrReplaceChild("pomeranian_ear_right3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2616F, -4.1457F, -11.05F, 0.0F, 0.0F, -0.3927F));

		PartDefinition oor2 = pomeranian_ear_right3.addOrReplaceChild("oor2", CubeListBuilder.create().texOffs(973, 13).addBox(-3.6512F, -1.1647F, 11.66F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1661F, 0.0829F, -0.147F));

		PartDefinition pomeranian_head2 = real_head.addOrReplaceChild("pomeranian_head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, 1.8667F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chihuahuaheadd2 = pomeranian_head2.addOrReplaceChild("chihuahuaheadd2", CubeListBuilder.create().texOffs(1690, 0).addBox(-2.5F, -10.9F, -8.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-0.5F))
		.texOffs(1783, 0).addBox(-2.5F, -6.9F, -8.0F, 5.0F, 5.0F, 1.0F, new CubeDeformation(-0.5F))
		.texOffs(1680, 18).addBox(-2.5F, -12.55F, -7.1F, 5.0F, 3.0F, 1.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, 4.4F, -7.6167F, -1.5708F, 0.0F, 0.0F));

		PartDefinition beard_right2 = chihuahuaheadd2.addOrReplaceChild("beard_right2", CubeListBuilder.create().texOffs(841, 19).addBox(-4.25F, -16.65F, -16.2F, 3.0F, 5.0F, 2.0F, new CubeDeformation(-0.7F)), PartPose.offset(0.0F, 5.75F, 8.25F));

		PartDefinition pomeranian_tong2 = chihuahuaheadd2.addOrReplaceChild("pomeranian_tong2", CubeListBuilder.create(), PartPose.offset(0.0F, -5.7834F, -8.3671F));

		PartDefinition pomeranian_tong_rot2 = pomeranian_tong2.addOrReplaceChild("pomeranian_tong_rot2", CubeListBuilder.create().texOffs(995, 1).addBox(-1.0F, -1.0458F, -1.9398F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.9599F, 0.0F, 0.0F));

		PartDefinition beard_left2 = chihuahuaheadd2.addOrReplaceChild("beard_left2", CubeListBuilder.create().texOffs(841, 19).mirror().addBox(1.25F, -10.9F, -7.95F, 3.0F, 5.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bridge2 = chihuahuaheadd2.addOrReplaceChild("bridge2", CubeListBuilder.create().texOffs(308, 18).addBox(-1.0F, -0.5F, -0.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -8.1259F, -8.022F, 1.1868F, 0.0F, 0.0F));

		PartDefinition mond2 = chihuahuaheadd2.addOrReplaceChild("mond2", CubeListBuilder.create().texOffs(1087, 16).addBox(-1.5F, -1.0515F, -1.1944F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.5F))
		.texOffs(978, 15).addBox(-1.5F, -0.3015F, -1.2944F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.7F)), PartPose.offsetAndRotation(0.0F, -7.4827F, -8.5314F, 0.1222F, 0.0F, 0.0F));

		PartDefinition bone2 = mond2.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(1000, 28).addBox(-1.0F, -0.6006F, -0.8157F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F))
		.texOffs(958, 30).addBox(-1.0F, 0.7F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
		.texOffs(875, 29).addBox(-0.5F, 0.4994F, -0.3986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.6F, -0.52F, -0.0436F, 0.0F, 0.0F));

		PartDefinition eye3 = chihuahuaheadd2.addOrReplaceChild("eye3", CubeListBuilder.create().texOffs(902, 28).addBox(-1.3F, -0.9F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)), PartPose.offset(-0.8F, -8.75F, -7.65F));

		PartDefinition eye4 = chihuahuaheadd2.addOrReplaceChild("eye4", CubeListBuilder.create(), PartPose.offset(0.8F, -8.75F, -7.65F));

		PartDefinition mane_sub_2 = eye4.addOrReplaceChild("mane_sub_2", CubeListBuilder.create().texOffs(902, 28).mirror().addBox(-0.7F, -0.9F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition smile_corner_left2 = pomeranian_head2.addOrReplaceChild("smile_corner_left2", CubeListBuilder.create().texOffs(933, 29).addBox(-0.4869F, -0.5F, -0.4009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.95F, -3.4F, -0.5667F, 0.0F, -0.1309F, 0.0F));

		PartDefinition smile_corner_right2 = pomeranian_head2.addOrReplaceChild("smile_corner_right2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.95F, -3.4F, -0.5667F, 0.0F, 0.1309F, 0.0F));

		PartDefinition mane_sub_3 = smile_corner_right2.addOrReplaceChild("mane_sub_3", CubeListBuilder.create().texOffs(933, 29).mirror().addBox(-0.5131F, -0.5F, -0.4009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition pomeranian_neck2 = pomeranian_head2.addOrReplaceChild("pomeranian_neck2", CubeListBuilder.create().texOffs(782, 4).addBox(-2.5F, -1.5F, -2.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(-0.4F)), PartPose.offset(0.0F, -1.7F, -1.8667F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition samoyed() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 13.0F, 7.25F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition samoyed_tail2 = real_tail.addOrReplaceChild("samoyed_tail2", CubeListBuilder.create().texOffs(607, 20).addBox(-2.5F, 0.0F, -2.0F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(607, 0).addBox(-2.5F, 0.0F, -5.0F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.25F, 0.55F, 1.7017F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-1.5F, 17.0F, 7.0F));

		PartDefinition leg4 = right_hind_leg.addOrReplaceChild("leg4", CubeListBuilder.create(), PartPose.offset(4.0F, -1.0F, 0.0F));

		PartDefinition Samoyed4 = leg4.addOrReplaceChild("Samoyed4", CubeListBuilder.create().texOffs(599, 19).mirror().addBox(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offset(-5.0F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(1.5F, 17.0F, 7.0F));

		PartDefinition leg2 = left_hind_leg.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offset(-4.0F, -1.0F, 0.0F));

		PartDefinition Samoyed5 = leg2.addOrReplaceChild("Samoyed5", CubeListBuilder.create().texOffs(599, 19).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offset(5.0F, 0.0F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-1.5F, 18.0F, -4.0F));

		PartDefinition leg3 = right_front_leg.addOrReplaceChild("leg3", CubeListBuilder.create(), PartPose.offset(4.0F, -2.0F, 0.0F));

		PartDefinition Samoyed6 = leg3.addOrReplaceChild("Samoyed6", CubeListBuilder.create().texOffs(599, 19).mirror().addBox(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offset(-5.0F, 0.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(1.5F, 18.0F, -4.0F));

		PartDefinition leg5 = left_front_leg.addOrReplaceChild("leg5", CubeListBuilder.create(), PartPose.offset(-4.0F, -2.0F, 0.0F));

		PartDefinition Samoyed2 = leg5.addOrReplaceChild("Samoyed2", CubeListBuilder.create().texOffs(599, 19).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offset(5.0F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.75F, 0.5F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_sub_2 = body.addOrReplaceChild("body_sub_2", CubeListBuilder.create(), PartPose.offset(0.0F, 1.5F, 0.75F));

		PartDefinition Samoyed3 = body_sub_2.addOrReplaceChild("Samoyed3", CubeListBuilder.create().texOffs(577, 2).addBox(-3.5F, -2.45F, -5.0F, 7.0F, 9.0F, 8.0F, new CubeDeformation(-0.25F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 15.5F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane_sub_7 = upper_body.addOrReplaceChild("mane_sub_7", CubeListBuilder.create(), PartPose.offset(0.0F, 2.5F, 4.0F));

		PartDefinition Samoyed9 = mane_sub_7.addOrReplaceChild("Samoyed9", CubeListBuilder.create().texOffs(551, 12).addBox(-5.0F, -3.0F, -10.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offset(1.0F, -2.5F, 2.5F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 10.0F, -6.0F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Samoyed_head2 = real_head.addOrReplaceChild("Samoyed_head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.75F, 3.5F, 1.5708F, 0.0F, 0.0F));

		PartDefinition Samoyed8 = Samoyed_head2.addOrReplaceChild("Samoyed8", CubeListBuilder.create().texOffs(622, 1).addBox(-3.5F, 0.05F, -1.2F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(1735, 18).addBox(-4.5F, -0.85F, -0.75F, 7.0F, 8.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(1670, 15).addBox(-5.5F, 1.15F, 0.25F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -4.5F, 2.95F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mane_sub_2 = Samoyed8.addOrReplaceChild("mane_sub_2", CubeListBuilder.create().texOffs(1670, 15).mirror().addBox(2.5F, 1.15F, 0.25F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone10 = Samoyed8.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, 10.0F, 7.7F, 0.0175F, 0.0F, 0.0F));

		PartDefinition oog2 = bone10.addOrReplaceChild("oog2", CubeListBuilder.create().texOffs(531, 0).addBox(-0.272F, -8.0968F, -9.4587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(527, 0).addBox(-0.3694F, -7.9968F, -9.4469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, -0.75F, 0.65F, 0.0F, 0.0F, -0.0262F));

		PartDefinition oog3 = bone10.addOrReplaceChild("oog3", CubeListBuilder.create().texOffs(531, 0).addBox(1.3951F, -8.1486F, -9.4587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(527, 0).addBox(1.5253F, -7.9968F, -9.4469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -0.75F, 0.65F, 0.0F, 0.0F, 0.0262F));

		PartDefinition bone11 = Samoyed8.addOrReplaceChild("bone11", CubeListBuilder.create().texOffs(607, 12).addBox(-1.5F, -8.4299F, -11.2632F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.95F))
		.texOffs(619, 22).addBox(-0.5F, -7.4299F, -10.4632F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F))
		.texOffs(501, 26).addBox(-1.5F, -7.5431F, -10.3247F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F))
		.texOffs(531, 0).addBox(-1.5F, -6.099F, -10.2784F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F))
		.texOffs(178, 27).addBox(-1.5F, -5.7991F, -10.2898F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.0F, 9.15F, 6.7F, 0.096F, 0.0F, 0.0F));

		PartDefinition bone12 = Samoyed8.addOrReplaceChild("bone12", CubeListBuilder.create().texOffs(523, 4).addBox(1.0F, -7.6262F, -6.9111F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 11.35F, 2.3F, -0.3927F, 0.0F, 0.0F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(2.0F, -1.5F, -0.5F));

		PartDefinition earleft2 = left_ear.addOrReplaceChild("earleft2", CubeListBuilder.create(), PartPose.offset(0.7876F, -2.0682F, 7.7313F));

		PartDefinition bone2 = earleft2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0541F, -0.3952F, 0.1002F));

		PartDefinition mane_sub_5 = bone2.addOrReplaceChild("mane_sub_5", CubeListBuilder.create().texOffs(557, 1).mirror().addBox(-4.6572F, -0.8995F, -7.5879F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(571, 0).mirror().addBox(-4.6572F, -1.8995F, -8.0892F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone3 = earleft2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9F, -4.0F, -0.1F, 0.0541F, -0.3952F, 0.1002F));

		PartDefinition mane_sub_6 = bone3.addOrReplaceChild("mane_sub_6", CubeListBuilder.create().texOffs(576, 7).mirror().addBox(-4.0803F, 2.2526F, -7.5242F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-2.0F, -1.5F, -0.5F));

		PartDefinition earright2 = right_ear.addOrReplaceChild("earright2", CubeListBuilder.create(), PartPose.offset(-0.7876F, -2.0682F, 7.7313F));

		PartDefinition bone4 = earright2.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0541F, 0.3952F, -0.1002F));

		PartDefinition mane_sub_3 = bone4.addOrReplaceChild("mane_sub_3", CubeListBuilder.create().texOffs(557, 1).addBox(1.6572F, -0.8995F, -7.5879F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(571, 0).addBox(1.6572F, -1.8995F, -8.0892F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.5F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone5 = earright2.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9F, -4.0F, -0.1F, 0.0541F, 0.3952F, -0.1002F));

		PartDefinition mane_sub_4 = bone5.addOrReplaceChild("mane_sub_4", CubeListBuilder.create().texOffs(576, 7).addBox(3.0803F, 2.2526F, -7.5242F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition st_bernard() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 10.0F, 10.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition stbernard3 = real_tail.addOrReplaceChild("stbernard3", CubeListBuilder.create().texOffs(1545, 18).addBox(-2.5F, -1.6522F, 0.3997F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(1557, 20).addBox(-2.5F, -1.6522F, -2.6003F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 0.95F, -3.4F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-2.0F, 16.0F, 7.0F));

		PartDefinition bernese2 = right_hind_leg.addOrReplaceChild("bernese2", CubeListBuilder.create().texOffs(709, 15).addBox(-2.5F, -0.25F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.3F)), PartPose.offset(1.5F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(2.0F, 16.0F, 7.0F));

		PartDefinition bernese3 = left_hind_leg.addOrReplaceChild("bernese3", CubeListBuilder.create().texOffs(709, 15).addBox(-1.5F, -0.25F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.3F)), PartPose.offset(0.5F, 0.0F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-1.75F, 16.0F, -4.0F));

		PartDefinition stbernardbernese5 = right_front_leg.addOrReplaceChild("stbernardbernese5", CubeListBuilder.create().texOffs(1504, 8).addBox(-2.5F, -0.35F, -1.25F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.3F)), PartPose.offset(1.25F, 0.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(1.75F, 16.0F, -4.0F));

		PartDefinition stbernardbernese2 = left_front_leg.addOrReplaceChild("stbernardbernese2", CubeListBuilder.create().texOffs(1504, 8).addBox(-1.5F, -0.35F, -1.25F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.3F)), PartPose.offset(0.75F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 15.0F, 1.8F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_sub_2 = body.addOrReplaceChild("body_sub_2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.2F, 1.0F));

		PartDefinition stbernardbernese3 = body_sub_2.addOrReplaceChild("stbernardbernese3", CubeListBuilder.create().texOffs(1528, 2).addBox(-3.5F, -3.4F, -0.15F, 7.0F, 8.0F, 8.0F, new CubeDeformation(0.4F))
		.texOffs(1534, 8).addBox(-3.5F, -3.4F, -2.95F, 7.0F, 8.0F, 2.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, -0.25F, 1.15F, -1.5708F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.0F, -4.25F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane_sub_2 = upper_body.addOrReplaceChild("mane_sub_2", CubeListBuilder.create(), PartPose.offset(0.0F, 3.75F, 2.5F));

		PartDefinition stbernardbernese6 = mane_sub_2.addOrReplaceChild("stbernardbernese6", CubeListBuilder.create().texOffs(1503, 9).addBox(-8.0F, -7.75F, -2.1F, 8.0F, 8.0F, 9.0F, new CubeDeformation(0.2F)), PartPose.offset(4.0F, 1.25F, -4.5F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 7.35F, -8.0F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-2.0F, -0.25F, 2.5F));

		PartDefinition ear_right2 = right_ear.addOrReplaceChild("ear_right2", CubeListBuilder.create().texOffs(1523, 0).addBox(1.503F, -18.6231F, -10.9019F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(1501, 0).addBox(1.5258F, -13.6415F, -10.5514F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.75F, 16.4F, 7.55F, -0.0436F, -0.2182F, 0.1745F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(2.0F, -0.25F, 2.8F));

		PartDefinition ear_left2 = left_ear.addOrReplaceChild("ear_left2", CubeListBuilder.create().texOffs(1523, 0).addBox(2.1754F, -18.2533F, -10.9832F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(1501, 0).addBox(2.1526F, -13.2716F, -10.6327F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2F, 16.85F, 8.85F, -0.0436F, 0.2182F, -0.1745F));

		PartDefinition head3 = real_head.addOrReplaceChild("head3", CubeListBuilder.create(), PartPose.offset(-1.0F, 6.15F, 2.5F));

		PartDefinition stbernard2 = head3.addOrReplaceChild("stbernard2", CubeListBuilder.create().texOffs(1475, 0).addBox(-3.5F, -20.05F, -11.75F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.1F))
		.texOffs(1503, 0).addBox(-2.0F, -13.45F, -11.75F, 4.0F, 2.0F, 6.0F, new CubeDeformation(-0.1F))
		.texOffs(1500, 0).addBox(-2.3F, -18.4F, -11.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F))
		.texOffs(1496, 0).addBox(-2.85F, -18.2F, -11.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F))
		.texOffs(1500, 0).addBox(1.25F, -18.4F, -11.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F))
		.texOffs(1496, 0).addBox(1.8F, -18.2F, -11.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offset(1.0F, 10.95F, 7.5F));

		PartDefinition bone2 = stbernard2.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(1481, 19).addBox(2.0F, -12.4869F, -8.2997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.45F)), PartPose.offsetAndRotation(-2.5F, -3.95F, -7.25F, -0.0436F, 0.0F, 0.0F));

		PartDefinition mond2 = stbernard2.addOrReplaceChild("mond2", CubeListBuilder.create().texOffs(1473, 23).addBox(-1.85F, -10.647F, -8.4197F, 2.0F, 5.0F, 4.0F, new CubeDeformation(-0.1F))
		.texOffs(1500, 28).addBox(0.0F, -10.5587F, -8.3366F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F))
		.texOffs(1485, 23).addBox(0.85F, -10.647F, -8.4197F, 2.0F, 5.0F, 4.0F, new CubeDeformation(-0.1F))
		.texOffs(1508, 28).addBox(-0.5F, -8.3373F, -8.2814F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(1507, 26).addBox(-0.5F, -7.8873F, -8.0314F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.1F))
		.texOffs(1472, 18).addBox(-1.65F, -6.8205F, -6.3607F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F))
		.texOffs(1482, 18).addBox(0.65F, -6.8205F, -6.3607F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -6.2F, -7.35F, -0.0436F, 0.0F, 0.0F));

		PartDefinition neus2 = mond2.addOrReplaceChild("neus2", CubeListBuilder.create().texOffs(1533, 26).addBox(0.0F, -13.7889F, -5.448F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.015F, 9.0455F, 1.1345F, 0.0F, 0.0F));

		PartDefinition bone3 = neus2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(1533, 26).addBox(-0.5F, -15.9939F, -6.4992F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
		.texOffs(1534, 27).addBox(-0.5F, -15.9939F, -4.7992F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3555F, -13.9238F, -0.829F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition poodle() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 10.5F, 8.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition poedel_tail = real_tail.addOrReplaceChild("poedel_tail", CubeListBuilder.create().texOffs(38, 24).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.0F, 1.2253F, 1.3418F, 0.829F, 0.0F, 0.0F));

		PartDefinition bone167 = poedel_tail.addOrReplaceChild("bone167", CubeListBuilder.create().texOffs(27, 16).addBox(-1.0F, -12.3767F, 13.6831F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-0.5F, 20.5196F, -1.0727F, 0.9163F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-1.75F, 16.0F, 7.0F));

		PartDefinition poodle_leg2 = right_hind_leg.addOrReplaceChild("poodle_leg2", CubeListBuilder.create(), PartPose.offset(0.1F, 8.0F, -7.0F));

		PartDefinition Labradorpoedel_leg2_rot = poodle_leg2.addOrReplaceChild("Labradorpoedel_leg2_rot", CubeListBuilder.create().texOffs(199, 0).addBox(0.6F, 14.8F, 14.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(-1.6F, -23.0F, -8.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(1.75F, 16.0F, 7.0F));

		PartDefinition poodle_leg1 = left_hind_leg.addOrReplaceChild("poodle_leg1", CubeListBuilder.create(), PartPose.offset(0.05F, -12.0F, -7.0F));

		PartDefinition Labradorpoedel_leg1_rot = poodle_leg1.addOrReplaceChild("Labradorpoedel_leg1_rot", CubeListBuilder.create(), PartPose.offset(-1.7F, -7.0F, -8.0F));

		PartDefinition mane_sub_182 = Labradorpoedel_leg1_rot.addOrReplaceChild("mane_sub_182", CubeListBuilder.create().texOffs(199, 0).mirror().addBox(0.6F, 18.8F, 14.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-2.0F, 16.0F, -4.5F));

		PartDefinition poodle_leg4 = right_front_leg.addOrReplaceChild("poodle_leg4", CubeListBuilder.create(), PartPose.offset(0.0F, -3.55F, 4.0F));

		PartDefinition labrador4_rot = poodle_leg4.addOrReplaceChild("labrador4_rot", CubeListBuilder.create().texOffs(199, 0).addBox(-2.25F, -0.45F, 2.45F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(1.25F, 3.8F, -7.5F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(2.0F, 16.0F, -4.5F));

		PartDefinition poodle_leg3 = left_front_leg.addOrReplaceChild("poodle_leg3", CubeListBuilder.create(), PartPose.offset(0.0F, -3.65F, 6.0F));

		PartDefinition labrador3_rot = poodle_leg3.addOrReplaceChild("labrador3_rot", CubeListBuilder.create(), PartPose.offset(-2.0F, 12.15F, -7.5F));

		PartDefinition mane_sub_176 = labrador3_rot.addOrReplaceChild("mane_sub_176", CubeListBuilder.create().texOffs(199, 0).mirror().addBox(1.0F, -8.7F, 0.45F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition asd = body.addOrReplaceChild("asd", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition poedel_body = asd.addOrReplaceChild("poedel_body", CubeListBuilder.create().texOffs(27, 0).addBox(-3.0F, -4.75F, 0.4F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 1.75F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.0F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition poedel_mane = upper_body.addOrReplaceChild("poedel_mane", CubeListBuilder.create().texOffs(1785, 16).addBox(-4.0F, -13.0F, -1.5F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 10.0F, -3.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 5.75F, -7.0F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-3.25F, -1.0F, 1.0F));

		PartDefinition poedel_oor_links2 = right_ear.addOrReplaceChild("poedel_oor_links2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, 4.0F, 12.5F, 0.0F, -0.1745F, 0.0F));

		PartDefinition bone159 = poedel_oor_links2.addOrReplaceChild("bone159", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4734F, -1.634F, -8.4201F, -0.0862F, -0.0431F, -1.3493F));

		PartDefinition mane_sub_216 = bone159.addOrReplaceChild("mane_sub_216", CubeListBuilder.create().texOffs(1606, 3).mirror().addBox(-3.8271F, -0.5029F, -6.1906F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.1F)).mirror(false)
		.texOffs(1633, 17).mirror().addBox(-6.0271F, -0.5029F, -6.1906F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(3.25F, -1.0F, 1.0F));

		PartDefinition poedel_oor_links = left_ear.addOrReplaceChild("poedel_oor_links", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, 4.0F, 12.5F, 0.0F, 0.1745F, 0.0F));

		PartDefinition bone160 = poedel_oor_links.addOrReplaceChild("bone160", CubeListBuilder.create().texOffs(1606, 3).addBox(-2.1729F, -0.5029F, -6.1906F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.1F))
		.texOffs(1633, 17).addBox(4.0271F, -0.5029F, -6.1906F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.4734F, -1.634F, -8.4201F, -0.0862F, 0.0431F, 1.3493F));

		PartDefinition poedel_head = real_head.addOrReplaceChild("poedel_head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.75F, 3.5F, 1.5708F, 0.0F, 0.0F));

		PartDefinition poedel_head_rot = poedel_head.addOrReplaceChild("poedel_head_rot", CubeListBuilder.create().texOffs(1761, 21).addBox(-4.0F, -2.35F, -3.25F, 6.0F, 5.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0F, -2.25F, 2.5F, -1.5708F, 0.0F, 0.0F));

		PartDefinition bone163 = poedel_head_rot.addOrReplaceChild("bone163", CubeListBuilder.create().texOffs(1765, 0).addBox(-3.0F, -2.2391F, -2.7502F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.2F))
		.texOffs(1612, 25).addBox(-3.0F, 0.6609F, -2.7502F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.19F)), PartPose.offsetAndRotation(-1.0F, -2.75F, -0.5F, 0.0436F, 0.0F, 0.0F));

		PartDefinition oog24 = poedel_head_rot.addOrReplaceChild("oog24", CubeListBuilder.create().texOffs(1593, 2).addBox(0.9504F, -11.5F, -9.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.04F))
		.texOffs(1593, 0).addBox(0.4487F, -11.4F, -9.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(-0.3F, 9.9F, 5.8F, 0.0F, 0.0F, -0.0175F));

		PartDefinition oog25 = poedel_head_rot.addOrReplaceChild("oog25", CubeListBuilder.create().texOffs(1593, 0).addBox(3.15F, -11.3802F, -9.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F))
		.texOffs(1593, 2).addBox(2.6482F, -11.4802F, -9.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.04F)), PartPose.offsetAndRotation(-6.3F, 9.8F, 5.9F, 0.0F, 0.0F, 0.0175F));

		PartDefinition bone40 = poedel_head_rot.addOrReplaceChild("bone40", CubeListBuilder.create().texOffs(1616, 18).addBox(-1.5F, -1.7421F, -2.1386F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F))
		.texOffs(1583, 0).addBox(-1.5F, -0.2132F, -2.1105F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-1.0F, 1.7838F, -4.1134F, 0.3578F, 0.0F, 0.0F));

		PartDefinition bone166 = bone40.addOrReplaceChild("bone166", CubeListBuilder.create().texOffs(1582, 7).addBox(-1.5F, -0.4332F, -1.7591F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.23F)), PartPose.offsetAndRotation(0.0F, 0.6496F, -0.332F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bone162 = bone40.addOrReplaceChild("bone162", CubeListBuilder.create().texOffs(1759, 0).addBox(-1.5F, -1.3865F, -0.8772F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(0.0F, -1.0791F, -2.2862F, 0.1134F, 0.0F, 0.0F));

		PartDefinition oor59 = poedel_head_rot.addOrReplaceChild("oor59", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.65F, 1.5F, 7.5F, 0.0F, -0.1745F, 0.0F));

		PartDefinition bone133 = oor59.addOrReplaceChild("bone133", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4924F, 3.5F, -0.4868F, 0.0436F, 0.0F, -1.3701F));

		PartDefinition oor29 = poedel_head_rot.addOrReplaceChild("oor29", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.65F, 1.5F, 7.5F, 0.0F, -0.1745F, 0.0F));

		PartDefinition bone113 = oor29.addOrReplaceChild("bone113", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4924F, 3.5F, -0.4868F, 0.0436F, 0.0F, -1.3701F));

		PartDefinition bone161 = poedel_head_rot.addOrReplaceChild("bone161", CubeListBuilder.create().texOffs(1592, 6).addBox(-0.5F, -0.2311F, -0.8157F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(-1.0F, 0.0302F, -3.5651F, 0.7418F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition husky() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 11.65F, 7.7F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Husky2 = real_tail.addOrReplaceChild("Husky2", CubeListBuilder.create().texOffs(287, 0).addBox(-3.0F, -2.9F, 13.0F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 2.1F, -15.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-1.5F, 16.0F, 7.0F));

		PartDefinition GermansheperdHusky4 = right_hind_leg.addOrReplaceChild("GermansheperdHusky4", CubeListBuilder.create().texOffs(279, 2).addBox(-2.0F, -0.25F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(1.0F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(1.5F, 16.0F, 7.0F));

		PartDefinition GermansheperdHusky3 = left_hind_leg.addOrReplaceChild("GermansheperdHusky3", CubeListBuilder.create().texOffs(279, 2).addBox(-2.0F, -0.25F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(1.0F, 0.0F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-1.5F, 16.0F, -4.0F));

		PartDefinition GermanAussheperdHusky4 = right_front_leg.addOrReplaceChild("GermanAussheperdHusky4", CubeListBuilder.create().texOffs(257, 22).addBox(-2.0F, -0.25F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(1.0F, 0.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(1.5F, 16.0F, -4.0F));

		PartDefinition GermanAussheperdHusky3 = left_front_leg.addOrReplaceChild("GermanAussheperdHusky3", CubeListBuilder.create().texOffs(257, 22).addBox(-2.0F, -0.25F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(1.0F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(273, 22).addBox(-3.0F, -5.0F, -6.45F, 6.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.3F, 3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_sub_2 = body.addOrReplaceChild("body_sub_2", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, -0.7F));

		PartDefinition Husky5 = body_sub_2.addOrReplaceChild("Husky5", CubeListBuilder.create().texOffs(257, 5).addBox(-4.5F, -1.75F, 4.75F, 7.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -0.5F, -9.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.8F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition Husky4 = upper_body.addOrReplaceChild("Husky4", CubeListBuilder.create().texOffs(225, 11).addBox(-5.0F, -2.5F, 0.25F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -0.5F, -4.2F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 9.55F, -7.5F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-2.0F, -1.55F, 0.5F));

		PartDefinition oorright3 = right_ear.addOrReplaceChild("oorright3", CubeListBuilder.create().texOffs(249, 14).addBox(-1.4338F, -0.8057F, -0.4349F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(243, 25).addBox(-1.4338F, -1.8057F, -0.7449F, 3.0F, 5.0F, 1.0F, new CubeDeformation(-0.3F))
		.texOffs(247, 5).addBox(-0.4338F, -1.8057F, -0.4349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.95F, -0.4533F, 0.054F, -0.3892F, -0.1415F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(2.0F, -1.55F, 0.5F));

		PartDefinition oorleft3 = left_ear.addOrReplaceChild("oorleft3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -2.25F, 3.7467F, 0.054F, 0.3892F, 0.1415F));

		PartDefinition mane_sub_4 = oorleft3.addOrReplaceChild("mane_sub_4", CubeListBuilder.create().texOffs(249, 14).mirror().addBox(0.1338F, -0.8057F, -4.4349F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(243, 25).mirror().addBox(0.1338F, -1.8057F, -4.7449F, 3.0F, 5.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
		.texOffs(247, 5).mirror().addBox(1.1338F, -1.8057F, -4.4349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition huskyhead2 = real_head.addOrReplaceChild("huskyhead2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.2F, 3.75F, 1.5708F, 0.0F, 0.0F));

		PartDefinition huskyhead_rotation2 = huskyhead2.addOrReplaceChild("huskyhead_rotation2", CubeListBuilder.create().texOffs(225, 0).addBox(-4.0F, -2.9F, -3.0F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(225, 0).addBox(-4.65F, -2.4F, -2.65F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(225, 4).addBox(-4.0F, -2.9F, 2.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(275, 0).addBox(-2.85F, -0.82F, -3.01F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(261, 1).addBox(-3.3F, -0.82F, -3.015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
		.texOffs(261, 1).addBox(0.3F, -0.82F, -3.015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
		.texOffs(275, 0).addBox(-0.15F, -0.82F, -3.01F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.25F, 2.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mane_sub_2 = huskyhead_rotation2.addOrReplaceChild("mane_sub_2", CubeListBuilder.create().texOffs(225, 0).mirror().addBox(1.65F, -2.4F, -2.65F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition streep2 = huskyhead_rotation2.addOrReplaceChild("streep2", CubeListBuilder.create().texOffs(251, 25).addBox(-0.5F, -0.8445F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, -1.7805F, -2.0489F, -1.5708F, 0.0F, 3.1416F));

		PartDefinition neusb2 = huskyhead_rotation2.addOrReplaceChild("neusb2", CubeListBuilder.create().texOffs(251, 25).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, 0.1195F, -2.5489F, -2.0595F, 0.0F, 0.0F));

		PartDefinition mond2 = huskyhead_rotation2.addOrReplaceChild("mond2", CubeListBuilder.create().texOffs(247, 3).addBox(-1.5F, -1.1313F, -1.1954F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.1F))
		.texOffs(229, 13).addBox(-0.5F, -0.8687F, -1.3046F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, 1.4781F, -4.989F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone2 = mond2.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(147, 26).addBox(-1.5F, -1.7974F, -1.4608F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(0.0F, -0.2702F, -0.6395F, 0.0436F, 0.0F, 0.0F));

		PartDefinition bone3 = mond2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(262, 0).addBox(-1.5F, -10.6126F, -12.283F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
		.texOffs(150, 0).addBox(-1.5F, -10.2129F, -12.2944F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 11.2579F, 10.8447F, -0.0262F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition doberman() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 12.0F, 8.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition doberman_tail2 = real_tail.addOrReplaceChild("doberman_tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.5208F, 11.8125F, -0.7854F, 0.0F, 0.0F));

		PartDefinition doberman_tail_rot2 = doberman_tail2.addOrReplaceChild("doberman_tail_rot2", CubeListBuilder.create().texOffs(1174, 0).addBox(-2.0F, 5.734F, -13.1308F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(1.5F, -0.25F, 0.75F, 0.7854F, 0.0F, 0.0F));

		PartDefinition doberman_tailpart3 = doberman_tail_rot2.addOrReplaceChild("doberman_tailpart3", CubeListBuilder.create().texOffs(1167, 14).addBox(-0.999F, 8.8709F, -3.2454F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.201F)), PartPose.offsetAndRotation(-1.0F, 7.1F, -3.4F, -0.8727F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-2.5F, 16.0F, 7.0F));

		PartDefinition doberman_rot6 = right_hind_leg.addOrReplaceChild("doberman_rot6", CubeListBuilder.create().texOffs(1168, 22).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, 2.0F, 0.0F));

		PartDefinition boxer3 = doberman_rot6.addOrReplaceChild("boxer3", CubeListBuilder.create().texOffs(1580, 20).addBox(-2.5F, -8.8492F, 6.0349F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.5F, 6.35F, -8.65F, 0.0436F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(2.5F, 16.0F, 7.0F));

		PartDefinition doberman_rot5 = left_hind_leg.addOrReplaceChild("doberman_rot5", CubeListBuilder.create().texOffs(1168, 22).addBox(1.0F, -8.0F, 6.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, 8.0F, -7.0F));

		PartDefinition boxer2 = doberman_rot5.addOrReplaceChild("boxer2", CubeListBuilder.create().texOffs(1580, 20).addBox(0.5F, -8.7992F, 6.0349F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, 0.3F, -1.65F, 0.0436F, 0.0F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-2.5F, 16.0F, -4.0F));

		PartDefinition doberman_rot3 = right_front_leg.addOrReplaceChild("doberman_rot3", CubeListBuilder.create().texOffs(1159, 14).addBox(-3.25F, -8.0F, -5.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 8.0F, 4.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(2.5F, 16.0F, -4.0F));

		PartDefinition doberman_rot2 = left_front_leg.addOrReplaceChild("doberman_rot2", CubeListBuilder.create().texOffs(1159, 14).addBox(1.25F, -1.0F, 3.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, 1.0F, -4.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.5F, 2.2F, 1.5708F, 0.0F, 0.0F));

		PartDefinition doberman_body2 = body.addOrReplaceChild("doberman_body2", CubeListBuilder.create(), PartPose.offset(0.0F, 4.55F, 0.9F));

		PartDefinition dobermanpoedel_rot2 = doberman_body2.addOrReplaceChild("dobermanpoedel_rot2", CubeListBuilder.create().texOffs(1127, 5).addBox(-3.5F, -2.75F, -6.75F, 7.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.6F, -3.25F, 1.5708F, 0.0F, 0.0F));

		PartDefinition doberman_mane2 = upper_body.addOrReplaceChild("doberman_mane2", CubeListBuilder.create().texOffs(1150, 0).addBox(-4.0F, -13.0F, -7.6F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 10.25F, 3.6F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 7.6F, -6.7F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-2.0F, -1.8F, 1.0F));

		PartDefinition ear_right3 = right_ear.addOrReplaceChild("ear_right3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.15F, 2.8F, 6.9F, 0.0F, -0.1745F, 0.0F));

		PartDefinition mane_sub_5 = ear_right3.addOrReplaceChild("mane_sub_5", CubeListBuilder.create().texOffs(1101, 0).mirror().addBox(2.7872F, -7.55F, -7.4095F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(1097, 1).mirror().addBox(2.8857F, -5.55F, -7.8269F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone10 = ear_right3.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.469F, -1.9199F, -9.1519F, 0.0435F, 0.0038F, -1.2653F));

		PartDefinition mane_sub_6 = bone10.addOrReplaceChild("mane_sub_6", CubeListBuilder.create().texOffs(1139, 0).mirror().addBox(-1.2664F, 0.6837F, 0.3817F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone11 = bone10.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7419F, 1.0951F, 0.997F, 0.0F, -0.1309F, 0.0F));

		PartDefinition mane_sub_7 = bone11.addOrReplaceChild("mane_sub_7", CubeListBuilder.create().texOffs(1152, 0).mirror().addBox(-0.4122F, -0.3959F, -0.5189F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.09F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(2.0F, -2.1F, 1.2F));

		PartDefinition ear_left3 = left_ear.addOrReplaceChild("ear_left3", CubeListBuilder.create().texOffs(1101, 0).addBox(-2.5717F, -11.15F, -14.3032F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1097, 1).addBox(-2.6702F, -9.15F, -14.7205F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.15F, 6.6F, 13.7F, 0.0F, 0.1745F, 0.0F));

		PartDefinition bone5 = ear_left3.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(1139, 0).addBox(-4.8275F, -1.8553F, -6.3963F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.469F, -1.9199F, -9.1519F, 0.0435F, -0.0038F, 1.2653F));

		PartDefinition bone6 = bone5.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(1152, 0).addBox(-2.7705F, -2.9349F, -7.6428F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.09F)), PartPose.offsetAndRotation(1.7419F, 1.0951F, 0.997F, 0.0F, 0.1309F, 0.0F));

		PartDefinition doberman_headfull2 = real_head.addOrReplaceChild("doberman_headfull2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.65F, 2.2F, 1.5708F, 0.0F, 0.0F));

		PartDefinition doberman_neck2 = doberman_headfull2.addOrReplaceChild("doberman_neck2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition doberman_neck_rot2 = doberman_neck2.addOrReplaceChild("doberman_neck_rot2", CubeListBuilder.create().texOffs(1688, 10).addBox(-2.0F, -0.8354F, -0.6787F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0374F, 1.6237F, -1.2217F, 0.0F, 0.0F));

		PartDefinition doberman_head2 = doberman_headfull2.addOrReplaceChild("doberman_head2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.4F, 2.45F));

		PartDefinition doberman_head_rot2 = doberman_head2.addOrReplaceChild("doberman_head_rot2", CubeListBuilder.create().texOffs(1098, 20).addBox(-2.9F, -1.71F, -2.41F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
		.texOffs(1098, 20).addBox(-0.1F, -1.71F, -2.41F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
		.texOffs(1117, 21).addBox(-3.5F, -1.85F, -2.35F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.25F, 2.75F, -1.5708F, 0.0F, 0.0F));

		PartDefinition bone2 = doberman_head_rot2.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(885, 10).addBox(-1.5F, 0.5697F, -0.8168F, 3.0F, 2.0F, 5.0F, new CubeDeformation(-0.26F)), PartPose.offsetAndRotation(-1.0F, 1.5502F, -5.7891F, 0.1309F, 0.0F, 0.0F));

		PartDefinition oog2 = doberman_head_rot2.addOrReplaceChild("oog2", CubeListBuilder.create().texOffs(1135, 0).addBox(0.7522F, -10.0F, -8.24F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
		.texOffs(1131, 0).addBox(0.6022F, -10.3F, -8.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 9.8F, 5.8F));

		PartDefinition oog3 = doberman_head_rot2.addOrReplaceChild("oog3", CubeListBuilder.create().texOffs(1131, 0).addBox(1.3918F, -10.278F, -8.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1135, 0).addBox(1.2418F, -9.978F, -8.34F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offset(-4.5F, 9.8F, 5.9F));

		PartDefinition bone3 = doberman_head_rot2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(1139, 24).addBox(-1.5F, 0.5548F, -0.6737F, 3.0F, 3.0F, 5.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.0F, 0.1259F, -6.3967F, 0.1833F, 0.0F, 0.0F));

		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(1735, 0).addBox(-1.5F, 0.204F, -0.3596F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.8F)), PartPose.offsetAndRotation(0.0F, -0.2649F, -1.0632F, -0.0436F, 0.0F, 0.0F));

		PartDefinition bone9 = doberman_head_rot2.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(1131, 2).addBox(-1.0F, -8.6053F, -5.7313F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, 9.2F, -2.5F, -0.6109F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition neapolitan_mastiff() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 10.5F, 8.25F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition mane = real_tail.addOrReplaceChild("mane", CubeListBuilder.create(), PartPose.offset(-1.0F, 2.5F, -8.2F));

		PartDefinition tail2 = mane.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 8.0F));

		PartDefinition neapolitanmastiff8 = tail2.addOrReplaceChild("neapolitanmastiff8", CubeListBuilder.create().texOffs(1394, 0).addBox(-0.5F, -12.0F, 9.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.3F)), PartPose.offset(1.0F, 12.0F, -10.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-2.25F, 16.0F, 7.0F));

		PartDefinition leg2 = right_hind_leg.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offset(2.75F, 0.0F, 0.0F));

		PartDefinition neapolitanmastiff5 = leg2.addOrReplaceChild("neapolitanmastiff5", CubeListBuilder.create().texOffs(1386, 14).addBox(-3.25F, -8.1F, 6.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(-0.5F, 8.0F, -7.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(2.25F, 16.0F, 7.0F));

		PartDefinition leg1 = left_hind_leg.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offset(-4.75F, 0.0F, 0.0F));

		PartDefinition neapolitanmastiff4 = leg1.addOrReplaceChild("neapolitanmastiff4", CubeListBuilder.create().texOffs(1386, 14).addBox(1.25F, -8.1F, 6.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(2.5F, 8.0F, -7.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-2.5F, 16.0F, -4.0F));

		PartDefinition leg4 = right_front_leg.addOrReplaceChild("leg4", CubeListBuilder.create(), PartPose.offset(3.0F, 0.0F, 0.0F));

		PartDefinition neapolitanmastiff7 = leg4.addOrReplaceChild("neapolitanmastiff7", CubeListBuilder.create().texOffs(1386, 14).addBox(-3.5F, -8.2F, -5.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(-0.5F, 8.0F, 4.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(2.5F, 16.0F, -4.0F));

		PartDefinition leg3 = left_front_leg.addOrReplaceChild("leg3", CubeListBuilder.create(), PartPose.offset(-5.0F, 0.0F, 0.0F));

		PartDefinition neapolitanmastiff6 = leg3.addOrReplaceChild("neapolitanmastiff6", CubeListBuilder.create().texOffs(1386, 14).addBox(1.5F, -8.2F, -5.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(2.5F, 8.0F, 4.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition asd = body.addOrReplaceChild("asd", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition body_rotation = asd.addOrReplaceChild("body_rotation", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_sub_1 = body_rotation.addOrReplaceChild("body_sub_1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition neapolitanmastiff2 = body_sub_1.addOrReplaceChild("neapolitanmastiff2", CubeListBuilder.create().texOffs(1386, 16).addBox(-3.5F, -3.4F, -1.75F, 7.0F, 7.0F, 9.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, -0.25F, 0.4F, -1.5708F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.0F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation = upper_body.addOrReplaceChild("mane_rotation", CubeListBuilder.create(), PartPose.offset(0.0F, 2.5F, -2.5F));

		PartDefinition mane_sub_1 = mane_rotation.addOrReplaceChild("mane_sub_1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition neapolitanmastiff3 = mane_sub_1.addOrReplaceChild("neapolitanmastiff3", CubeListBuilder.create().texOffs(1370, 0).addBox(-8.0F, -6.75F, 3.65F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.1F)), PartPose.offset(4.0F, 1.25F, -5.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 9.5F, -9.25F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-2.0F, 1.0F, 2.75F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(2.0F, 1.0F, 2.75F));

		PartDefinition head2 = real_head.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offset(-1.0F, 4.0F, 2.25F));

		PartDefinition neapolitanmastiff = head2.addOrReplaceChild("neapolitanmastiff", CubeListBuilder.create().texOffs(1344, 0).addBox(-3.0F, -20.25F, -11.75F, 6.0F, 7.0F, 7.0F, new CubeDeformation(0.1F))
		.texOffs(1347, 5).addBox(-0.5F, -17.65F, -15.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F))
		.texOffs(1347, 5).addBox(-1.85F, -19.05F, -11.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F))
		.texOffs(1360, 15).addBox(-2.3F, -18.95F, -11.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.04F))
		.texOffs(1347, 5).addBox(0.8F, -19.05F, -11.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F))
		.texOffs(1360, 15).addBox(1.25F, -18.95F, -11.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.04F)), PartPose.offset(1.0F, 13.9F, 7.5F));

		PartDefinition oor38 = neapolitanmastiff.addOrReplaceChild("oor38", CubeListBuilder.create().texOffs(1364, 25).addBox(1.5182F, -19.7853F, -12.2376F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.1F))
		.texOffs(1370, 19).addBox(1.5856F, -16.62F, -12.4453F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-10.75F, -0.95F, 0.05F, -0.0436F, -0.2182F, 0.1745F));

		PartDefinition oor39 = neapolitanmastiff.addOrReplaceChild("oor39", CubeListBuilder.create().texOffs(1364, 25).addBox(2.2962F, -19.4328F, -12.933F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.1F))
		.texOffs(1370, 19).addBox(2.2744F, -16.2308F, -13.0417F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(6.2F, -0.5F, 1.65F, -0.0436F, 0.2182F, -0.1745F));

		PartDefinition mond9 = neapolitanmastiff.addOrReplaceChild("mond9", CubeListBuilder.create().texOffs(1374, 23).addBox(-1.75F, -12.0155F, -8.2204F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.1F))
		.texOffs(1358, 22).addBox(0.0F, -12.0112F, -8.1205F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1324, 16).addBox(0.75F, -12.0155F, -8.2204F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.1F))
		.texOffs(1335, 1).addBox(-0.1F, -12.0155F, -8.2204F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(1363, 18).addBox(-0.5F, -9.1648F, -8.2884F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(1363, 3).addBox(-1.65F, -7.1498F, -8.0898F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.1F))
		.texOffs(1370, 24).addBox(-1.75F, -7.1581F, -6.5894F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.09F))
		.texOffs(1344, 14).addBox(-1.5F, -7.684F, -6.7162F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.1F))
		.texOffs(1363, 3).addBox(0.65F, -7.1498F, -8.0898F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.1F))
		.texOffs(1370, 24).addBox(0.75F, -7.1581F, -6.5894F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.09F)), PartPose.offsetAndRotation(-0.5F, -6.0F, -6.25F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neus6 = mond9.addOrReplaceChild("neus6", CubeListBuilder.create().texOffs(1343, 0).addBox(0.0F, -13.44F, -4.9613F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, -0.6295F, 1.629F, 0.3054F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition afghan_hound() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 8.5F, 8.75F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition afghan_tail = real_tail.addOrReplaceChild("afghan_tail", CubeListBuilder.create(), PartPose.offset(-0.5F, -7.7747F, 1.9418F));

		PartDefinition bone139 = afghan_tail.addOrReplaceChild("bone139", CubeListBuilder.create().texOffs(1964, 6).addBox(-1.0F, -0.1F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(1984, 26).addBox(-1.0F, -0.1F, -3.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F))
		.texOffs(1966, 24).addBox(-1.0F, 2.9F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offset(0.5F, 8.3129F, -2.5117F));

		PartDefinition afghan_tail_mid = bone139.addOrReplaceChild("afghan_tail_mid", CubeListBuilder.create().texOffs(1974, 28).addBox(-0.375F, 0.875F, 0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1898, 2).addBox(-0.375F, 1.875F, 1.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(1983, 2).addBox(-0.875F, 2.875F, -0.625F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.01F))
		.texOffs(1948, 0).addBox(-0.375F, -0.125F, -1.625F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.125F, 3.025F, 0.625F));

		PartDefinition afghan_tail_bottom = afghan_tail_mid.addOrReplaceChild("afghan_tail_bottom", CubeListBuilder.create().texOffs(1942, 1).addBox(-0.4167F, -2.9167F, 0.9167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1918, 1).addBox(-0.9167F, -3.9167F, 1.9167F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(1954, 2).addBox(-0.4167F, -3.9167F, -0.0833F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(1954, 2).addBox(-0.4167F, -4.9167F, -1.0833F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(1946, 0).addBox(-0.4167F, -3.9167F, -2.0833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1924, 2).addBox(-0.4167F, -1.9167F, -0.0833F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(1981, 1).addBox(-0.9167F, 0.0833F, -0.1033F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offset(0.0417F, 2.7917F, 3.4583F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-1.5F, 14.75F, 6.5F));

		PartDefinition afghan_leg2 = right_hind_leg.addOrReplaceChild("afghan_leg2", CubeListBuilder.create().texOffs(1868, 1).mirror().addBox(-0.35F, -2.0F, -7.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(2058, 20).mirror().addBox(-0.85F, -3.0F, -5.0F, 3.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.75F, 2.25F, 1.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition afghan_lig_leg2 = afghan_leg2.addOrReplaceChild("afghan_lig_leg2", CubeListBuilder.create().texOffs(2098, 23).mirror().addBox(-0.85F, -3.0F, -7.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition afghan_lig_legside2 = afghan_lig_leg2.addOrReplaceChild("afghan_lig_legside2", CubeListBuilder.create().texOffs(2050, 0).mirror().addBox(-4.536F, -0.5451F, -6.0F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.3F, -1.0F, 0.0F, 0.0F, -0.9163F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(1.5F, 14.75F, 6.5F));

		PartDefinition afghan_leg3 = left_hind_leg.addOrReplaceChild("afghan_leg3", CubeListBuilder.create().texOffs(1868, 1).addBox(-1.65F, -2.0F, -7.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(2058, 20).addBox(-2.15F, -3.0F, -5.0F, 3.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.75F, 2.25F, 1.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition afghan_lig_leg4 = afghan_leg3.addOrReplaceChild("afghan_lig_leg4", CubeListBuilder.create().texOffs(2098, 23).addBox(-2.15F, -3.0F, -7.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition afghan_lig_legside3 = afghan_lig_leg4.addOrReplaceChild("afghan_lig_legside3", CubeListBuilder.create().texOffs(2050, 0).addBox(-0.464F, -0.5451F, -6.0F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.3F, -1.0F, 0.0F, 0.0F, 0.9163F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-2.25F, 14.0F, -3.0F));

		PartDefinition afghan_leg4_r1 = right_front_leg.addOrReplaceChild("afghan_leg4_r1", CubeListBuilder.create().texOffs(2080, 17).mirror().addBox(-0.1088F, -1.5571F, -6.0F, 3.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3912F, 4.0571F, -0.2F, 1.5708F, 0.0F, 0.0F));

		PartDefinition afghan_lig_leg3 = right_front_leg.addOrReplaceChild("afghan_lig_leg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.9F, 5.0F, 1.0F, 0.0F, 0.0F, -0.6545F));

		PartDefinition afghan_lig_leg4_r1 = afghan_lig_leg3.addOrReplaceChild("afghan_lig_leg4_r1", CubeListBuilder.create().texOffs(2110, 17).mirror().addBox(-0.1378F, 9.5721F, -13.25F, 4.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(10.1513F, -2.5375F, -8.0F, 1.5708F, 0.6545F, 0.6545F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(2.25F, 14.0F, -3.0F));

		PartDefinition afghan_leg3_r1 = left_front_leg.addOrReplaceChild("afghan_leg3_r1", CubeListBuilder.create().texOffs(2080, 17).addBox(-2.8912F, -1.5571F, -6.0F, 3.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3912F, 4.0571F, -0.2F, 1.5708F, 0.0F, 0.0F));

		PartDefinition afghan_lig_leg5 = left_front_leg.addOrReplaceChild("afghan_lig_leg5", CubeListBuilder.create(), PartPose.offsetAndRotation(16.9F, 5.0F, 1.0F, 0.0F, 0.0F, 0.6545F));

		PartDefinition afghan_lig_leg3_r1 = afghan_lig_leg5.addOrReplaceChild("afghan_lig_leg3_r1", CubeListBuilder.create().texOffs(2110, 17).addBox(-3.8622F, 9.5721F, -13.25F, 4.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.1513F, -2.5375F, -8.0F, 1.5708F, -0.6545F, -0.6545F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.0F, 4.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition afghan_body3 = body.addOrReplaceChild("afghan_body3", CubeListBuilder.create().texOffs(1924, 0).addBox(-3.0F, -10.6F, 16.85F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 9.0F, -19.0F));

		PartDefinition afghan_body_coat_left2 = afghan_body3.addOrReplaceChild("afghan_body_coat_left2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3814F, -1.0439F, 3.7562F, 0.0F, -0.1745F, 0.0F));

		PartDefinition bone13 = afghan_body_coat_left2.addOrReplaceChild("bone13", CubeListBuilder.create().texOffs(2050, 11).addBox(1.6563F, -15.7895F, -9.4F, 1.0F, 10.0F, 7.0F, new CubeDeformation(0.22F)), PartPose.offsetAndRotation(0.7386F, 0.0F, -0.1302F, -1.5708F, 0.0F, 0.0F));

		PartDefinition afghan_body_coat_right2 = afghan_body3.addOrReplaceChild("afghan_body_coat_right2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3814F, -1.0439F, 3.7562F, 0.0F, 0.1745F, 0.0F));

		PartDefinition bone14 = afghan_body_coat_right2.addOrReplaceChild("bone14", CubeListBuilder.create().texOffs(2050, 11).mirror().addBox(-3.3949F, -15.6592F, -9.4F, 1.0F, 10.0F, 7.0F, new CubeDeformation(0.22F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition afghan_mane_coat_back2 = afghan_body3.addOrReplaceChild("afghan_mane_coat_back2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 1.65F, 4.85F, 0.0F, 0.0F, 1.5708F));

		PartDefinition bone15 = afghan_mane_coat_back2.addOrReplaceChild("bone15", CubeListBuilder.create().texOffs(2030, 10).addBox(-4.193F, -17.5262F, -2.8F, 1.0F, 12.0F, 6.0F, new CubeDeformation(0.21F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, -0.1309F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.5F, -2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition afghan_mane2 = upper_body.addOrReplaceChild("afghan_mane2", CubeListBuilder.create().texOffs(1940, 5).addBox(-4.0F, -13.0F, -6.5F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 9.0F, 3.5F));

		PartDefinition afghan_mane_coat_left2 = afghan_mane2.addOrReplaceChild("afghan_mane_coat_left2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.7F, -9.0F, 5.6F, 0.0F, -0.1745F, 0.0F));

		PartDefinition bone8 = afghan_mane_coat_left2.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(2012, 8).addBox(-1.8019F, 5.0863F, -3.8439F, 1.0F, 12.0F, 8.0F, new CubeDeformation(0.22F)), PartPose.offsetAndRotation(0.2462F, 0.0F, -0.0434F, -1.5708F, 0.0F, 0.0F));

		PartDefinition afghan_mane_lig3 = bone8.addOrReplaceChild("afghan_mane_lig3", CubeListBuilder.create().texOffs(2133, 7).addBox(-4.0355F, 2.0355F, -4.0F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.22F)), PartPose.offsetAndRotation(0.6384F, 7.8877F, 0.1561F, 0.0F, 0.0F, -0.6109F));

		PartDefinition afghan_mane_coat_right2 = afghan_mane2.addOrReplaceChild("afghan_mane_coat_right2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.7F, -9.0F, 5.6F, 0.0F, 0.1745F, 0.0F));

		PartDefinition bone10 = afghan_mane_coat_right2.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(2012, 8).mirror().addBox(0.8019F, 5.0863F, -3.8439F, 1.0F, 12.0F, 8.0F, new CubeDeformation(0.22F)).mirror(false), PartPose.offsetAndRotation(-0.2462F, 0.0F, -0.0434F, -1.5708F, 0.0F, 0.0F));

		PartDefinition afghan_mane_lig4 = bone10.addOrReplaceChild("afghan_mane_lig4", CubeListBuilder.create().texOffs(2133, 7).mirror().addBox(3.0355F, 2.0355F, -4.0F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.22F)).mirror(false), PartPose.offsetAndRotation(-0.6384F, 7.8877F, 0.1561F, 0.0F, 0.0F, 0.6109F));

		PartDefinition afghan_mane_coat_front2 = afghan_mane2.addOrReplaceChild("afghan_mane_coat_front2", CubeListBuilder.create(), PartPose.offset(0.2F, -12.35F, 4.85F));

		PartDefinition bone11 = afghan_mane_coat_front2.addOrReplaceChild("bone11", CubeListBuilder.create().texOffs(2157, 6).addBox(-0.2508F, 4.3153F, -4.2F, 1.0F, 12.0F, 8.0F, new CubeDeformation(0.22F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, -0.0436F, -1.5708F));

		PartDefinition bone12 = bone11.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3573F, 1.2803F, -0.2F, 0.0F, 0.0F, -0.3927F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 4.75F, -7.0F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(2.5F, -1.25F, 0.75F));

		PartDefinition afghan_ear_left3 = left_ear.addOrReplaceChild("afghan_ear_left3", CubeListBuilder.create(), PartPose.offset(0.65F, -0.5F, 0.25F));

		PartDefinition bone9 = afghan_ear_left3.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(1941, 25).addBox(-2.5662F, -1.768F, -2.1275F, 10.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5021F, 2.054F, -0.5098F, -0.0843F, 0.0468F, 1.3928F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-2.5F, -1.25F, 0.75F));

		PartDefinition afghan_ear_right3 = right_ear.addOrReplaceChild("afghan_ear_right3", CubeListBuilder.create(), PartPose.offset(-0.65F, -0.5F, 0.25F));

		PartDefinition bone7 = afghan_ear_right3.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(1941, 25).mirror().addBox(-7.4338F, -1.768F, -2.1275F, 10.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5021F, 2.054F, -0.5098F, -0.0843F, -0.0468F, -1.3928F));

		PartDefinition poedel_head_rot3 = real_head.addOrReplaceChild("poedel_head_rot3", CubeListBuilder.create().texOffs(1880, 9).addBox(-2.5F, -4.35F, -2.5F, 5.0F, 5.0F, 6.0F, new CubeDeformation(-0.1F))
		.texOffs(1972, 10).addBox(2.3F, -4.35F, -2.0F, 1.0F, 5.0F, 6.0F, new CubeDeformation(-0.1F))
		.texOffs(1823, 14).addBox(-2.5F, 0.45F, -2.5F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, 2.25F, 0.5F));

		PartDefinition mane_sub_2 = poedel_head_rot3.addOrReplaceChild("mane_sub_2", CubeListBuilder.create().texOffs(1972, 10).mirror().addBox(-4.3F, -2.35F, -3.0F, 1.0F, 5.0F, 6.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offset(1.0F, -2.0F, 1.0F));

		PartDefinition afghan_head_snood_overlay2 = poedel_head_rot3.addOrReplaceChild("afghan_head_snood_overlay2", CubeListBuilder.create().texOffs(1839, 12).addBox(-2.5F, -14.85F, 5.5F, 5.0F, 5.0F, 6.0F, new CubeDeformation(0.15F)), PartPose.offset(0.0F, 10.5F, -8.0F));

		PartDefinition afghan_neck2 = poedel_head_rot3.addOrReplaceChild("afghan_neck2", CubeListBuilder.create().texOffs(1993, 0).addBox(-2.5F, -2.8887F, -2.69F, 4.0F, 5.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 1.15F, 2.5F, 0.48F, 0.0F, 0.0F));

		PartDefinition afghan_wig_right2 = poedel_head_rot3.addOrReplaceChild("afghan_wig_right2", CubeListBuilder.create().texOffs(1872, 0).addBox(-3.5F, -0.1456F, -3.4032F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(1701, 28).addBox(-0.5F, -1.1456F, -0.4032F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(1972, 25).addBox(-3.5F, -1.1456F, -3.4032F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.65F, 1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition mane_sub_3 = afghan_wig_right2.addOrReplaceChild("mane_sub_3", CubeListBuilder.create().texOffs(1972, 25).mirror().addBox(0.5F, -1.1456F, -3.4032F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition snood2 = afghan_wig_right2.addOrReplaceChild("snood2", CubeListBuilder.create(), PartPose.offset(0.0F, 15.25F, -8.5F));

		PartDefinition snood_left2 = snood2.addOrReplaceChild("snood_left2", CubeListBuilder.create().texOffs(2048, 0).mirror().addBox(0.5F, -16.3956F, 5.0968F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition snood_overlay_left2 = snood_left2.addOrReplaceChild("snood_overlay_left2", CubeListBuilder.create().texOffs(2028, 0).mirror().addBox(0.5F, -16.3956F, 5.0968F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.15F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition snood_overlay_right2 = snood_left2.addOrReplaceChild("snood_overlay_right2", CubeListBuilder.create().texOffs(2028, 0).addBox(-3.5F, -16.3956F, 5.0968F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.15F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition snood_right2 = snood2.addOrReplaceChild("snood_right2", CubeListBuilder.create().texOffs(2048, 0).addBox(-3.5F, -16.3956F, 5.0968F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition snood_mid2 = snood2.addOrReplaceChild("snood_mid2", CubeListBuilder.create().texOffs(2040, 0).mirror().addBox(-0.5F, -15.3956F, 5.0968F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition oog2 = poedel_head_rot3.addOrReplaceChild("oog2", CubeListBuilder.create().texOffs(1569, 25).addBox(-2.5584F, -11.3931F, -9.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.3F, 7.9F, 6.8F));

		PartDefinition mane_sub_4 = oog2.addOrReplaceChild("mane_sub_4", CubeListBuilder.create().texOffs(1563, 17).mirror().addBox(0.2584F, -12.1931F, -9.75F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
		.texOffs(1569, 25).mirror().addBox(0.9584F, -11.3931F, -9.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition oog3 = poedel_head_rot3.addOrReplaceChild("oog3", CubeListBuilder.create().texOffs(1563, 17).addBox(-2.0084F, -12.1931F, -9.75F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.45F)), PartPose.offset(-0.55F, 7.9F, 6.8F));

		PartDefinition bone2 = poedel_head_rot3.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(1779, 9).addBox(-1.5F, -1.9132F, -2.192F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4662F, -3.2634F, 0.3578F, 0.0F, 0.0F));

		PartDefinition afghan_mouth_rot2 = bone2.addOrReplaceChild("afghan_mouth_rot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8496F, -0.132F, 0.3491F, 0.0F, 0.0F));

		PartDefinition afghan_mouth2 = afghan_mouth_rot2.addOrReplaceChild("afghan_mouth2", CubeListBuilder.create().texOffs(627, 11).addBox(-1.5F, -0.2441F, -2.7887F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.23F))
		.texOffs(1809, 9).addBox(-1.5F, -0.665F, -2.7902F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F))
		.texOffs(102, 14).addBox(-1.5F, -1.265F, -2.7902F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition afghan_tongue_rot2 = afghan_mouth2.addOrReplaceChild("afghan_tongue_rot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.25F, 1.1413F, -1.4875F, -0.0664F, 0.0F, 0.0F));

		PartDefinition afghan_tongue2 = afghan_tongue_rot2.addOrReplaceChild("afghan_tongue2", CubeListBuilder.create().texOffs(806, 21).addBox(-1.75F, -2.4602F, -2.4124F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.4F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(1729, 14).addBox(-1.5F, -1.7088F, -0.9361F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.75F)), PartPose.offsetAndRotation(0.0F, -0.8918F, -2.3563F, 0.0698F, 0.0F, 0.0F));

		PartDefinition oor2 = poedel_head_rot3.addOrReplaceChild("oor2", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.65F, -0.5F, 8.5F, 0.0F, -0.1745F, 0.0F));

		PartDefinition bone4 = oor2.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4924F, 3.5F, -0.4868F, 0.0436F, 0.0F, -1.3701F));

		PartDefinition oor3 = poedel_head_rot3.addOrReplaceChild("oor3", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.65F, -0.5F, 8.5F, 0.0F, -0.1745F, 0.0F));

		PartDefinition bone5 = oor3.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4924F, 3.5F, -0.4868F, 0.0436F, 0.0F, -1.3701F));

		PartDefinition bone6 = poedel_head_rot3.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(1483, 15).addBox(-0.5F, -0.8826F, -0.9123F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9698F, -2.5651F, 0.7418F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition shiba_inu() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 13.05F, 8.75F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition shiba_tail3 = real_tail.addOrReplaceChild("shiba_tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -1.25F, 0.3F, -0.5672F, 0.0F, 0.0F));

		PartDefinition shibatail_rotation3 = shiba_tail3.addOrReplaceChild("shibatail_rotation3", CubeListBuilder.create().texOffs(817, 0).addBox(-2.5F, 0.1037F, -1.0343F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.0001F))
		.texOffs(822, 24).addBox(-2.5F, 0.15F, -3.95F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 1.0F, -2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bone3 = shibatail_rotation3.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(816, 6).addBox(-2.0F, -4.1304F, 17.4983F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(816, 14).addBox(-2.0F, -7.1278F, 14.5982F, 3.0F, 8.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, 22.3528F, 3.6224F, 1.597F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-1.5F, 16.0F, 7.0F));

		PartDefinition shibainu4 = right_hind_leg.addOrReplaceChild("shibainu4", CubeListBuilder.create().texOffs(800, 0).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(1.5F, 16.0F, 7.0F));

		PartDefinition shibainu2 = left_hind_leg.addOrReplaceChild("shibainu2", CubeListBuilder.create().texOffs(808, 0).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 0.0F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-1.5F, 16.0F, -4.0F));

		PartDefinition shibainu6 = right_front_leg.addOrReplaceChild("shibainu6", CubeListBuilder.create().texOffs(800, 0).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 0.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(1.5F, 16.0F, -4.0F));

		PartDefinition shibainu5 = left_front_leg.addOrReplaceChild("shibainu5", CubeListBuilder.create().texOffs(808, 0).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 15.4F, 3.3F, 1.5708F, 0.0F, 0.0F));

		PartDefinition shiba_body3 = body.addOrReplaceChild("shiba_body3", CubeListBuilder.create(), PartPose.offset(0.0F, -1.3F, 1.4F));

		PartDefinition shibainu3 = shiba_body3.addOrReplaceChild("shibainu3", CubeListBuilder.create().texOffs(758, 16).addBox(-3.5F, -2.25F, -4.85F, 7.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 15.4F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition shibainu8 = upper_body.addOrReplaceChild("shibainu8", CubeListBuilder.create().texOffs(747, 0).addBox(-5.0F, -3.0F, -10.3F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 0.0F, 6.4F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 11.45F, -6.4F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-2.0F, -0.95F, -0.1F));

		PartDefinition shiba_ear_right3 = right_ear.addOrReplaceChild("shiba_ear_right3", CubeListBuilder.create().texOffs(797, 24).addBox(-3.8784F, -1.4616F, -9.4398F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(807, 15).addBox(-3.8784F, -2.3616F, -9.8498F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.4F))
		.texOffs(774, 0).addBox(-2.8784F, -2.4616F, -9.4398F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.4333F, 9.2133F, 0.0781F, -0.2538F, -0.1351F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(2.0F, -0.95F, -0.1F));

		PartDefinition shiba_ear_left3 = left_ear.addOrReplaceChild("shiba_ear_left3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -2.4333F, 9.2133F, 0.0781F, 0.2538F, 0.1351F));

		PartDefinition mane_sub_2 = shiba_ear_left3.addOrReplaceChild("mane_sub_2", CubeListBuilder.create().texOffs(797, 24).mirror().addBox(0.8784F, -1.4616F, -9.4398F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(807, 15).mirror().addBox(0.8784F, -2.3616F, -9.8498F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
		.texOffs(774, 0).mirror().addBox(1.8784F, -2.4616F, -9.4398F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition shibahead3 = real_head.addOrReplaceChild("shibahead3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.55F, 10.4F, 1.5708F, 0.0F, 0.0F));

		PartDefinition shiba_rotation3 = shibahead3.addOrReplaceChild("shiba_rotation3", CubeListBuilder.create().texOffs(779, 10).addBox(-3.5F, -4.16F, -11.4333F, 7.0F, 6.0F, 7.0F, new CubeDeformation(-0.18F))
		.texOffs(781, 12).addBox(-4.05F, -2.87F, -10.4833F, 1.0F, 4.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.24F, 0.1333F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mane_sub_5 = shiba_rotation3.addOrReplaceChild("mane_sub_5", CubeListBuilder.create().texOffs(781, 12).mirror().addBox(3.05F, -2.87F, -10.4833F, 1.0F, 4.0F, 5.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition neus3 = shiba_rotation3.addOrReplaceChild("neus3", CubeListBuilder.create().texOffs(929, 23).addBox(-1.5F, -3.6348F, -9.288F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.95F)), PartPose.offsetAndRotation(0.0F, 0.9545F, -6.1153F, 0.1309F, 0.0F, 0.0F));

		PartDefinition mond3 = shiba_rotation3.addOrReplaceChild("mond3", CubeListBuilder.create().texOffs(787, 25).addBox(-1.5F, -2.749F, -9.3062F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F))
		.texOffs(800, 14).addBox(-0.5F, -2.6996F, -9.3719F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.3386F, -4.9502F, 0.0785F, 0.0F, 0.0F));

		PartDefinition bone4 = mond3.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(807, 27).addBox(-1.5F, -2.5988F, -10.3385F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F))
		.texOffs(346, 25).addBox(-1.5F, -2.1688F, -10.3438F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 0.9894F, 1.0988F, 0.0262F, 0.0F, 0.0F));

		PartDefinition neus5 = shiba_rotation3.addOrReplaceChild("neus5", CubeListBuilder.create().texOffs(785, 0).addBox(-0.5F, -8.1882F, -4.0707F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3306F, -3.0984F, 1.0036F, 0.0F, 0.0F));

		PartDefinition oog3 = shiba_rotation3.addOrReplaceChild("oog3", CubeListBuilder.create().texOffs(774, 2).addBox(3.7342F, -11.4486F, -11.98F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-6.3F, 9.09F, 0.7167F, 0.0F, 0.0F, 0.0436F));

		PartDefinition oog5 = shiba_rotation3.addOrReplaceChild("oog5", CubeListBuilder.create().texOffs(774, 2).addBox(2.0388F, -11.5489F, -11.98F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-0.5F, 9.49F, 0.7167F, 0.0F, 0.0F, -0.0436F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition schnauzer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 13.0F, 6.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create().texOffs(844, 13).addBox(-1.0F, -0.8031F, -1.3012F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition schnauzer_tail_top_r1 = real_tail.addOrReplaceChild("schnauzer_tail_top_r1", CubeListBuilder.create().texOffs(982, 21).addBox(-0.9999F, 0.9273F, 2.4601F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0001F)), PartPose.offsetAndRotation(0.0F, 3.2816F, -3.9287F, 0.3927F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-1.5F, 17.5F, 6.0F));

		PartDefinition schnauzer_leg8 = right_hind_leg.addOrReplaceChild("schnauzer_leg8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -7.2F, 1.5708F, 0.0F, 0.0F));

		PartDefinition schnauzer_leg3_rel2 = schnauzer_leg8.addOrReplaceChild("schnauzer_leg3_rel2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition schnauzer_leg3_rot2 = schnauzer_leg3_rel2.addOrReplaceChild("schnauzer_leg3_rot2", CubeListBuilder.create().texOffs(2308, 12).mirror().addBox(-1.0F, 6.3916F, -5.4517F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5F, -0.75F, 0.0873F, 0.0F, 0.0F));

		PartDefinition schnauzer_leg3_hip2 = schnauzer_leg3_rot2.addOrReplaceChild("schnauzer_leg3_hip2", CubeListBuilder.create().texOffs(2293, 0).mirror().addBox(-2.5F, 3.8959F, -2.8365F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.5F, 0.4957F, 1.3847F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(1.5F, 17.5F, 6.0F));

		PartDefinition schnauzer_leg4 = left_hind_leg.addOrReplaceChild("schnauzer_leg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.25F, -6.95F, 1.5708F, 0.0F, 0.0F));

		PartDefinition schnauzer_leg4_rel3 = schnauzer_leg4.addOrReplaceChild("schnauzer_leg4_rel3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition schnauzer_leg4_rot3 = schnauzer_leg4_rel3.addOrReplaceChild("schnauzer_leg4_rot3", CubeListBuilder.create().texOffs(2308, 12).addBox(-1.0F, 6.4352F, -4.9536F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.75F, -1.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition schnauzer_leg4_hip3 = schnauzer_leg4_rot3.addOrReplaceChild("schnauzer_leg4_hip3", CubeListBuilder.create().texOffs(2293, 0).addBox(0.5F, 3.9395F, -2.3384F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 0.4957F, 1.3847F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-2.0F, 18.0F, -4.0F));

		PartDefinition schnauzer_leg6 = right_front_leg.addOrReplaceChild("schnauzer_leg6", CubeListBuilder.create().texOffs(2315, 22).mirror().addBox(-1.0F, -3.8F, -13.7F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, -7.75F, 2.55F, 1.5708F, 0.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(2.0F, 18.0F, -4.0F));

		PartDefinition schnauzer_leg5 = left_front_leg.addOrReplaceChild("schnauzer_leg5", CubeListBuilder.create().texOffs(2315, 22).addBox(-1.0F, -3.8F, -13.7F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -7.75F, 2.55F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(2290, 6).addBox(-2.5F, -2.7F, -1.4F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(0.0F, 15.75F, 2.5F, 1.5708F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 15.5F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition schnauzer_mane2 = upper_body.addOrReplaceChild("schnauzer_mane2", CubeListBuilder.create().texOffs(2289, 18).addBox(-3.5F, -13.0F, -1.55F, 6.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, 9.75F, -1.5F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 8.1F, -6.0F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-2.0F, -2.1F, -0.5F));

		PartDefinition schnauzer_ear_right2 = right_ear.addOrReplaceChild("schnauzer_ear_right2", CubeListBuilder.create().texOffs(729, 20).mirror().addBox(1.3534F, -1.118F, -3.9635F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1868F, 1.0473F, 4.7733F, -0.4216F, 0.6167F, -0.6553F));

		PartDefinition schnauzer_ear_right_flap2 = schnauzer_ear_right2.addOrReplaceChild("schnauzer_ear_right_flap2", CubeListBuilder.create(), PartPose.offset(0.8517F, -2.1768F, -1.3358F));

		PartDefinition schnauzer_ear_right_flap_rot2 = schnauzer_ear_right_flap2.addOrReplaceChild("schnauzer_ear_right_flap_rot2", CubeListBuilder.create().texOffs(729, 16).mirror().addBox(0.5017F, 2.4884F, -1.3541F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6894F, 0.0F, 0.0F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(2.0F, -2.1F, -0.5F));

		PartDefinition schnauzer_ear_left2 = left_ear.addOrReplaceChild("schnauzer_ear_left2", CubeListBuilder.create().texOffs(729, 20).addBox(-4.3534F, -1.118F, -3.9635F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1868F, 1.0473F, 4.7733F, -0.4216F, -0.6167F, 0.6553F));

		PartDefinition schnauzer_ear_left_flap2 = schnauzer_ear_left2.addOrReplaceChild("schnauzer_ear_left_flap2", CubeListBuilder.create(), PartPose.offset(-0.8517F, -2.1768F, -1.3358F));

		PartDefinition schnauzer_ear_left_flap_rot2 = schnauzer_ear_left_flap2.addOrReplaceChild("schnauzer_ear_left_flap_rot2", CubeListBuilder.create().texOffs(729, 16).addBox(-3.5017F, 2.4884F, -1.3541F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6894F, 0.0F, 0.0F));

		PartDefinition schnauzer_head2 = real_head.addOrReplaceChild("schnauzer_head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.15F, 1.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition schnauzer_head_neck_full2 = schnauzer_head2.addOrReplaceChild("schnauzer_head_neck_full2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -1.5F, 4.25F, -1.5708F, 0.0F, 0.0F));

		PartDefinition schnauzer_head_neck2 = schnauzer_head_neck_full2.addOrReplaceChild("schnauzer_head_neck2", CubeListBuilder.create(), PartPose.offset(-1.0F, 2.85F, 1.35F));

		PartDefinition schnauzer_head_neck_rot2 = schnauzer_head_neck2.addOrReplaceChild("schnauzer_head_neck_rot2", CubeListBuilder.create().texOffs(2305, 0).addBox(-2.0F, -2.1998F, -3.9946F, 4.0F, 6.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.9F, 1.3F, 0.3491F, 0.0F, 0.0F));

		PartDefinition schnauzer_head_full2 = schnauzer_head2.addOrReplaceChild("schnauzer_head_full2", CubeListBuilder.create(), PartPose.offset(1.0F, 1.1F, 1.75F));

		PartDefinition schnauzer_head_rot2 = schnauzer_head_full2.addOrReplaceChild("schnauzer_head_rot2", CubeListBuilder.create().texOffs(2326, 19).addBox(-3.5F, -4.5F, -1.8F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(2320, 18).addBox(-2.5F, -5.25F, -1.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.5F, -1.5708F, 0.0F, 0.0F));

		PartDefinition schnauzer_flappy2 = schnauzer_head_rot2.addOrReplaceChild("schnauzer_flappy2", CubeListBuilder.create(), PartPose.offset(-1.0F, -4.25F, -2.3F));

		PartDefinition schnauzer_flappy_rot2 = schnauzer_flappy2.addOrReplaceChild("schnauzer_flappy_rot2", CubeListBuilder.create().texOffs(1850, 0).addBox(-1.5F, 0.1997F, -1.4779F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.829F, 0.0F, 0.0F));

		PartDefinition schnauzer_brow_right2 = schnauzer_head_rot2.addOrReplaceChild("schnauzer_brow_right2", CubeListBuilder.create(), PartPose.offset(-2.5F, -3.6F, -2.3F));

		PartDefinition schnauzer_brow_right_rot2 = schnauzer_brow_right2.addOrReplaceChild("schnauzer_brow_right_rot2", CubeListBuilder.create().texOffs(1807, 11).addBox(-0.9891F, -0.7498F, -0.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(-0.2432F, 0.1608F, 0.55F, 0.0F, 0.0F, -0.0436F));

		PartDefinition schnauzer_brow_left2 = schnauzer_head_rot2.addOrReplaceChild("schnauzer_brow_left2", CubeListBuilder.create(), PartPose.offset(0.5F, -3.6F, -2.3F));

		PartDefinition schnauzer_brow_left_rot2 = schnauzer_brow_left2.addOrReplaceChild("schnauzer_brow_left_rot2", CubeListBuilder.create().texOffs(1807, 11).mirror().addBox(-1.0109F, -0.7498F, -0.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(0.25F, 0.15F, 0.55F, 0.0F, 0.0F, 0.0436F));

		PartDefinition schnauzer_pupil_left2 = schnauzer_head_rot2.addOrReplaceChild("schnauzer_pupil_left2", CubeListBuilder.create().texOffs(751, 2).addBox(0.9F, -17.35F, 2.13F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(751, 0).addBox(1.26F, -17.6F, 2.135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.9F, 14.1F, -4.0F));

		PartDefinition schnauzer_pupil_right2 = schnauzer_head_rot2.addOrReplaceChild("schnauzer_pupil_right2", CubeListBuilder.create().texOffs(751, 2).mirror().addBox(-1.9F, -17.35F, 2.13F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(751, 0).mirror().addBox(-2.26F, -17.6F, 2.135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-1.1F, 14.1F, -4.0F));

		PartDefinition schnauzer_mouth2 = schnauzer_head_rot2.addOrReplaceChild("schnauzer_mouth2", CubeListBuilder.create().texOffs(2122, 8).addBox(-2.0F, -2.6412F, -0.784F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(2175, 20).addBox(1.75F, -1.8812F, -0.774F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.01F))
		.texOffs(2059, 11).addBox(-1.9998F, -1.8914F, -0.7842F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-1.0F, 0.86F, -3.5848F, 0.2094F, 0.0F, 0.0F));

		PartDefinition mane_sub_2 = schnauzer_mouth2.addOrReplaceChild("mane_sub_2", CubeListBuilder.create().texOffs(2175, 20).mirror().addBox(-2.75F, -1.8812F, -0.774F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition schnauzer_bridge2 = schnauzer_mouth2.addOrReplaceChild("schnauzer_bridge2", CubeListBuilder.create().texOffs(1610, 27).addBox(-1.0F, -0.5825F, -1.4648F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -2.4719F, 2.6553F, 0.3054F, 0.0F, 0.0F));

		PartDefinition schnauzer_stache2 = schnauzer_mouth2.addOrReplaceChild("schnauzer_stache2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.403F, -0.5783F, -0.0873F, 0.0F, 0.0F));

		PartDefinition schnauzer_beard2 = schnauzer_mouth2.addOrReplaceChild("schnauzer_beard2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.248F, 1.8622F, 0.0436F, 0.0F, 0.0F));

		PartDefinition schnauzer_mouth_beard2 = schnauzer_beard2.addOrReplaceChild("schnauzer_mouth_beard2", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0394F, -1.7479F));

		PartDefinition schnauzer_mouth_beard_rot2 = schnauzer_mouth_beard2.addOrReplaceChild("schnauzer_mouth_beard_rot2", CubeListBuilder.create().texOffs(1868, 7).addBox(-1.5F, -0.6107F, -0.9191F, 3.0F, 4.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.1F, 0.1309F, 0.0F, 0.0F));

		PartDefinition schnauzer_jaw2 = schnauzer_beard2.addOrReplaceChild("schnauzer_jaw2", CubeListBuilder.create().texOffs(1457, 9).addBox(-1.5F, -0.6962F, -0.8961F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.6833F, -1.7256F));

		PartDefinition bone2 = schnauzer_jaw2.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(751, 16).addBox(-1.5F, -0.6466F, 0.0444F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.0188F, -1.1968F, -0.0349F, 0.0F, 0.0F));

		PartDefinition schnauzer_nose2 = schnauzer_mouth2.addOrReplaceChild("schnauzer_nose2", CubeListBuilder.create().texOffs(807, 10).addBox(-0.5F, -0.6507F, 0.5576F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.05F, -2.1342F, -1.5958F, -0.1309F, 0.0F, 0.0F));

		PartDefinition schnauzer_nose_only2 = schnauzer_nose2.addOrReplaceChild("schnauzer_nose_only2", CubeListBuilder.create().texOffs(2157, 0).addBox(-1.5F, -1.5215F, -0.797F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.8F)), PartPose.offset(0.0F, -0.0298F, 0.5389F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition komondor() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 12.0F, 8.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition komondor_tail = real_tail.addOrReplaceChild("komondor_tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6981F, 0.0F, 0.0F));

		PartDefinition komondor_tail_rot = komondor_tail.addOrReplaceChild("komondor_tail_rot", CubeListBuilder.create().texOffs(2429, 18).addBox(-2.0F, -2.0F, -4.0F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1174F, 1.6091F, 0.2035F, -0.1302F, 1.483F, 1.4416F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-2.0F, 17.9F, 6.8F));

		PartDefinition komondor_leg4 = right_hind_leg.addOrReplaceChild("komondor_leg4", CubeListBuilder.create().texOffs(2411, 20).mirror().addBox(-1.25F, -2.3F, -5.1F, 3.0F, 4.0F, 6.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-0.25F, 0.9F, -0.7F, 1.5708F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(2.0F, 17.9F, 6.8F));

		PartDefinition komondor_leg3 = left_hind_leg.addOrReplaceChild("komondor_leg3", CubeListBuilder.create().texOffs(2411, 20).addBox(-1.5F, -2.0F, -7.0F, 3.0F, 4.0F, 6.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.0F, -1.0F, -1.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-2.5F, 17.75F, -2.25F));

		PartDefinition komondor_leg2 = right_front_leg.addOrReplaceChild("komondor_leg2", CubeListBuilder.create().texOffs(2411, 20).mirror().addBox(-1.25F, -6.3F, -19.1F, 3.0F, 4.0F, 6.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-0.25F, -12.95F, 4.35F, 1.5708F, 0.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(2.5F, 17.75F, -2.25F));

		PartDefinition komondor_leg1 = left_front_leg.addOrReplaceChild("komondor_leg1", CubeListBuilder.create().texOffs(2411, 20).addBox(-1.75F, -2.05F, -5.1F, 3.0F, 4.0F, 6.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.25F, 1.05F, 0.1F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 16.4F, 4.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition komondor_body_sit = body.addOrReplaceChild("komondor_body_sit", CubeListBuilder.create(), PartPose.offset(0.0F, 9.75F, 4.75F));

		PartDefinition komondor_body = komondor_body_sit.addOrReplaceChild("komondor_body", CubeListBuilder.create().texOffs(2445, 11).addBox(-4.0F, -13.45F, -2.85F, 8.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(2450, 16).addBox(-4.0F, -10.45F, -4.85F, 8.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.4591F, -3.0914F));

		PartDefinition komondor_body_rasta_left = komondor_body.addOrReplaceChild("komondor_body_rasta_left", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, 4.4409F, 3.3414F, 0.0F, -0.1309F, 0.0F));

		PartDefinition komondor_body_rasta_left1 = komondor_body_rasta_left.addOrReplaceChild("komondor_body_rasta_left1", CubeListBuilder.create().texOffs(2470, 7).mirror().addBox(-0.8562F, -11.85F, -1.907F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-0.132F, 0.0F, -0.6372F));

		PartDefinition komondor_body_rasta_left2 = komondor_body_rasta_left.addOrReplaceChild("komondor_body_rasta_left2", CubeListBuilder.create().texOffs(2470, 7).mirror().addBox(-0.8431F, -11.85F, -1.8079F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-0.3017F, -4.0F, -1.9261F));

		PartDefinition komondor_body_rasta_left3 = komondor_body_rasta_left.addOrReplaceChild("komondor_body_rasta_left3", CubeListBuilder.create().texOffs(2470, 7).mirror().addBox(-0.8562F, -11.85F, -1.907F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-0.6933F, -3.0F, -4.9004F));

		PartDefinition komondor_body_rasta_left4 = komondor_body_rasta_left.addOrReplaceChild("komondor_body_rasta_left4", CubeListBuilder.create().texOffs(2470, 7).mirror().addBox(-0.8431F, -11.85F, -1.8079F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-0.5628F, -1.0F, -3.909F));

		PartDefinition komondor_body_rasta_left5 = komondor_body_rasta_left.addOrReplaceChild("komondor_body_rasta_left5", CubeListBuilder.create().texOffs(2470, 7).mirror().addBox(-0.8562F, -11.85F, -1.907F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-0.9543F, 0.0F, -6.8833F));

		PartDefinition komondor_body_rasta_right = komondor_body.addOrReplaceChild("komondor_body_rasta_right", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 4.4409F, 3.3414F, 0.0F, 0.1309F, 0.0F));

		PartDefinition komondor_body_rasta_right1 = komondor_body_rasta_right.addOrReplaceChild("komondor_body_rasta_right1", CubeListBuilder.create().texOffs(2470, 7).addBox(-0.1438F, -11.85F, -1.907F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.132F, 0.0F, -0.6372F));

		PartDefinition komondor_body_rasta_right2 = komondor_body_rasta_right.addOrReplaceChild("komondor_body_rasta_right2", CubeListBuilder.create().texOffs(2470, 7).addBox(-0.1569F, -11.85F, -1.8079F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.3017F, -4.0F, -1.9261F));

		PartDefinition komondor_body_rasta_right3 = komondor_body_rasta_right.addOrReplaceChild("komondor_body_rasta_right3", CubeListBuilder.create().texOffs(2470, 7).addBox(-0.1438F, -11.85F, -1.907F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.6933F, -3.0F, -4.9004F));

		PartDefinition komondor_body_rasta_right4 = komondor_body_rasta_right.addOrReplaceChild("komondor_body_rasta_right4", CubeListBuilder.create().texOffs(2470, 7).addBox(-0.1569F, -11.85F, -1.8079F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5628F, -1.0F, -3.909F));

		PartDefinition komondor_body_rasta_right5 = komondor_body_rasta_right.addOrReplaceChild("komondor_body_rasta_right5", CubeListBuilder.create().texOffs(2470, 7).addBox(-0.1438F, -11.85F, -1.907F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.9543F, 0.0F, -6.8833F));

		PartDefinition komondor_body_hair = komondor_body.addOrReplaceChild("komondor_body_hair", CubeListBuilder.create().texOffs(2517, 20).addBox(2.9F, -18.4909F, -3.9414F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(2475, 18).addBox(-4.0F, -16.4909F, -5.6914F, 8.0F, 5.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offset(0.0F, 6.1409F, -1.9086F));

		PartDefinition mane_sub_794 = komondor_body_hair.addOrReplaceChild("mane_sub_794", CubeListBuilder.create().texOffs(2517, 20).mirror().addBox(-3.9F, -18.4909F, -3.9414F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 14.0F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition komondor_pant = upper_body.addOrReplaceChild("komondor_pant", CubeListBuilder.create(), PartPose.offset(1.0F, 3.65F, 0.0F));

		PartDefinition komondor_mane = komondor_pant.addOrReplaceChild("komondor_mane", CubeListBuilder.create().texOffs(2468, 1).addBox(-4.5F, 5.15F, -19.0F, 9.0F, 7.0F, 10.0F, new CubeDeformation(-0.05F)), PartPose.offset(0.0F, -11.0F, 13.0F));

		PartDefinition komondor_mane_hair = komondor_mane.addOrReplaceChild("komondor_mane_hair", CubeListBuilder.create().texOffs(2496, 1).addBox(-4.5F, -4.2F, -20.8F, 9.0F, 7.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offset(0.0F, 9.35F, -1.0F));

		PartDefinition komondor_mane_rasta = komondor_mane.addOrReplaceChild("komondor_mane_rasta", CubeListBuilder.create(), PartPose.offset(3.0F, 9.35F, 0.0F));

		PartDefinition komondor_mane_rasta_right = komondor_mane_rasta.addOrReplaceChild("komondor_mane_rasta_right", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.5F, -8.7F, 3.5F, 0.0F, 0.1309F, 0.0F));

		PartDefinition komondor_mane_rasta_right1 = komondor_mane_rasta_right.addOrReplaceChild("komondor_mane_rasta_right1", CubeListBuilder.create().texOffs(2470, 7).addBox(1.7214F, 9.5F, -16.8413F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.179F, -2.0F, -0.2276F));

		PartDefinition komondor_mane_rasta_right2 = komondor_mane_rasta_right.addOrReplaceChild("komondor_mane_rasta_right2", CubeListBuilder.create().texOffs(2470, 7).addBox(1.7606F, 9.5F, -17.1387F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.7011F, -2.0F, -4.1934F));

		PartDefinition komondor_mane_rasta_right3 = komondor_mane_rasta_right.addOrReplaceChild("komondor_mane_rasta_right3", CubeListBuilder.create().texOffs(2470, 7).addBox(1.7606F, 9.5F, -17.1387F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.44F, -4.0F, -2.2105F));

		PartDefinition komondor_mane_rasta_right4 = komondor_mane_rasta_right.addOrReplaceChild("komondor_mane_rasta_right4", CubeListBuilder.create().texOffs(2470, 7).addBox(1.7606F, 10.5F, -17.1387F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.9621F, -4.0F, -6.1763F));

		PartDefinition komondor_mane_rasta_right5 = komondor_mane_rasta_right.addOrReplaceChild("komondor_mane_rasta_right5", CubeListBuilder.create().texOffs(2470, 7).addBox(1.7606F, 9.5F, -17.1387F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5705F, 0.0F, -3.2019F));

		PartDefinition komondor_mane_rasta_left = komondor_mane_rasta.addOrReplaceChild("komondor_mane_rasta_left", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5F, -8.7F, 3.5F, 0.0F, -0.1309F, 0.0F));

		PartDefinition komondor_mane_rasta_left1 = komondor_mane_rasta_left.addOrReplaceChild("komondor_mane_rasta_left1", CubeListBuilder.create().texOffs(2470, 7).mirror().addBox(-2.7214F, 9.5F, -16.8413F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-0.179F, -2.0F, -0.2276F));

		PartDefinition komondor_mane_rasta_left2 = komondor_mane_rasta_left.addOrReplaceChild("komondor_mane_rasta_left2", CubeListBuilder.create().texOffs(2470, 7).mirror().addBox(-2.7606F, 9.5F, -17.1387F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-0.7011F, -2.0F, -4.1934F));

		PartDefinition komondor_mane_rasta_left3 = komondor_mane_rasta_left.addOrReplaceChild("komondor_mane_rasta_left3", CubeListBuilder.create().texOffs(2470, 7).mirror().addBox(-2.7606F, 9.5F, -17.1387F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-0.44F, -4.0F, -2.2105F));

		PartDefinition komondor_mane_rasta_left4 = komondor_mane_rasta_left.addOrReplaceChild("komondor_mane_rasta_left4", CubeListBuilder.create().texOffs(2470, 7).mirror().addBox(-2.7606F, 10.5F, -17.1387F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-0.9621F, -4.0F, -6.1763F));

		PartDefinition komondor_mane_rasta_left5 = komondor_mane_rasta_left.addOrReplaceChild("komondor_mane_rasta_left5", CubeListBuilder.create().texOffs(2470, 7).mirror().addBox(-2.7606F, 9.5F, -17.1387F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-0.5705F, 0.0F, -3.2019F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 9.5F, -7.25F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create().texOffs(16, 14).addBox(0.5F, 0.5F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.5F, -1.5F, 1.25F));

		PartDefinition komondor_ear_right = right_ear.addOrReplaceChild("komondor_ear_right", CubeListBuilder.create().texOffs(554, 8).addBox(-1.0F, -2.0642F, -5.231F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(604, 21).addBox(-1.0F, -2.0642F, -10.231F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7567F, -0.1525F, 1.4835F, 0.0F, 0.0F));

		PartDefinition komondor_ear_right_rasta = komondor_ear_right.addOrReplaceChild("komondor_ear_right_rasta", CubeListBuilder.create(), PartPose.offset(6.5F, 19.3782F, -5.4276F));

		PartDefinition komondor_ear_right_rasta_rot = komondor_ear_right_rasta.addOrReplaceChild("komondor_ear_right_rasta_rot", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.5F, -8.7F, 3.5F, 0.0F, 0.1309F, 0.0F));

		PartDefinition komondor_ear_right_rasta1 = komondor_ear_right_rasta_rot.addOrReplaceChild("komondor_ear_right_rasta1", CubeListBuilder.create().texOffs(2470, 7).addBox(-0.305F, -8.7852F, -0.2832F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.073F, -2.0F, -0.5887F));

		PartDefinition komondor_ear_right_rasta2 = komondor_ear_right_rasta_rot.addOrReplaceChild("komondor_ear_right_rasta2", CubeListBuilder.create().texOffs(2470, 7).addBox(-0.305F, -8.7852F, -0.2832F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.373F, -4.0F, -3.0887F));

		PartDefinition komondor_ear_right_rasta3 = komondor_ear_right_rasta_rot.addOrReplaceChild("komondor_ear_right_rasta3", CubeListBuilder.create().texOffs(2470, 7).addBox(-0.305F, -8.7852F, -0.2832F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.673F, -2.0F, -5.0887F));

		PartDefinition komondor_ear_right_rasta4 = komondor_ear_right_rasta_rot.addOrReplaceChild("komondor_ear_right_rasta4", CubeListBuilder.create().texOffs(2470, 7).addBox(-0.305F, -8.7852F, -0.2832F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.492F, 0.0298F, -3.7708F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(16, 14).addBox(-2.5F, 0.5F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(3.5F, -1.5F, 1.25F));

		PartDefinition komondor_ear_left = left_ear.addOrReplaceChild("komondor_ear_left", CubeListBuilder.create().texOffs(554, 8).mirror().addBox(-0.9F, -2.2211F, -5.1878F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(604, 21).mirror().addBox(-0.9F, -2.2211F, -10.1878F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.7F, 0.0F, 1.4835F, 0.0F, 0.0F));

		PartDefinition komondor_ear_left_rasta = komondor_ear_left.addOrReplaceChild("komondor_ear_left_rasta", CubeListBuilder.create(), PartPose.offset(-6.4F, 10.9405F, -3.0975F));

		PartDefinition komondor_ear_left_rasta_rot = komondor_ear_left_rasta.addOrReplaceChild("komondor_ear_left_rasta_rot", CubeListBuilder.create(), PartPose.offsetAndRotation(7.5F, -8.7F, 3.5F, 0.0F, -0.1309F, 0.0F));

		PartDefinition komondor_ear_left_rasta1 = komondor_ear_left_rasta_rot.addOrReplaceChild("komondor_ear_left_rasta1", CubeListBuilder.create().texOffs(2470, 7).mirror().addBox(-0.9935F, -0.5044F, -2.5506F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-0.073F, -2.0F, -0.5887F));

		PartDefinition komondor_ear_left_rasta2 = komondor_ear_left_rasta_rot.addOrReplaceChild("komondor_ear_left_rasta2", CubeListBuilder.create().texOffs(2470, 7).mirror().addBox(-0.9935F, -0.5044F, -2.5506F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-0.373F, -4.0F, -3.0887F));

		PartDefinition komondor_ear_left_rasta3 = komondor_ear_left_rasta_rot.addOrReplaceChild("komondor_ear_left_rasta3", CubeListBuilder.create().texOffs(2470, 7).mirror().addBox(-0.9935F, -0.5044F, -2.5506F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-0.673F, -2.0F, -5.0887F));

		PartDefinition komondor_ear_left_rasta4 = komondor_ear_left_rasta_rot.addOrReplaceChild("komondor_ear_left_rasta4", CubeListBuilder.create().texOffs(2470, 7).mirror().addBox(-0.9935F, -0.5044F, -2.5506F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-0.492F, 0.0299F, -3.7708F));

		PartDefinition komondor_head = real_head.addOrReplaceChild("komondor_head", CubeListBuilder.create().texOffs(602, 3).addBox(-3.5F, -5.0F, 0.25F, 7.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(551, 19).addBox(-3.5F, -5.0F, -4.75F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, 3.75F, 1.5708F, 0.0F, 0.0F));

		PartDefinition komondor_cheeks = komondor_head.addOrReplaceChild("komondor_cheeks", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.75F, 0.6F, 0.0873F, 0.0F, 0.0F));

		PartDefinition komondor_cheek_right = komondor_cheeks.addOrReplaceChild("komondor_cheek_right", CubeListBuilder.create().texOffs(610, 4).addBox(-3.0F, -18.7955F, 3.3083F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(639, 9).addBox(-3.0F, -18.7955F, 1.3083F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 18.25F, -4.1F));

		PartDefinition komondor_cheek_left = komondor_cheeks.addOrReplaceChild("komondor_cheek_left", CubeListBuilder.create().texOffs(610, 4).mirror().addBox(1.0F, -0.5455F, -0.7917F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(639, 9).mirror().addBox(1.0F, -0.5455F, -2.7917F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition komondor_eyes = komondor_head.addOrReplaceChild("komondor_eyes", CubeListBuilder.create().texOffs(631, 9).addBox(1.5F, -17.7F, 4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, 12.5F, -1.75F));

		PartDefinition mane_sub_742 = komondor_eyes.addOrReplaceChild("mane_sub_742", CubeListBuilder.create().texOffs(631, 9).mirror().addBox(-2.5F, -17.7F, 4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition komondor_hair = komondor_head.addOrReplaceChild("komondor_hair", CubeListBuilder.create().texOffs(569, 19).addBox(-3.5F, 0.1505F, -6.875F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, -4.9F, 7.15F, -0.2618F, 0.0F, 0.0F));

		PartDefinition komondor_snout = komondor_head.addOrReplaceChild("komondor_snout", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.25F, 2.6F, -1.5621F, 0.0F, 0.0F));

		PartDefinition betterdogs_jaw = komondor_snout.addOrReplaceChild("betterdogs_jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7647F, 2.0155F));

		PartDefinition betterdogs_tongue_rot = betterdogs_jaw.addOrReplaceChild("betterdogs_tongue_rot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5098F, -0.66F, 0.0F, 0.0331F, -0.0118F));

		PartDefinition betterdogs_tongue = betterdogs_tongue_rot.addOrReplaceChild("betterdogs_tongue", CubeListBuilder.create(), PartPose.offset(0.1594F, -0.3742F, -4.4065F));

		PartDefinition betterdogs_tongue_size = betterdogs_tongue.addOrReplaceChild("betterdogs_tongue_size", CubeListBuilder.create(), PartPose.offset(0.0437F, -0.906F, -0.9948F));

		PartDefinition bordercollie_tongue2 = betterdogs_tongue_size.addOrReplaceChild("bordercollie_tongue2", CubeListBuilder.create(), PartPose.offset(0.2473F, 0.1107F, -0.083F));

		PartDefinition bordercollie_tongue_rot2 = bordercollie_tongue2.addOrReplaceChild("bordercollie_tongue_rot2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0515F, 2.6279F, -0.0562F, 0.6109F, 0.0F, 0.0F));

		PartDefinition bordercollie_tongue_walk2 = bordercollie_tongue_rot2.addOrReplaceChild("bordercollie_tongue_walk2", CubeListBuilder.create(), PartPose.offset(0.0F, -2.25F, 2.6F));

		PartDefinition komondor_jaw = betterdogs_jaw.addOrReplaceChild("komondor_jaw", CubeListBuilder.create(), PartPose.offset(-0.0095F, -0.1497F, -0.0562F));

		PartDefinition komondor_jaw_rot = komondor_jaw.addOrReplaceChild("komondor_jaw_rot", CubeListBuilder.create().texOffs(624, 5).addBox(-1.4897F, 0.5026F, -5.5087F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.0F, 0.55F, 2.7F, 0.1047F, -0.003F, -0.0002F));

		PartDefinition komondor_tongue_rot = komondor_jaw_rot.addOrReplaceChild("komondor_tongue_rot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0103F, 1.2526F, -5.5087F, 0.5236F, 0.0F, 0.0F));

		PartDefinition komondor_tongue = komondor_tongue_rot.addOrReplaceChild("komondor_tongue", CubeListBuilder.create().texOffs(609, 15).addBox(-1.0F, -1.2804F, -1.6905F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.05F)), PartPose.offset(0.0F, 0.5F, 1.0F));

		PartDefinition komondor_goatee = komondor_jaw_rot.addOrReplaceChild("komondor_goatee", CubeListBuilder.create().texOffs(639, 9).mirror().addBox(-1.0568F, -0.4247F, -1.4175F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0172F, 2.0351F, -5.034F, 1.5708F, 0.0F, 0.0F));

		PartDefinition komondor_nose = komondor_snout.addOrReplaceChild("komondor_nose", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3598F, -0.72F, -0.0611F, 0.0F, 0.0F));

		PartDefinition komondor_nose_rot = komondor_nose.addOrReplaceChild("komondor_nose_rot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.065F, 0.1075F, 0.0436F, 0.0F, 0.0F));

		PartDefinition komondor_nose_subrot = komondor_nose_rot.addOrReplaceChild("komondor_nose_subrot", CubeListBuilder.create().texOffs(613, 20).addBox(-1.5F, -0.7699F, -1.3734F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.7F)), PartPose.offsetAndRotation(0.0F, 1.0593F, 0.1664F, -0.0873F, 0.0F, 0.0F));

		PartDefinition komondor_uplip = komondor_snout.addOrReplaceChild("komondor_uplip", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.7416F, 1.3897F, -0.2618F, 0.0F, 0.0F));

		PartDefinition komondor_uplip_rot = komondor_uplip.addOrReplaceChild("komondor_uplip_rot", CubeListBuilder.create().texOffs(596, 4).addBox(-1.5F, -1.3922F, -1.8837F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5862F, -0.2234F, 0.2443F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
	public static LayerDefinition samoyed_new() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 10.0F, 8.75F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition samoyed_tail = real_tail.addOrReplaceChild("samoyed_tail", CubeListBuilder.create(), PartPose.offset(0.5F, -7.836F, -18.5736F));

		PartDefinition samoyed_tail_rot = samoyed_tail.addOrReplaceChild("samoyed_tail_rot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1339F, -0.1744F, -1.6151F));

		PartDefinition samoyed_tail_anim = samoyed_tail_rot.addOrReplaceChild("samoyed_tail_anim", CubeListBuilder.create(), PartPose.offset(2.3034F, -1.0142F, 1.0304F));

		PartDefinition samoyed_tail_spin = samoyed_tail_anim.addOrReplaceChild("samoyed_tail_spin", CubeListBuilder.create().texOffs(2368, 17).addBox(-6.7503F, -7.2599F, -21.2847F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(2356, 15).addBox(-6.7503F, -7.2599F, -24.2847F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.75F, 2.0F, -0.25F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-2.5F, 17.0F, 6.0F));

		PartDefinition samoyed_leg3_sit4 = right_hind_leg.addOrReplaceChild("samoyed_leg3_sit4", CubeListBuilder.create().texOffs(2441, 0).mirror().addBox(-6.5F, 11.15F, 0.4F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(2399, 3).mirror().addBox(-6.5F, 9.15F, 4.4F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.0F, 7.4F, -12.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(2.5F, 17.0F, 6.0F));

		PartDefinition samoyed_leg3_sit3 = left_hind_leg.addOrReplaceChild("samoyed_leg3_sit3", CubeListBuilder.create().texOffs(2441, 0).addBox(-1.5F, 11.15F, 0.4F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(2399, 3).addBox(-1.5F, 9.15F, 4.4F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.4F, -12.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-3.0F, 18.5F, -4.0F));

		PartDefinition samoyed_leg9 = right_front_leg.addOrReplaceChild("samoyed_leg9", CubeListBuilder.create().texOffs(2455, 0).mirror().addBox(-8.25F, -2.0F, -5.05F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(2399, -5).mirror().addBox(-8.25F, 0.0F, -5.05F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.75F, 0.45F, 0.65F, 1.5708F, 0.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(3.0F, 18.5F, -4.0F));

		PartDefinition samoyed_leg1 = left_front_leg.addOrReplaceChild("samoyed_leg1", CubeListBuilder.create().texOffs(2455, 0).addBox(-2.25F, -2.0F, -5.05F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(2399, -5).addBox(0.75F, 0.0F, -5.05F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.75F, 0.45F, 0.65F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition sad = body.addOrReplaceChild("sad", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition samoyed_body2 = sad.addOrReplaceChild("samoyed_body2", CubeListBuilder.create().texOffs(2372, 0).addBox(-4.5F, -3.6996F, -4.3823F, 9.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1409F, 1.9087F, 1.5708F, 0.0F, 0.0F));

		PartDefinition samoyed_tail2 = samoyed_body2.addOrReplaceChild("samoyed_tail2", CubeListBuilder.create(), PartPose.offset(0.5F, 4.6805F, 4.5141F));

		PartDefinition samoyed_tail_rot2 = samoyed_tail2.addOrReplaceChild("samoyed_tail_rot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1339F, -0.1744F, -1.6151F));

		PartDefinition samoyed_tail_anim2 = samoyed_tail_rot2.addOrReplaceChild("samoyed_tail_anim2", CubeListBuilder.create(), PartPose.offset(2.3034F, -1.0142F, 1.0304F));

		PartDefinition samoyed_tail_spin2 = samoyed_tail_anim2.addOrReplaceChild("samoyed_tail_spin2", CubeListBuilder.create().texOffs(2368, 17).addBox(-1.6986F, -7.4804F, -2.9333F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(2356, 15).addBox(-1.6986F, -7.4804F, -5.9333F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.75F, 2.0F, -0.25F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create().texOffs(2408, 0).addBox(-5.5F, -2.85F, -5.65F, 11.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.0F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 8.5F, -7.0F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create().texOffs(16, 14).addBox(-7.0F, 0.5F, -1.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -0.5F, 1.5F));

		PartDefinition samoyed_ear_right = right_ear.addOrReplaceChild("samoyed_ear_right", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.15F, 0.5F, 1.5708F, -0.0436F, 0.0F));

		PartDefinition samoyed_ear_right_sub = samoyed_ear_right.addOrReplaceChild("samoyed_ear_right_sub", CubeListBuilder.create(), PartPose.offset(-0.6501F, 6.9933F, -2.9573F));

		PartDefinition samoyed_ear_right_anim = samoyed_ear_right_sub.addOrReplaceChild("samoyed_ear_right_anim", CubeListBuilder.create().texOffs(2354, 8).mirror().addBox(-2.3335F, -8.5934F, 4.0916F, 4.0F, 2.0F, 5.0F, new CubeDeformation(-0.01F)).mirror(false)
		.texOffs(2345, 3).mirror().addBox(-1.3335F, -8.5934F, 9.0704F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offset(1.0F, 0.0F, -1.0F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(16, 14).addBox(5.0F, 0.5F, -1.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, -0.5F, 1.5F));

		PartDefinition samoyed_ear_left2 = left_ear.addOrReplaceChild("samoyed_ear_left2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 3.0F, 6.1F, 1.5708F, 0.0436F, 0.0F));

		PartDefinition samoyed_ear_left_sub2 = samoyed_ear_left2.addOrReplaceChild("samoyed_ear_left_sub2", CubeListBuilder.create(), PartPose.offset(0.9554F, 0.0F, 1.0427F));

		PartDefinition samoyed_ear_left_anim2 = samoyed_ear_left_sub2.addOrReplaceChild("samoyed_ear_left_anim2", CubeListBuilder.create().texOffs(2354, 8).addBox(-1.7276F, -7.1947F, 2.9416F, 4.0F, 2.0F, 5.0F, new CubeDeformation(-0.01F))
		.texOffs(2345, 3).addBox(-0.7276F, -7.1947F, 7.9204F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offset(-1.0F, 0.0F, -1.0F));

		PartDefinition samoyed_head2 = real_head.addOrReplaceChild("samoyed_head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.9F, 2.9F, 1.5708F, 0.0F, 0.0F));

		PartDefinition samoyed_head_sub2 = samoyed_head2.addOrReplaceChild("samoyed_head_sub2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition samoyed_head_anim2 = samoyed_head_sub2.addOrReplaceChild("samoyed_head_anim2", CubeListBuilder.create().texOffs(2323, 0).addBox(-4.0F, -4.4F, -1.25F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(2351, 0).addBox(-3.5F, -4.4F, 4.75F, 7.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(2346, 21).addBox(-2.0F, -3.4F, 6.75F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition samoyed_tuft_left2 = samoyed_head_anim2.addOrReplaceChild("samoyed_tuft_left2", CubeListBuilder.create(), PartPose.offset(0.0F, 11.1F, -2.3F));

		PartDefinition samoyed_tuft_left_sub2 = samoyed_tuft_left2.addOrReplaceChild("samoyed_tuft_left_sub2", CubeListBuilder.create(), PartPose.offset(5.45F, -11.5F, 5.0F));

		PartDefinition samoyed_tuft_left_anim2 = samoyed_tuft_left_sub2.addOrReplaceChild("samoyed_tuft_left_anim2", CubeListBuilder.create().texOffs(2038, 4).mirror().addBox(-1.5F, -2.0F, -0.95F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, -1.0F));

		PartDefinition samoyed_tuft_right2 = samoyed_head_anim2.addOrReplaceChild("samoyed_tuft_right2", CubeListBuilder.create(), PartPose.offset(0.0F, 11.1F, -2.3F));

		PartDefinition samoyed_tuft_right_sub2 = samoyed_tuft_right2.addOrReplaceChild("samoyed_tuft_right_sub2", CubeListBuilder.create(), PartPose.offset(-5.45F, -11.5F, 5.0F));

		PartDefinition samoyed_tuft_right_anim2 = samoyed_tuft_right_sub2.addOrReplaceChild("samoyed_tuft_right_anim2", CubeListBuilder.create().texOffs(2038, 4).addBox(-0.5F, -2.0F, -0.95F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -1.0F));

		PartDefinition samoyed_eye_right2 = samoyed_head_anim2.addOrReplaceChild("samoyed_eye_right2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.35F, -4.25F, 4.3F, 0.0F, 0.0436F, 0.0F));

		PartDefinition samoyed_eye_right_anim2 = samoyed_eye_right2.addOrReplaceChild("samoyed_eye_right_anim2", CubeListBuilder.create().texOffs(2277, 6).addBox(-2.3586F, -15.45F, 6.1509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)), PartPose.offset(2.1936F, 15.35F, -6.601F));

		PartDefinition samoyed_eye_left2 = samoyed_head_anim2.addOrReplaceChild("samoyed_eye_left2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.45F, -4.25F, 4.3F, 0.0F, -0.0436F, 0.0F));

		PartDefinition samoyed_eye_left_anim2 = samoyed_eye_left2.addOrReplaceChild("samoyed_eye_left_anim2", CubeListBuilder.create().texOffs(2277, 6).mirror().addBox(1.3586F, -15.45F, 6.1509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)).mirror(false), PartPose.offset(-2.2935F, 15.35F, -6.5966F));

		PartDefinition samoyed_beard_bottom2 = samoyed_head_anim2.addOrReplaceChild("samoyed_beard_bottom2", CubeListBuilder.create(), PartPose.offset(2.5167F, -2.5167F, 2.5667F));

		PartDefinition samoyed_beard_bottom_sub2 = samoyed_beard_bottom2.addOrReplaceChild("samoyed_beard_bottom_sub2", CubeListBuilder.create(), PartPose.offset(-2.5167F, 1.6167F, -4.8667F));

		PartDefinition samoyed_beard_bottom_anim2 = samoyed_beard_bottom_sub2.addOrReplaceChild("samoyed_beard_bottom_anim2", CubeListBuilder.create().texOffs(2338, 12).mirror().addBox(-3.0F, -2.5F, -0.95F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition samoyed_mouth_open2 = samoyed_head_anim2.addOrReplaceChild("samoyed_mouth_open2", CubeListBuilder.create().texOffs(2369, 0).addBox(-2.0F, -0.9939F, -0.4504F, 4.0F, 3.0F, 2.0F, new CubeDeformation(-0.05F))
		.texOffs(2367, 0).addBox(-0.5F, -1.0539F, -0.5496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -6.15F, 1.65F, 0.1222F, 0.0F, 0.0F));

		PartDefinition bone2 = samoyed_mouth_open2.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(2367, 0).addBox(-2.55F, -15.6F, 3.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
		.texOffs(2367, 0).mirror().addBox(1.55F, -15.6F, 3.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 16.5585F, -5.9485F, -0.1222F, 0.0F, 0.0F));

		PartDefinition bone3 = samoyed_mouth_open2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(2343, 26).addBox(-1.5F, -1.5052F, -1.6499F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.75F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.9F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bone4 = samoyed_mouth_open2.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(2318, 0).addBox(-1.0F, -1.5543F, -1.6775F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5654F, 1.4972F, 0.829F, 0.0F, 0.0F));

		PartDefinition samoyed_jaw2 = samoyed_mouth_open2.addOrReplaceChild("samoyed_jaw2", CubeListBuilder.create(), PartPose.offset(0.0F, 1.5F, -1.0F));

		PartDefinition samoyed_jaw_rot2 = samoyed_jaw2.addOrReplaceChild("samoyed_jaw_rot2", CubeListBuilder.create().texOffs(2328, 12).addBox(-2.0F, -2.1451F, -0.0845F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F))
		.texOffs(2225, 14).addBox(-2.0F, -2.1451F, -0.6345F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.13F))
		.texOffs(2258, 19).addBox(-2.0F, -2.1451F, 0.4155F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.16F))
		.texOffs(2258, 19).mirror().addBox(1.0F, -2.1451F, 0.4155F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.16F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition samoyed_tongue2 = samoyed_jaw_rot2.addOrReplaceChild("samoyed_tongue2", CubeListBuilder.create(), PartPose.offset(0.0F, -1.018F, -0.308F));

		PartDefinition samoyed_tongue_rot2 = samoyed_tongue2.addOrReplaceChild("samoyed_tongue_rot2", CubeListBuilder.create().texOffs(2320, 12).addBox(-1.5F, -2.8644F, 0.6335F, 3.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.9599F, 0.0F, 0.0F));

		PartDefinition samoyed_mouth_closed2 = samoyed_head_anim2.addOrReplaceChild("samoyed_mouth_closed2", CubeListBuilder.create().texOffs(2380, 17).addBox(-2.0F, -0.9956F, -0.4502F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(2349, 0).addBox(-0.5F, -1.2056F, -0.5994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -6.0F, 1.7F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone5 = samoyed_mouth_closed2.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(2380, 22).addBox(-1.5F, -1.5F, -1.55F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.75F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.9F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bone8 = samoyed_mouth_closed2.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(2392, 17).addBox(-1.0F, -1.5554F, -1.6761F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5654F, 1.7471F, 0.829F, 0.0F, 0.0F));

		PartDefinition bone9 = samoyed_mouth_closed2.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(2409, 3).addBox(-2.0F, -2.4956F, -0.2002F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, 1.5F, -1.0F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
}
