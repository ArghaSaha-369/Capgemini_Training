package ride_booking_system;

import java.util.Iterator;
import java.util.List;

@SecurityCheck (role = "Admin")
public class Admin extends User {
	
	Admin(String id, String name) {
		super(id,name);
	}
	
	@Override
	public void showProfile() {
		Class<SecurityCheck> c = SecurityCheck.class;
		SecurityCheck s = c.getDeclaredAnnotation(SecurityCheck.class);
		System.out.println("Name of Admin: "+ this.name + "\nRole: "+ s.role());
	}
	
	public void removeDriver(List<Driver> drivers, String driverId) {
		Class<?> clazz = this.getClass();
		if(clazz.isAnnotationPresent(SecurityCheck.class)) {
			SecurityCheck sc = clazz.getAnnotation(SecurityCheck.class);
			if ("Admin".equals(sc.role())) {
				Iterator<Driver> iterator = drivers.iterator();
				if(iterator.hasNext()) {
					Driver driver = iterator.next();
					if(driver.id.equals(driverId)) {
						iterator.remove();
						System.out.println("Driver Removed");
						return;
					}
				}
				else {
					System.out.println("Driver Not Found");
				}
			}
			else {
				System.out.println("Unauthorized Access");
			}
		}
		
	}
	
}
