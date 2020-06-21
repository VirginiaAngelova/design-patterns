package PlovdivPostOffice;

import java.io.IOException;
import java.io.InputStreamReader;

public class MainPostOffice {
	
	private static Logger getChain(){
		Boy boy=new Boy();
		Logger staffOfCityPost = new StaffOfCityPost();
		Logger staffOfCountryPost = new StaffofCountryPost();
		Logger staffOfInternationalPost = new StaffOfInternationalPost();
        Logger staffOfCityPost1 = new StaffOfCityPost();
        Logger staffOfCityPost2 = new StaffOfCityPost();
		
		staffOfCityPost.setNextLogger(staffOfCountryPost);
        staffOfCountryPost.setNextLogger(staffOfInternationalPost);
       staffOfInternationalPost.setNextLogger(staffOfCityPost1);
       staffOfCityPost1.setNextLogger(staffOfCityPost2);

		staffOfCityPost.addObserver(boy);
		return staffOfCityPost;
		
	}

	public static void main(String[] args) throws IOException {
		Logger chain = getChain();
		
		chain.handleMessage(3);
		chain.handleMessage( 2);
		chain.handleMessage(1);
		chain.handleMessage(3);
		chain.handleMessage(3);

		    }
		        

	}


