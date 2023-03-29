window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.ProductInput = window.blockly.js.blockly.ProductInput || {};

/**
 * @function updateProductImput
 *
 * ProductInput
 *
 *
 * @author Roshan Silva
 * @since 28/03/2023, 11:04:52
 *
 */
window.blockly.js.blockly.ProductInput.updateProductImputArgs = [];
window.blockly.js.blockly.ProductInput.updateProductImput = async function() {
 var item;
  //
  this.cronapi.util.callServerBlocklyAsynchronous('blockly.ProductController:increaseProductQuantity', async function(sender_item) {
      item = sender_item;
    //
    (await this.cronapi.screen.post("INPUT"));
  }.bind(this), this.cronapi.screen.getValueOfField("INPUT.active.prODUCT"), this.cronapi.screen.getValueOfField("INPUT.active.quantity"));
}
