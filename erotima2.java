package Main;

import static org.mockito.Mockito.*;

public class Test {

	public static void main(String[] args) {
		Location myLocation = getLocation();
		
		LocationService locationServiceMock = mock(LocationService.class);
		
		NearService nearService = new NearService(locationServiceMock);
		
		when(nearService.isNearTo(othersLocation)).thenReturn(2);
		
		Assert.assertEquals(nearService.isNearTo(othersLocation), 2);
		
		verify(nearService).isNearTo(otherLocation);
		
	}

}
