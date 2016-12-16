package ocr.sales.channelrestocking;

/**
 * 渠道补货单常量类
 * @author wanghw
 *
 */
public class ChannelRestockingConstant {

	//待发货补货单的查询地址
	public static final String QUERY4READYSHIP_ADDRESS = "query4readyship";
	//待收货补货单的查询地址
	public static final String QUERY4ACCEPT_ADDRESS = "query4accept";
	//补货单发货地址
	public static final String SHIP_ADDRESS = "ship";
	//补货单发货地址
	public static final String ACCEPT_ADDRESS = "update4accept";
	
	//创建状态
	public static final String CREATE_STATUS = "created";
	//提交状态
	public static final String COMMIT_STATUS = "commit";
	//发货中状态
	public static final String SHIPPING_STATUS = "shipping";
	//已发货状态
	public static final String SHIPPED_STATUS = "shipped";
}
