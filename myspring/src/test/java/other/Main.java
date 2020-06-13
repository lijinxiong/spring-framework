package other;

import java.lang.reflect.Field;

public class Main {

	public static void main(String[] args) {

		Class<BehaviorEnum> clazz = BehaviorEnum.class;
		Field[] declaredFields = clazz.getDeclaredFields();
		for (Field declaredField : declaredFields) {
			System.out.println(declaredField.getName() + ":" + declaredField.isSynthetic());
		}
	}
}
