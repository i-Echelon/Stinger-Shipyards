package data.scripts.intel;

import com.fs.starfarer.api.Global;
import com.fs.starfarer.api.campaign.BaseCampaignEventListener;
import com.fs.starfarer.api.combat.DeployedFleetMemberAPI;
import com.fs.starfarer.api.combat.listeners.FleetMemberDeploymentListener;
import com.fs.starfarer.api.fleet.FleetMemberAPI;

import java.util.logging.Logger;

public class SexHospitalShipListener implements FleetMemberDeploymentListener {

	@Override
	public void reportFleetMemberDeployed(DeployedFleetMemberAPI deployedFleetMemberAPI) {
		if (Global.getSector() == null || Global.getSector().getPlayerFleet() == null) {
		// Not in campaign context (e.g., mission or simulator)
		return;
	}
	float totalFleetHospitalShipBonus = 1f;
	for (FleetMemberAPI s : Global.getSector().getPlayerFleet().getFleetData().getMembersListCopy()) {
		totalFleetHospitalShipBonus *= s.getStats().getDynamic().getStat("sex_global_crew_loss").getModifiedValue();
	}
	deployedFleetMemberAPI.getMember().getStats().getCrewLossMult()
		.modifyMult(this.getClass().getName(), totalFleetHospitalShipBonus);
	}
}
