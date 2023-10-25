package betterdogs_dtn.models;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class Cerberus {
    public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 12.4F, 7.3F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tail2 = real_tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offset(-1.0F, 0.0F, 0.0F));

		PartDefinition Cerberus8 = tail2.addOrReplaceChild("Cerberus8", CubeListBuilder.create().texOffs(1050, 18).addBox(-1.5F, -12.0F, 9.0F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(1049, 11).addBox(-1.0F, -4.0F, 9.5F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offset(1.0F, 12.0F, -11.0F));

		PartDefinition bone86 = Cerberus8.addOrReplaceChild("bone86", CubeListBuilder.create().texOffs(1059, 10).addBox(-0.1446F, -16.4857F, 9.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8F, 7.75F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition bone90 = Cerberus8.addOrReplaceChild("bone90", CubeListBuilder.create().texOffs(1059, 10).addBox(0.3694F, -17.3258F, 9.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.35F, 12.75F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition bone88 = Cerberus8.addOrReplaceChild("bone88", CubeListBuilder.create().texOffs(1059, 10).addBox(-0.1447F, -16.4857F, 9.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.5F, 7.75F, 14.3F, 1.5708F, -1.4399F, -1.5708F));

		PartDefinition bone91 = Cerberus8.addOrReplaceChild("bone91", CubeListBuilder.create().texOffs(1059, 10).addBox(-0.1447F, -16.4857F, 9.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.5F, 12.25F, 14.3F, 1.5708F, -1.4399F, -1.5708F));

		PartDefinition bone89 = Cerberus8.addOrReplaceChild("bone89", CubeListBuilder.create().texOffs(1059, 10).addBox(-2.5633F, -16.5016F, -12.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.5F, 7.75F, 4.3F, -1.5708F, 1.4399F, -1.5708F));

		PartDefinition bone93 = Cerberus8.addOrReplaceChild("bone93", CubeListBuilder.create().texOffs(1059, 10).addBox(-2.5633F, -16.5016F, -12.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.5F, 12.05F, 4.4F, -1.5708F, 1.4399F, -1.5708F));

		PartDefinition bone87 = Cerberus8.addOrReplaceChild("bone87", CubeListBuilder.create().texOffs(1059, 10).addBox(-0.112F, -16.7336F, 9.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.7F, 7.75F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone92 = Cerberus8.addOrReplaceChild("bone92", CubeListBuilder.create().texOffs(1059, 10).addBox(-0.112F, -16.7336F, 9.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.7F, 12.15F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create(), PartPose.offset(-2.5F, 16.0F, 7.0F));

		PartDefinition leg2 = right_hind_leg.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offset(3.0F, 0.0F, 0.0F));

		PartDefinition Cerberus5 = leg2.addOrReplaceChild("Cerberus5", CubeListBuilder.create().texOffs(1065, 0).addBox(-3.0F, -0.25F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(-1.0F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create(), PartPose.offset(2.5F, 16.0F, 7.0F));

		PartDefinition leg1 = left_hind_leg.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offset(-5.0F, 0.0F, 0.0F));

		PartDefinition Cerberus4 = leg1.addOrReplaceChild("Cerberus4", CubeListBuilder.create().texOffs(1065, 0).addBox(-1.0F, -0.25F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(5.0F, 0.0F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create(), PartPose.offset(-3.5F, 16.0F, -4.0F));

		PartDefinition leg4 = right_front_leg.addOrReplaceChild("leg4", CubeListBuilder.create(), PartPose.offset(4.0F, 0.0F, 0.0F));

		PartDefinition Cerberus7 = leg4.addOrReplaceChild("Cerberus7", CubeListBuilder.create().texOffs(1041, 15).addBox(-4.0F, -0.25F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(-1.0F, 0.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create(), PartPose.offset(3.5F, 16.0F, -4.0F));

		PartDefinition leg3 = left_front_leg.addOrReplaceChild("leg3", CubeListBuilder.create(), PartPose.offset(-6.0F, 0.0F, 0.0F));

		PartDefinition Cerberus6 = leg3.addOrReplaceChild("Cerberus6", CubeListBuilder.create().texOffs(1041, 15).addBox(0.0F, -0.25F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(5.0F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 14.0F, 2.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body_rotation = body2.addOrReplaceChild("body_rotation", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_sub_1 = body_rotation.addOrReplaceChild("body_sub_1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Cerberus3 = body_sub_1.addOrReplaceChild("Cerberus3", CubeListBuilder.create().texOffs(1009, 14).addBox(-4.5F, -2.45F, -4.15F, 9.0F, 9.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone76 = Cerberus3.addOrReplaceChild("bone76", CubeListBuilder.create().texOffs(1039, 2).addBox(0.55F, -0.6429F, -0.4091F, 8.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -1.6F, -5.6F, 2.9234F, -1.5708F, 1.5708F));

		PartDefinition bone64 = Cerberus3.addOrReplaceChild("bone64", CubeListBuilder.create().texOffs(1039, 2).addBox(-4.0F, 1.0525F, -0.1801F, 8.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 3.65F, -1.309F, 0.0F, 0.0F));

		PartDefinition bone78 = Cerberus3.addOrReplaceChild("bone78", CubeListBuilder.create().texOffs(1039, 2).addBox(-5.0F, 0.6847F, -0.4604F, 8.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -1.35F, 0.15F, -2.7925F, -1.5708F, 1.5708F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 14.0F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation = upper_body.addOrReplaceChild("mane_rotation", CubeListBuilder.create(), PartPose.offset(1.0F, 2.5F, -2.5F));

		PartDefinition mane_sub_1 = mane_rotation.addOrReplaceChild("mane_sub_1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Cerberus2 = mane_sub_1.addOrReplaceChild("Cerberus2", CubeListBuilder.create().texOffs(1005, 0).addBox(-6.0F, -5.5F, -2.05F, 12.0F, 6.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone62 = Cerberus2.addOrReplaceChild("bone62", CubeListBuilder.create().texOffs(1038, 2).addBox(-5.0F, 0.8215F, -0.4845F, 10.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 6.4F, -1.309F, 0.0F, 0.0F));

		PartDefinition bone66 = Cerberus2.addOrReplaceChild("bone66", CubeListBuilder.create().texOffs(1039, 2).addBox(-4.9001F, 0.8206F, -0.0802F, 8.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -4.1F, 2.9F, 2.9234F, -1.6144F, 1.5708F));

		PartDefinition bone74 = Cerberus2.addOrReplaceChild("bone74", CubeListBuilder.create().texOffs(1039, 2).addBox(-4.9F, 0.6847F, -0.4604F, 8.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, -4.6F, 2.65F, -2.7925F, -1.5708F, 1.5708F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 13.5F, -7.0F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-2.0F, -3.0F, 0.5F));

		PartDefinition oor19 = right_ear.addOrReplaceChild("oor19", CubeListBuilder.create().texOffs(992, 9).addBox(-2.0133F, -13.0412F, -9.5056F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.1F))
		.texOffs(996, 18).addBox(-2.0002F, -13.0412F, -9.8053F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(996, 18).addBox(-1.5543F, -14.3265F, -9.7912F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(992, 9).addBox(-1.5364F, -14.3417F, -9.5119F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.09F)), PartPose.offsetAndRotation(4.75F, 10.5F, 6.4F, 0.0F, 0.4363F, -0.0349F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(2.0F, -3.0F, 0.5F));

		PartDefinition oor20 = left_ear.addOrReplaceChild("oor20", CubeListBuilder.create().texOffs(992, 9).addBox(-2.2168F, -12.9519F, -8.6529F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.1F))
		.texOffs(996, 18).addBox(-2.2299F, -12.9519F, -8.9526F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(996, 18).addBox(-1.6465F, -14.2449F, -8.9397F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(992, 9).addBox(-1.699F, -14.2522F, -8.659F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.09F)), PartPose.offsetAndRotation(-2.3F, 10.5F, 6.6F, 0.0F, -0.4363F, 0.0349F));

		PartDefinition head2 = real_head.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offset(-1.0F, 0.0F, 0.0F));

		PartDefinition cerberus = head2.addOrReplaceChild("cerberus", CubeListBuilder.create().texOffs(974, 0).addBox(-4.0F, -3.0F, -3.75F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(995, 8).addBox(1.74F, -2.99F, -1.85F, 1.0F, 6.0F, 4.0F, new CubeDeformation(-0.002F))
		.texOffs(995, 8).addBox(-4.74F, -2.99F, -1.85F, 1.0F, 6.0F, 4.0F, new CubeDeformation(-0.002F)), PartPose.offset(2.0F, -1.0F, 0.0F));

		PartDefinition bone57 = cerberus.addOrReplaceChild("bone57", CubeListBuilder.create().texOffs(1003, 15).addBox(-2.0F, -7.5F, -11.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.75F, 10.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition bone51 = cerberus.addOrReplaceChild("bone51", CubeListBuilder.create().texOffs(993, 6).addBox(2.4719F, -10.5832F, -13.141F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-11.65F, 12.0F, 9.65F, -0.0873F, -0.3927F, 0.0F));

		PartDefinition bone54 = cerberus.addOrReplaceChild("bone54", CubeListBuilder.create().texOffs(993, 6).addBox(2.4719F, -10.5832F, -13.141F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(4.35F, 12.0F, 11.65F, -0.0873F, 0.3927F, 0.0F));

		PartDefinition bone52 = cerberus.addOrReplaceChild("bone52", CubeListBuilder.create().texOffs(993, 6).addBox(2.241F, -11.24F, -13.0957F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-11.75F, 10.5F, 10.4F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone55 = cerberus.addOrReplaceChild("bone55", CubeListBuilder.create().texOffs(993, 6).addBox(2.241F, -11.24F, -13.0957F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(4.65F, 10.5F, 12.15F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone53 = cerberus.addOrReplaceChild("bone53", CubeListBuilder.create().texOffs(993, 6).addBox(2.241F, -11.2409F, -13.1175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-11.75F, 8.25F, 11.4F, 0.0873F, -0.3927F, 0.0F));

		PartDefinition bone56 = cerberus.addOrReplaceChild("bone56", CubeListBuilder.create().texOffs(993, 6).addBox(2.241F, -11.2409F, -13.1175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(4.7F, 8.25F, 13.15F, 0.0873F, 0.3927F, 0.0F));

		PartDefinition mond4 = cerberus.addOrReplaceChild("mond4", CubeListBuilder.create().texOffs(1009, 30).addBox(-0.5F, -10.4649F, -14.0553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F))
		.texOffs(999, 1).addBox(-1.5F, -10.4131F, -13.8036F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 9.55F, 6.7F, 0.0349F, 0.0F, 0.0F));

		PartDefinition bone95_r1 = mond4.addOrReplaceChild("bone95_r1", CubeListBuilder.create().texOffs(1037, 4).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1356F, -7.2479F, -13.501F, -0.0261F, -0.0014F, -0.0872F));

		PartDefinition bone94_r1 = mond4.addOrReplaceChild("bone94_r1", CubeListBuilder.create().texOffs(1037, 4).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1356F, -7.2479F, -13.501F, -0.0261F, 0.0014F, 0.0872F));

		PartDefinition bone48 = mond4.addOrReplaceChild("bone48", CubeListBuilder.create().texOffs(1037, 26).addBox(-1.5F, -10.1353F, -13.64F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F))
		.texOffs(996, 21).addBox(-1.5F, -9.4838F, -13.2424F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offset(0.0F, 2.5448F, -0.2482F));

		PartDefinition bone49 = bone48.addOrReplaceChild("bone49", CubeListBuilder.create().texOffs(1037, 4).addBox(-1.4843F, -11.193F, -13.6813F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.75F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition bone50 = bone48.addOrReplaceChild("bone50", CubeListBuilder.create().texOffs(1037, 4).addBox(0.4843F, -11.193F, -13.6813F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition bone47 = cerberus.addOrReplaceChild("bone47", CubeListBuilder.create().texOffs(994, 13).addBox(0.0F, -9.6146F, -14.6166F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 3.6F, 11.3F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cerberushoofd = real_head.addOrReplaceChild("cerberushoofd", CubeListBuilder.create().texOffs(974, 0).addBox(-1.0178F, -3.0F, -12.2563F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(995, 8).addBox(4.7222F, -2.99F, -10.3563F, 1.0F, 6.0F, 4.0F, new CubeDeformation(-0.002F))
		.texOffs(995, 8).addBox(-1.7578F, -2.99F, -10.3563F, 1.0F, 6.0F, 4.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-5.0F, 0.6F, 9.3F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone60 = cerberushoofd.addOrReplaceChild("bone60", CubeListBuilder.create().texOffs(1003, 15).addBox(0.9822F, -10.4093F, -18.9933F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.75F, 10.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition bone61 = cerberushoofd.addOrReplaceChild("bone61", CubeListBuilder.create().texOffs(993, 6).addBox(1.9719F, -9.7988F, -22.1068F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-11.65F, 12.0F, 9.65F, -0.0873F, -0.3927F, 0.0F));

		PartDefinition bone63 = cerberushoofd.addOrReplaceChild("bone63", CubeListBuilder.create().texOffs(993, 6).addBox(1.741F, -11.24F, -22.0957F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-11.75F, 10.5F, 10.4F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone65 = cerberushoofd.addOrReplaceChild("bone65", CubeListBuilder.create().texOffs(993, 6).addBox(1.741F, -12.0253F, -22.0832F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-11.75F, 8.25F, 11.4F, 0.0873F, -0.3927F, 0.0F));

		PartDefinition oor21 = cerberushoofd.addOrReplaceChild("oor21", CubeListBuilder.create().texOffs(992, 9).addBox(3.9969F, -12.9385F, -15.4352F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.1F))
		.texOffs(996, 18).addBox(4.0099F, -12.9385F, -15.7349F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(996, 18).addBox(4.4559F, -14.2238F, -15.7208F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(992, 9).addBox(4.4737F, -14.239F, -15.4416F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.09F)), PartPose.offsetAndRotation(1.75F, 8.5F, 6.9F, 0.0F, 0.4363F, -0.0349F));

		PartDefinition oor22 = cerberushoofd.addOrReplaceChild("oor22", CubeListBuilder.create().texOffs(992, 9).addBox(-3.0668F, -13.0426F, -16.6228F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.1F))
		.texOffs(996, 18).addBox(-3.0798F, -13.0426F, -16.9225F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(996, 18).addBox(-2.4964F, -14.3356F, -16.9096F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(992, 9).addBox(-2.5489F, -14.3429F, -16.6289F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.09F)), PartPose.offsetAndRotation(-1.3F, 8.5F, 7.1F, 0.0F, -0.4363F, 0.0349F));

		PartDefinition mond5 = cerberushoofd.addOrReplaceChild("mond5", CubeListBuilder.create().texOffs(1009, 30).addBox(2.3469F, -10.7644F, -22.633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F))
		.texOffs(999, 1).addBox(1.4822F, -10.7099F, -22.3047F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 9.55F, 6.7F, 0.0349F, 0.0F, 0.0F));

		PartDefinition bone70 = mond5.addOrReplaceChild("bone70", CubeListBuilder.create().texOffs(1037, 4).addBox(1.7876F, -5.6479F, -25.5915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0924F, -2.1358F, 3.2556F, 0.0F, 0.0F, -0.0873F));

		PartDefinition bone69 = mond5.addOrReplaceChild("bone69", CubeListBuilder.create().texOffs(1037, 4).addBox(3.3852F, -5.9929F, -25.5494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.223F, -2.3364F, 3.2402F, 0.0F, 0.0F, 0.0873F));

		PartDefinition bone68 = mond5.addOrReplaceChild("bone68", CubeListBuilder.create().texOffs(1037, 26).addBox(1.5123F, -14.6326F, -25.0917F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
		.texOffs(996, 21).addBox(1.4965F, -14.0888F, -24.9135F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offset(0.0F, 6.7575F, 2.9067F));

		PartDefinition bone72 = cerberushoofd.addOrReplaceChild("bone72", CubeListBuilder.create().texOffs(994, 13).addBox(3.0174F, -12.498F, -22.5386F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 3.6F, 11.3F, 0.3491F, 0.0F, 0.0F));

		PartDefinition bone = cerberushoofd.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(9.4399F, 9.9683F, -2.5608F));

		PartDefinition cerberushoofd2 = real_head.addOrReplaceChild("cerberushoofd2", CubeListBuilder.create().texOffs(974, 0).addBox(-7.4442F, -2.0F, -12.0649F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(995, 8).addBox(-1.7042F, -1.99F, -10.1649F, 1.0F, 6.0F, 4.0F, new CubeDeformation(-0.002F))
		.texOffs(995, 8).addBox(-8.1841F, -1.99F, -10.1649F, 1.0F, 6.0F, 4.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(7.5F, -0.4F, 10.5F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone73 = cerberushoofd2.addOrReplaceChild("bone73", CubeListBuilder.create().texOffs(1003, 15).addBox(-5.4442F, -9.4042F, -19.1555F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.75F, 10.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition bone75 = cerberushoofd2.addOrReplaceChild("bone75", CubeListBuilder.create().texOffs(993, 6).addBox(2.4719F, -8.8026F, -22.0196F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(4.35F, 12.0F, 11.65F, -0.0873F, 0.3927F, 0.0F));

		PartDefinition bone77 = cerberushoofd2.addOrReplaceChild("bone77", CubeListBuilder.create().texOffs(993, 6).addBox(2.241F, -10.24F, -22.0957F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(4.65F, 10.5F, 12.15F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone79 = cerberushoofd2.addOrReplaceChild("bone79", CubeListBuilder.create().texOffs(993, 6).addBox(2.241F, -11.0292F, -22.1704F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(4.7F, 8.25F, 13.15F, 0.0873F, 0.3927F, 0.0F));

		PartDefinition oor23 = cerberushoofd2.addOrReplaceChild("oor23", CubeListBuilder.create().texOffs(992, 9).addBox(-2.1527F, -12.1689F, -17.8965F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.1F))
		.texOffs(996, 18).addBox(-2.1396F, -12.1689F, -18.1963F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(996, 18).addBox(-1.6936F, -13.4541F, -18.1821F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(992, 9).addBox(-1.6758F, -13.4693F, -17.9029F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.09F)), PartPose.offsetAndRotation(1.75F, 8.5F, 6.9F, 0.0F, 0.4363F, -0.0349F));

		PartDefinition oor24 = cerberushoofd2.addOrReplaceChild("oor24", CubeListBuilder.create().texOffs(992, 9).addBox(-8.5116F, -11.8338F, -14.196F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.1F))
		.texOffs(996, 18).addBox(-8.5247F, -11.8338F, -14.4957F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(996, 18).addBox(-7.9412F, -13.1268F, -14.4829F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(992, 9).addBox(-7.9937F, -13.1341F, -14.2021F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.09F)), PartPose.offsetAndRotation(-1.3F, 8.5F, 7.1F, 0.0F, -0.4363F, 0.0349F));

		PartDefinition mond6 = cerberushoofd2.addOrReplaceChild("mond6", CubeListBuilder.create().texOffs(1009, 30).addBox(-3.8089F, -9.7583F, -22.4767F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F))
		.texOffs(999, 1).addBox(-4.9442F, -9.7039F, -22.1484F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 9.55F, 6.7F, 0.0349F, 0.0F, 0.0F));

		PartDefinition bone81 = mond6.addOrReplaceChild("bone81", CubeListBuilder.create().texOffs(1037, 26).addBox(-4.9442F, -13.7153F, -21.3783F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
		.texOffs(996, 21).addBox(-4.9442F, -13.0638F, -20.9807F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offset(-0.046F, 6.8258F, -0.8673F));

		PartDefinition bone82 = bone81.addOrReplaceChild("bone82", CubeListBuilder.create().texOffs(1037, 4).addBox(-4.644F, -14.1693F, -21.4778F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.75F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition bone83 = bone81.addOrReplaceChild("bone83", CubeListBuilder.create().texOffs(1037, 4).addBox(-3.1374F, -13.5717F, -21.462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition bone85 = cerberushoofd2.addOrReplaceChild("bone85", CubeListBuilder.create().texOffs(994, 13).addBox(-3.5904F, -11.5632F, -22.8943F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9043F, 3.6F, 11.531F, 0.3491F, 0.0F, 0.0F));

		PartDefinition glowing_eyes = partdefinition.addOrReplaceChild("glowing_eyes", CubeListBuilder.create(), PartPose.offset(0.0F, 13.5F, -7.0F));

		PartDefinition real_glowing_eyes = glowing_eyes.addOrReplaceChild("real_glowing_eyes", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cerberushoofd3 = real_glowing_eyes.addOrReplaceChild("cerberushoofd3", CubeListBuilder.create(), PartPose.offsetAndRotation(7.5F, -0.4F, 10.5F, 0.0F, -0.3927F, 0.0F));

		PartDefinition oog2 = cerberushoofd3.addOrReplaceChild("oog2", CubeListBuilder.create().texOffs(1014, 30).addBox(-3.693F, -10.028F, -14.2649F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(986, 12).addBox(-3.962F, -10.0163F, -14.27F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(1014, 30).addBox(-4.3973F, -10.1279F, -14.1349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.65F, 9.5F, 1.95F, 0.0F, 0.0F, 0.0436F));

		PartDefinition oog3 = cerberushoofd3.addOrReplaceChild("oog3", CubeListBuilder.create().texOffs(1014, 30).addBox(-1.9314F, -10.3258F, -14.2573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(986, 12).addBox(-1.6625F, -10.3141F, -14.2606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(1014, 30).addBox(-1.2271F, -10.4258F, -14.1273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.65F, 9.6F, 1.95F, 0.0F, 0.0F, -0.0436F));

		PartDefinition cerberus9 = real_glowing_eyes.addOrReplaceChild("cerberus9", CubeListBuilder.create(), PartPose.offset(1.0F, -1.0F, 0.0F));

		PartDefinition oog4 = cerberus9.addOrReplaceChild("oog4", CubeListBuilder.create().texOffs(1014, 30).addBox(-0.2957F, -11.1773F, -5.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(986, 12).addBox(-0.6454F, -11.162F, -5.96F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(1014, 30).addBox(-1.0001F, -11.2772F, -5.82F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.65F, 9.5F, 1.95F, 0.0F, 0.0F, 0.0436F));

		PartDefinition oog5 = cerberus9.addOrReplaceChild("oog5", CubeListBuilder.create().texOffs(1014, 30).addBox(1.5956F, -11.2729F, -5.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(986, 12).addBox(1.8454F, -11.262F, -5.96F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(1014, 30).addBox(2.3F, -11.3728F, -5.82F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.65F, 9.6F, 1.95F, 0.0F, 0.0F, -0.0436F));

		PartDefinition cerberushoofd4 = real_glowing_eyes.addOrReplaceChild("cerberushoofd4", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, 0.6F, 9.3F, 0.0F, 0.3927F, 0.0F));

		PartDefinition oog6 = cerberushoofd4.addOrReplaceChild("oog6", CubeListBuilder.create().texOffs(1014, 30).addBox(2.6836F, -11.3074F, -14.4563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(986, 12).addBox(2.4147F, -11.2956F, -14.4595F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(1014, 30).addBox(1.9793F, -11.4073F, -14.3263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.65F, 9.5F, 1.95F, 0.0F, 0.0F, 0.0436F));

		PartDefinition oog7 = cerberushoofd4.addOrReplaceChild("oog7", CubeListBuilder.create().texOffs(1014, 30).addBox(4.6089F, -11.0412F, -14.4487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(986, 12).addBox(5.0737F, -11.0209F, -14.455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(1014, 30).addBox(5.3132F, -11.1412F, -14.3186F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.65F, 9.6F, 1.95F, 0.0F, 0.0F, -0.0436F));

		return LayerDefinition.create(meshdefinition, 3002, 32);
	}
}
