@file:Suppress("UNCHECKED_CAST", "USELESS_CAST", "INAPPLICABLE_JVM_NAME", "UNUSED_ANONYMOUS_PARAMETER", "NAME_SHADOWING", "UNNECESSARY_NOT_NULL_ASSERTION")
package uni.UNI5BB4822
import io.dcloud.uniapp.*
import io.dcloud.uniapp.extapi.*
import io.dcloud.uniapp.framework.*
import io.dcloud.uniapp.runtime.*
import io.dcloud.uniapp.vue.*
import io.dcloud.uniapp.vue.shared.*
import io.dcloud.uts.*
import io.dcloud.uts.Map
import io.dcloud.uts.Set
import io.dcloud.uts.UTSAndroid
import kotlin.properties.Delegates
import io.dcloud.uniapp.extapi.showModal as uni_showModal
import io.dcloud.uniapp.extapi.showToast as uni_showToast
open class GenPagesIndexIndex : BasePage {
    constructor(__ins: ComponentInternalInstance, __renderer: String?) : super(__ins, __renderer) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesIndexIndex) -> Any? = fun(__props): Any? {
            val __ins = getCurrentInstance()!!
            val _ctx = __ins.proxy as GenPagesIndexIndex
            val _cache = __ins.renderCache
            val handleStartJourney = fun(){
                uni_showToast(ShowToastOptions(title = "健康之旅已开始！", icon = "success", duration = 2000))
            }
            val handleShowTips = fun(){
                uni_showModal(ShowModalOptions(title = "健康小贴士", content = "每天保持适量运动，均衡饮食，充足睡眠是保持健康的关键。建议每天步行8000步以上，饮用2升水。", showCancel = false, confirmText = "知道了"))
            }
            val handleSettings = fun(){
                uni_showToast(ShowToastOptions(title = "设置功能开发中", icon = "none", duration = 1500))
            }
            return fun(): Any? {
                return _cE("view", _uM("class" to "container"), _uA(
                    _cE("text", _uM("class" to "app-title"), "WellMate 健康助手"),
                    _cE("view", _uM("class" to "welcome-section"), _uA(
                        _cE("text", _uM("class" to "welcome-text"), "欢迎使用 WellMate"),
                        _cE("text", _uM("class" to "subtitle"), "您的个人健康管理专家")
                    )),
                    _cE("view", _uM("class" to "card"), _uA(
                        _cE("text", _uM("class" to "card-title"), "今日健康数据"),
                        _cE("view", _uM("class" to "stats-row"), _uA(
                            _cE("view", _uM("class" to "stat-item"), _uA(
                                _cE("text", _uM("class" to "stat-value"), "7,500"),
                                _cE("text", _uM("class" to "stat-label"), "步数")
                            )),
                            _cE("view", _uM("class" to "stat-item"), _uA(
                                _cE("text", _uM("class" to "stat-value"), "8"),
                                _cE("text", _uM("class" to "stat-label"), "小时睡眠")
                            )),
                            _cE("view", _uM("class" to "stat-item"), _uA(
                                _cE("text", _uM("class" to "stat-value"), "2.5"),
                                _cE("text", _uM("class" to "stat-label"), "L 饮水")
                            ))
                        ))
                    )),
                    _cE("view", _uM("class" to "button-section"), _uA(
                        _cE("button", _uM("class" to "primary-btn", "onClick" to handleStartJourney), "开始健康之旅"),
                        _cE("button", _uM("class" to "secondary-btn", "onClick" to handleShowTips), "健康小贴士"),
                        _cE("button", _uM("class" to "outline-btn", "onClick" to handleSettings), "应用设置")
                    )),
                    _cE("view", _uM("class" to "footer"), _uA(
                        _cE("text", _uM("class" to "footer-text"), "版本 1.0.0 | 数据更新于今天")
                    ))
                ))
            }
        }
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            _nCS(_uA(
                styles0
            ), _uA(
                GenApp.styles
            ))
        }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return _uM("container" to _pS(_uM("paddingTop" to "30rpx", "paddingRight" to "30rpx", "paddingBottom" to "30rpx", "paddingLeft" to "30rpx", "backgroundImage" to "linear-gradient(135deg, #667eea 0%, #764ba2 100%)", "backgroundColor" to "rgba(0,0,0,0)", "display" to "flex", "flexDirection" to "column")), "app-title" to _pS(_uM("fontSize" to "48rpx", "fontWeight" to "bold", "color" to "#ffffff", "textAlign" to "center", "marginTop" to "60rpx", "marginBottom" to "40rpx")), "welcome-section" to _pS(_uM("textAlign" to "center", "marginBottom" to "50rpx")), "welcome-text" to _pS(_uM("fontSize" to "36rpx", "color" to "#ffffff", "marginBottom" to "10rpx")), "subtitle" to _pS(_uM("fontSize" to "28rpx", "color" to "rgba(255,255,255,0.8)")), "card" to _pS(_uM("backgroundImage" to "none", "backgroundColor" to "rgba(255,255,255,0.95)", "borderTopLeftRadius" to "20rpx", "borderTopRightRadius" to "20rpx", "borderBottomRightRadius" to "20rpx", "borderBottomLeftRadius" to "20rpx", "paddingTop" to "40rpx", "paddingRight" to "40rpx", "paddingBottom" to "40rpx", "paddingLeft" to "40rpx", "marginBottom" to "40rpx", "boxShadow" to "0 10rpx 30rpx rgba(0, 0, 0, 0.1)")), "card-title" to _pS(_uM("fontSize" to "32rpx", "fontWeight" to "bold", "color" to "#333333", "textAlign" to "center", "marginBottom" to "30rpx")), "stats-row" to _pS(_uM("display" to "flex", "justifyContent" to "space-around")), "stat-item" to _pS(_uM("textAlign" to "center")), "stat-value" to _pS(_uM("fontSize" to "36rpx", "fontWeight" to "bold", "color" to "#667eea")), "stat-label" to _pS(_uM("fontSize" to "24rpx", "color" to "#666666", "marginTop" to "8rpx")), "button-section" to _pS(_uM("display" to "flex", "flexDirection" to "column", "gap" to "20rpx", "marginBottom" to "40rpx")), "primary-btn" to _pS(_uM("backgroundImage" to "none", "backgroundColor" to "#4CAF50", "color" to "#FFFFFF", "borderTopWidth" to "medium", "borderRightWidth" to "medium", "borderBottomWidth" to "medium", "borderLeftWidth" to "medium", "borderTopStyle" to "none", "borderRightStyle" to "none", "borderBottomStyle" to "none", "borderLeftStyle" to "none", "borderTopColor" to "#000000", "borderRightColor" to "#000000", "borderBottomColor" to "#000000", "borderLeftColor" to "#000000", "borderTopLeftRadius" to "50rpx", "borderTopRightRadius" to "50rpx", "borderBottomRightRadius" to "50rpx", "borderBottomLeftRadius" to "50rpx", "paddingTop" to "24rpx", "paddingRight" to "24rpx", "paddingBottom" to "24rpx", "paddingLeft" to "24rpx", "fontSize" to "32rpx")), "secondary-btn" to _pS(_uM("backgroundImage" to "none", "backgroundColor" to "#2196F3", "color" to "#FFFFFF", "borderTopWidth" to "medium", "borderRightWidth" to "medium", "borderBottomWidth" to "medium", "borderLeftWidth" to "medium", "borderTopStyle" to "none", "borderRightStyle" to "none", "borderBottomStyle" to "none", "borderLeftStyle" to "none", "borderTopColor" to "#000000", "borderRightColor" to "#000000", "borderBottomColor" to "#000000", "borderLeftColor" to "#000000", "borderTopLeftRadius" to "50rpx", "borderTopRightRadius" to "50rpx", "borderBottomRightRadius" to "50rpx", "borderBottomLeftRadius" to "50rpx", "paddingTop" to "24rpx", "paddingRight" to "24rpx", "paddingBottom" to "24rpx", "paddingLeft" to "24rpx", "fontSize" to "32rpx")), "outline-btn" to _pS(_uM("backgroundImage" to "none", "backgroundColor" to "rgba(0,0,0,0)", "color" to "#FFFFFF", "borderTopWidth" to "2rpx", "borderRightWidth" to "2rpx", "borderBottomWidth" to "2rpx", "borderLeftWidth" to "2rpx", "borderTopStyle" to "solid", "borderRightStyle" to "solid", "borderBottomStyle" to "solid", "borderLeftStyle" to "solid", "borderTopColor" to "#FFFFFF", "borderRightColor" to "#FFFFFF", "borderBottomColor" to "#FFFFFF", "borderLeftColor" to "#FFFFFF", "borderTopLeftRadius" to "50rpx", "borderTopRightRadius" to "50rpx", "borderBottomRightRadius" to "50rpx", "borderBottomLeftRadius" to "50rpx", "paddingTop" to "24rpx", "paddingRight" to "24rpx", "paddingBottom" to "24rpx", "paddingLeft" to "24rpx", "fontSize" to "32rpx")), "footer" to _pS(_uM("textAlign" to "center", "marginTop" to "auto", "paddingTop" to "40rpx")), "footer-text" to _pS(_uM("fontSize" to "24rpx", "color" to "rgba(255,255,255,0.6)")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
