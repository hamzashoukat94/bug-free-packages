// <copyright file="DateTimeModel.cs" company="APIMatic">
// Copyright (c) APIMatic. All rights reserved.
// </copyright>
namespace TestForDatetimeInModel.Standard.Models
{
    using System;
    using System.Collections.Generic;
    using System.ComponentModel;
    using System.IO;
    using System.Linq;
    using System.Text;
    using System.Threading.Tasks;
    using Newtonsoft.Json;
    using Newtonsoft.Json.Converters;
    using TestForDatetimeInModel.Standard;
    using TestForDatetimeInModel.Standard.Utilities;

    /// <summary>
    /// DateTimeModel.
    /// </summary>
    public class DateTimeModel
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DateTimeModel"/> class.
        /// </summary>
        public DateTimeModel()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DateTimeModel"/> class.
        /// </summary>
        /// <param name="dateTime">dateTime.</param>
        public DateTimeModel(
            DateTime dateTime)
        {
            this.DateTime = dateTime;
        }

        /// <summary>
        /// Gets or sets DateTime.
        /// </summary>
        [JsonConverter(typeof(IsoDateTimeConverter))]
        [JsonProperty("dateTime")]
        public DateTime DateTime { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"DateTimeModel : ({string.Join(", ", toStringOutput)})";
        }

        /// <inheritdoc/>
        public override bool Equals(object obj)
        {
            if (obj == null)
            {
                return false;
            }

            if (obj == this)
            {
                return true;
            }
            return obj is DateTimeModel other &&                this.DateTime.Equals(other.DateTime);
        }
        
        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.DateTime = {this.DateTime}");
        }
    }
}