using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Native.List.View.RNNativeListView
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNNativeListViewModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNNativeListViewModule"/>.
        /// </summary>
        internal RNNativeListViewModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNNativeListView";
            }
        }
    }
}
