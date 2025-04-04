package betterdogs_dtn;
import org.joml.Vector3f;

import betterdogs_dtn.models.BDWolf;
import betterdogs_dtn.models.Cerberus;
import doggytalents.api.events.RegisterCustomDogModelsEvent;
import doggytalents.api.events.RegisterDogSkinJsonPathEvent;
import doggytalents.api.events.RegisterCustomDogModelsEvent.DogModelProps.Builder;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent.RegisterLayerDefinitions;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class BetterDogsForDTN {

    public BetterDogsForDTN() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> {
            modEventBus.addListener(BetterDogsForDTN::registeringSkin);
            modEventBus.addListener(BetterDogsForDTN::registeringSkinJson);
            modEventBus.addListener(BetterDogsForDTN::registerLayerDefinition);
        });

    }

    public static void registeringSkin(RegisterCustomDogModelsEvent event) {
        event.register(new Builder(getRes("borzoi"), ModelLayerLocations.BORZOI).withAccessory());
        event.register(new Builder(getRes("corgi"), ModelLayerLocations.CORGI).withAccessory());
        event.register(new Builder(getRes("shih_tzu"), ModelLayerLocations.SHIH_TZU).withAccessory());
        event.register(new Builder(getRes("border_collie"), ModelLayerLocations.BORDER_COLLIE).withAccessory());
        event.register(new Builder(getRes("basset_hound"), ModelLayerLocations.BASSET_HOUND).withAccessory());
        event.register(new Builder(getRes("irish_terrier"), ModelLayerLocations.IRISH_TERRIER).withAccessory());
        event.register(new Builder(getRes("chihuahua"), ModelLayerLocations.CHIHUAHUA)
            .withDefaultScale(0.704f).withAccessory());
        event.register(new Builder(getRes("boxer"), ModelLayerLocations.BOXER).withAccessory());
        event.register(new Builder(getRes("bull_terrier"), ModelLayerLocations.BULL_TERRIER).withAccessory());
        event.register(new Builder(getRes("german_shepherd"), ModelLayerLocations.GERMAN_SHEPHERD).withAccessory());
        event.register(new Builder(getRes("rottweiler"), ModelLayerLocations.ROTTWEILER).withAccessory());
        event.register(new Builder(getRes("pug"), ModelLayerLocations.PUG).withAccessory());
        event.register(new Builder(getRes("wolf"), ModelLayerLocations.BD_WOLF)
            .withGlowingEyes().withAccessory());
        event.register(new Builder(getRes("australian_shepherd"), ModelLayerLocations.AUSTRALIAN_SHEPHERD).withAccessory());
        event.register(new Builder(getRes("beagle"), ModelLayerLocations.BEAGLE).withAccessory());
        event.register(new Builder(getRes("bernese_dog"), ModelLayerLocations.BERNESE_DOG).withAccessory());        
        event.register(new Builder(getRes("dachshund"), ModelLayerLocations.DACHSHUND).withAccessory());        
        event.register(new Builder(getRes("english_bulldog"), ModelLayerLocations.ENGLISH_BULLDOG).withAccessory());        
        event.register(new Builder(getRes("king_charles"), ModelLayerLocations.KING_CHARLES).withAccessory());        
        event.register(new Builder(getRes("west_cairn_terrier"), ModelLayerLocations.WEST_CAIRN_TERRIER).withAccessory());        
        event.register(new Builder(getRes("labrador_golden_retriever"), ModelLayerLocations.LAB_GOL).withAccessory());        
        event.register(new Builder(getRes("dalmatian"), ModelLayerLocations.DUMA).withAccessory());        
        event.register(new Builder(getRes("great_dane"), ModelLayerLocations.GREAT_DANE).withAccessory());        
        event.register(new Builder(getRes("jack_russel"), ModelLayerLocations.JACK_RUSSEL).withAccessory());
        event.register(new Builder(getRes("pomeranian"), ModelLayerLocations.POMERANIAN)
            .withCustomRootPivot(new Vector3f(0, 17, 0)).withAccessory());
        event.register(new Builder(getRes("samoyed"), ModelLayerLocations.SAMOYED).withAccessory());        
        event.register(new Builder(getRes("st_bernard"), ModelLayerLocations.ST_BERNARD).withAccessory());        
        event.register(new Builder(getRes("poodle"), ModelLayerLocations.POODLE).withAccessory());        
        event.register(new Builder(getRes("husky"), ModelLayerLocations.HUSKY).withAccessory());        
        event.register(new Builder(getRes("doberman"), ModelLayerLocations.ADOBEMAN).withAccessory());        
        event.register(new Builder(getRes("neapolitan_mastiff"), ModelLayerLocations.NEAPO).withAccessory());        
        event.register(new Builder(getRes("afghan_hound"), ModelLayerLocations.AFGHAN_HOUND).withAccessory());        
        event.register(new Builder(getRes("shiba_inu"), ModelLayerLocations.SHIBA_INU).withAccessory());        
        event.register(new Builder(getRes("cerberus"), ModelLayerLocations.CERBERUS)
            .withGlowingEyes().withAccessory());
        event.register(new Builder(getRes("schnauzer"), ModelLayerLocations.SCHNAUZER).withAccessory());          
        event.register(new Builder(getRes("komondor"), ModelLayerLocations.KOMONDOR).withAccessory());          
        event.register(new Builder(getRes("samoyed_new"), ModelLayerLocations.SAMOYED_NEW).withAccessory());          
    }

    public static void registeringSkinJson(RegisterDogSkinJsonPathEvent event) {
        event.register(Constants.SKIN_JSON_PATH);
    }

    public static void registerLayerDefinition(RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModelLayerLocations.BORZOI, LayerDefinitions::borzoi);
        event.registerLayerDefinition(ModelLayerLocations.CORGI, LayerDefinitions::corgi);
        event.registerLayerDefinition(ModelLayerLocations.SHIH_TZU, LayerDefinitions::shih_tzu);
        event.registerLayerDefinition(ModelLayerLocations.CHIHUAHUA, LayerDefinitions::chihuahua);
        event.registerLayerDefinition(ModelLayerLocations.BASSET_HOUND, LayerDefinitions::basset_hound);
        event.registerLayerDefinition(ModelLayerLocations.BORDER_COLLIE, LayerDefinitions::border_collie);
        event.registerLayerDefinition(ModelLayerLocations.IRISH_TERRIER, LayerDefinitions::irish_terrier);
        event.registerLayerDefinition(ModelLayerLocations.BOXER, LayerDefinitions::boxer);
        event.registerLayerDefinition(ModelLayerLocations.BULL_TERRIER, LayerDefinitions::bull_terrier);
        event.registerLayerDefinition(ModelLayerLocations.GERMAN_SHEPHERD, LayerDefinitions::german_shepherd);
        event.registerLayerDefinition(ModelLayerLocations.ROTTWEILER, LayerDefinitions::rottweiler);
        event.registerLayerDefinition(ModelLayerLocations.PUG, LayerDefinitions::pug);
        event.registerLayerDefinition(ModelLayerLocations.BD_WOLF, BDWolf::createBodyLayer);
        event.registerLayerDefinition(ModelLayerLocations.AUSTRALIAN_SHEPHERD, LayerDefinitions::australian_shepherd);
        event.registerLayerDefinition(ModelLayerLocations.BEAGLE, LayerDefinitions::beagle);
        event.registerLayerDefinition(ModelLayerLocations.BERNESE_DOG, LayerDefinitions::bernese_dog);
        event.registerLayerDefinition(ModelLayerLocations.DACHSHUND, LayerDefinitions::dachshund);
        event.registerLayerDefinition(ModelLayerLocations.ENGLISH_BULLDOG, LayerDefinitions::english_bulldog);
        event.registerLayerDefinition(ModelLayerLocations.KING_CHARLES, LayerDefinitions::king_charles);
        event.registerLayerDefinition(ModelLayerLocations.WEST_CAIRN_TERRIER, LayerDefinitions::west_cairn_terrier);
        event.registerLayerDefinition(ModelLayerLocations.LAB_GOL, LayerDefinitions::labrador_golden_retriever);
        event.registerLayerDefinition(ModelLayerLocations.DUMA, LayerDefinitions::dalmatian);
        event.registerLayerDefinition(ModelLayerLocations.GREAT_DANE, LayerDefinitions::great_dane);
        event.registerLayerDefinition(ModelLayerLocations.JACK_RUSSEL, LayerDefinitions::jack_russel);
        event.registerLayerDefinition(ModelLayerLocations.POMERANIAN, LayerDefinitions::pomeranian);
        event.registerLayerDefinition(ModelLayerLocations.SAMOYED, LayerDefinitions::samoyed);
        event.registerLayerDefinition(ModelLayerLocations.ST_BERNARD, LayerDefinitions::st_bernard);
        event.registerLayerDefinition(ModelLayerLocations.POODLE, LayerDefinitions::poodle);
        event.registerLayerDefinition(ModelLayerLocations.HUSKY, LayerDefinitions::husky);
        event.registerLayerDefinition(ModelLayerLocations.ADOBEMAN, LayerDefinitions::doberman);
        event.registerLayerDefinition(ModelLayerLocations.NEAPO, LayerDefinitions::neapolitan_mastiff);
        event.registerLayerDefinition(ModelLayerLocations.AFGHAN_HOUND, LayerDefinitions::afghan_hound);
        event.registerLayerDefinition(ModelLayerLocations.SHIBA_INU, LayerDefinitions::shiba_inu);
        event.registerLayerDefinition(ModelLayerLocations.CERBERUS, Cerberus::createBodyLayer);
        event.registerLayerDefinition(ModelLayerLocations.SCHNAUZER, LayerDefinitions::schnauzer);
        event.registerLayerDefinition(ModelLayerLocations.KOMONDOR, LayerDefinitions::komondor);
        event.registerLayerDefinition(ModelLayerLocations.SAMOYED_NEW, LayerDefinitions::samoyed_new);
   }

    public static ResourceLocation getRes(String name) {
        return new ResourceLocation(Constants.MOD_ID, name);
    }
    
}
