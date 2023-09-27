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

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(-1.0F, 10.0F, 6.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition borzoi_tail_full2 = real_tail.addOrReplaceChild("borzoi_tail_full2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.5753F, 0.9418F, 0.2182F, 0.0F, 0.0F));

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

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 11.9F, 0.9F));

		PartDefinition borzoi_body_r1 = body.addOrReplaceChild("borzoi_body_r1", CubeListBuilder.create().texOffs(2072, 16).addBox(-2.5F, -0.6F, 9.6F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.0F, 12.1F, -0.9F, 1.5708F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offset(0.0F, 12.0F, -5.0F));

		PartDefinition borzoi_mane2 = upper_body.addOrReplaceChild("borzoi_mane2", CubeListBuilder.create().texOffs(2175, 18).addBox(-3.0F, -13.0F, 0.5F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.2F))
		.texOffs(2129, 0).addBox(-3.0F, -13.0F, -4.9F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.2F))
		.texOffs(2180, 4).addBox(2.0F, -13.0F, -4.9F, 1.0F, 8.0F, 5.0F, new CubeDeformation(0.2F))
		.texOffs(2180, 4).mirror().addBox(-3.0F, -13.0F, -4.9F, 1.0F, 8.0F, 5.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.0F, 9.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition borzoi_mane_coat_left2 = borzoi_mane2.addOrReplaceChild("borzoi_mane_coat_left2", CubeListBuilder.create(), PartPose.offset(2.45F, -10.0F, 5.6F));

		PartDefinition borzoi_mane_coat_left_rot2 = borzoi_mane_coat_left2.addOrReplaceChild("borzoi_mane_coat_left_rot2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5267F, 1.0F, -0.4373F, -1.5708F, -0.0436F, 0.0F));

		PartDefinition borzoi_mane_coat_right2 = borzoi_mane2.addOrReplaceChild("borzoi_mane_coat_right2", CubeListBuilder.create(), PartPose.offset(-2.7F, -10.0F, 5.6F));

		PartDefinition borzoi_mane_coat_right_rot2 = borzoi_mane_coat_right2.addOrReplaceChild("borzoi_mane_coat_right_rot2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2767F, 1.0F, -0.4373F, -1.5708F, 0.0436F, 0.0F));

		PartDefinition borzoi_mane_coat_front2 = borzoi_mane2.addOrReplaceChild("borzoi_mane_coat_front2", CubeListBuilder.create(), PartPose.offset(0.2F, -12.85F, 4.35F));

		PartDefinition borzoi_mane_coat_front_rot2 = borzoi_mane_coat_front2.addOrReplaceChild("borzoi_mane_coat_front_rot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -2.75F, -1.5708F, 0.0F, -1.5708F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 9.5F, -10.0F));

		PartDefinition left_ear = head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(2.0F, -6.5F, 3.0F));

		PartDefinition borzoi_ear_left2 = left_ear.addOrReplaceChild("borzoi_ear_left2", CubeListBuilder.create(), PartPose.offset(0.5F, -1.0F, 0.75F));

		PartDefinition borzoi_ear_left_rot2 = borzoi_ear_left2.addOrReplaceChild("borzoi_ear_left_rot2", CubeListBuilder.create().texOffs(1933, 14).addBox(-0.8556F, -0.6131F, -2.3301F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4684F, -0.633F, -1.3565F, 3.1358F, 0.9915F, 2.1281F));

		PartDefinition borzoi_ear_left_fuzz2 = borzoi_ear_left_rot2.addOrReplaceChild("borzoi_ear_left_fuzz2", CubeListBuilder.create().texOffs(1918, 17).addBox(-1.0351F, -2.5097F, -2.871F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.474F, 1.7047F, -1.224F, 0.1852F, -0.5391F, -0.035F));

		PartDefinition borzoi_sideburns = left_ear.addOrReplaceChild("borzoi_sideburns", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8F, -0.85F, -2.7F, -0.1745F, 0.0F, 0.0F));

		PartDefinition borzoi_sideburn_left_r1 = borzoi_sideburns.addOrReplaceChild("borzoi_sideburn_left_r1", CubeListBuilder.create().texOffs(2010, 0).mirror().addBox(2.1914F, -23.6094F, 18.2495F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(5.9993F, 22.35F, -16.4488F, 0.0F, -0.1745F, 0.0F));

		PartDefinition right_ear = head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-2.0F, -6.5F, 3.0F));

		PartDefinition borzoi_ear_right2 = right_ear.addOrReplaceChild("borzoi_ear_right2", CubeListBuilder.create(), PartPose.offset(-0.5F, -1.0F, 0.75F));

		PartDefinition borzoi_ear_right_rot2 = borzoi_ear_right2.addOrReplaceChild("borzoi_ear_right_rot2", CubeListBuilder.create().texOffs(1933, 14).mirror().addBox(-0.1444F, -0.6131F, -2.3301F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4684F, -0.633F, -1.3565F, 3.1358F, -0.9915F, -2.1281F));

		PartDefinition borzoi_ear_right_fuzz2 = borzoi_ear_right_rot2.addOrReplaceChild("borzoi_ear_right_fuzz2", CubeListBuilder.create().texOffs(1918, 17).mirror().addBox(0.0351F, -2.5097F, -2.871F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.474F, 1.7047F, -1.224F, 0.1852F, 0.5391F, 0.035F));

		PartDefinition borzoi_sideburn_right = right_ear.addOrReplaceChild("borzoi_sideburn_right", CubeListBuilder.create().texOffs(2010, 0).addBox(-2.0876F, -2.7363F, -0.0183F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2F, 0.4559F, -0.7905F, -0.1745F, 0.1745F, 0.0F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition borzoi_head_rot = real_head.addOrReplaceChild("borzoi_head_rot", CubeListBuilder.create(), PartPose.offset(0.0F, 15.0F, 10.0F));

		PartDefinition borzoi_head_main = borzoi_head_rot.addOrReplaceChild("borzoi_head_main", CubeListBuilder.create().texOffs(1902, 6).addBox(-2.5F, -1.35F, -2.4F, 5.0F, 5.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offset(0.0F, -21.85F, -8.8F));

		PartDefinition borzoi_head_beard = borzoi_head_rot.addOrReplaceChild("borzoi_head_beard", CubeListBuilder.create(), PartPose.offset(0.0F, -18.3F, -10.85F));

		PartDefinition borzoi_head_beard_rot = borzoi_head_beard.addOrReplaceChild("borzoi_head_beard_rot", CubeListBuilder.create().texOffs(2099, 16).addBox(-3.5F, -2.5F, -0.5F, 7.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offset(0.0F, 0.25F, 0.8F));

		PartDefinition borzoi_head_top = borzoi_head_rot.addOrReplaceChild("borzoi_head_top", CubeListBuilder.create().texOffs(1902, 2).mirror().addBox(-3.5F, -1.4039F, 0.5287F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.05F, -22.5632F, -7.875F, -0.48F, 0.0F, 0.0F));

		PartDefinition borzoi_neck = borzoi_head_rot.addOrReplaceChild("borzoi_neck", CubeListBuilder.create().texOffs(2089, 1).addBox(-2.0F, -1.5315F, -3.9672F, 3.0F, 5.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, -18.85F, -6.4F, 0.3491F, 0.0F, 0.0F));

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

		return LayerDefinition.create(meshdefinition, 3002, 32);
    }
    
	public static LayerDefinition corgi() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 16.0F, 4.75F, 1.9635F, 0.0F, 0.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(-1.0F, -5.6429F, 1.7223F));

		PartDefinition corgi_tail3 = real_tail.addOrReplaceChild("corgi_tail3", CubeListBuilder.create(), PartPose.offset(1.0F, 4.8F, -2.2F));

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

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, -1.5F, -2.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-1.5F, 0.0F, 0.5F));

		PartDefinition corgi_ear_right2 = right_ear.addOrReplaceChild("corgi_ear_right2", CubeListBuilder.create().texOffs(422, 27).mirror().addBox(-1.1826F, -4.3668F, -0.7878F, 3.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1087F, -1.5863F, 1.0947F, 0.0F, 0.3491F, -0.3927F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(1.5F, 0.0F, 0.5F));

		PartDefinition corgi_ear_left2 = left_ear.addOrReplaceChild("corgi_ear_left2", CubeListBuilder.create().texOffs(422, 27).addBox(-1.8174F, -4.3668F, -0.7878F, 3.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1087F, -1.5863F, 1.0947F, 0.0F, -0.3491F, 0.3927F));

		PartDefinition corgi_head_full2 = real_head.addOrReplaceChild("corgi_head_full2", CubeListBuilder.create().texOffs(371, 0).addBox(-3.5F, -2.0F, -2.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offset(1.0F, 0.25F, 1.5F));

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

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 18.0F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition shihtzu_mane2 = upper_body.addOrReplaceChild("shihtzu_mane2", CubeListBuilder.create().texOffs(1424, 0).addBox(-3.5F, -6.0F, -8.35F, 7.0F, 6.0F, 7.0F, new CubeDeformation(0.1F)), PartPose.offset(1.0F, 3.25F, 5.35F));

		PartDefinition shihtzu_mane_hair2 = shihtzu_mane2.addOrReplaceChild("shihtzu_mane_hair2", CubeListBuilder.create().texOffs(1813, 0).addBox(-3.5F, -3.0F, -7.75F, 7.0F, 6.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, -3.0F, -3.4F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 14.5F, -6.0F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -1.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create().texOffs(1468, 11).mirror().addBox(-2.0F, -0.9F, -1.5F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false)
		.texOffs(1783, 17).mirror().addBox(-2.0F, 2.9F, -1.5F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.55F, 0.5F, 0.15F, -1.5708F, 0.0F, 0.0F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(1468, 11).addBox(0.0F, -0.9F, -1.5F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.1F))
		.texOffs(1783, 17).addBox(0.0F, 2.9F, -1.5F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.55F, 0.5F, 0.15F, -1.5708F, 0.0F, 0.0F));

		PartDefinition shihtzu_head2 = real_head.addOrReplaceChild("shihtzu_head2", CubeListBuilder.create(), PartPose.offset(0.0F, 2.5F, -3.25F));

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
}
