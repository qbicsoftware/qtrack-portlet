/**
 * Connects JavaScript with Vaadin
 */
window.com_vaadin_ui_ChartComponent = function() {

    // Create the component
    var chart = new GraphSelector.ChartComponent(this.getElement());

    // Handle changes from the server-side
    this.onStateChange = function() {
       chart.setData(this.getState().data, this.getState().selectedOptions);
    };
};
