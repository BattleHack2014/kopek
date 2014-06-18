package battlehack.kopek;

import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;

public class NavigationFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_navigation, container, false); 
		RadioButton radioButton ;
		radioButton = (RadioButton) view.findViewById(R.id.navigation_trips);
		radioButton.setOnCheckedChangeListener(tripsOnCheckedChangeListener);
		radioButton = (RadioButton) view.findViewById(R.id.navigation_add_trip);
		radioButton.setOnCheckedChangeListener(addTripOnCheckedChangeListener);
		if (getActivity() instanceof TripsActivity) {
			radioButton.setChecked(true);
		}
		return view;
	}
	
	private CompoundButton.OnCheckedChangeListener tripsOnCheckedChangeListener =  new CompoundButton. OnCheckedChangeListener ( )  {
		public  void onCheckedChanged ( CompoundButton buttonView, boolean isChecked )  {
			if (isChecked) {
				getActivity().findViewById(R.id.trips).setVisibility(View.INVISIBLE);
				getActivity().findViewById(R.id.add_trip).setVisibility(View.VISIBLE);
			}
		}
	};
	
	private CompoundButton.OnCheckedChangeListener addTripOnCheckedChangeListener =  new CompoundButton. OnCheckedChangeListener ( )  {
		public  void onCheckedChanged ( CompoundButton buttonView, boolean isChecked )  {
			if  ( isChecked && !(getActivity() instanceof TripsActivity))  {
				buttonView.setChecked(false);
				startActivity(new Intent(getActivity(), TripsActivity.class));
			}
		}
	};
}
