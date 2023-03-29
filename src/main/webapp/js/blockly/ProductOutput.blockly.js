window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.ProductOutput = window.blockly.js.blockly.ProductOutput || {};

/**
 * @function updateProductoutput
 *
 * ProductOutput
 *
 *
 * @author Roshan Silva
 * @since 3/29/2023, 10:09:35 AM
 *
 */
window.blockly.js.blockly.ProductOutput.updateProductoutputArgs = [];
window.blockly.js.blockly.ProductOutput.updateProductoutput = async function() {
 var response;
  //
  this.cronapi.util.callServerBlocklyAsynchronous('blockly.ProductController:decreaseProductQuantity', async function(sender_response) {
      response = sender_response;
    //
    if (this.cronapi.json.getProperty(response, 'status')) {
      //
      (await this.cronapi.screen.post("OUTPUT"));
      //
      this.cronapi.notification.customNotify('success', this.cronapi.json.getProperty(response, 'msg'), 'fade', 'top', 'center', 'false');
    } else {
      //
      this.cronapi.notification.customNotify('error', this.cronapi.json.getProperty(response, 'msg'), 'fade', 'top', 'center', 'false');
    }
  }.bind(this), this.cronapi.screen.getValueOfField("OUTPUT.active.prODUCT"), this.cronapi.screen.getValueOfField("OUTPUT.active.quantity"));
}
