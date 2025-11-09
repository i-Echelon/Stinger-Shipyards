package data.scripts.intel;

import com.fs.starfarer.api.Global;
import com.fs.starfarer.api.campaign.BaseCampaignEventListener;
import com.fs.starfarer.api.campaign.InteractionDialogAPI;
import com.fs.starfarer.api.fleet.FleetMemberAPI;

import java.util.logging.Logger;

public class SexHospitalCampaignListener extends BaseCampaignEventListener {
    public SexHospitalCampaignListener(boolean permaRegister) {
        super(permaRegister);
    }

	@Override
	public void reportShownInteractionDialog(InteractionDialogAPI dialog) {
		if (Global.getSector() == null || Global.getSector().getPlayerFleet() == null) return;

	float totalFleetHospitalShipBonus = 1f;
	for (FleetMemberAPI s : Global.getSector().getPlayerFleet().getFleetData().getMembersListCopy()) {
		if (s.getVariant().hasHullMod("sex_hospital")) {
		totalFleetHospitalShipBonus *= s.getStats().getDynamic()
			.getStat("sex_global_crew_loss").getModifiedValue();
		}
	}

	Global.getSector().getPlayerFleet().getStats().getDynamic()
		.getStat("overall_crew_loss_mult")
		.modifyMult(this.getClass().getName(), totalFleetHospitalShipBonus);
	}
}
