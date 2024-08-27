import * as ActionTypes from "./ActionType.js";

const initialState = {
  loading: false,
  error: null,
  orders: [],
};

export const restaurantsOrderReducer = (state = initialState, action) => {
  switch (action.type) {
    case ActionTypes.GET_RESTAURANTS_ORDER_REQUEST:
    case ActionTypes.UPDATE_ORDER_STATUS_REQUEST:
      return {
        ...state,
        loading: true,
        error: null,
      };
    case ActionTypes.GET_RESTAURANTS_ORDER_SUCCESS:
      return {
        ...state,
        loading: false,
        orders: action.payload,
      };
    case ActionTypes.UPDATE_ORDER_STATUS_SUCCESS:
      const updatedOrders = state.orders.map((order) =>
        order.id === action.payload.id ? action.payload : order
      );
      return {
        ...state,
        loading: false,
        orders: updatedOrders,
      };
    case ActionTypes.GET_RESTAURANTS_ORDER_FAILURE:
    case ActionTypes.UPDATE_ORDER_STATUS_FAILURE:
      return {
        ...state,
        loading: false,
        error: action.error,
      };
    default:
      return state;
  }
};
