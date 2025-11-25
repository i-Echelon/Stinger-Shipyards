package data.missions.fzsex_exotica;

import com.fs.starfarer.api.fleet.FleetGoal;
import com.fs.starfarer.api.fleet.FleetMemberType;
import com.fs.starfarer.api.impl.campaign.ids.Personalities;
import com.fs.starfarer.api.mission.FleetSide;
import com.fs.starfarer.api.mission.MissionDefinitionAPI;
import com.fs.starfarer.api.mission.MissionDefinitionPlugin;

public class MissionDefinition implements MissionDefinitionPlugin {

	public void defineMission(MissionDefinitionAPI api) {

		// Set up the fleets so we can add ships and fighter wings to them.
		// In this scenario, the fleets are attacking each other, but
		// in other scenarios, a fleet may be defending or trying to escape
		api.initFleet(FleetSide.PLAYER, "", FleetGoal.ATTACK, false, 5);
		api.initFleet(FleetSide.ENEMY, "TTS", FleetGoal.ATTACK, true, 7);

		// Set a small blurb for each fleet that shows up on the mission detail and
		// mission results screens to identify each side.
		api.setFleetTagline(FleetSide.PLAYER, "Luddic Path strike force");
		api.setFleetTagline(FleetSide.ENEMY, "TTS Exotica with its escort");
		
		// These show up as items in the bulleted list under 
		// "Tactical Objectives" on the mission detail screen
		api.addBriefingItem("Purge the technological abomination");
		
		// Set up the player's fleet.
		api.addToFleet(FleetSide.PLAYER, "sex_eradicator2_Raider", FleetMemberType.SHIP, "White Flame", true);
		api.addToFleet(FleetSide.PLAYER, "sex_eradicator2_Raider", FleetMemberType.SHIP, false).getCaptain().setPersonality(Personalities.AGGRESSIVE);
		api.addToFleet(FleetSide.PLAYER, "sex_starliner2_Assault", FleetMemberType.SHIP, false).getCaptain().setPersonality(Personalities.AGGRESSIVE);
		api.addToFleet(FleetSide.PLAYER, "sex_hammerhead2_Strike", FleetMemberType.SHIP, false).getCaptain().setPersonality(Personalities.AGGRESSIVE);
		api.addToFleet(FleetSide.PLAYER, "sex_enforcer2_Strike", FleetMemberType.SHIP, false).getCaptain().setPersonality(Personalities.AGGRESSIVE);
		api.addToFleet(FleetSide.PLAYER, "sex_enforcer2_Strike", FleetMemberType.SHIP, false).getCaptain().setPersonality(Personalities.AGGRESSIVE);
		api.addToFleet(FleetSide.PLAYER, "sex_enforcer2_Strike", FleetMemberType.SHIP, false).getCaptain().setPersonality(Personalities.AGGRESSIVE);
		api.addToFleet(FleetSide.PLAYER, "sex_mule2_Strike", FleetMemberType.SHIP, false).getCaptain().setPersonality(Personalities.AGGRESSIVE);
		api.addToFleet(FleetSide.PLAYER, "sex_condor2_Support", FleetMemberType.SHIP, false).getCaptain().setPersonality(Personalities.AGGRESSIVE);
		api.addToFleet(FleetSide.PLAYER, "sex_condor2_Support", FleetMemberType.SHIP, false).getCaptain().setPersonality(Personalities.AGGRESSIVE);
		api.addToFleet(FleetSide.PLAYER, "gremlin_luddic_path_Strike", FleetMemberType.SHIP, false).getCaptain().setPersonality(Personalities.AGGRESSIVE);
		api.addToFleet(FleetSide.PLAYER, "gremlin_luddic_path_Strike", FleetMemberType.SHIP, false).getCaptain().setPersonality(Personalities.AGGRESSIVE);
		api.addToFleet(FleetSide.PLAYER, "sex_tartarus_pather_Skirmish", FleetMemberType.SHIP, false).getCaptain().setPersonality(Personalities.AGGRESSIVE);
		api.addToFleet(FleetSide.PLAYER, "sex_tartarus_pather_Skirmish", FleetMemberType.SHIP, false).getCaptain().setPersonality(Personalities.AGGRESSIVE);
		api.addToFleet(FleetSide.PLAYER, "sex_tartarus_pather_Skirmish", FleetMemberType.SHIP, false).getCaptain().setPersonality(Personalities.AGGRESSIVE);
		api.addToFleet(FleetSide.PLAYER, "brawler_pather_Raider", FleetMemberType.SHIP, false).getCaptain().setPersonality(Personalities.AGGRESSIVE);
		api.addToFleet(FleetSide.PLAYER, "brawler_pather_Raider", FleetMemberType.SHIP, false).getCaptain().setPersonality(Personalities.AGGRESSIVE);
		api.addToFleet(FleetSide.PLAYER, "brawler_pather_Raider", FleetMemberType.SHIP, false).getCaptain().setPersonality(Personalities.AGGRESSIVE);
		
		// Set up the enemy fleet.
		// It's got less ships than the player's, but their ships are more elite.
		api.addToFleet(FleetSide.ENEMY, "sex_melpomene_Overdriven", FleetMemberType.SHIP, "TTS Exotica", true);;
		api.addToFleet(FleetSide.ENEMY, "sex_lilith_Shieldbreaker", FleetMemberType.SHIP, "TTS Transistent", false);
		api.addToFleet(FleetSide.ENEMY, "sex_adramelech_Standoff", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "sex_nephilim_Support", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "sex_nephilim_Support", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "sex_nephilim_Support", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "harbinger_Strike", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "sex_hammerhead_tritachyon_Standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "sex_hammerhead_tritachyon_Standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "tempest_Attack", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "tempest_Attack", FleetMemberType.SHIP, false);
		
		
		// Set up the map.
		float width = 22000f;
		float height = 20000f;
		api.initMap((float)-width/2f, (float)width/2f, (float)-height/2f, (float)height/2f);
		
		float minX = -width/2;
		float minY = -height/2;
		
		// All the addXXX methods take a pair of coordinates followed by data for
		// whatever object is being added.
		
		api.addNebula(minX + width * 0.4f, minY + height * 0.4f, 2000);
		api.addNebula(minX + width * 0.5f, minY + height * 0.5f, 2500);
		
		// And a few random ones to spice up the playing field.
		// A similar approach can be used to randomize everything
		// else, including fleet composition.
		for (int i = 0; i < 7; i++) {
			float x = (float) Math.random() * width - width/2;
			float y = (float) Math.random() * height - height/2;
			float radius = 100f + (float) Math.random() * 800f; 
			api.addNebula(x, y, radius);
		}
		
		// Add objectives. These can be captured by each side
		// and provide stat bonuses and extra command points to
		// bring in reinforcements.
		// Reinforcements only matter for large fleets - in this
		// case, assuming a 100 command point battle size,
		// both fleets will be able to deploy fully right away.
		api.addObjective(minX + width * 0.25f + 2000, minY + height * 0.25f + 2000, "sensor_array");
		api.addObjective(minX + width * 0.75f - 2000, minY + height * 0.75f - 2000, "sensor_array");
		api.addObjective(minX + width * 0.4f + 1000, minY + height * 0.5f, "nav_buoy");
		api.addObjective(minX + width * 0.6f - 1000, minY + height * 0.5f, "nav_buoy");
		
		
		// Add some planets.  These are defined in data/config/planets.json.
		api.addPlanet(-320, -140, 200f, "barren", 250f, true);
	}

}
