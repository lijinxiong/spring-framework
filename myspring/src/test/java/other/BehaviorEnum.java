package other;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public enum BehaviorEnum {
    /**
     * 关注
     */
    FOLLOW{
        @Override
        void action() {
            System.out.println("我已经关注了 CoderLi 了");
        }
    },
    /**
     * 在看
     */
    WOW{
        @Override
        void action() {
            System.out.println("CoderLi 的文章我已经点在看了");
        }
    },
    /**
     * 分享
     */
    FORWARD_TO_FRIENDS{
        @Override
        void action() {
            System.out.println("CoderLi 的文章我已经分享给我的基友了");
        }
    },
    /**
     * 收藏
     */
    ADD_TO_FAVORITES{
        @Override
        void action() {
            System.out.println("CoderLi 的文章已经在我的收藏里面吃灰了");
        }
    },;

    abstract void action();

	public static void main(String[] args)  {

		try {
			Class<BehaviorEnum> behaviorEnumClass = BehaviorEnum.class;
			Constructor<?>[] constructors =
					behaviorEnumClass.getDeclaredConstructors();

			Constructor<?> constructor = constructors[0];

			constructor.setAccessible(true);
			Object o = constructor.newInstance("codeLi", 5);
			System.out.println();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}